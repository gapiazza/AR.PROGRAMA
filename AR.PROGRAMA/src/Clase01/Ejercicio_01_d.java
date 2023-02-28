package Clase01;

public class Ejercicio_01_d {

    public static void main(String[] args) {

        // Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
        // y “b”. Su código puede arrancar (por ejemplo):
        // A lo anterior, solo muestre los números pares
        // Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        // Se deberían mostrar los números: 14,12,10,8,6

        int numeroInicio = 5;
        int numeroFin = 14;


        for (int i = numeroFin; i >= numeroInicio; i--)
        {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
