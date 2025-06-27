class Producto:
    def __init__(self, nombre, precio, cantidad):
        self.nombre = nombre
        self.precio = precio
        self.cantidad = cantidad
    def calcular_total(self):
        return self.precio * self.cantidad
producto = Producto("Manzana", 2.0, 5)
print(producto.calcular_total())  # 10.0
