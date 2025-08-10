package cozykey.app;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Venta> ventas = new ArrayList<>();

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

        //MENÚ INTERACTIVO//

        int opcion;
        do {
            System.out.println("\n--- Menú Cozykey ---");
            System.out.println("1. Ver clientes");
            System.out.println("2. Ver productos");
            System.out.println("3. Realizar venta");
            System.out.println("4. Ver historial de ventas");
            System.out.println("0. Salir");
            System.out.println("Elige una de estas opciones: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nClientes dados de alta:");
                    System.out.println(cliente1);
                    System.out.println(cliente2);
                    System.out.println(cliente3);
                    System.out.println(cliente4);
                    System.out.println(cliente5);
                    break;

                case 2:
                    System.out.println("\nTeclados disponibles:");
                    System.out.println(t1.getDescripcion());
                    System.out.println(t2.getDescripcion());

                    System.out.println("\nKeycaps disponibles:");
                    System.out.println(C1.getDescripcion());
                    System.out.println(C2.getDescripcion());
                    System.out.println(C3.getDescripcion());
                    System.out.println(C4.getDescripcion());
                    break;

                case 3:
                    System.out.println("\nRealizar venta:");
                    System.out.println("Clientes disponibles:");
                    Cliente[] clientes = {cliente1, cliente2, cliente3, cliente4, cliente5};
                    for (Cliente c : clientes) {
                        System.out.println(c.getId() + ". " + c.getNombre());
                    }
                    System.out.println("Introduce el ID del cliente:");
                    int idCliente = sc.nextInt();
                    sc.nextLine();

                    Cliente clienteSeleccionado = null;
                    for (Cliente c : clientes) {
                        if (c.getId() == idCliente) {
                            clienteSeleccionado = c;
                            break;
                        }
                    }
                    if (clienteSeleccionado == null) {
                        System.out.println("Cliente no existe.");
                        break;
                    }

                    System.out.println("Introduce la fecha de la venta:");
                    String fechaVenta = sc.nextLine();
                    Venta nuevaVenta = new Venta(clienteSeleccionado, fechaVenta);

                    Producto[] productos = {t1, t2, C1, C2, C3, C4};
                    System.out.println("\nProductos disponibles:");
                    for (int i= 0; i < productos.length; i++) {
                        System.out.println((i+ 1) + ". " + productos[i].getDescripcion());
                    }

                    String añadir;
                    do {
                        System.out.println("Introduce el núemro del producto que desea añadir: ");
                        int numProducto = sc.nextInt();
                        sc.nextLine();

                        if (numProducto >= 1 && numProducto <= productos.length) {
                            nuevaVenta.añadirProducto(productos[numProducto - 1]);
                            System.out.println("Producto añadido.");

                        } else {
                            System.out.println("Número no válido.");
                        }
                        System.out.println("¿Quieres añadir otro producto? (s/n): ");
                        añadir = sc.nextLine().toLowerCase();
                    } while (añadir.equals("s"));

                    ventas.add(nuevaVenta);
                    System.out.println("\nVenta añadida!.");
                    System.out.println(nuevaVenta);
                    break;

                case 4:
                    System.out.println("\nHistorial de ventas:");
                    for (Venta v : ventas) {
                        System.out.println(v);
                    }
                    break;

                case 0:
                    System.out.println("Gracias, hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida");

            }
        } while (opcion != 0);


    }

}


/*
        //Crear venta EJEMPLO:

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
 */



