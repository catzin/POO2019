import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal{


    static Manejador m;
    static Menu menu;
    static Cifrador c;
    static Descifrador d;

    public static void main(String []args){
        d = new Descifrador();
        m = new Manejador();
        c = new Cifrador(m); 
        menu = new Menu(m,c,d);
        Login login = new Login(menu);
      
        login.setVisible(true);

    
    }


}