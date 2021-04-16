
import java.sql.SQLException;
import java.sql.Connection;
import org.junit.Test;
import org.junit.Assert;
import sgp.ca.dataaccess.DataBaseConnection;
public class DataBaseConnectionTest {
    
    public DataBaseConnectionTest(){
    
}
    @Test
    public void DataBaseConnectionTest() throws SQLException, ClassNotFoundException{
        Connection currentConnection = new DataBaseConnection().connection();
        Assert.assertNotNull(currentConnection);
    }
}
