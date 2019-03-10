/**
 * Esta clase se implementa el Objeto: CitaMedica
 * junto con sus operaciones fundamentales.
 *
 * @author Ehecatzin Vallejo
 *
 */
public class CitaMedica{

  private String nombrePaciente;
  private int edad;
  private String domicilio;
  private char genero;
  private long telefonoFijo;
  private long telefonoCelular;
  private long numSeguroSocial;
  private String tipoSangre;
  private String alergias;
  private String horaCita;
  private int consultorio;
  private String doctor;
  private String padecimiento;

  //constructor utlizando todos los atributos de la clase.

  /**
   * Constructor con los 13 parametros de la clase
   * @param nombre del paciente.
   * @param edad.
   * @param . domicilio.
   * @param . genero del paciente.
   * @param . Telefono Fijo.
   * @param . Telefono Celular.
   * @param . Numero de Seguro Social.
   * @param . Tipo de sangre.
   * @param . Alergias.
   * @param . Hora de cita.
   * @param . numero de Consultorio .
   * @param . Nombre del doctor.
   * @param . Padecimiento.

   */

  public CitaMedica(String nombrePaciente,int edad,String domicilio,char genero,long telefonoFijo,long telefonoCelular,long numSeguroSocial,String tipoSangre,String alergias,String horaCita,int consultorio,String doctor,String padecimiento){

    this.nombrePaciente = nombrePaciente;
    this.edad = edad;
    this.genero = genero;
    this.telefonoFijo = telefonoFijo;
    this.telefonoCelular = telefonoCelular;
    this.numSeguroSocial = numSeguroSocial;
    this.tipoSangre = tipoSangre;
    this.alergias = alergias;
    this.horaCita = horaCita;
    this.consultorio = consultorio;
    this.doctor = doctor;
    this.padecimiento = padecimiento;

  }

  /**
   * constructor ideal 1
   * @param . Nombre del paciente.
   * @param . Edad.
   * @param . Domicilio.
   * @param . Telefono Fijo
   * @param . Telefono Celular.
   * @param . Numero de seguro social.

   */

  public CitaMedica(String nombrePaciente,int edad,String domicilio, long telefonoFijo,long telefonoCelular,long numSeguroSocial){


    this.nombrePaciente = nombrePaciente;
    this.edad = edad;
    this.domicilio = domicilio;
    this.telefonoFijo = telefonoFijo;
    this.telefonoCelular = telefonoCelular;
    this.numSeguroSocial = numSeguroSocial;
  }

  /**
   * Constructor 2
   * @param . Nombre del paciente.
   * @param . Numero de seguro social.
   * @param . Edad.
   * @param .Hora de cita.

   */

  public CitaMedica(String nombrePaciente,long numSeguroSocial,int edad,String horaCita){

    this.nombrePaciente = nombrePaciente;
    this.numSeguroSocial = numSeguroSocial;
    this.consultorio = consultorio;
    this.doctor = doctor;
    this.horaCita = horaCita;

  }


  /**
   * Constructor 3
   * Puede ser mismo paciente pero se especifica padecimiento
   *  @param . Nombre del paciente.
   * @param . Numero de seguro social.
   * @param . Edad.
   * @param Hora de cita.
   * @param . Padecimiento.

   */

  public CitaMedica(String nombrePaciente,long numSeguroSocial,int edad,String horaCita,String padecimiento){

    this.nombrePaciente = nombrePaciente;
    this.numSeguroSocial = numSeguroSocial;
    this.edad = edad;
    this.horaCita = horaCita;
    this.padecimiento = padecimiento;
  }


  /**
   * constructor 4
   *  puede ser difente nombre y mismo domicilio
   * @param . Nombre del paciente.
   * @param . Numero de seguro social.
   * @param . Domicilio.
   */

  public CitaMedica(String nombrePaciente,long numSeguroSocial, String domicilio){

    this.nombrePaciente = nombrePaciente;
    this.numSeguroSocial = numSeguroSocial;
    this.domicilio = domicilio;

  }

  /**
   * Constructor 5
   * Diferente paciente , mismo doctor.
   * @param . Nombre del paciente.
   * @param . Hora cita.
   * @param . Doctor.
   */

  public CitaMedica(String nombrePaciente,String horaCita,String doctor){

    this.nombrePaciente = nombrePaciente;
    this.horaCita = horaCita;
    this.doctor = doctor;

  }

  /**
   * Constructor 6
   * @param . Nombre del paciente.
   * @param . Numero de hora de Cital.
   * @param . Nombre del doctor.
   * @param . Numero de consultorio.
   */
  public CitaMedica(String nombrePaciente,String horaCita,String doctor,int consultorio){

    this.nombrePaciente = nombrePaciente;
    this.horaCita = horaCita;
    this.doctor = doctor;
    this.consultorio = consultorio;


  }

