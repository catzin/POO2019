import java.util.Scanner;

public class Frac{

  private int num;
  private int den;

  public Frac(){   //constructor
  num = 1;
  den = 1;
  }

  public void LeeFrac(){

    Scanner entrada = new Scanner(System.in);

    num =  entrada.nextInt();
    den = entrada.nextInt();

  }

  public void MuestraFrac(){

    System.out.printf("%d/%d\t\n",num,den);

  }

  public void SumaI(Frac a, Frac b){


    num = a.num + b.num;
    den = b.den;



  }

  public void SumaD(Frac a , Frac b){


    den  = a.den * b.den;
    num  = (a.num * b.den) + (a.den * b.num);



  }

  public boolean Check(Frac a , Frac b){

    if(a.den == b.den){
      return true;
    }
    else{

      return false;
    }

  }

  public void SumaFrac(Frac a , Frac b){

    if(Check(a,b)){

      SumaI(a,b);

    }
    else{

      SumaD(a,b);

    }

  }

  public void MultFrac(Frac a, Frac b){

    num = (a.num * b.num);
    den = (a.den * b.den);

  }

  public void DivFrac(Frac a , Frac b){

    num = (a.num * b.den);
    den = (a.den * b.num);
  }

  }
