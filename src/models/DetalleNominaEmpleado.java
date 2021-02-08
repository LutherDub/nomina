
package models;

public class DetalleNominaEmpleado {
    
    private int id;
    private Empleado empleado;
    private Nomina nomina;
    private Deduccion deduccion;
    private String responsable;
    private int estado;
    private String fecha_registro;

    public DetalleNominaEmpleado() {
    }

    public DetalleNominaEmpleado(int id, Empleado empleado, Nomina nomina, Deduccion deduccion, String responsable, int estado, String fecha_registro) {
        this.id = id;
        this.empleado = empleado;
        this.nomina = nomina;
        this.deduccion = deduccion;
        this.responsable = responsable;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public Deduccion getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(Deduccion deduccion) {
        this.deduccion = deduccion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
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
        return "DetalleNominaEmpleado{" + "id=" + id + ", empleado=" + empleado + ", nomina=" + nomina + ", deduccion=" + deduccion + ", responsable=" + responsable + ", estado=" + estado + ", fecha_registro=" + fecha_registro + '}';
    }
    
    
    
    
}
