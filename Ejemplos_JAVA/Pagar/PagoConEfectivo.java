package Pagar;

public class PagoConEfectivo implements MedioPago {
    @Override
    public void pagar(float monto) {
        System.out.println("Cobrando con efectivo: " + monto);
    }
}