  /**
   * Constructor 7
   * @param . Nombre del paciente.
   * @param . Tipo de sangre.
   * @param . Alergias.
   * @param . Padecimiento
   */

  public CitaMedica(String nombrePaciente,String tipoSangre,String alergias, String padecimiento){

    this.nombrePaciente = nombrePaciente;
    this.tipoSangre  = tipoSangre;
    this.alergias = alergias;
    this.padecimiento = padecimiento;
  }


  /**
   * Constructor 8
   * @param . Nombre del paciente.
   * @param . Telefono fijo.
   * @param . Telefono celular.
   *
   */

  public CitaMedica(String nombrePaciente,long telefonoFijo ,long telefonoCelular){

    this.nombrePaciente = nombrePaciente;
    this.telefonoFijo = telefonoFijo;
    this.telefonoCelular = telefonoCelular;

  }

  /**
   * Constructor 9
   * @param . Nombre del paciente.
   * @param . Tipo de sangre.
   * @param . Genero del paciente.
   * @param . Numero de Seguro social.
   */

  public CitaMedica(String nombrePaciente,String tipoSangre, char genero, long numSeguroSocial){

    this.nombrePaciente = nombrePaciente;
    this.tipoSangre = tipoSangre;
    this.genero = genero;
    this.numSeguroSocial = numSeguroSocial;

  }

  // Gets de la clase

  public String getNombrePaciente(){

    return nombrePaciente;
  }

  public int getEdad(){
    return edad;
  }

  public String getDomicilio(){
    return domicilio;
  }

  public char getGenero(){
    return genero;

  }

  public long getTelefonoFijo(){
    return telefonoFijo;

  }

  public long getTelefonoCelular(){
    return telefonoCelular;
  }

  public long getnumSeguroSocial(){
    return numSeguroSocial;
  }

  public String getTipoSangre(){
    return tipoSangre;

  }

  public String getAlergias(){
    return alergias;
  }

  public String getHoraCita(){
    return horaCita;
  }

  public int getConsultorio(){
    return consultorio;
  }

  public String getDoctor(){
    return doctor;
  }

  public String getPadecimiento(){
    return padecimiento;
  }

  // Fin de Gets de clase.


  // Set

  public void setNombrePaciente(String nombrePaciente){

    this.nombrePaciente = nombrePaciente;

    }

  public void setEdad(int edad){

    this.edad = edad;

    }

  public void setDomicilio(String domicilio){

    this.domicilio = domicilio;

    }

  public void setGenero(char genero){

    this.genero = genero;

    }

  public void setTelefonoFijo(long telefonoFijo){

    this.telefonoFijo = telefonoFijo;

    }

  public void setTelefonoCelular(long telefonoCelular){

    this.telefonoCelular = telefonoCelular;

    }

  public void setnumSeguroSocial(long numSeguroSocial){

    this.numSeguroSocial = numSeguroSocial;

    }

  public void setTipoSangre(String tipoSangre){

    this.tipoSangre = tipoSangre;

    }

  public void setAlergias(String alergias){

    this.alergias = alergias;

    }

  public void sethoraCita(String horaCita){

    this.horaCita = horaCita;

    }

  public void setconsultorio(int consultorio){

    this.consultorio = consultorio;

    }

  public void setdoctor(String doctor){

    this.doctor = doctor;

    }

  public void setpadecimiento(String padecimiento){

    this.padecimiento = padecimiento;
  }

  //Fin de sets

  /**
   * Metodo que muestra por pantalla los elementos de una CitaMedica
   */


  public void MuestraDatos(){

    System.out.println("\n");
    System.out.println("Nombre:\t"+nombrePaciente+"\t");
    System.out.println("Edad:\t"+edad+"\t");
    System.out.println("Domicilio:\t"+domicilio+"\t");
    System.out.println("Genero:\t"+genero+"\t");
    System.out.println("Telefono fijo:\t"+telefonoFijo+"\t");
    System.out.println("Telefono Celular:\t"+telefonoCelular+"\t");
    System.out.println("Numero de seguro Social:\t"+numSeguroSocial+"\t");
    System.out.println("Tipo de Sangre:\t"+tipoSangre+"\t");
    System.out.println("Alergias:\t"+alergias+"\t");
    System.out.println("Hora de cita:\t"+horaCita+"\t");
    System.out.println("Consultorio:\t"+consultorio+"\t");
    System.out.println("Doctor:\t"+doctor+"\t");
    System.out.println("Padecimiento:\t"+padecimiento+"\t");

  }


}
