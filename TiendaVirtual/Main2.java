import java.util.Scanner;

public class Main2{

  public static void main(String[]args){

    TiendaVirtual a = new TiendaVirtual("Cuidado con el Catzin");
    CarritoCompra nuevo = new CarritoCompra(2203);
    CarritoCompra nuevo2 = new CarritoCompra(2205);
    int[]idsprod = new int[50];
    int cantidad = 0;
    Scanner entrada = new Scanner(System.in);
    Persona cliente = new Persona("Daniel",2459494);
    Producto auxiliar = new Producto(123,250,"Gorra negro mate","Nike",20,"Deportes");
    Producto auxiliar2 = new Producto(567,500,"Tennis deportivos LunarLon","Nike",20,"Deportes");
    Producto auxiliar3 = new Producto(723,500,"Pantalon Skynny mezclilla","Nike",20,"Deportes");
    Producto auxiliar4 = new Producto(893,500,"Pantalon Skynny negro","Nike",20,"Deportes");
    a.darAltaProducto(auxiliar);
    a.darAltaProducto(auxiliar2);
    a.darAltaProducto(auxiliar3);
    a.darAltaProducto(auxiliar4);
    /*qSystem.out.println(cliente.getNombre()+cliente.getIdpersona());
    cliente.mostrarDescripciones(cliente.consultarProductos(a),a);*/
    /*nuevo.agregarItems(auxiliar.getIdproducto(),2);
    nuevo.modificarItem(123,10);
    /*System.out.println(nuevo.getItems().get(0).getCantidad());*/
    a.darAltaCarrito(nuevo);
    a.darAltaPersona(cliente);

    System.out.println(a);
    /*System.out.println("¿Cuántos articulos vas a comprar:");
    cantidad = entrada.nextInt();
    idsprod = cliente.leerIDs(cantidad);
    /*cliente.comprarProducto(idsprod,cantidad,a);*/

    /*int p = a.buscarProducto(123);
    System.out.println(p);*/
    /*System.out.println(a.buscarProducto(123));*/

    /*System.out.println(a.buscarProducto(123));*/


    /*System.out.println(nuevo.getItems().get(nuevo.buscarItem(123)).getCantidad());*/

  }
}
