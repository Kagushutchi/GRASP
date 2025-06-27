package Pagar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
        procesarPago(new PagarConTarjeta(), 100);
        procesarPago(new PagoConEfectivo(), 50);
        }
        public static void procesarPago(MedioPago medio_para_pagar, float monto){
        medio_para_pagar.pagar(monto);
        }
    }

