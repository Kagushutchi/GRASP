package Ventas;

public class Producto {
    private String nombre;
    private float precio;
    private int cantidad;
    public Producto(String nombre , float precio , int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public float calcularTotal(){
        return this.precio * this.cantidad;
    }
}
