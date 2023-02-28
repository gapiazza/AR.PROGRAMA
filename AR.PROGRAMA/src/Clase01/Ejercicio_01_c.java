package Clase01;

import java.util.Scanner;
public class Ejercicio_01_c {

    public static void main(String[] args) {

        // Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
        // y “b”. Su código puede arrancar (por ejemplo):
        // A lo anterior, solo muestre los números pares
        // A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
        // Se deberían mostrar los números: 6,8,10,12,14 ó 5,7,8,11,13

        int numeroInicio = 5;
        int numeroFin = 14;
        int eleccion;
        Scanner leer = new Scanner(System.in);


        System.out.print("Para mostrar número inpares digite 1 y para pares 2: ");
        eleccion = leer.nextInt();

        while(numeroInicio <= numeroFin)
        {
            if (eleccion == 1 && numeroInicio % 2 != 0) {
                System.out.println(numeroInicio);

            } else if (eleccion == 2 && numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);

            }

            numeroInicio++;
        }
    }
}
