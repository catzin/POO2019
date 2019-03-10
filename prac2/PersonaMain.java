public class PersonaMain{

public static void main(String[]args){

  Persona practica = new Persona("Ehecatzin",23,"CDMX",56744598);

  practica.cambiarEdad(15);
  practica.cambiarNombre("Fernando");
  System.out.println("La nueva edad es:\n");
  System.out.print(practica.consultarEdad());
  System.out.println("EL nuevo nombre es:\n");
  System.out.print(practica.consultarNombre());


}



}
