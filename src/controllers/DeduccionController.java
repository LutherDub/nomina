package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Deduccion;
import models.Conexion;

public class DeduccionController {
    
   private final String tabla = "deducciones";
   Connection conexion;
   
   public void actualizar(Deduccion deduccion){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(deduccion.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "( descripcion, seguridad_social, desempleo, irpf, formacion_profesional, estado, fecha_registro) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, deduccion.getNombre());
            consulta.setString(2, deduccion.getDescripcion());
            consulta.setDouble(3, deduccion.getSeguridad_social());
            consulta.setDouble(4, deduccion.getDesempleo());
            consulta.setDouble(5, deduccion.getIrpf());
            consulta.setDouble(6, deduccion.getFormacion_profesional());
            consulta.setInt(7, deduccion.getEstado());
            consulta.setString(8, deduccion.getFecha_registro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET nombre =?, descripcion =?, seguridad_social =?, desempleo =?, irpf =?, formacion_profesional =?, estado =?, fecha_registro = ? WHERE id = ?");
            consulta.setString(1, deduccion.getNombre());
            consulta.setString(2, deduccion.getDescripcion());
            consulta.setDouble(3, deduccion.getSeguridad_social());
            consulta.setDouble(4, deduccion.getDesempleo());
            consulta.setDouble(5, deduccion.getIrpf());
            consulta.setDouble(6, deduccion.getFormacion_profesional());
            consulta.setInt(7, deduccion.getEstado());
            consulta.setString(8, deduccion.getFecha_registro());
            consulta.setInt(9, deduccion.getId());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
             JOptionPane.showConfirmDialog(null,"Operación realizada exitosamente");
         }else{
             JOptionPane.showConfirmDialog(null,"No se puedo llevar a cabo la operación");
         }
         
      }catch(Exception ex){
          JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   public Deduccion consultar(int id){
      Deduccion deduccion = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, descripcion, seguridad_social, desempleo, irpf, formacion_profesional, estado, fecha_registro FROM " + this.tabla + " WHERE id = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            deduccion = new Deduccion(rs.getInt("id"), 
                                      rs.getString("nombre"), 
                                      rs.getString("descripcion"), 
                                      rs.getDouble("seguridad_social"),
                                      rs.getDouble("desempleo"),
                                      rs.getDouble("irpf"),
                                      rs.getDouble("formacion_profesional"),
                                      rs.getInt("estado"), 
                                      rs.getString("fecha_registro") );
         }
         Conexion.cerrar();
      }catch(Exception ex){
           JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return deduccion;
   }
   
   
   public void eliminar(Deduccion deduccion){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, deduccion.getEstado());
          consulta.setInt(2, deduccion.getId());
          consulta.executeUpdate();
         Conexion.cerrar();
       JOptionPane.showConfirmDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
       JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   
   public List<Deduccion> listar(){
      List<Deduccion> deducciones = new ArrayList<Deduccion>();
      Deduccion deduccion = null;
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, descripcion, seguridad_social, desempleo, irpf, formacion_profesional, estado, fecha_registro FROM " + this.tabla + " ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            deduccion = new Deduccion(rs.getInt("id"), 
                          rs.getString("nombre"), 
                          rs.getString("descripcion"), 
                          rs.getDouble("seguridad_social"),
                          rs.getDouble("desempleo"),
                          rs.getDouble("irpf"),
                          rs.getDouble("formacion_profesional"),
                          rs.getInt("estado"), 
                          rs.getString("fecha_registro") );
            deducciones.add(deduccion);
         }
         Conexion.cerrar();
      }catch(Exception ex){
          JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return deducciones;
   }
}