import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Descifrador extends JFrame implements ActionListener{

    JPanel panel;
    JTextField cadena;
    JButton descifrar;
    JButton salir;
    JDialog descrifrado;
 


    public Descifrador(){

    
        setTitle("Descifador");
        setResizable(false);
        setBounds(400,100, 400, 200);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void iniciarComponentes(){

        crearPanel();
        colocarBotones();
      
    }


    public void crearPanel(){

        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
    }


    public void colocarBotones(){

        cadena = new JTextField();
        cadena.setBounds(105,50,200,30);   
        panel.add(cadena);

        descifrar = new JButton("Descifrar");
        descifrar.setBounds(105,100,200,30); 
        panel.add(descifrar);

        salir = new JButton("Salir");
        salir.setBounds(105,130,200,30); 
        panel.add(salir);

        descifrar.addActionListener(this);
        salir.addActionListener(this);

    }


    /**
 * Metodo descifrar:
 * Este metodo corresponde al tipo de descifrado cesar.
 * @param palabra. Palabra a descifrar.
 * @return cifrado. Cadena descifrada.
 */

    public String descifrar(String palabra){

        String modoDescifrado ="";
        char auxiliar;
        int i=0;
        for(i=0;i<palabra.length();i++){
            auxiliar=palabra.charAt(i);
            if(auxiliar==' '){
                
            }else{
                auxiliar--;
                if(auxiliar=='`'){
                    auxiliar = 'z';
                }
            }
            modoDescifrado = modoDescifrado +""+auxiliar;
        }
        return modoDescifrado;
    }

    public void mostrarDescifrado(String x){

        JOptionPane.showMessageDialog(null,x);
     
     
    }


      /**
     * @method ActionPerformed.
     * Este metodo contiene todas las acciones , 
     * para los botonones declarados en el frame;
     */


    public void actionPerformed(ActionEvent e){

        if(e.getSource().equals(descifrar)){

            mostrarDescifrado(descifrar(cadena.getText()));

        }

        if(e.getSource().equals(salir)){
            dispose();
        

        }



    }
    













    
}