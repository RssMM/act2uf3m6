package act2uf2v3;

public class Pedido implements Gestor {
    private String producto;
    private int cantidad;

    public Pedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void procesarPedido() {
        System.out.println("El pedido ha sido creado " + this.toString() );
    }

	@Override
	public String toString() {
		return "Pedido [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
    
    

}
