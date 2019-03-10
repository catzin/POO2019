
public class Main{

  public static void main(String[] args){

    Frac a = new Frac();
    Frac b = new Frac();
    Frac r = new Frac();

    System.out.println("Ingresa fraccion:");
    a.LeeFrac();
    System.out.println("Ingresa fraccion:");
    b.LeeFrac();

    System.out.println("\n");

    r.SumaFrac(a,b);
    System.out.println("La suma es:");
    r.MuestraFrac();
    System.out.println("La Multiplicacion es:");
    r.MultFrac(a,b);
    r.MuestraFrac();
    System.out.println("La Division es:");
    r.DivFrac(a,b);
    r.MuestraFrac();


  }
}
