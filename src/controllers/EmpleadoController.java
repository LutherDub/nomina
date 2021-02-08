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
import models.Empleado;
import models.Conexion;

public class EmpleadoController {
    
   private final String tabla = "empleados";
   Connection conexion;
   
   public void actualizar(Empleado empleado){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(empleado.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(dni, nombres, apellidos,telefono,direccion, estado, fecha_registro) VALUES(?, ?, ?, ?, ?,?, ?)");
            consulta.setString(1, empleado.getDni());
            consulta.setString(2, empleado.getNombres());
            consulta.setString(3, empleado.getApellidos());
            consulta.setString(4, empleado.getTelefono());
            consulta.setString(5, empleado.getDireccion());
            consulta.setInt(6, empleado.getEstado());
            consulta.setString(7, empleado.getFecha_registro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET dni=?, nombres=?, apellidos=?,telefono=?,direccion=?, estado=?, fecha_registro=? WHERE id = ?");
            consulta.setString(1, empleado.getDni());
            consulta.setString(2, empleado.getNombres());
            consulta.setString(3, empleado.getApellidos());
            consulta.setString(4, empleado.getTelefono());
            consulta.setString(5, empleado.getDireccion());
            consulta.setInt(6, empleado.getEstado());
            consulta.setString(7, empleado.getFecha_registro());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
             JOptionPane.showMessageDialog(null, "Operación realizada exitosamente");
         }else{
             JOptionPane.showMessageDialog(null, "No se puedo llevar a cabo la operación");
         }
         
      }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   public Empleado consultar(int id){
      Empleado empleado = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id,dni, nombres, apellidos,telefono,direccion, estado, fecha_registro FROM " + this.tabla + " WHERE id = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            empleado = new Empleado(rs.getInt("id"),
                                    rs.getString("dn1"),
                                    rs.getString("nombres"),
                                    rs.getString("apellidos"),
                                    rs.getString("telefono"),
                                    rs.getString("direccion"),
                                    rs.getInt("estado"),
                                    rs.getString("fecha_registro"));
         }
         Conexion.cerrar();
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return empleado;
   }
   
   
   public void eliminar(Empleado empleado){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, empleado.getEstado());
          consulta.setInt(2, empleado.getId());
          consulta.executeUpdate();
          Conexion.cerrar();
          JOptionPane.showMessageDialog(null, "Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
   }
   
   
   public List<Empleado> listar(){
      List<Empleado> empleados = new ArrayList<Empleado>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id,dni, nombres, apellidos,telefono,direccion, estado, fecha_registro FROM " + this.tabla + " ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            Empleado empleado = new Empleado(rs.getInt("id"),
                                             rs.getString("dni"), 
                                             rs.getString("nombres"),
                                             rs.getString("apellidos"),
                                             rs.getString("telefono"), 
                                             rs.getString("direccion"),
                                             rs.getInt("estado"), 
                                             rs.getString("fecha_registro"));
                                             empleados.add(empleado);
         }
         Conexion.cerrar();
      }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return empleados;
   }
}