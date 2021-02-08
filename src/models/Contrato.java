
package models;

public class Contrato {
    
    private int id;
    private Empleado empleado;
    private Categoria categoria;
    private String puesto_destino;
    private String fecha_alta;
    private String fecha_baja;
    private int estado;
    private String fecha_registro;

    public Contrato() {
    }
    
    

    public Contrato(int id, Empleado empleado, Categoria categoria, String puesto_destino, String fecha_alta, String fecha_baja, int estado, String fecha_registro) {
        this.id = id;
        this.empleado = empleado;
        this.categoria = categoria;
        this.puesto_destino = puesto_destino;
        this.fecha_alta = fecha_alta;
        this.fecha_baja = fecha_baja;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getPuesto_destino() {
        return puesto_destino;
    }

    public void setPuesto_destino(String puesto_destino) {
        this.puesto_destino = puesto_destino;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(String fecha_baja) {
        this.fecha_baja = fecha_baja;
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
        return "Contrato{" + "id=" + id + ", empleado=" + empleado + ", categoria=" + categoria + ", puesto_destino=" + puesto_destino + ", fecha_alta=" + fecha_alta + ", fecha_baja=" + fecha_baja + ", estado=" + estado + ", fecha_registro=" + fecha_registro + '}';
    }
    
    
    
}
