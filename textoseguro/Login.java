import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.ImageIcon;
/**
 * Creacion de Frame completo 
 * para logeo de usuario.
 */
public class Login extends JFrame{

   
     JPanel panel;
     JTextField usuario;
     JPasswordField contraseña;
     private boolean estado;
     Menu menu;
    

    MetodosSql metodos = new MetodosSql();

    public Login(Menu u){
    
        setTitle("Login");
        setResizable(false);
    
        /* posicion inicial  , size */
        setBounds(400,100,300,600);
        iniciarComponentes();
        this.menu = u;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public boolean getEstado(){
        return estado;
    }

   

    /**
     * Metodo Iniciar componentes , nos permite agregar componentes
     * al Jfram principal.
     */
    private void iniciarComponentes(){

        crearPanel();
        colocarLogeo();
        colocarBotonIngreso();
    
    }

    /**
     * Metodo que crea el panel y lo adiere al JFrame
     */
    public void crearPanel(){

        panel = new JPanel();
        this.getContentPane().add(panel);
        JLabel label = new JLabel();
        ImageIcon imagen = new ImageIcon("/Users/Catzin/Desktop/textoseguro/lgin.png");
        label.setIcon(imagen);
        panel.add(label);
        
    }

    /**
     * Metodo que coloca todos los componentes para 
     * poder ingresar datos .
     */
    public void colocarLogeo(){

        JLabel usuarioEtiqueta = new JLabel();
        JLabel contraseñaEtiqueta = new JLabel();
        usuarioEtiqueta.setText("Usuario");
        usuarioEtiqueta.setBounds(10, 20, 80, 20);
        contraseñaEtiqueta.setText("Contraseña");
        contraseñaEtiqueta.setBounds(10, 50, 80, 20);
        usuario = new JTextField(20);
        usuario.setBounds(100, 20, 80, 20);
        contraseña = new JPasswordField(20);
        contraseña.setBounds(100, 50, 80, 20);
        panel.add(usuarioEtiqueta);
        panel.add(usuario);
        panel.add(contraseñaEtiqueta);
        panel.add(contraseña);
        
        }


    /**
     * Metodo que inicialmente desencadenaria toda la app.
     * Falló por que no sé el modo correcto de implementar el metodo oyente.
     */
    public void colocarBotonIngreso(){

        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(100, 100, 80, 20);
        panel.add(ingresar);

        ActionListener accion = new ActionListener(){
       
        public void actionPerformed(ActionEvent ae){

            if(metodos.buscarUsuario(usuario.getText(), contraseña.getText())){
                estado = true;
                dispose();
                menu.setVisible(true);
             
    
            }

            else{

                JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
            }

            




        }      
    };

        ingresar.addActionListener(accion);
        
    }
}





