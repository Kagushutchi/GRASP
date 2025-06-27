package Guardar_Datos;
public class Main {
    public static void main(String[] args){
     guardarDatos(new BaseDeDatos(),"Cliente: Ana");
     guardarDatos(new BaseDeDatos(),"Cliente: Ana");
    }
    public static void guardarDatos(Almacenamiento almacenador, String datos){
        almacenador.guardar(datos);
    }
}
