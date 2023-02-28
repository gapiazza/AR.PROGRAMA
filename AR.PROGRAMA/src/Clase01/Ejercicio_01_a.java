package Clase01;

public class Ejercicio_01_a {

    public static void main(String[] args) {

        // Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
        // y “b”. Su código puede arrancar (por ejemplo):
        // Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14

        int numeroInicio = 5;
        int numeroFin = 14;

        while(numeroInicio <=numeroFin)
        {
            System.out.println(numeroInicio);
            numeroInicio++;
        }
    }
}
