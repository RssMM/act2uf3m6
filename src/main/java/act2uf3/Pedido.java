package act2uf3;

public class Pedido {
	
    private String producto;
    private int cantidad;
    private Cliente cliente = new Cliente("Joan", 1);

    public Pedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public void procesarPedido() {
        System.out.println("El client " + getCliente().getNombre() + " ha realitzat un pedido de " + getCantidad() + " " + getProducto() + ".");
    }

	public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
