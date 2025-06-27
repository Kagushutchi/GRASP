package Ventas;

public class Cajaregistradora {


    public int devolverVuelto(int montoTotla, int pago){
        return calcularVuelto(montoTotla,pago);
    }
    private int calcularVuelto(int montoTotal, int pago){
        return pago-montoTotal;
    }
}
