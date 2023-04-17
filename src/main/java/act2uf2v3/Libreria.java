package act2uf2v3;

public class Libreria {
	public static void main(String[] args) {
        Cliente cliente = new Cliente("Joan", 1);
        Gestor pedido = new Pedido("Llibre", 2);
 
        
        Mesa mesa = new Mesa(cliente, pedido);
        mesa.procesarPedido();
        
        Gestor pedido2 = new Pedido("Llibre2", 4);
        mesa.setGestor(pedido2);
        mesa.procesarPedido();
        
    }
}
