package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Categoria;
import models.Contrato;
import models.Conexion;
import models.Empleado;

public class ContratoController {
    
   private final String tabla = "contratos";
   Connection conexion;
   
   public void actualizar(Contrato contrato){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(contrato.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(id_empleado, id_categoria, puesto_destino, fecha_alta, fecha_baja, fecha_registro, estado) VALUES(?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, contrato.getEmpleado().getId());
            consulta.setInt(2, contrato.getCategoria().getId());
            consulta.setString(3, contrato.getPuesto_destino());
            consulta.setString(4, contrato.getFecha_alta());
            consulta.setString(5, contrato.getFecha_baja());
            consulta.setString(6, contrato.getFecha_registro());
            consulta.setInt(7, contrato.getEstado());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET id_empleado = ?, id_categoria = ?, puesto_destino = ?, fecha_alta = ?, fecha_baja = ?, fecha_registro = ?, estado = ? WHERE id = ?");
            consulta.setInt(1, contrato.getEmpleado().getId());
            consulta.setInt(2, contrato.getCategoria().getId());
            consulta.setString(3, contrato.getPuesto_destino());
            consulta.setString(4, contrato.getFecha_alta());
            consulta.setString(5, contrato.getFecha_baja());
            consulta.setString(6, contrato.getFecha_registro());
            consulta.setInt(7, contrato.getEstado());
            consulta.setInt(8, contrato.getId());
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
   
   public Contrato consultar(int id){
      Contrato contrato = null;
      
      Empleado empleado = null;
      EmpleadoController ec = new EmpleadoController();
      
      Categoria categoria = null;
      CategoriaController cc = new CategoriaController();
      
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, id_empleado, id_categoria, puesto_destino, fecha_alta, fecha_baja, fecha_registro, estado FROM " + this.tabla + " WHERE id = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery(); 
         
         while(rs.next()){
             
            empleado = ec.consultar(rs.getInt("id_empleado"));
            categoria = cc.consultar(rs.getInt("id_categoria"));
            
            contrato = new Contrato(rs.getInt("id"), 
                                    empleado, 
                                    categoria, 
                                    rs.getString("puesto_destino"),
                                    rs.getString("fecha_alta"),
                                    rs.getString("fecha_baja"),
                                    rs.getInt("estado"),
                                    rs.getString("fecha_registro"));
         }
         Conexion.cerrar();
      }catch(Exception ex){
           JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return contrato;
   }
   
   
   public void eliminar(Contrato contrato){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, contrato.getEstado());
          consulta.setInt(2, contrato.getId());
          consulta.executeUpdate();
          Conexion.cerrar();
         JOptionPane.showConfirmDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   
   public List<Contrato> listar(){
      Contrato contrato = null;
      
      Empleado empleado = null;
      EmpleadoController ec = new EmpleadoController();
      
      Categoria categoria = null;
      CategoriaController cc = new CategoriaController();
      
      List<Contrato> contratos = new ArrayList<Contrato>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, id_empleado, id_categoria, puesto_destino, fecha_alta, fecha_baja, fecha_registro, estado FROM " + this.tabla + " ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
                        contrato = new Contrato(rs.getInt("id"), 
                                    empleado, 
                                    categoria, 
                                    rs.getString("puesto_destino"),
                                    rs.getString("fecha_alta"),
                                    rs.getString("fecha_baja"),
                                    rs.getInt("estado"),
                                    rs.getString("fecha_registro"));
            contratos.add(contrato);
         }
         Conexion.cerrar();
      }catch(Exception ex){
          JOptionPane.showConfirmDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return contratos;
   }
}