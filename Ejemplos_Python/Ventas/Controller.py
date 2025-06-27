import Creator

class ControladorPedido():
    def realizar_pedido(self, datos_productos):
        pedido = Pedido()
        for datos in datos_productos:
            pedido.agregar_producto(*datos)
        return pedido
controlador = ControladorPedido()
pedido = controlador.realizar_pedido([
    ("Pan", 1.5, 4),
    ("Leche", 0.9, 2)
])
