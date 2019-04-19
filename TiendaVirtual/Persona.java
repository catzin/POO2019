import java.util.Scanner;

public class Persona{
  private String nombre;
  private int idPersona;

  /**
  @param nombre. Nombre que se asginará al nuevo objeto.
  @param idPersona. id que se asignará al nuevo objeto.
  */
  public Persona(String nombre , int idPersona){
    this.nombre = nombre;
    this.idPersona = idPersona;

  }

  /**
  Metodo getNombre, nos permite obtener el nombre de la Persona.
  */

  public String getNombre(){
    return nombre;
  }
  /**
  @return nombre. Retorna el nombre de la persona.
  */
  public int getIdpersona(){
    return idPersona;
  }

  /**
  Metodo setIdpersona, nos permite modificar el id de la persona.
  @param idPersona. nuevo id que se asignará.
  */

  public void setIdpersona(int idPersona){
    this.idPersona = idPersona;
  }
  /**
  Metodo setIdpersona, nos permite modificar el id de la persona.
  @param nombre. nuevo nombre que se asignará.
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /**
  Metodo consultarProductos nos obtener el arreglo de productos de una TiendaVirtual
  y asi construir un nuevo arreglo solamente con las descripciones.

  @param descripciones. TiendaVirtual con Arreglo que contiene los productos.

  */
  public String[] consultarProductos(TiendaVirtual v){

    int i = 0;
    Producto[] aux = new Producto[50];
    String[]descripciones = new String[50];

    aux = v.getProductos();

    for(i = 0 ; i < v.contarProductos();i++){

     descripciones[i] = aux[i].getDescripcion()+"\t"+"Marca:\t"+aux[i].getMarca() +"\t"+"Precio :\t"+aux[i].getPrecio()+"\t"+
     "ID:\t"+ aux[i].getIdproducto();

    }


    return descripciones;

  }
  /**
  Metodo mostrarDescripciones nos permite mostrar la descripcion de cada uno de los productos existentes
  en una determinada TiendaVirtual.
  @param descripciones. Arreglo que contiene las descripciones de los productos.
  @param v. TiendaVirtual de las cuales se obtendrá el tamaño de productos que contiene.
  */
  public void mostrarDescripciones(String[] descripciones , TiendaVirtual v){
    int i = 0;

    for(i = 0; i < v.contarProductos();i++){
      System.out.println(descripciones[i]);
    }

  }


  public int[] leerIDs(int cantidad){

    int[]ids = new int[50];

    Scanner entrada = new Scanner(System.in);
    int i = 0;

    for(i = 0 ; i < cantidad ; i++){
       System.out.println("Igresa ID del producto\t"+(i+1));
      ids[i]  = entrada.nextInt();

    }

    return ids;


  }


  public void comprarProducto(int[] idsProd , int cuantos , TiendaVirtual a){

    int id = 0;
    int cantidad = 0;
    int posicionaux = 0;
    Producto [] temp  = a.getProductos();
    CarritoCompra aux = new CarritoCompra();

    for(int i = 0; i < cuantos ; i++){
      posicionaux = a.buscarProducto(idsProd[i]);
      cantidad = temp[posicionaux].getCantidad();

      ITEM creado = new ITEM(id,cantidad);

      aux.agregarItem(creado);

    }
      a.darAltaCarrito(aux);

  }


}
