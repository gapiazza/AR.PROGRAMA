package Clase03;

public class Ejercicio_01_c {

    public static void main(String[] args) {

        /* Utilizando solo tipos primitivos, String (solo usar método length), vectores, iteraciones simples y condicionales, 
        genere una clase por ejercicio que posea los siguientes métodos:
            
        c. Dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado. */

        int numeros[] = {3,1,5,7,8,2,6,4,9};
        int x = 5;
        int sum = 0;

        for (int num : numeros) {
            if ( num > x)
                sum += num;
        }

        System.out.println("Las suma de los números mayores a \"" + x + "\" es: " + sum);
    }
}