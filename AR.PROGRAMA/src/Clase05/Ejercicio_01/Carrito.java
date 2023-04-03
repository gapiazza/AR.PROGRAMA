package Clase05.Ejercicio_01;

import java.time.LocalDate;

public class Carrito {

    // VARIABLES DE INSTANCIA / PROPIEDADES
    private Persona persona;
    private LocalDate fechaCompra;
    private Producto producto[] = new Producto[10];

    // GETTER & SETTER
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Producto[] getProducto() {
        return producto;
    }
    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }
}
