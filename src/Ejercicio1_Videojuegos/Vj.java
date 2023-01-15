package Ejercicio1_Videojuegos;

public abstract class Vj {
    String nombrejuego;
    int aniopublicacion;
    String generojuego;


    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public int getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(int aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public String getGenerojuego() {
        return generojuego;
    }

    public void setGenerojuego(String generojuego) {
        this.generojuego = generojuego;
    }
}
