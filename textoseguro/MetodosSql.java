import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class MetodosSql{


    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar(String nombreUsuario,String contraseña){

        int resultado = 0;
        Connection conexion = null;
        String sentencia = ("INSERT INTO usuario(nombreUsuario,contraseña) values(?,?)");

        try{

            conexion = this.conexion.getConnection();
            sentencia_preparada = conexion.prepareStatement(sentencia);
            sentencia_preparada.setString(1,nombreUsuario);
            sentencia_preparada.setString(2,contraseña);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();


        }catch(Exception e){

            System.out.println(e);

        }

        return resultado;

    }


    public boolean buscarNombre(String nombreUsuario){

        String busquedaNombre = null;
        Connection conexion = null;
        boolean estado = false;

        try{

            conexion = this.conexion.getConnection();
            String sentenciaa_buscar = ("SElECT NombreUsuario FROM usuario WHERE NombreUsuario like '"+nombreUsuario+"'");
            sentencia_preparada = conexion.prepareStatement(sentenciaa_buscar);
            resultado = sentencia_preparada.executeQuery();

            if(resultado.next()){

                String nombreu = resultado.getString("NombreUsuario");
                busquedaNombre = nombreu;
                estado = true;
              

            }

            conexion.close();

        }catch(Exception e){

            System.out.println(e);
        }

        System.out.println(estado);

        return estado;

    }


    public boolean buscarUsuario(String NombreUsuario, String contraseña){

        boolean usuarioEncontrado = false;
        Connection conexion = null;

        try{

            conexion = this.conexion.getConnection();
            String sentencia_buscar_usuario = ("SELECT NombreUsuario FROM usuario WHERE NombreUsuario ='"+NombreUsuario+"'&& contraseña ='"+ contraseña+"'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);

            resultado = sentencia_preparada.executeQuery();

            if(resultado.next()){

                usuarioEncontrado = true;
                
            }

            else{

                usuarioEncontrado = false;

            }


            conexion.close();



        }catch(Exception e){

            System.out.println(e);
        }

        return usuarioEncontrado;
        
    }











}