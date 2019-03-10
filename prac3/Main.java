import java.util.ArrayList;


public class Main{

  public static void main(String[]args){

    CitaMedica a = new CitaMedica("Ehecatzin","10:30","Ernesto",14);
    CitaMedica b = new CitaMedica("Diego",201863018,22,"4:20");
    CitaMedica c = new CitaMedica("Ernesto",22,"Reforma 22",'H',56744598,55567804,12345566,"O+","Ninguna","10:30 AM",15,"Adrian","Esguince");

    ListaCitas nueva = new ListaCitas();

    nueva.AgregaCitamedica(a);
    nueva.AgregaCitamedica(b);
    nueva.AgregaCitamedica(c);

    System.out.println("Numero de Citas medicas en la lista:\n");
    System.out.println(nueva.NumerodeElementos());

    System.out.println("Objeto original:\n");
    nueva.MuestraDatosPaciente(nueva.getLista().get(nueva.EncuentraCitaMedica(12345566)));

    nueva.modifificaCita(nueva.EncuentraCitaMedica(12345566),56345678,568785840,"Cardenas 22 colonia centro");
    System.out.println("Objeto después de la modificacion:\n");
    nueva.MuestraDatosPaciente(nueva.getLista().get(nueva.EncuentraCitaMedica(12345566)));

    nueva.EliminaCitamedica(201863018);
    nueva.EliminaCitamedica(12345566);

    System.out.println("Numero de Citas medicas en la lista:\n");
    System.out.println(nueva.NumerodeElementos());






  }

}
