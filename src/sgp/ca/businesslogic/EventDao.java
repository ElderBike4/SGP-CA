package sgp.ca.businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sgp.ca.dataaccess.DataBaseConnection;
import sgp.ca.domain.Event;

/**
 *
 * @author Esteban
 */
public class EventDao {
    public void registerEvent(Event eventAux){
        IEventDao iEventDao = new IEventDao();
        DataBaseConnection dbc = new DataBaseConnection();
        Connection connection = dbc.connection();
        String sql;
        String dateEvent = Integer.toString(eventAux.getDateEvent());
        String dateRegister = Integer.toString(eventAux.getDateRegister());
        String hour = Integer.toString(eventAux.getHour());
        String place = eventAux.getPlace();
        
        sql="INSERT INTO event(dateEvent,dateRegister,hour,place) VALUES (?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,dateEvent);
            preparedStatement.setString(2,dateRegister);
            preparedStatement.setString(3,hour);
            preparedStatement.setString(4,place);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                iEventDao.registerEventConfirmation(1);
                connection.close();
            }
        }catch(SQLException e){
            iEventDao.registerEventConfirmation(2);
            System.out.println(e);
        }
    }
}
