package Ventas;

public class Notificador {
    private ServicioEmail servicio_email;
    public Notificador(ServicioEmail servicio_email){
        this.servicio_email= servicio_email;
    }
    public void notificar(String usuario, String mensaje){
        this.servicio_email.enviar(usuario, mensaje);
    }
}
