package Clase01;

import java.util.Scanner;
public class Ejercicio_02 {

    public static void main(String[] args) {

        // Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una persona pertenece al
        // segmento de ingresos altos”. Del i al iii, la idea es hacerlo en papel y lápiz y sólo implementar el cuarto.
        //
        // “Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a todas y todos los
        // convivientes:

        // ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083 (3,5 canastas básicas para un
        //   hogar tipo 2 según el INDEC).
        // ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
        // ● Tener 3 o más inmuebles.
        // ● Poseer una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren
        //   capacidad económica plena.”
        //
        //  Tomado de https://www.argentina.gob.ar/subsidios el 07/12/2022
        //
        //  a. Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.
        //  b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo en clase, también puede
        //  consultar este link
        //  c. Piense en un arbol de decision, tambien como se vio en clase si puede resolver el problema, dadas
        //  las entradas
        //  d. Finalmente, vea si puede resolver el problema utilizando código Java. Por ejemplo si estuviésemos
        //  intentando resolver el ejemplo de monotributo tendríamos el código que se muestra más abajo, y cambiando
        //  las variables


        Scanner leer = new Scanner(System.in);
        char ingresos;
        char vehiculos;
        char inmuebles;
        char otros;

        System.out.println("+++   DETERMINACIÓN DE PERTENENCIA AL SEGMENTE DE INGRESOS ALTOS   +++ ");
        System.out.println("+++          (RESPONDA CON 'S' PARA SI Y CON 'N' PARA NO)          +++ ");

        System.out.print("1) ¿Los ingresos totales del hogar son iguales o superiores a $489.083?: ");
        ingresos = leer.next().charAt(0);

        if (ingresos == 's' || ingresos == 'S') {
            System.out.println("RESULTADO: Pertenece al segmentos de altos ingresos.v");

        } else {
            System.out.print("2) ¿Posee al menos 3 vehículos con una antiguedad menor a 5 años?: ");
            vehiculos = leer.next().charAt(0);

            if (vehiculos == 's' || vehiculos == 'S') {
                System.out.println("RESULTADO: Pertenece al segmentos de altos ingresos.v");

            } else {
                System.out.print("3) ¿Posee al menos 3 inmuebles?: ");
                inmuebles = leer.next().charAt(0);

                if (inmuebles == 's' || inmuebles == 'S') {
                    System.out.println("RESULTADO: Pertenece al segmentos de altos ingresos.v");

                } else {
                    System.out.print("4) ¿Posee una embarcación y/o aeronave de lujo y/o es titular de activos " +
                            "societarios que demuestren capacidad económica plena?: ");
                    otros = leer.next().charAt(0);

                    if (otros == 's' || otros == 'S') {
                        System.out.println("RESULTADO: Pertenece al segmentos de altos ingresos.v");

                    } else {
                        System.out.println("RESULTADO: No pertenece al segmentos de altos ingresos.v");
                    }
                }
            }
        }
    }
}
