package Clase04;

// import Clase04.Ejercicio_01_a;
// import Clase04.Ejercicio_01_b;

public class Ejercicio_01_c {
    
    public static void main(String[] args) {
    
    /* Tomando los Ejercicios de la clase anterior
        haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente 
        o descendente y los muestre ordenados por tal criterio. 
        
        c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
        si no detecta ninguno. Vea si con una función puede evitar repetir código. */
    

        if (args.length == 4) {
            Ejercicio_01_a.main(args);
        
        } else {
            Ejercicio_01_b.main(args);
        }
    }
}