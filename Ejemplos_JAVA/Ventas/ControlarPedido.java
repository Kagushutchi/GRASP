package Ventas;

import java.util.ArrayList;

public class ControlarPedido {

    public Pedido realizarPedido(ArrayList<Object[]> datosProdcutos){
        Pedido pedido = new Pedido();

        for (Object[] datos : datosProdcutos){
            String nombre = (String) datos[0];
            float precio = (float) datos[1];
            int cantidad = (int) datos[2];
            pedido.agregarProducto(nombre, precio, cantidad);
        }
        return pedido;
    }
}
