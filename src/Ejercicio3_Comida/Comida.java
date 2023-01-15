package Ejercicio3_Comida;

public abstract  class Comida {
    String nombreplato;
    String acompañante;
    protected abstract void ingresardatos();
    public String getNombreplato() {
        return nombreplato;
    }

    public String getAcompañante() {
        return acompañante;
    }
}
