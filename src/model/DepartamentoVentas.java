package model;

public class DepartamentoVentas extends Departamento{

    private PersonaVentas liderVentas;

    public PersonaVentas getLiderVentas() {
        return liderVentas;
    }

    public void setLiderVentas(PersonaVentas liderVentas) {
        this.liderVentas = liderVentas;
    }

    @Override
    public String toString() {
        return "DepartamentoVentas{" +
                "liderVentas=" + liderVentas +
                '}';
    }
}
