/**
 * Esta clase se implementa un Objeto de tipo Producto,
 * junto con sus operaciones fundamentales.
 * @author Ehecatzin Vallejo
 */

public class Producto{
  private int idProducto;
  private float precio;
  private String descripcion;
  private String marca;
  private int cantidad;
  private String departamento;

  /**
  * primer constructor de para objeto Producto.
  * @param id. Id del producto.
  * @param precio. precio del producto.
  * @param descripcion. descripcion del producto.
  * @param marca. marca del producto.
  * @param cantidad. cantidad del producto.
  * @param departamento. departamento del producto.
  */

  public Producto(int idProducto , float precio , String descripcion , String marca ,int cantidad ,String departamento){

    this.idProducto = idProducto;
    this.precio = precio;
    this.descripcion = descripcion;
    this.marca = marca;
    this.cantidad = cantidad;
    this.departamento = departamento;
  }
  /**
  *constructor 2, no recibe parametros
  */
  public Producto(){

  this.idProducto = 0;
  this.precio = 0f;
  this.descripcion = null;
  this.marca = null;
  this.cantidad = 0;
  this.departamento = null;

  }
  /**
  *constructor 3, no recibe parametros
  */
  public Producto(int idProducto , float precio , String marca){
    this.idProducto = idProducto;
    this.precio = precio;
    this.marca = marca;
  }

  /**
  *constructor 4, no recibe parametros
  */
  public Producto(String descripcion , int cantidad , float precio){

    this.descripcion = descripcion;
    this.cantidad = cantidad;
    this.precio = precio;

  }

  /**
  * Metodo getIdproducto , nos permite obtener el id del producto.
  */
  public int getIdproducto(){
    return idProducto;
  }
  /**
  @return .Retorna el valor que se encuentra en id.
  */

  /**
  * Metodo getDescripcion. Permite obtener la descripcion del producto
  */
  public String getDescripcion(){
    return descripcion;
  }

  /**
  @return . Retorna la cadena con la descripcion del producto;
  */

  /**
  * Metodo getMarca .Permite obtener la marca del producto.
  */
  public String getMarca(){
    return marca;
  }
  /**
  @return . Retorna la cadena con el nombre de la marca.
  */

  /**
  * Metodo getPrecio .Permite obtener el precio del producto.
  */
  public float getPrecio(){
    return precio;
  }

  /**
  @return . Retorna flotante con el precio del producto.
  */

  /**
  * Metodo getCantidad .Permite obtener la Cantidad de producto.
  */
  public int getCantidad(){
    return cantidad;
  }
  /**
  @return . Retorna entero con la cantidad de producto.
  */

  /**
  * Metodo getDepartamento .Permite obtener el departamento del producto.
  */
  public String getDepartamento(){
    return departamento;
  }

  /**
  @return . Retorna cadena con el nombre del departamento.
  */


  /**
  * Metodo setIdproducto.Permite cambiar el Id del producto.
  */
  public void setIdproducto(int idProducto){
    this.idProducto = idProducto;

  }

  /**
  * Metodo setPrecio .Permite cambiar el precio del producto.
  */
  public void setPrecio(float precio){
    this.precio = precio;

  }
  /**
  * Metodo setDescripcion .Permite cambiar la descripcion del producto.
  */
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;

  }
  /**
  * Metodo setMarca .Permite cambiar la marca del producto.
  */
  public void setMarca(String marca){
    this.marca = marca;

  }
  /**
  * Metodo setCantidad .Permite cambiar la cantidad del producto.
  */
  public void setCantidad(int cantidad){
    this.cantidad = cantidad;

  }
  /**
  * Metodo setDepartamento .Permite cambiar el departamento del producto.
  */
  public void setDepartamento(String departamento){

    this.departamento = departamento;

  }



}
