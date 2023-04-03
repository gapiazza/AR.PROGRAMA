package Clase05.Ejercicio_01;

import java.time.LocalDate;

public class Producto {

    // VARIABLES DE INSTANCIA / PROPIEDADES
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private Integer pesoKg;
    private Double precio;
    private static final Double minPrecio = 0.1;

    // CONSTRUCTORES
    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }

    @Override
     public String toString() {
         return "Producto {" +
                 "Nombre: " + nombre + '\'' +
                 ", Descripción: " + descripcion + '\'' +
                 ", Fecha de alta: " + fechaAlta + '\'' +
                 ", Peso en KG: " + pesoKg + '\'' +
                 ", Precio: " + precio + '\'' +
                 '}';
     }

     // GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Integer pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static Double getMinprecio() {
        return minPrecio;
    }
}
