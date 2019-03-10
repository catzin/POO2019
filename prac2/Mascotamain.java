  import java.util.Scanner;

  public class Mascotamain{

    public static void main(String[]args){
      Scanner entrada = new Scanner(System.in);
      int n = 0;
      Mascota practica = new Mascota();

      System.out.println("1.¿Cual es tu nombre?");
      System.out.println("2.¿Cual es tu tipo?");
      System.out.println("3.¿Quién es tu dueño?");
      System.out.println("4.¿Cual es tu edad?");
      System.out.println("5.¿Estás satisfecho?");
      System.out.println("6.¿Cuál es tu hora de dormir?");
      System.out.println("7.Salir");
      System.out.println("Elige una opcion:");


      do{

        n = entrada.nextInt();


        switch(n){
          case 1:System.out.println("Mi nombre es:" +practica.darNombre());break;
          case 2:System.out.println("Soy de tipo :" +practica.darTipoMascota());break;
          case 3:System.out.println("Mi dueño es:" +practica.darNombreDuenio());break;
          case 4:System.out.println("Mi edad es :" +practica.darEdad());break;
          case 5:System.out.println(":" +practica.decirSatisfecho());break;
          case 6:System.out.println("Mi hora de dormir es:" +practica.darHoraDormir());break;
          case 7: System.out.println("Finalizado");

        }


      }while(n!=7);


    }
  }
