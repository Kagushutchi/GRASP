package Pagar;

public class PagarConTarjeta implements MedioPago {
    @Override
    public void pagar(float monto) {
        System.out.println("Cobrando con tarjeta: " + monto);
    }
}
