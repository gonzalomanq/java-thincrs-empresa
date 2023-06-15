package model;

public class Departamento {

    //puede ser dpto. desarrollo, ventas,
    private int idDepartamento;
    private String nombreDepartamento;
    private String descripcion;

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "idDepartamento=" + idDepartamento +
                ", nombreDepartamento='" + nombreDepartamento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
