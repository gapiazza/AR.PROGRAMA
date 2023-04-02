package Clase04;

import java.util.Scanner;

public class Ejercicio_01_b {
    
    public static void main(String[] args) {
    
    /* Tomando los Ejercicios de la clase anterior
        haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente 
        o descendente y los muestre ordenados por tal criterio. 
        
        b. haga lo mismo, pero solicitando los parámetros de a uno por consola. */
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el 1° número: ");
        int n1 = scanner.nextInt();

        System.out.println("Ingrese el 2° número: ");
        int n2 = scanner.nextInt();

        System.out.println("Ingrese el 3° número: ");
        int n3 = scanner.nextInt();
        
        System.out.println("Ingrese a para ordernarlo asc y d para ordernarlos des: ");
        char orden = scanner.next().charAt(0);

        int vector[] = new int[3]; 
        
        
        if (orden == 'a') {
            if (n1 < n2) {
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