
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Esta clase se implementa una lista de Objetos: CitaMedica
 * junto con sus operaciones fundamentales.
 *
 * @author Ehecatzin Vallejo
 *
 */
public class ListaCitas{

  private String NombreLista = "Pacientes";
  private ArrayList<CitaMedica> lista_citas;

  public ListaCitas(){

    this.lista_citas = new ArrayList<CitaMedica>();

  }

  public ArrayList<CitaMedica> getLista(){
    return lista_citas;
  }


  /**
   * Metodo clave que permite agregar un Objeto CitaMedica a la lista.
   * @param CitaMedica x. Este parametro permitirá agregar una CitaMedica a la lista.
   */

  public void AgregaCitamedica(CitaMedica x){

    lista_citas.add(x);


  }

  /**
   * Metodo que permite conocer el numero de Objetos CitaMedica en la lista.
   */

  public int NumerodeElementos(){

    return lista_citas.size();
  }

  /**
   * @return. Retorna un valor entero que indica el numero de Objetos CitaMedica.
   */


  /**
   * Metodo que nos permite visualizar todos los campos de una CitaMedica.
   * @param CitaMedica x. CitaMedica de la cual se mostrarán los datos.
   */
  public void MuestraDatosPaciente(CitaMedica x){

    x.MuestraDatos();

  }

  /**
   * Método que elimina cita buscada por numero de numSeguroSocial
   * @param numSeguroSocial. Parametro clave para la busca de una CitaMedica por elemento unico.
   */

  public void EliminaCitamedica(long numSeguroSocial){

    int i = 0;

    for(i = 0 ; i < lista_citas.size(); i++){

      if(numSeguroSocial == lista_citas.get(i).getnumSeguroSocial()){

        lista_citas.remove(i);

      }
    }

  }


  /**
   * Método clave que nos permite encotrar una CitaMedica por un numero especifico de SeguroSocial y
   * nos retorna la posición en lista de dicho elemento, si es que éste existe.
   *
   * @param numSeguroSocial. Parametro clave para realizar la busqueda.
   */


  public int EncuentraCitaMedica(long numSeguroSocial){

    int i = 0;
    int contador = 0;

    for(i = 0; i < lista_citas.size(); i++){

      if(numSeguroSocial == lista_citas.get(i).getnumSeguroSocial()){

        contador = i;

      }
    }

    return contador;


  }
  /**
   * @return. Retorna entero , el cual es la posición del elemento buscado ,en lista.
   */

  //Sobre carga de métodos.


  /**
   * Método que nos permite encontrar CitaMedica por Nombre y numero de Seguro Social, en la lista.
   * Comparando nombre y numero de seguro hasta encontrar el elemento buscado.
   * @param nombrePaciente. Nombre a buscar en los atributos de cada CitaMedica contenida en la lista.
   * @param numSeguroSocial.Numero de seguro social a buscar en los atributos de cada CitaMedica contenida en la lista.
   */

  public int EncuentraCitaMedica(String nombrePaciente ,long numSeguroSocial){

    int i = 0;
    int contador = 0;

    for(i = 0; i < lista_citas.size(); i++){

      if(numSeguroSocial == lista_citas.get(i).getnumSeguroSocial() &&  nombrePaciente == lista_citas.get(i).getNombrePaciente()){

        contador = i;

      }
    }

    return contador;

  }

  /**
   * @return. Retorna un valor entero , que represeta la posicion el lista, del elemento que buscamos.
   */


  /**
   * Método que nos permite encontrar CitaMedica por Nombre y numero de consultorio, en la lista.
   * Comparando nombre y numero de consultorio hasta encontrar el elemento buscado.
   * @param nombrePaciente. Nombre a buscar en los atributos de cada CitaMedica contenida en la lista.
   * @param consultorio.Numero de consultorio a buscar en los atributos de cada CitaMedica contenida en la lista.
   */

  public int EncuentraCitaMedica(String nombrePaciente ,int consultorio){

    int i = 0;
    int contador = 0;

    for(i = 0; i < lista_citas.size(); i++){

      if(nombrePaciente == lista_citas.get(i).getNombrePaciente() &&  consultorio == lista_citas.get(i).getConsultorio()){

        contador = i;

      }
    }

    return contador;

  }

  /**
   * @return. Retorna valor entero, que representa la posicion en lista del elemento buscado.
   */


  /**
   * Método que nos permite encontrar CitaMedica por Nombre y su hora de cita , en la lista.
   * Comparando nombre y hora de cita hasta encontrar el elemento buscado.
   * @param nombrePaciente. Nombre a buscar en los atributos de cada CitaMedica contenida en la lista.
   * @param horaCita. hora de cita a buscar en los atributos de cada CitaMedica contenida en la lista.
   */
  public int EncuentraCitaMedica(String nombrePaciente ,String horaCita){

    int i = 0;
    int contador = 0;

    for(i = 0; i < lista_citas.size(); i++){

      if(nombrePaciente == lista_citas.get(i).getNombrePaciente() &&  horaCita == lista_citas.get(i).getHoraCita()){

        contador = i;

      }
    }

    return contador;

  }

  //termina sobre carga de métodos.

  /**
   * Método que nos permite encontrar CitaMedica por numero de seguroSocial,y modificar sus atributos,
   * telefonoFijo ,telefonoCelular y domicilio.
   * @param posicion. Posicion retornada por el metodo EncuentraCitaMedica.
   * @param telefonoFijo. nuevo telefonoFijo.
   * @param telefonoCelular. nuevo telefonoCelular.
   * @param Domicilio. nuevo domicilio.


   */

  public void modifificaCita(int posicionCitaMedica,long telefonoFijo,long telefonoCelular,String domicilio){

    lista_citas.get(posicionCitaMedica).setTelefonoFijo(telefonoFijo);
    lista_citas.get(posicionCitaMedica).setTelefonoCelular(telefonoCelular);
    lista_citas.get(posicionCitaMedica).setDomicilio(domicilio);

  }



}
