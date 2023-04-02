public class ClaseUno {

    public static void main(String[] args) {

        // Ejercicio 1. a
        System.out.println("Ejercicio 1.a");
        int a = 5;
        int b = 15;
        while (a<b) {
            System.out.println(a);
            a = a + 1 ;
        }

        // Ejercicio 1. b
        System.out.println("Ejercicio 1.b");
        a = 5;
        b = 15;
        while (a<b) {
            if (a % 2 == 0) {
                System.out.println("Pares");
                System.out.println(a);
            }
            a = a + 1 ;
        }

        // Ejercicio 1. c
        System.out.println("Ejercicio 1.c");
        char mostrarParOImpar = 'p';
        a = 5;
        b = 15;
        while (a<b) {
            char resultado = 'p';
            if (a % 2 == 0) {
                resultado = 'p';
            } else {
                resultado = 'i';
            }
            if (mostrarParOImpar==resultado) {
                System.out.println(mostrarParOImpar);
                System.out.println(a);
            }
            a = a + 1 ;
        }


        //Ejercicio 1.4
        System.out.println("Ejercicio 1.4_impares");
        a = 5;
        for(b=15; b > a; b-=2)
        {
            System.out.println(b);
        }

        //Ejercicio 1.4
        System.out.println("Ejercicio 1.4_pares");
        a = 5;
        for(b=15; b > a; b--)
        {
            if (b % 2 ==0) {
                System.out.println(b);
            }
        }
    }
}