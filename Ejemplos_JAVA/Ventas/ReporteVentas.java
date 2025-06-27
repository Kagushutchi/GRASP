package Ventas;

import java.util.ArrayList;
public class ReporteVentas {
    ArrayList<Factura> ventas;
    public ReporteVentas(ArrayList<Factura> ventas){
        this.ventas = ventas;
    }
    public float totalVentas(){
        float total= 0;
        for (Factura f : ventas){
            total+= f.getTotal();
        }
        return total;
    }
    public int cantidadProductos(){
        int cantidad=0;
        for (Factura f : ventas){
            cantidad += f.getPedido().getProductos().size();
        }
        return cantidad;
    }
}
