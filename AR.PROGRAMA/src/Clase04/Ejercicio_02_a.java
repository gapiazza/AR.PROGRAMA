package Clase04;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio_02_a {

    public static void main(String[] args) {
        
        /* 
            Haga una main donde por parámetro envíe la ruta de un archivo. 
            Ese archivo debe contener números. 
            El programa debe escribir por consola la suma de esos números.
            
            a. Al programa anterior agreguele un parámetro para que la operación 
            pueda ser suma o multiplicación.
        */
    
        if (args.length != 2) {
            System.out.println("Debe ingresar la ruta del archivo y una 's' para sumar los número o una 'm' para multiplicarlos.");
            return;
        }
        
        String route = args[0];
        // String route = "file.txt";

        int resultado = 0;
        String op = "suma";

        // Normalizo el valor inicial según si es una suma o multiplicacion.
        if(args[1].charAt(0) == 'm') {
            resultado = 1;
            op = "multiplicacion";

        } else {
            resultado = 0;
            op = "suma";
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(route))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("-?\\d+")) { // Verificar que la línea contenga un número
                    if(args[1].charAt(0) == 's')
                        resultado += Integer.parseInt(line);

                    if(args[1].charAt(0) == 'm')
                        resultado *= Integer.parseInt(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            return;
        }

        System.out.println("La " + op + " da como resultado: " + resultado);
    }
}