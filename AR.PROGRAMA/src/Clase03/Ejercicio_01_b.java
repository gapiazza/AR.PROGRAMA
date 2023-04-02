package Clase03;

public class Ejercicio_01_b {

    public static void main(String[] args) {

        /* Utilizando solo tipos primitivos, String (solo usar método length), vectores, iteraciones simples y condicionales, 
        genere una clase por ejercicio que posea los siguientes métodos:
            
        b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3. */

        int n1 = 5;
        int n2 = 7;
        int n3 = 3;
        int vector[] = new int[3]; 

        char orden = 'a'; // a = ASC y d = DESC

        if (orden == 'a') {
            if (n1 > n2) {
                if (n1 < n3) {
                    vector[0] = n1;
                    if (n2 < n3) {
                        vector[1] = n2;
                        vector[2] = n3;
                    } else {
                        vector[1] = n3;
                        vector[2] = n2;
                    }
                } else {
                    vector[0] = n3;
                    if (n1 < n2) {
                        vector[1] = n1;
                        vector[2] = n2;
                    } else {
                        vector[1] = n2;
                        vector[2] = n1;
                    }
                }
            } else {
                if(n2 < n3) {
                    vector[0] = n2;
                    if (n1 < n3) {
                        vector[1] = n1;
                        vector[2] = n3;
                    } else {
                        vector[1] = n3;
                        vector[2] = n1;
                    }
                } else {
                    vector[0] = n3;
                    if (n1 < n2) {
                        vector[1] = n1;
                        vector[2] = n2;
                    } else {
                        vector[1] = n2;
                        vector[2] = n1;
                    }
                }
            }

        } else if (orden == 'd') {
            if (n1 > n2) {
                if (n1 > n3) {
                    vector[0] = n1;
                    if (n2 > n3) {
                        vector[1] = n2;
                        vector[2] = n3;
                    } else {
                        vector[1] = n3;
                        vector[2] = n2;
                    }
                } else {
                    vector[0] = n3;
                    if (n1 > n2) {
                        vector[1] = n1;
                        vector[2] = n2;
                    } else {
                        vector[1] = n2;
                        vector[2] = n1;
                    }
                }
            } else {
                if(n2 > n3) {
                    vector[0] = n2;
                    if (n1 > n3) {
                        vector[1] = n1;
                        vector[2] = n3;
                    } else {
                        vector[1] = n3;
                        vector[2] = n1;
                    }
                } else {
                    vector[0] = n3;
                    if (n1 > n2) {
                        vector[1] = n1;
                        vector[2] = n2;
                    } else {
                        vector[1] = n2;
                        vector[2] = n1;
                    }
                }
             }
        }

        System.out.println("El vector quedó de la siguiente manera: ");
        for (int num : vector) {
            System.out.println(num);
        }
    }
}
