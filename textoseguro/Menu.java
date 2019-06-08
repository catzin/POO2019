import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{

    JPanel panel;
    JButton manejador;
    JButton cifrador;
    JButton descifrador;
    JButton manejador2;
    int opcion;
    Manejador m;
    Cifrador c;
    Descifrador d;
    

    /**
     * Primer constructor para la clase Menejador
     */

    public Menu(Manejador m , Cifrador c , Descifrador d){
        this.m = m;
        this.c = c;
        this.d = d;
        setTitle("Menu");
        setResizable(false);
        setBounds(400,100, 200, 200);
        iniciarComponentes();
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

     /**
     * Metodo que inicia todos los componentes del frame
     */
    public void iniciarComponentes(){
        iniciarPanel();
        agregarBotones();
       
    }

     /**
     * Metodo para colocar el panel en le FRAME
     */

    public void iniciarPanel(){
        panel = new JPanel();
        this.getContentPane().add(panel);
         
    }


    /**
     * @method.colocarBotones;
     * Metodo que coloca botones en el Frame
     */

    public void agregarBotones(){

        manejador = new JButton();
        manejador.setText("Manejador");
        panel.add(manejador);

        cifrador = new JButton();
        cifrador.setText("Cifrador");
        panel.add(cifrador);

        descifrador = new JButton();
        descifrador.setText("Descifrador");
        panel.add(descifrador);

        manejador2 = new JButton();
        manejador2.setText("Manejador IO");
        panel.add(manejador2);

    
        manejador.addActionListener(this);
        cifrador.addActionListener(this);
        descifrador.addActionListener(this);
      

    }


      /**
     * @method ActionPerformed.
     * Este metodo contiene todas las acciones , 
     * para los botonones declarados en el frame;
     */
    public void actionPerformed(ActionEvent e){

        

        if(e.getSource().equals(manejador)){

            m.setVisible(true);
          
        }

        if(e.getSource().equals(cifrador)){

            c.setVisible(true);
        }

        if(e.getSource().equals(descifrador)){

            d.setVisible(true);
        }

  

    }


}