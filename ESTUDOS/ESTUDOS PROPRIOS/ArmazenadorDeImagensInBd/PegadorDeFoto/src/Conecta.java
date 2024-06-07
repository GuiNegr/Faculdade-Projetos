import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {

   public Connection conecta(){
       Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/fotos?user=root&password=root";
            connection = DriverManager.getConnection(url);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
   }


}
