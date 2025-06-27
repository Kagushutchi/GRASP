import Creator

class Factura:
    def __init__(self, pedido):
        self.total = sum(p.calcular_total() for p in pedido.productos)