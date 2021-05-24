package sgp.ca.dataaccess;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void closeConnection(){
        if(connection!= null){
            try{
                if(!connection.isClosed()){
                    connection.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }   
 

}    

