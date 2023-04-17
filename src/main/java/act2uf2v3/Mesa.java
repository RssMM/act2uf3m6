package act2uf2v3;

public class Mesa {
	private Cliente cliente;
	private Gestor pedido;
	
	public Mesa(Cliente cliente, Gestor gestor) {
		this.pedido = gestor;
		this.cliente = cliente;
	}
	
	public void procesarPedido() {
		
		System.out.println("El client " + cliente.getNombre() + " ha realitzat un pedido");
		pedido.procesarPedido();
        
    }
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Gestor getGestor() {
		return pedido;
	}

	public void setGestor(Gestor pedido) {
		this.pedido = pedido;
	}
	
}
