package act2uf2v3;

public class Cliente {
    private String nombre;
    private int id;

    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
