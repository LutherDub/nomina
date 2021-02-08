
package models;

public class Deduccion {
    
    private int id;
    private String nombre;
    private String descripcion;
    private double seguridad_social;
    private double desempleo;
    private double irpf;
    private double formacion_profesional;
    private int estado;
    private String fecha_registro;

    public Deduccion() {
    }
    
    

    public Deduccion(int id, String nombre, String descripcion, double seguridad_social, double desempleo, double irpf, double formacion_profesional, int estado, String fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.seguridad_social = seguridad_social;
        this.desempleo = desempleo;
        this.irpf = irpf;
        this.formacion_profesional = formacion_profesional;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSeguridad_social() {
        return seguridad_social;
    }

    public void setSeguridad_social(double seguridad_social) {
        this.seguridad_social = seguridad_social;
    }

    public double getDesempleo() {
        return desempleo;
    }

    public void setDesempleo(double desempleo) {
        this.desempleo = desempleo;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getFormacion_profesional() {
        return formacion_profesional;
    }

    public void setFormacion_profesional(double formacion_profesional) {
        this.formacion_profesional = formacion_profesional;
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
        return "Deduccion{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", seguridad_social=" + seguridad_social + ", desempleo=" + desempleo + ", irpf=" + irpf + ", formacion_profesional=" + formacion_profesional + ", estado=" + estado + ", fecha_registro=" + fecha_registro + '}';
    }
    
    
    
}
