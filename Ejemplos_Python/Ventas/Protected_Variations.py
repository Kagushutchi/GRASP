class Almacenamiento:
    def guardar(self, datos):
        raise NotImplementedError
    
class BaseDeDatos(Almacenamiento):
    def guardar(self, datos):
        print("Guardando en base de datos...")
        
class ArchivoJSON(Almacenamiento):
    def guardar(self, datos):
        print("Guardando en archivo JSON...")
        
def guardar_datos(almacenador: Almacenamiento, datos):
    almacenador.guardar(datos)
    
# Tiene un uso flexible y protegido frente a cambios.
guardar_datos(BaseDeDatos(), {"cliente": "Ana"})
guardar_datos(ArchivoJSON(), {"cliente": "Ana"}) 