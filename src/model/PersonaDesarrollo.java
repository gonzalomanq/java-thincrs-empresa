package model;

public class PersonaDesarrollo extends Persona{

    private String conocimientosTecnicos;

    public String getConocimientosTecnicos() {
        return conocimientosTecnicos;
    }

    public void setConocimientosTecnicos(String conocimientosTecnicos) {
        this.conocimientosTecnicos = conocimientosTecnicos;
    }

    @Override
    public String toString() {
        return "PersonaDesarrollo{" +
                "conocimientosTecnicos='" + conocimientosTecnicos + '\'' +
                '}';
    }
}
