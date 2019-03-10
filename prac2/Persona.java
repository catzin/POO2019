public class Persona {

    public String nombre;
    public int edad;
    public String ciudad;
    public int telefono;


    public Persona (String nombre, int edad,String ciudad,int telefono){ //Constructor sin param.
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public void cambiarEdad (int edad){
        this.edad = edad;
    }

    public void cambiarTelefono(int telefono){
      this.telefono = telefono;
    }

    public void cambiarNombre(String nombre){
      this.nombre = nombre;
    }

    public String consultarNombre(){
        return nombre;
    }

    public int consultarEdad(){
        return edad;
    }

    public String consultarCiudad(){
        return ciudad;
    }

    public int consultarTelefono (){
        return telefono;
    }

}
