import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBD{

    public static String bd = "textoseguro";
    public static String url  = "jdbc:mysql://localhost/"+bd+"?userTimezone=true&serverTimezone=UTC";
    public static String user = "root" ;
    public static String contra = "catzin96";
    
    
    public  Connection getConnection(){
       
        
        Connection conexion = null;
 
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
           conexion = (Connection) DriverManager.getConnection(url, user, contra);
           /*System.out.println("Conexion exitosa");*/


        }catch(Exception e){

            System.out.println(e);

        }

     
        return conexion;
    }

}




