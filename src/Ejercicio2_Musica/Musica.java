package Ejercicio2_Musica;

public abstract  class Musica  {
    String nombreartista;
    String generomusica;
    String ultimoalbum;
    int anioultimoalbum;

    protected abstract void ingresardatoscantante();
    public String getNombreartista() {
        return nombreartista;
    }

    public void setNombreartista(String nombreartista) {
        this.nombreartista = nombreartista;
    }

    public String getGeneromusica() {
        return generomusica;
    }

    public void setGeneromusica(String generomusica) {
        this.generomusica = generomusica;
    }

    public String getUltimoalbum() {
        return ultimoalbum;
    }

    public void setUltimoalbum(String ultimoalbum) {
        this.ultimoalbum = ultimoalbum;
    }

    public int getAnioultimoalbum() {
        return anioultimoalbum;
    }

    public void setAnioultimoalbum(int anioultimoalbum) {
        this.anioultimoalbum = anioultimoalbum;
    }
}
