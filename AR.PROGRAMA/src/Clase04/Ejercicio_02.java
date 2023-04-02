package Clase04;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio_02 {

    public static void main(String[] args) {
        
        /* 
            Haga una main donde por parámetro envíe la ruta de un archivo. 
            Ese archivo debe contener números. 
            El programa debe escribir por consola la suma de esos números. 
        */
    
        if (args.length != 1) {
            System.out.println("Debe ingresar solo la ruta del archivo.");
            return;
        }
        
        String route = args[0];
        // String route = "file.txt";
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(route))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("-?\\d+")) { // Verificar que la línea contenga un número
                    sum += Integer.parseInt(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            return;
        }

        System.out.println("La suma da como resultado: " + sum);

    }
}