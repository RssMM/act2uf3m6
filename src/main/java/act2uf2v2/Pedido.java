package act2uf2v2;

public class Pedido {
	
    private String producto;
    private int cantidad;
    private Cliente cliente;

    public Pedido(String producto, int cantidad, Cliente cliente) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.cliente = cliente;
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

    public void procesarPedido() {
        System.out.println("El client " + cliente.getNombre() + " ha realitzat un pedido de " + cantidad + " " + producto + ".");
    }
}