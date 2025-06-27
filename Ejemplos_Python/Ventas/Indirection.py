class ServicioEmail:
    def enviar(self, destinatario, mensaje):
        print(f"Enviando email a {destinatario}: {mensaje}")
        
class Notificador:
    def __init__(self, servicio_email):
        self.servicio_email = servicio_email


    def notificar(self, usuario, mensaje):
        self.servicio_email.enviar(usuario.email, mensaje)
# Uso
email = ServicioEmail()
notificador = Notificador(email)