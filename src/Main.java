import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ejercicio2_Musica.*;
import Ejercicio1_Videojuegos.*;
import Ejercicio3_Comida.Datoscomida;

public class Main {
    static List juego = new ArrayList();
    static List comida = new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        List  musica = new ArrayList();

        try {
            do {
                System.out.println("\t****MENU****");
                System.out.println("\n1. Ejercicio 1 Videojuegos");
                System.out.println("2. Ejercicio 2 Musica");
                System.out.println("3. Ejercicio 3 Comida a nivel mundial");
                System.out.print("\nEscoja una opcion: ");
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 3){
                    System.out.println("\nLa respuesta ingresada es incorrecta vuelva a intentarlo");
                }
            }while (opcion < 1 || opcion > 3);
            switch (opcion){
                case 1:
                    System.out.println("\nEjercicio 1 videojuegos");
                    juego.add(new Pc("Rocekt League",2015,"Carros","Medio"));
                    juego.add(new Pc("Fortnite",2017,"Guerra","Medio"));
                    juego.add(new Pc("Fall guys",2019,"Parkour","Facil"));
                    imprimirJuego((ArrayList) juego);
                    break;
                case 2:
                    System.out.println("\nEjercicio 2 Musica");
                    musica.add(new Canciones("Bad Bunny", "Regeton", "x100",2019,"Tu no vive asi"));
                    musica.add(new Canciones("Morat", "POP", "Si ayer fuera hoy",2022,"Segundos platos"));
                    musica.add(new Canciones("Sebastian Yatra", "POP", "Dharma",2022,"Como mirarte"));

                    imprimirMusica((ArrayList)musica);
                    break;
                case 3:
                    System.out.println("\nEjercicio 3 Comida");
                    comida.add(new Datoscomida("Encebollado","Chifle","Ecuador","2.50"));
                    comida.add(new Datoscomida("Pachamanca","Canguil","Peru","3.00"));
                    comida.add(new Datoscomida("Bandeja paisa","Cerveza","Colombia","5.00"));
                    imprimirComida((ArrayList)comida);
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void imprimirMusica(ArrayList musica){
        for (int i=0; i<musica.size();i++){
            Canciones a = (Canciones) musica.get(i);
            System.out.println("Cancion [" + (i+1) + "]");
            System.out.println("Nombre: " + a.getNombreartista());
            System.out.println("Genero: " + a.getGeneromusica());
            System.out.println("Ultimo album: " + a.getUltimoalbum());
            System.out.println("Anio ultimo album: " + a.getAnioultimoalbum());
            System.out.println("Primera cancion: " + a.getTituloprimeracancion());
            System.out.println();
        }
    }
    private static void imprimirJuego(ArrayList juegp){
        for (int i=0; i<juego.size();i++){
            Pc p = (Pc) juego.get(i);
            System.out.println("Videojuego [" + (i+1) + "]");
            p.ingresardatosjuego();
            System.out.println();
        }
    }
    private static void imprimirComida(ArrayList comida){
        for (int i=0; i<comida.size();i++){
            Datoscomida d = (Datoscomida) comida.get(i);
            System.out.println("Comida [" + (i+1) + "]");
            d.ingresardatos();
            System.out.println();
        }
    }

}
