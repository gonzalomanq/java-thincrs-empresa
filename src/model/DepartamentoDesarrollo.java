package model;

public class DepartamentoDesarrollo extends Departamento{

    private PersonaDesarrollo liderTecnico;

    public PersonaDesarrollo getLiderTecnico() {
        return liderTecnico;
    }

    public void setLiderTecnico(PersonaDesarrollo liderTecnico) {
        this.liderTecnico = liderTecnico;
    }

    @Override
    public String toString() {
        return "DepartamentoDesarrollo{" +
                "liderTecnico=" + liderTecnico +
                '}';
    }
}
