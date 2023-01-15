package Ejercicio3_Comida;

public class Pais extends Comida {

    private String plato;

    private String acompaniantee;
    private String nombrepais;

    public Pais(String plato, String acompaniantee, String nombrepais) {
        this.nombreplato = plato;
        this.acompañante = acompaniantee;
        this.nombrepais = nombrepais;
    }
    @Override
    protected void ingresardatos(){
        this.nombreplato = plato;
        this.acompañante = acompaniantee;
        this.nombrepais = nombrepais;
    }
    public String getNombrepais() {
        return nombrepais;
    }
}
