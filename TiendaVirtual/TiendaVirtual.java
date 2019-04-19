/**
 * Esta clase se implementa un Objeto de tipo TiendaVirtual,
 * junto con sus operaciones fundamentales.
 * @author Ehecatzin Vallejo
 * puedes cambiar o seguir igual. La vida no tiene reglas.
 */

public class TiendaVirtual{

  private String nombre;
  private Persona[] IDsPersona = new Persona[50];
  private Producto[] productos = new Producto[50];
  private CarritoCompra[] carritos = new CarritoCompra[50];

  /**
  * Primer constructor que nos permite darle nombre a nuestra TiendaVirtual
  *@param nombre. Nombre que deseamos asignara a la TiendaVirtual
   */

  public TiendaVirtual(String nombre){
    this.nombre = nombre;
  }

  /**
  * Metodo getCarritoCompra
  */
  public CarritoCompra[] getCarritos(){
    return carritos;
  }

  /**
  *@return. Retorna un arreglo con los carritos existentes en el arreglo carritos.
   */

  /**
  * Metodo getProductos
  */

  public Producto[] getProductos(){
    return productos;
  }

  /**
  *@return. Retorna un arreglo con los productos existentes en el arreglo
   */

   public Persona[] getIDsPersona(){
     return IDsPersona;
   }

   /**
   Metodo que me permite conocer cuantos productos hay en el arreglo productos
   */
  public int contarProductos(){
    int i = 0;
    int contador = 0;

    while(productos[i]!= null){
      i++;

    }

    return i;
  }

  /**
  *@return. Entero con la cantidad de elementos producto contenidos en el arreglo.
  */

  /**
  Metodo que me permite conocer cuantos carritos hay en el arreglo carritos
  */
  public int contarCarritos(){
    int i = 0;
    int contador = 0;


    while(carritos[i] != null){
      i++;

    }
    return i;
  }
  /**
  *@return. Entero con la cantidad de elementos CarritoCompra contenidos en el arreglo.
  */

  /**
  Metodo que me permite conocer cuantas Personas hay en el arreglo IDsPersona
  */
  public int contarPersonas(){
    int i = 0;
    int contador = 0;

    while(IDsPersona[i] != null){
      i++;
    }

    return i;
  }

  /**
  *@return. Entero con la cantidad de IDs contenidos en el arreglo IDspersona.
  */


  /**
  Metodo  que permite aregar un producto al array de productos.
  @param x. Objeto producto que se desea agregar al array.
  */

  public void darAltaProducto(Producto x){

    int existentes = contarProductos();

    if(productos[0] == null){
       productos[0] = x;
    }
    else{

      productos[(existentes-1)+1] = x;
    }

  }

  /**
  Metodo  que permite aregar un carrito al array de carritos.
  @param c. Objeto CarritoCompra que se desea agregar al array carritos.
  */
  public void darAltaCarrito(CarritoCompra c){

    int existentes = contarCarritos();

    if(carritos[0] == null){
      carritos[0] = c;
    }
    else{

      carritos[(existentes-1)+1] = c;

    }
  }
  /**
  Metodo  que permite aregar una Persona al array de IDsPersona.
  @param p. Objeto Persona que se desea agregar al array IDsPersona.
  */

  public void darAltaPersona(Persona p){

    int existentes = contarPersonas();

    if(IDsPersona[0] == null){
      IDsPersona[0] = p;
    }

    else{

      IDsPersona[(existentes-1)+1] = p;

    }


  }

  public int buscarProducto(int id){

    int i = 0;
    int j = contarProductos();
    int aux2 = 0;
    int aux = 0;
    int posicion = 0;


    for(i = 0; i < j; i++){

      aux = productos[i].getIdproducto();
      System.out.println("Id analizado :"+aux);

      if(id == aux){

        posicion = i;

      }

      else{
        posicion = -1;
      }

    }

    return posicion;

  }


  public int buscarCarrito(int idc){

    int i = 0;
    int j = contarCarritos();
    int aux2 = 0;
    int aux = 0;
    int posicion = 0;


    for(i = 0; i < j; i++){

      aux = carritos[i].getIdCarrrito();
      System.out.println("Idcarrito analizado :"+aux);

      if(idc == aux){

        posicion = i;

      }

      else{
        posicion = -1;
      }

    }

    return posicion;


  }

  public void checkOut(int IDCarrito){

    int posicioncarrito = buscarCarrito(IDCarrito);
    CarritoCompra carrito = new CarritoCompra();
    carrito = carritos[posicioncarrito];
    int j = carrito.tamanioCarrito();
    int[]ids = new int[50];

    for(int i = 0; i < j ;i++){
      ids[i] = carrito.getItems().get(i).getIdprod();
    }

  }


}
