package cozykey.app;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenid@s a Cozykey!");

        //Datos clientes
        Cliente cliente1 = new Cliente(1, "Francisco Sánchez", "11579634W", "francsamon@gmail.es", "688733622544", "C/ Parque 21, Madrid");
        Cliente cliente2 = new Cliente(2, "Julia Bautista", "46228579T", "juliabaut@gmail.es", "6644771159866", "C/ Conde 88 1ºC, Burgos");
        Cliente cliente3 = new Cliente(3, "Mustapha Ouichou", "Y50994753D", "mustapha@gmail.es", "609906606244", "Urbanización Frias 17, Torrelavega");
        Cliente cliente4 = new Cliente(4, "Miguel García", "13345579J", "miguel@gmail.es", "655000942881", "C/ Constitución nº3, Cádiz");
        Cliente cliente5 = new Cliente(5, "Rebeca Sánchez", "50067449F", "rebeca@gmail.es", "6117717554322", "C/ Guatemala 17, Talamanca");

        //Mostrar clientes
        System.out.println("\nClientes registrados:");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);

        //Productos
        //Teclados
        Teclado t1 = new Teclado("CozyKey 75% ", 89.99, "red", true);
        Teclado t2 = new Teclado("CozyKey Wireless ", 109.99, "blue", false);

        System.out.println("\nProductos disponibles:");
        System.out.println(t1.getDescripcion());
        System.out.println(t2.getDescripcion());

        //Keycaps
        Keycap C1 = new Keycap("Modelo gato ", 39.99, "XDA", "rosa");
        Keycap C2 = new Keycap("Modelo vaca ", 39.99, "MOT", "azul");
        Keycap C3 = new Keycap("Modelo panda ", 34.99, "XDA", "verde");
        Keycap C4 = new Keycap("Modelo perro ", 29.99, "XDA", "rojo");

        System.out.println("\nKeycaps disponibles:");
        System.out.println(C1.getDescripcion());
        System.out.println(C2.getDescripcion());
        System.out.println(C3.getDescripcion());
        System.out.println(C4.getDescripcion());

        //Crear venta
        Venta venta1 = new Venta(cliente1, "10/08/2025");

        //Añadir productos
        venta1.añadirProducto(t1);  //teclado
        venta1.añadirProducto(C4); //keycap

        //Resumen venta
        System.out.println("\nDatos de venta:");
        System.out.println(venta1);

        //Productos comprados
        System.out.println("\nProductos de la venta:");
        for (Producto p : venta1.getProductos()) {
            System.out.println("- " + p.getNombre() + " (€" + p.getPrecio() + ")");
        }




    }

}