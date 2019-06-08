import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cifrador extends JFrame implements ActionListener{

    JPanel panel;
    JButton cifrado1;
    JButton cifrado2;
    JButton mostrar;
    JButton regresar;
    JTextField cadena;
    Manejador manejador;
    JComboBox opciones;
    
    
     /**
     * Primer constructor para la clase Menejador
     */
    public Cifrador(Manejador m){
        manejador = m;
        setTitle("Cifrador");
        setResizable(false);
        setBounds(400,100, 400, 400);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


     /**
     * Metodo que inicia todos los componentes del frame
     */

    public void iniciarComponentes(){

        crearPanel();
        colocarBotones();
      
    }
    
    /**
     * Metodo para colocar el panel en le FRAME
     */
    public void crearPanel(){

        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
    }

    /**
     * @method.colocarBotones;
     * Metodo que coloca botones en el Frame
     */
    public void colocarBotones(){

        cadena = new JTextField();
        cadena.setBounds(105,50,200,30);   
        panel.add(cadena);

        opciones = new JComboBox();
        opciones.setBounds(105,100,200,30); 
        panel.add(opciones);

        mostrar = new JButton("Mostrar");
        mostrar.setBounds(120,150,150,30);
        panel.add(mostrar);

        cifrado1 = new JButton("Cifrado Cesar");
        cifrado1.setBounds(120,190,150,30);
        panel.add(cifrado1);

        cifrado2 = new JButton("Cifrado Vigenere");
        cifrado2.setBounds(120,240,150,30);
        panel.add(cifrado2);

        regresar = new JButton("regresar");
        regresar.setBounds(120,280,150,30);
        panel.add(regresar);

        opciones.addActionListener(this);
        cifrado1.addActionListener(this);
        mostrar.addActionListener(this);
        regresar.addActionListener(this);
        
       
    }

    /**
 * Metodo cifrar:
 * Este metodo corresponde al tipo de cifrado vigenere
 * @param palabra. Palabra a cifrar.
 * @param clave. clave para el cifrado.
 * @return cifrado. Cadena cifrada en vigenere.
 */

    public String cifrar(String palabra){

        String cifrado= " ";
        char auxiliar;
        int i = 0;
    
        for(i=0;i<palabra.length();i++){
            auxiliar=palabra.charAt(i);
            if(auxiliar ==' '){
                
            }else{
                auxiliar++;
                if(auxiliar=='{'){
                    auxiliar='a';
                }
            }
            cifrado=cifrado+""+auxiliar;
        }
        return cifrado;
    }
    
    /**
     * Metodo para Colocar opciones en el JComBobox
     */
    public void llenarOpciones(Manejador m ){

        for(int i = 0 ; i < m.getTextos().size(); i++){
            opciones.addItem(m.getTextos().get(i));
        }


        }


     /**
     * @method ActionPerformed.
     * Este metodo contiene todas las acciones , 
     * para los botonones declarados en el frame;
     */

    public void actionPerformed(ActionEvent e){

        if(e.getSource().equals(mostrar)){

            llenarOpciones(manejador);
        
     
        }

        if(e.getSource().equals(cifrado1)){

            String aCifrar = opciones.getSelectedItem().toString();
            String cifrada = cifrar(aCifrar);
            cadena.setText(cifrada);
            manejador.agregarCadena(cifrada);
            
         
           

        }

        

        if(e.getSource().equals(regresar)){

            setVisible(false);

            
        }


        


        

    }









    
}