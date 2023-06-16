package model;

public class OrdenVentaCabecera {

    int idOrdenVentaCabecera;
    int idCliente;

    public int getIdOrdenVentaCabecera() {
        return idOrdenVentaCabecera;
    }

    public void setIdOrdenVentaCabecera(int idOrdenVentaCabecera) {
        this.idOrdenVentaCabecera = idOrdenVentaCabecera;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "OrdenVentaCabecera{" +
                "idOrdenVentaCabecera=" + idOrdenVentaCabecera +
                ", idCliente=" + idCliente +
                '}';
    }
}
