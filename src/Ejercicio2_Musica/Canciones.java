package Ejercicio2_Musica;

public class Canciones extends Artista1{
    private String tituloprimeracancion;

    public Canciones(String nombre, String genero, String ultimo, int anio, String tituloprimeracancion) {
        super(nombre, genero, ultimo, anio);
        this.tituloprimeracancion = tituloprimeracancion;
    }

    public String getTituloprimeracancion() {
        return tituloprimeracancion;
    }
}
