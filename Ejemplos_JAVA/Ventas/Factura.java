package Ventas;

public class Factura {
    private float total = 0;
    private Pedido pedido;
    public Factura(Pedido pedido) {
        this.pedido=pedido;
        for (Producto p : pedido.getProductos()) {
            this.total += p.calcularTotal();
        }
    }
    public float getTotal() {
        return total;
    }
    public Pedido getPedido() {
        return pedido;
    }
}
