/**
 * Esta clase se implementa un Objeto de tipo Carrito de compra,
 * junto con sus operaciones fundamentales.
 * @author Ehecatzin Vallejo
 */
import java.util.ArrayList;
public class CarritoCompra{

  private int IDCarrito;
  private ArrayList<ITEM> items = new ArrayList<ITEM>();


  /**
  * Primer constructor para CarritoCompra
  * No recibe parametros
  */
  public CarritoCompra(){
    this.IDCarrito = 0;

  }

  /**
  * Segundo constructor para CarritoCompra
  *@param ID . Valor de ID que se desea asignar.
  */
  public CarritoCompra(int ID){
    this.IDCarrito = ID;
  }

  /**
  * Metodo que permite agregar un Item al ArrayList items
  *@param idProd. Id del producto , que se utiliza para construir objeto Item.
  *@param cantidad. Cantidad de un cierto producto , se utiliza para construir Objeto ITem.
  * Una vez construido en Objeto Item , se agrega al ArryaList de Items , con add().
  */
  public void agregarItems(int idProducto , int cantidad){

    ITEM nuevo = new ITEM(idProducto,cantidad);
    this.items.add(nuevo);

  }

  /**
  * Metodo que permite agregar de otra forma un Item al ArrayList items
  *@param x. varible de Tipo Item.
  * Se recibe un ITem , previamente construido, el cual se agrega al ArrayList Items.
  */
  public void agregarItem(ITEM x){
    items.add(x);

  }

  public int getIdCarrrito(){
    return IDCarrito;
  }

  /**
  * Metodo getTtems.
  */
  public ArrayList<ITEM> getItems(){
    return items;
  }
  /**
  *@return. Retorna el ArryaList que contiene los Items
  */

  /**
  * Metodo que permite obtener la posicion en ArrayList de un producto(item) especifico.
  * @param idProducto.variable con el id del producto a buscar.
  * Recorremos el ArrayList comparando cada Id  , hasta encontrar el Id buscado. Si lo encuentra regresa la posicion (int)
  * si no lo encuentra , regresa -1 , y un mensaje de advertencia.
  */

  public int buscarItem(int idProducto){
    int posicion = 0;
    int aux = 0;

    for( ITEM i : items){

      if(idProducto == i.getIdprod()){
        posicion  = aux;
        break;
      }
      else{
        posicion = -1;
      }
      aux++;
    }

    return posicion;

  }

  /**
  *@return. regresa entero con la posicion de item buscado. en caso contrario -1.
  */

  /**
  *  metodo especial de ArrayList que permite elminar todo el ArrayList
  */
  public void vaciarCarrito(){
    items.clear();
  }

  /**
  * Metodo que permite modificar una compra contenida en el  ArrayList de un producto(item) especifico.
  *@param idProd. variable con el id del producto a buscar.
  *@param cantidad.  Parametro que se utiliza para modificar la cantidad.
  * utilizamos Idprod  para comparar con todos los IDs de Items en el ArrayList items
  *cuando lo tenemos , modificamos , haciendo uso de un set.
  */

  public boolean modificarItem(int idProducto,int cantidad){

    boolean estado = false;

    for(ITEM i: items){
      if(idProducto == i.getIdprod()){
        i.setCantidad(cantidad);
        estado = true;
      }
      else{
        estado = false;
      }

    }

      return estado;

}

/**
*@return . Retornamos un booleano, si se encuentra el producto y se modifica , regresa true. Caso contrario False.
*/

/**
* Metodo que permite borrar un  producto(ITEM) del ArrayList items
*@param idProd. variable con el idProd a buscar en el ArryaList Items.
* Se recibe un idProd, el cual se compara con todos los Id de los productos(items) contenidos en el Array.
* si lo encuentra lo borra y regresa un True , pues cumplio. Caso contrario , da una alerta y el estado es false.
*/
  public boolean borrarItem(int idProd){

    boolean estado = true;

    for(ITEM i: items){
      if(idProd == i.getIdprod()){
        items.remove(i);
        estado = true;
      }
      else{
        estado = false;
      }

    }

    return estado;
  }

  /**
  *@return.regresa un True , pues cumplio. Caso contrario , da una alerta y el estado es false.
   */


  public int tamanioCarrito(){
    return items.size();
  }
  }
