package model;

public class Material extends OrdenVentaDetalle {

    int idMaterial;
    String codigoMaterial;
    String descripcionMaterial;

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    @Override
    public String toString() {
        return "Material{" +
                "idMaterial=" + idMaterial +
                ", codigoMaterial='" + codigoMaterial + '\'' +
                ", descripcionMaterial='" + descripcionMaterial + '\'' +
                '}';
    }
}
