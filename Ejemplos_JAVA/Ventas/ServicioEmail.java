package Ventas;

public class ServicioEmail {
    public void enviar(String destinatario, String mensaje){
        System.out.println("Enviando email a " + destinatario +": "+ mensaje);
    }
}
