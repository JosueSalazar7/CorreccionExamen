package Ejercicio1_Videojuegos;

public class Pc extends Juego{
    private String dificultadjuego;
    public Pc(String nombrejuego, int aniopublicacion, String generojuego, String dificultadjuego) {
        super(nombrejuego, aniopublicacion, generojuego);
        this.dificultadjuego = dificultadjuego;
    }

    public String getDificultadjuego() {
        return dificultadjuego;
    }

    public void ingresardatosjuego(){
        System.out.println("Nombre: " + getNombrejuego());
        System.out.println("Anio publicacion: " + getAniopublicacion());
        System.out.println("Genero juego: " + getGenerojuego());
        System.out.println("Dificultad juego: " + getDificultadjuego());
    }

}
