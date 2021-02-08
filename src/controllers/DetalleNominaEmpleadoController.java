/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.DetalleNominaEmpleado;
import models.Conexion;
import models.Deduccion;
import models.Empleado;
import models.Nomina;

public class DetalleNominaEmpleadoController {
    
   private final String tabla = "detalle_nomina_empleado";
   Connection conexion;
   
   public void actualizar(DetalleNominaEmpleado detalle_nomina_empleado){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(detalle_nomina_empleado.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(id_empleado, id_nomina, id_deduccion, responsable,estado,fecha_registro) VALUES(?, ?, ?, ?, ?,?)");
            consulta.setInt(1, detalle_nomina_empleado.getEmpleado().getId());
            consulta.setInt(2, detalle_nomina_empleado.getNomina().getId());
            consulta.setInt(3, detalle_nomina_empleado.getDeduccion().getId());
            consulta.setString(4, detalle_nomina_empleado.getResponsable());
            consulta.setInt(3, detalle_nomina_empleado.getEstado());
            consulta.setString(5, detalle_nomina_empleado.getFecha_registro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET id_empleado=?, id_nomina=?, id_deduccion=?, responsable=?,esatdo=?, fecha_registro=? WHERE id = ?"); 
            consulta.setInt(1, detalle_nomina_empleado.getEmpleado().getId());
            consulta.setInt(2, detalle_nomina_empleado.getNomina().getId());
            consulta.setInt(3, detalle_nomina_empleado.getDeduccion().getId());
            consulta.setString(4, detalle_nomina_empleado.getResponsable());
            consulta.setInt(3, detalle_nomina_empleado.getEstado());
            consulta.setString(5, detalle_nomina_empleado.getFecha_registro());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
             JOptionPane.showMessageDialog(null, "Operación realizada exitosamente");
         }else{
           JOptionPane.showMessageDialog(null,"No se puedo llevar a cabo la operación");
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   public DetalleNominaEmpleado consultar(int id){
      DetalleNominaEmpleado detalle_nomina_empleado = null;
      
      Empleado empleado=null;
      EmpleadoController ep=new EmpleadoController();
      
      Nomina nomina=null;
      NominaController nm=new NominaController();
      
      Deduccion deduccion=null;
      DeduccionController dc=new DeduccionController();
      
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, id_empleado, id_nomina, id_deduccion, responsable,estado,fecha_registro FROM " + this.tabla + " WHERE id = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            empleado = ep.consultar(rs.getInt("id_empleado"));
            nomina =nm.consultar(rs.getInt("id_nomina"));
            deduccion =dc.consultar(rs.getInt("id_deduccion"));
             
            detalle_nomina_empleado = new DetalleNominaEmpleado(rs.getInt("id"),
                                                                empleado,
                                                                nomina, 
                                                                deduccion,
                                                                rs.getString("responsable"),
                                                                rs.getInt("estado"), 
                                                                rs.getString("fecha_registro"));
         }
         Conexion.cerrar();
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
      return detalle_nomina_empleado;
   }
   
   
   public void eliminar(DetalleNominaEmpleado detalle_nomina_empleado){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, detalle_nomina_empleado.getEstado());
          consulta.setInt(2, detalle_nomina_empleado.getId());
          consulta.executeUpdate();
          Conexion.cerrar();
          JOptionPane.showConfirmDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   
   public List<DetalleNominaEmpleado> listar(){
      DetalleNominaEmpleado detalle_nomina_empleado = null;
      
      Empleado empleado=null;
      EmpleadoController ep=new EmpleadoController();
      
      Nomina nomina=null;
      NominaController nm=new NominaController();
      
      Deduccion deduccion=null;
      DeduccionController dc=new DeduccionController();
      
      List<DetalleNominaEmpleado> detalle_nomina_empleados = new ArrayList<DetalleNominaEmpleado>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, salario_base, puesto_destino, estado, fecha_registro FROM " + this.tabla + " ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
         empleado = ep.consultar(rs.getInt("id_empleado"));
         nomina =nm.consultar(rs.getInt("id_nomina"));
         deduccion =dc.consultar(rs.getInt("id_deduccion"));
             
         detalle_nomina_empleado = new DetalleNominaEmpleado(rs.getInt("id"),
                                                             empleado,
                                                             nomina, 
                                                             deduccion,
                                                             rs.getString("responsable"),
                                                             rs.getInt("estado"), 
                                                             rs.getString("fecha_registro"));
         }
         Conexion.cerrar();
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
      return detalle_nomina_empleados;
   }
}