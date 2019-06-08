import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.ArrayList;

public class Manejador extends JFrame implements ActionListener{

    private ArrayList<String> textos = new ArrayList<String>();
    JPanel panel;
    JTextField cadena;
    JTextField cadena2;
    JTextField cadena3;
    JTextField cadena4;
    JButton ok;
    JButton modificar;
    JButton agregar;
    JButton mostrar;
    JButton borrar;
    JButton regresar;


    /**
     * Primer constructor para la clase Menejador
     */
    public Manejador(){

        setTitle("Manejador");
        /* posicion inicial  , size */
        setBounds(400,100,700,400);
        setResizable(false);
        /*setVisible(true);*/
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

        agregar = new JButton("Agregar");
        agregar.setBounds(50,50,100,30);
                
        panel.add(agregar);
        cadena = new JTextField(30);
        cadena.setBounds(150,50,150,30);
        panel.add(cadena);

        modificar = new JButton("Modificar");
        modificar.setBounds(50,100,100,30);
        panel.add(modificar);
        cadena2 = new JTextField(30);
        cadena2.setBounds(150,100,150,30);
        panel.add(cadena2);

        cadena3 = new JTextField();
        cadena3.setBounds(300,100,150,30);
        panel.add(cadena3);

        borrar = new JButton("Borrar");
        borrar.setBounds(50,150,100,30);
        panel.add(borrar);

        cadena4 = new JTextField();
        cadena4.setBounds(150,150,150,30);
        panel.add(cadena4);

        mostrar = new JButton("Mostrar cadenas");
        mostrar.setBounds(50,200,150,30);
        panel.add(mostrar);

        regresar = new JButton("Regresar");
        regresar.setBounds(500,300,150,30);
        panel.add(regresar);

        agregar.addActionListener(this);
        mostrar.addActionListener(this);
        modificar.addActionListener(this);
        regresar.addActionListener(this);
        borrar.addActionListener(this);
    
}

    /**
     * Metodo para agregar una cadena al ArrayList
     */
    public void agregarCadena(String x){
        textos.add(x);
    
    }
     /**
     * Metodo que nos permite obtener el ArrayList.
     * @return textos. Arraylist de la clase.
     */
    public ArrayList<String> getTextos(){
        return textos;
    }

     /**
     * 
     * @param indice. Indice del elemento a obtener.
     * @return la cadena en ese indice.
     */


    public String getTexto(int indice){

        return textos.get(indice);

    }

    /**
     * @method .verificarModificacion
     * Se utilizan dos cadenas
     * cadena x . Representa la cadena original , y la que se buscara en el arraylist
     * cadena y . Representa la cadena nueva, para modificar la cadena x
     * Si se logra modificar el estado es igual verdadero y se muestra mensaje de exito.
     * en caso contrario false, y mensaje de error.
     */

    public boolean modificarCadenas(String x , String y){

        boolean estado = false;
    
        int posicionCadenaBuscada = textos.lastIndexOf(x);
        if(posicionCadenaBuscada != -1){

            textos.set(posicionCadenaBuscada,y);
            estado = true;
        }

        else{

            estado = false;

        }

        return estado;

    }

    /**
     * @method .verificarModificacion
     * Metodo que nos permite mostrar un mensaje de exito o rechazo.
     * Segun es estado de la modificacion
     */

    public void verificarModificacion(boolean estado){

        if(estado == true){

            JOptionPane.showMessageDialog(null,"¡Modificacion Exitosa!");
        }
        else{

            JOptionPane.showMessageDialog(null,"¡Error en modificacion!");


        }

    }


    /**
     * @method .mostrarCadenas
    * Metodo que concatena cadenas para mostrarlas mas facil en un JOptionPane
    */

    public void mostrarCadenas(){
        String cadenas = "";

        for(int i = 0 ; i < textos.size(); i++ ){

            cadenas += textos.get(i)+"\n";
        }

      

        JOptionPane.showMessageDialog(null,cadenas);
        
    }


      /**
       * 
       * @Method borrar.
     * Metodo que me permite borrar una cadena del ArrayList
     * Debemos ingresar la cadena que deseamos borrar.
     * SE busca y si está se borra y se devuelve true.
     * caso contrario false
     */

    public boolean borrar(String x){
        boolean estado = false;

        int posicionCadenaBuscada = textos.lastIndexOf(x);

        if(posicionCadenaBuscada != -1){
            textos.remove(posicionCadenaBuscada);
            estado = true;
        }
        else{
            estado = false;
        }

        return estado;


    }
    /**
     * @method verificaBorrado.
     * Metodo que nos arroja mensaje de exito o fracaso
     * dependiedo del estado del metodo borrar
     */
    public void verificaBorrado(boolean estado){

        if(estado == true){

            JOptionPane.showMessageDialog(null,"¡Cadena borrada exitosamente!");
        }
        else{

            JOptionPane.showMessageDialog(null,"¡Error :"+"No se borro la cadena!");

        }

    }

    /**
     * @method ActionPerformed.
     * Este metodo contiene todas las acciones , 
     * para los botonones declarados en el frame;
     */

    public void actionPerformed(ActionEvent e){

        if(e.getSource().equals(agregar)){
            agregarCadena(cadena.getText());
            cadena.setText("");
          
        }

        if(e.getSource().equals(mostrar)){

            mostrarCadenas();
        }

        if(e.getSource().equals(modificar)){

            verificarModificacion( modificarCadenas(cadena2.getText(),cadena3.getText()));
            cadena2.setText("");
            cadena3.setText("");

        
        }

        if(e.getSource().equals(regresar)){
            setVisible(false);
        }

        if(e.getSource().equals(borrar)){

            verificaBorrado(borrar(cadena4.getText()));
            
        }


}

}