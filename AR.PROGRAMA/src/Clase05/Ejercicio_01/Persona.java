package Clase05.Ejercicio_01;

import java.sql.Date;

public class Persona {

     // VARIABLES DE INSTANCIA / PROPIEDADES
     private String nombre;
     private String apellido;
     private String dni;
     private Date fechaNacimiento;
 
     // CONSTRUCTORES
     public Persona() { }
 
     public Persona(String nombre, String apellido) {
         this.nombre = nombre;
         this.apellido = apellido;
     }
 
     @Override
     public String toString() {
         return "Persona {" +
                 "Nombre: " + nombre + '\'' +
                 ", Apellido: " + apellido + '\'' +
                 ", DNI: " + dni + '\'' +
                 ", Fecha de Nacimiento: " + fechaNacimiento +
                 '}';
     }

    // GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
