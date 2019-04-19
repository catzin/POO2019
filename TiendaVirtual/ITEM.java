/**
 * Esta clase se implementa un Objeto de tipo Item,
 * junto con sus operaciones fundamentales.
 * @author Ehecatzin Vallejo
 *
 */
public class ITEM{

  private int idProd;
  private int cantidad;

  /**
  * primer constructor de para objeto Producto.
  * @param idprod. Id del producto.
  * @param cantidad. cantidad del producto.
  */
  public ITEM(int idProd , int cantidad){
    this.idProd = idProd;
    this.cantidad = cantidad;
  }

  /**
  * metodo getIdprod.
  */
  public int getIdprod(){
    return idProd;
  }
  /**
  @return. Retorna el valor del id , en el objeto Item.
  */
  /**
  * metodo getCantidad.
  */
  public int getCantidad(){
    return cantidad;
  }
  /**
  @return. Retorna el valor de cantidad, en el objeto Item.
  */

  /**
  * metodo setId. Permite cambiar el valor contenido en Id.
  */

  public void setIdprod(int idProd){
    this. idProd = idProd;
  }
  /**
  * metodo setCantidad. Permite cambiar el valor contenido en cantidad.
  */
  public void setCantidad(int cantidad){
    this.cantidad = cantidad;
  }



}
