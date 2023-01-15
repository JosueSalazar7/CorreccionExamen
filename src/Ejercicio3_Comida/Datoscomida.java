package Ejercicio3_Comida;

public class Datoscomida extends  Pais{
    private String costo;

    public Datoscomida(String plato, String acompaniante, String nombrepais, String costo) {
        super(plato, acompaniante, nombrepais);
        this.costo = costo;
    }
    @Override
    public void ingresardatos(){
        System.out.println("Nombre: " + getNombreplato());
        System.out.println("Acompañado del plato: " + getAcompañante());
        System.out.println("Pais de origen del plato: " + getNombrepais());
        System.out.println("Costo del plato: " + getCosto());
    }

    public String getCosto() {
        return costo;
    }
}
