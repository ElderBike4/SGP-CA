package sgp.ca.dataaccess;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Esteban
 */
public class DataBaseConnection {
    Connection connection= null;
    public Connection connection(){
        try{
    Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
    connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sgp-ca","Esteban","KYRF5yVRqznsAN3A");
        }catch(SQLException ex) {
            System.out.println(ex);
        }catch(ClassNotFoundException ex) { 
            System.out.println(ex);
    }
  return connection;
}
    
    public boolean connect(){
        DataBaseConnection connectionDataBase = new DataBaseConnection();
        boolean connect = false;
        Connection connection = connectionDataBase.connection();
        if(connection==null){
            
        }else{
            connect = true;  
        }
        return connect;
    }

}    

