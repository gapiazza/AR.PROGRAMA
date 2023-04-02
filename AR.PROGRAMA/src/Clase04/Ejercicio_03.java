package Clase04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ejercicio_03 {

    public static void main(String[] args) {

        /* 
            Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una 
            codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la 
            entrada y otro para la salida. Que por pantalla solo indique si terminó o no correctamente, 
            los resultados deben estar en el archivo de salida.
         */

         if (args.length != 4) {
            System.out.println("Debe ingresar ruta del archivo de entrada, ruta del archivo de salida, 'c' si es para codificar, 'd' si es para decodificar y el desplazamiento.");
            return;
        }
        
        String routeFileEntrada = args[0];
        String routeFileSalida = args[1];
        String operacion = args[2];
        String desplazamiento = args[3];

        try (BufferedReader reader = new BufferedReader(new FileReader(routeFileEntrada))) {
            // Crear el objeto FileOutputStream y PrintStream para el archivo de salida.
            FileOutputStream fos = new FileOutputStream(routeFileSalida);
            PrintStream ps = new PrintStream(fos);
            
            String line;
            while ((line = reader.readLine()) != null) {
                if (operacion.charAt(0) == 'c') {
                    String textCoding = coding(line, Integer.parseInt(desplazamiento));
                    // Escribir en el objeto PrintStream en lugar de System.out.
                    ps.println(textCoding);
                }

                if (operacion.charAt(0) == 'd') {
                    String textDecoding = decoding(line, Integer.parseInt(desplazamiento));
                    // Escribir en el objeto PrintStream en lugar de System.out.
                    ps.println(textDecoding);
                }
            }

            // Cerrar el objeto PrintStream y FileOutputStream.
            ps.close();
            fos.close();

            System.out.println("La operación se completó correctamente.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            return;
        }

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
