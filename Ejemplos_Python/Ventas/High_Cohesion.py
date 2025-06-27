import Low_Coupling

class ReporteVentas:
    def __init__(self, ventas):
        self.ventas = ventas
        
    def total_ventas(self):
        return sum(v.total for v in self.ventas)
    
    def cantidad_productos(self):
        return sum(len(v.productos) for v in self.ventas)