
package models;

public class Empleado {
    
    private int id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private int estado;
    private String fecha_registro;

    public Empleado() {
    }
    
    public Empleado(int id, String dni, String nombres, String apellidos, String telefono, String direccion, int estado, String fecha_registro) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }
    
    public Empleado( String dni, String nombres, String apellidos, String telefono, String direccion) {
       
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", dni=" + dni + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", estado=" + estado + ", fecha_registro=" + fecha_registro + '}';
    }
    
    
    
}
