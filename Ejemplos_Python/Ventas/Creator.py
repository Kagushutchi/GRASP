class Pedido:
    def __init__(self):
        self.productos = []
    def agregar_producto(self, nombre, precio, cantidad):
        producto = Producto(nombre, precio, cantidad)
        self.productos.append(producto)
class Producto:
    def __init__(self, nombre, precio, cantidad):
        self.nombre = nombre
        self.precio = precio
        self.cantidad = cantidad