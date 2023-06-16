package model;

public class OrdenVentaDetalle {

    int idOrdenVentaDetalle;
    String codigoMaterial;
    String descripcionMaterial;
    int unidades;
    int precioUnitario;
    int totalLinea;
      int idOrdenVentaCabecera;

    public int getIdOrdenVentaDetalle() {
        return idOrdenVentaDetalle;
    }

    public void setIdOrdenVentaDetalle(int idOrdenVentaDetalle) {
        this.idOrdenVentaDetalle = idOrdenVentaDetalle;
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getTotalLinea() {
        return totalLinea;
    }

    public void setTotalLinea(int totalLinea) {
        this.totalLinea = totalLinea;
    }


    public int getIdOrdenVentaCabecera() {
        return idOrdenVentaCabecera;
    }

    public void setIdOrdenVentaCabecera(int idOrdenVentaCabecera) {
        this.idOrdenVentaCabecera = idOrdenVentaCabecera;
    }

    @Override
    public String toString() {
        return "OrdenVentaDetalle{" +
                "idOrdenVentaDetalle=" + idOrdenVentaDetalle +
                ", codigoMaterial='" + codigoMaterial + '\'' +
                ", descripcionMaterial='" + descripcionMaterial + '\'' +
                ", unidades=" + unidades +
                ", precioUnitario=" + precioUnitario +
                ", totalLinea=" + totalLinea +
                ", idOrdenVentaCabecera=" + idOrdenVentaCabecera +
                '}';
    }
}
