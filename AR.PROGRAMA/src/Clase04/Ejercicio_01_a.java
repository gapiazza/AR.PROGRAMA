package Clase04;

public class Ejercicio_01_a {
    
    public static void main(String[] args) {
    
    /* Tomando los Ejercicios de la clase anterior
        a. haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente 
        o descendente y los muestre ordenados por tal criterio. */
    
        if (args.length != 4) {
            System.out.println("Debe ingresar 3 números y una letra (a/d) por parámetro.");
            return;
        }
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        char orden = args[3].charAt(0);
        int vector[] = new int[3]; 
        
        if (orden != 'a' && orden != 'd') {
            System.out.println("La letra debe ser 'a' para orden ascendente o 'd' para orden descendente.");
            return;
        }

        
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