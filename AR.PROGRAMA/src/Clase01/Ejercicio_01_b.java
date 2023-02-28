package Clase01;

public class Ejercicio_01_b {

    public static void main(String[] args) {

        // Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
        // y “b”. Su código puede arrancar (por ejemplo):
        // A lo anterior, solo muestre los números pares
        // Se deberían mostrar los números: 6,8,10,12,14

        int numeroInicio = 5;
        int numeroFin = 14;


        while(numeroInicio <=numeroFin)
        {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        }
    }
}
