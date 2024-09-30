import java.util.HashMap;

public class Tienda {
    private HashMap<String, Producto> productos;

    public Tienda() {
        productos = new HashMap<>();
    }


    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }


    public Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            for (Producto producto : productos.values()) {
                System.out.println(producto);
            }
        }
    }
}
