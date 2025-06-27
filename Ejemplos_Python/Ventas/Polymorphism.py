class MedioPago:
    def pagar(self, monto):
        raise NotImplementedError
    
class PagoConTarjeta(MedioPago): 
    def pagar(self, monto):
        print(f"Pagando {monto} con tarjeta.")
        
class PagoConEfectivo(MedioPago):
    def pagar(self, monto):
        print(f"Pagando {monto} en efectivo.")
        
def procesar_pago(medio: MedioPago, monto):
    medio.pagar(monto)

    
procesar_pago(PagoConTarjeta(), 100)
procesar_pago(PagoConEfectivo(), 50)