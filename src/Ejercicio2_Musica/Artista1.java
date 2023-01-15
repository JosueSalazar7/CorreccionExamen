package Ejercicio2_Musica;

public class Artista1 extends Musica {
    private String nombre;
    private String genero;
    private String ultimo;
    private int anio;

    public Artista1(String nombre, String genero, String ultimo, int anio) {
        this.nombre = nombre;
        this.genero = genero;
        this.ultimo = ultimo;
        this.anio = anio;
        ingresardatoscantante();
    }
    @Override
    protected void ingresardatoscantante(){
        this.nombreartista = nombre;
        this.generomusica = genero;
        this.ultimoalbum = ultimo;
        this.anioultimoalbum = anio;
    }

}
