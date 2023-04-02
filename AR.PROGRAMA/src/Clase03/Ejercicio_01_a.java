package Clase03;

public class Ejercicio_01_a {

    public static void main(String[] args) {

        /* Utilizando solo tipos primitivos, String (solo usar método length), vectores, iteraciones simples y condicionales, 
        genere una clase por ejercicio que posea los siguientes métodos:
            
        a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String. */

        String texto = "Hola mundo!";
        char letraBuscada = 'o';
        int cant = 0;

        for (int i=0; i < texto.length(); i++) {
            if (texto.charAt(i) == letraBuscada)
                cant++;
        }

        System.out.println("La leta \"" + letraBuscada + "\" aparece " + cant + " veces en el texto: \"" + texto + "\"");
    }
}
