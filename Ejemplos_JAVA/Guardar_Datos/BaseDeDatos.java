package Guardar_Datos;

public class BaseDeDatos implements Almacenamiento{
    @Override
    public void guardar(String datos) {
        System.out.println("Guardando en archivo JSON...");
    }
}
