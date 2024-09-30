import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner teclado = new Scanner(System.in);
//        Duvan felipe nieto hernandez id 92736

        Producto producto1 = new Producto("001", "Laptop", 1500.0);
        Producto producto2 = new Producto("002", "Smartphone", 800.0);
        Producto producto3 = new Producto("003", "Tablet", 300.0);


        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);


            System.out.println("Productos en la tienda:");
            tienda.mostrarProductos();

            System.out.println("\nBusca el producto que necesite:");

            Producto buscado = tienda.buscarProducto(teclado.nextLine());
            if (buscado != null) {
                System.out.println(buscado);
            } else {
                System.out.println("Producto no encontrado.");
            }


    }
}