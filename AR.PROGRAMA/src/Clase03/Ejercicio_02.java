package Clase03;

public class Ejercicio_02 {

    public static void main(String[] args) {

        /* 
         * Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, 
         * dado un número de desplazamiento.
         * 
         *      ● Por ejemplo, con desplazo de 1:
         *          “hola que tal” -> “ipmbarvfaubm”
         *          h -> i o -> p
         * 
         *      ● con desplazo de 2
         *          “hola que tal” -> “jqncbswgbvcn”
         *           h -> j o -> q
         * 
         * En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
         * Para este ejercicio puede usar todos los métodos de String, tanto de instancia 
         * (por ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde arr es un char[].
         * Tenga a mano los javadocs del mismo.
         */


        String text = "hola que tal";
        int desplaza = 2;
        String textCoding = coding(text, desplaza);
        String textDecoding = decoding(textCoding, desplaza);

        System.out.println(textCoding);
        System.out.println(textDecoding);

    }

    static String coding(String text, int desp) {

        String abc = "abcdefghijklmnñopqrstuvwxyz ";
        String abcCoding = "";
        String textCoding = "";

        // Armo un abc desplazado.
        for (int i = 0; i < abc.length(); i++) {
            if ((i + desp) < abc.length()) {
                abcCoding += abc.charAt(i + desp);
            } else {
                int aux = (i + desp) - (abc.length());
                abcCoding += abc.charAt(aux);
            }
        }

        // Genero un nuevo string con el abc desplazado.
        for (int i = 0; i < text.length(); i++) {
            // Primero decupero letra a letra el string a codificar.
            // En el abc "común" identifico que a que index pertenece la letra recuperada.
            // Recupero la letra del abcCoding que machea con el mismo index del abc.
            // Concateno.

            textCoding += abcCoding.charAt((abc.indexOf(text.charAt(i))));
        }

        return textCoding;
    }


    static String decoding(String text, int desp) {

        String abc = "abcdefghijklmnñopqrstuvwxyz ";
        String abcCoding = "";
        String textDecoding = "";

        // Armo un abc desplazado.
        for (int i = 0; i < abc.length(); i++) {
            if ((i + desp) < abc.length()) {
                abcCoding += abc.charAt(i + desp);
            } else {
                int aux = (i + desp) - (abc.length());
                abcCoding += abc.charAt(aux);
            }
        }

        // Genero un nuevo string con el abc desplazado.
        for (int i = 0; i < text.length(); i++) {
            // Primero decupero letra a letra el string a codificar.
            // En el abc "común" identifico que a que index pertenece la letra recuperada.
            // Recupero la letra del abcCoding que machea con el mismo index del abc.
            // Concateno.
            
            textDecoding += abc.charAt((abcCoding.indexOf(text.charAt(i))));
        }

        return textDecoding;
    }
}