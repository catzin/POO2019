    import java.util.Random;

    public class Mascota{
      String nombre;
      String tipo;
      String duenio;
      int edad;
      boolean satisfecho;
      short horadormir;


      public String darNombre(){

        int random = (int) (Math.random() * 10) + 1;

        switch(random){

          case 1: nombre = "Charly";break;
          case 2: nombre = "Nala";break;
          case 3: nombre = "Max";break;
          case 4: nombre = "Puchis";break;
          case 5: nombre = "Goliath";break;
          case 6: nombre = "Satanas";break;
          case 7: nombre = "Zucar";break;
          case 8: nombre = "Kelly";break;
          case 9: nombre = "Pugstavo";break;
          case 10:nombre = "Boby";break;

        }
        return nombre;
      }

      public String darTipoMascota(){

        int random = (int) (Math.random() * 10) + 1;


        switch(random){

          case 1: tipo = "Acuatico";break;
          case 2: tipo = "Terrestre";break;
          case 3: tipo = "Roedor";break;
          case 4: tipo = "Salvaje";break;
          case 5: tipo = "Domestico";break;
          case 6: tipo = "Ave";break;
          case 7: tipo = "Mamifero";break;
          case 8: tipo = "Herbivoro";break;
          case 9: tipo = "Bípedo";break;
          case 10:tipo= "Vertebrado";break;

        }

        return tipo;

      }


      public String darNombreDuenio(){

        int random = (int) (Math.random() * 10) + 1;

        switch(random){

          case 1: duenio = "Carlos";break;
          case 2: duenio = "Juan";break;
          case 3: duenio = "Lucia";break;
          case 4: duenio = "Gustavo";break;
          case 5: duenio = "Ehecatzin";break;
          case 6: duenio = "Saúl";break;
          case 7: duenio = "Edwin";break;
          case 8: duenio = "David";break;
          case 9: duenio = "Karla";break;
          case 10:duenio = "José";break;

        }
        return duenio;

      }

      public int darEdad(){

        int random = (int) (Math.random() * 10) + 1;

        switch(random){

          case 1: edad = 11;break;
          case 2: edad = 12;break;
          case 3: edad = 10;break;
          case 4: edad = 4;break;
          case 5: edad = 5;break;
          case 6: edad = 3;break;
          case 7: edad = 13;break;
          case 8: edad = 8;break;
          case 9: edad = 7;break;
          case 10:edad = 2;break;

        }

        return edad;

      }


      public boolean decirSatisfecho(){

        int random = (int) (Math.random() * 10) + 1;

        switch(random){

          case 1: satisfecho = true;break;
          case 2: satisfecho = false;break;
          case 3: satisfecho = false;break;
          case 4: satisfecho = true;break;
          case 5: satisfecho = false;break;
          case 6: satisfecho = true;break;
          case 7: satisfecho = true;break;
          case 8: satisfecho = false;break;
          case 9: satisfecho = true;break;
          case 10:satisfecho = false;break;

        }

        return satisfecho;

      }

      public short darHoraDormir(){

        int random = (int) (Math.random() * 10) + 1;

        switch(random){

          case 1: horadormir = 10;break;
          case 2: horadormir = 9;break;
          case 3: horadormir = 3;break;
          case 4: horadormir = 2;break;
          case 5: horadormir = 6;break;
          case 6: horadormir = 1;break;
          case 7: horadormir = 11;break;
          case 8: horadormir = 12;break;
          case 9: horadormir = 4;break;
          case 10:horadormir = 5;break;

        }

        return horadormir;

      }

      }
