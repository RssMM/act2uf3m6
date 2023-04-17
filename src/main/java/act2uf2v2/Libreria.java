package act2uf2v2;

public class Libreria {
	
	public static void main(String[] args) {
		
        Pedido pedido = new Pedido("Llibre", 2, new Cliente("Joan", 1));
        pedido.procesarPedido();
    }
	
}
