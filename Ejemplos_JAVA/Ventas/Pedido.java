package Ventas;

import java.util.ArrayList;
public class Pedido {
    protected ArrayList<Producto> productos;
    public Pedido() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(String nombre,float precio, int cantidad){
        Producto producto= new Producto(nombre,precio,cantidad);
        this.productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
}
