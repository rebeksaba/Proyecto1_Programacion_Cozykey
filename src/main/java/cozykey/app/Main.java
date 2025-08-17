package cozykey.app;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Venta> ventas = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        List<Producto> catalogoBase = new ArrayList<>();
        int añadirId = 1;


        System.out.println("Bienvenid@s a Cozykey!");

        //Datos clientes
        Cliente cliente1 = new Cliente(1, "Francisco Sánchez", "11579634W", "francsamon@gmail.es", "688733622544", "C/ Parque 21, Madrid");
        Cliente cliente2 = new Cliente(2, "Julia Bautista", "46228579T", "juliabaut@gmail.es", "6644771159866", "C/ Conde 88 1ºC, Burgos");
        Cliente cliente3 = new Cliente(3, "Mustapha Ouichou", "Y50994753D", "mustapha@gmail.es", "609906606244", "Urbanización Frias 17, Torrelavega");
        Cliente cliente4 = new Cliente(4, "Miguel García", "13345579J", "miguel@gmail.es", "655000942881", "C/ Constitución nº3, Cádiz");
        Cliente cliente5 = new Cliente(5, "Rebeca Sánchez", "50067449F", "rebeca@gmail.es", "6117717554322", "C/ Guatemala 17, Talamanca");

        //Añadir clientes
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);

        //Mostrar clientes
        System.out.println("\nClientes registrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        //Productos
        // Teclados predefinidos
        catalogoBase.add(new Teclado("Teclado T1", 59.99, 50,"Red", true));
        catalogoBase.add(new Teclado("Teclado T2", 49.99, 100,"Blue", false));

        // Keycaps predefinidas
        catalogoBase.add(new Keycap("Keycap C1", 12.99, 150,"XDA", "rosa"));
        catalogoBase.add(new Keycap("Keycap C2", 13.99, 120,"MOT", "azul"));
        catalogoBase.add(new Keycap("Keycap C3", 11.99, 100,"XDA", "verde"));
        catalogoBase.add(new Keycap("Keycap C4", 14.99, 62,"MOT", "rojo"));


        //MENÚ INTERACTIVO//

        int opcion;
        do {
            System.out.println("\n--- Menú Cozykey ---");
            System.out.println("1. Gestión de clientes");
            System.out.println("2. Gestión de productos");
            System.out.println("3. Realizar venta");
            System.out.println("4. Ver historial de ventas");
            System.out.println("0. Salir");
            System.out.println("Elige una de estas opciones: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: //Gestión clientes
                    int opcionCliente;
                    do {
                        System.out.println("\n--- Gestión de clientes ---");
                        System.out.println("1. Alta de cliente");
                        System.out.println("2. Baja de cliente");
                        System.out.println("3. Modificar cliente");
                        System.out.println("4. Buscar cliente por DNI");
                        System.out.println("5. Listado de clientes");
                        System.out.println("0. Volver el menú principal");
                        System.out.println("Elige una de estas opciones: ");
                        opcionCliente = sc.nextInt();
                        sc.nextLine();

                        switch (opcionCliente) {
                            case 1: //Alta
                                System.out.println("Nombre: ");
                                String nombre = sc.nextLine();
                                System.out.println("DNI: ");
                                String dni = sc.nextLine();
                                System.out.println("Email: ");
                                String email = sc.nextLine();
                                System.out.println("Teléfono: ");
                                String telefono = sc.nextLine();
                                System.out.println("Dirección: ");
                                String direccion = sc.nextLine();
                                Cliente nuevoCliente = new Cliente(nombre, dni, email, telefono, direccion);
                                clientes.add(nuevoCliente);
                                System.out.println("Cliente añadido correctamente. ");
                                break;

                            case 2: //Baja
                                System.out.println("Introduce el DNI del cliente: ");
                                String dniEliminar = sc.nextLine();
                                boolean eliminado = clientes.removeIf(c -> c.getDNI().equalsIgnoreCase(dniEliminar));
                                if (eliminado) {
                                    System.out.println("Cliente eliminado. ");
                                } else {
                                    System.out.println("Cliente no encontrado. ");
                                }
                                break;

                            case 3: //Modificar
                                System.out.println("Introduce el DNI del cliente: ");
                                String dniModificar = sc.nextLine();

                                Cliente clienteMod = null;

                                for (Cliente c : clientes) {
                                    if (c.getDNI().equalsIgnoreCase(dniModificar)) {
                                        clienteMod = c;
                                        break;
                                    }
                                }
                                if (clienteMod != null) {
                                    System.out.println("Nuevo nombre (" + clienteMod.getNombre() + "): ");
                                    clienteMod.setNombre(sc.nextLine());
                                    System.out.println("Nuevo email (" + clienteMod.getEmail() + "): ");
                                    clienteMod.setEmail(sc.nextLine());
                                    System.out.println("Nuevo teléfono (" + clienteMod.getTelefono() + "): ");
                                    clienteMod.setTelefono(sc.nextLine());
                                    System.out.println("Nueva dirección (" + clienteMod.getDireccion() + "): ");
                                    clienteMod.setDireccion(sc.nextLine());
                                    System.out.println("Cliente modificado.");
                                    break;

                                } else {
                                    System.out.println("Cliente no encontrado");
                                }

                            case 4: //Buscar cliente por DNI
                                System.out.print("Introduce el DNI: ");
                                String dniBuscar = sc.nextLine();
                                Cliente clienteEncontrado = null;
                                for (Cliente c : clientes) {
                                    if (c.getDNI().equalsIgnoreCase(dniBuscar)) {
                                        clienteEncontrado = c;
                                        break;
                                    }
                                }
                                if (clienteEncontrado != null) {
                                    System.out.println("Cliente encontrado:");
                                    System.out.println(clienteEncontrado);
                                } else {
                                    System.out.println("Cliente no encontrado.");
                                }
                                break;

                            case 5: //Listado clientes

                                System.out.println("\nClientes dados de alta:");
                                if (clientes.isEmpty()) {
                                    System.out.println("No hay clientes registrados.");
                                } else {
                                    for (Cliente c : clientes) {
                                        System.out.println(c);
                                    }
                                }
                                break;

                            case 0:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción inválida.");
                        }
                    } while (opcionCliente != 0);
                    break;

                case 2:
                    int opcionProducto;
                    do {
                        System.out.println("\n--- Gestión de productos ---");
                        System.out.println("1. Ver catálogo");
                        System.out.println("2. Añadir producto del catálogo");
                        System.out.println("3. Crear nuevo producto");
                        System.out.println("4. Ver productos añadidos");
                        System.out.println("5. Eliminar producto añadido");
                        System.out.println("0. Volver al menú principal");
                        System.out.println("Elige una de estas opciones: ");
                        opcionProducto = sc.nextInt();
                        sc.nextLine();

                        switch (opcionProducto) {
                            case 1: //Ver catálogo
                                System.out.println("\nCatálogo disponible:");
                                for (int i = 0; i < catalogoBase.size(); i++) {
                                    System.out.println((i + 1) + ". " + catalogoBase.get(i).getDescripcion());
                                }
                                break;

                            case 2: //Añadir
                                System.out.print("\nSelecciona el número del producto que deseas añadir:");
                                for (int i = 0; i < catalogoBase.size(); i++) {
                                    System.out.println((i + 1) + ". " + catalogoBase.get(i));
                                }
                                System.out.print("Opción: ");
                                int seleccion = sc.nextInt();
                                sc.nextLine();

                                if (seleccion >= 1 && seleccion <= catalogoBase.size()) {
                                    Producto productoSeleccionado = catalogoBase.get(seleccion - 1);
                                    listaProductos.add(productoSeleccionado);
                                    System.out.println("Producto añadido correctamente.");
                                } else {
                                    System.out.println("Selección no válida.");
                                }
                                break;

                            case 3: // Crear nuevo producto
                                System.out.println("\n¿Qué tipo de producto quieres crear?");
                                System.out.println("1. Teclado");
                                System.out.println("2. Keycap");
                                System.out.print("Opción: ");
                                int tipoProducto = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Nombre del producto: ");
                                String nombre = sc.nextLine();

                                System.out.print("Precio (€): ");
                                double precio = sc.nextDouble();
                                sc.nextLine();

                                System.out.print("Stock: ");
                                int stock = sc.nextInt();
                                sc.nextLine();

                                Producto nuevoProducto = null;

                                if (tipoProducto == 1) {
                                    System.out.print("Tipo de switch: ");
                                    String tipoSwitch = sc.nextLine();

                                    System.out.print("¿Tiene cable? (s/n): ");
                                    String cableInput = sc.nextLine().toLowerCase();
                                    boolean conCable = cableInput.equals("s");

                                    nuevoProducto = new Teclado(nombre, precio, stock, tipoSwitch, conCable);

                                } else if (tipoProducto == 2) {
                                    System.out.print("Tipo de Keycap (XDA/MOT): ");
                                    String tipoKeycap = sc.nextLine();

                                    System.out.print("Color (rosa, azul, verde, rojo): ");
                                    String color = sc.nextLine();

                                    nuevoProducto = new Keycap(nombre, precio, stock, tipoKeycap, color);

                                } else {
                                    System.out.println("Opción no válida.");
                                    break;
                                }

                                listaProductos.add(nuevoProducto);
                                System.out.println("Producto creado y añadido correctamente.");
                                break;

                            case 4: // Ver productos añadidos
                                System.out.println("\nProductos añadidos:");
                                if (listaProductos.isEmpty()) {
                                    System.out.println("No hay productos añadidos.");
                                } else {
                                    for (int i = 0; i < listaProductos.size(); i++) {
                                        System.out.println((i + 1) + ". " + listaProductos.get(i));
                                    }
                                }
                                break;

                            case 5: // Eliminar producto añadido
                                System.out.println("\nProductos añadidos:");
                                for (int i = 0; i < listaProductos.size(); i++) {
                                    System.out.println((i + 1) + ". " + listaProductos.get(i));
                                }

                                System.out.print("Selecciona el número del producto que deseas eliminar: ");
                                int eliminar = sc.nextInt();
                                sc.nextLine();

                                if (eliminar >= 1 && eliminar <= listaProductos.size()) {
                                    listaProductos.remove(eliminar - 1);
                                    System.out.println("Producto eliminado correctamente.");
                                } else {
                                    System.out.println("Selección no válida.");
                                }
                                break;

                            case 0: // Volver al menú
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }

                    } while (opcionProducto != 0);
                    break;


                case 3: // Realizar venta
                    System.out.println("\nRealizar venta:");
                    System.out.println("Clientes disponibles:");
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

                    Producto[] productos = catalogoBase.toArray(new Producto[0]);
                    System.out.println("\nProductos disponibles:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i].getDescripcion());
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
                    break;


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



