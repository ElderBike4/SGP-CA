package sgp.ca.businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sgp.ca.dataaccess.DataBaseConnection;
import sgp.ca.domain.Event;

/**
 *
 * @author Esteban
 */
public class EventDao implements IEventDao{
    @Override
    public int registerEvent(Event eventAux){
        int confirmation = 0;
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String sql;
        String dateEvent = simpleDateFormat.format(eventAux.getDateEvent());
        String dateRegister = simpleDateFormat.format(eventAux.getDateRegister());
        String hour = dateFormat.format(eventAux.getHour());
        
        sql="INSERT INTO event(Title, responsable, typeEvent, dateRegister, hour, place, dateEvent, guests) VALUES (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,eventAux.getTitle());
            preparedStatement.setString(2,eventAux.getResponsable());
            preparedStatement.setString(3,eventAux.getTypeEvent());
            preparedStatement.setString(4,dateRegister);
            preparedStatement.setString(5,hour);
            preparedStatement.setString(6,eventAux.getPlace());
            preparedStatement.setString(7,dateEvent);
            preparedStatement.setString(8,eventAux.getGuests());
            int n=preparedStatement.executeUpdate();
            if(n>0){
                dataBaseConnection.closeConnection();
                confirmation = 1;
            }
        }catch(SQLException ex){
            confirmation = 2;
            Logger.getLogger(EventDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }
    @Override
    public int editEvent(Event eventAux, String titleAux){
       int confirmation = 0;
       DataBaseConnection dataBaseConnection = new DataBaseConnection();
       Connection connection = dataBaseConnection.connection();
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
       DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
       String dateEvent = simpleDateFormat.format(eventAux.getDateEvent());
       String dateRegister = simpleDateFormat.format(eventAux.getDateRegister());
       String hour = dateFormat.format(eventAux.getHour());
       String sql = "UPDATE event SET Title = ?, responsable = ?, typeEvent = ?,dateRegister = ?, hour = ?, place = ?,dateEvent = ?, guests = ? Where Title = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,eventAux.getTitle());
            preparedStatement.setString(2,eventAux.getResponsable());
            preparedStatement.setString(3,eventAux.getTypeEvent());
            preparedStatement.setString(4,dateRegister);
            preparedStatement.setString(5,hour);
            preparedStatement.setString(6,eventAux.getPlace());
            preparedStatement.setString(7,dateEvent);
            preparedStatement.setString(8,eventAux.getGuests());
            preparedStatement.setString(9,titleAux);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                dataBaseConnection.closeConnection();
                confirmation = 1;
            }
        }catch(SQLException ex){
            confirmation = 2;
            Logger.getLogger(EventDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }
    @Override
    public ArrayList<Event> searchEvent(String title){
        ArrayList<Event> EventList = new ArrayList<Event>();
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try{
            preparedStatement=connection.prepareStatement("SELECT * FROM event WHERE title = ?");
            preparedStatement.setString(1, title);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Event event = new Event();
                event.setTitle(resultSet.getString("Title"));
                event.setResponsable(resultSet.getString("responsable"));
                event.setTypeEvent(resultSet.getString("typeEvent"));
                event.setDateRegister(simpleDateFormat.parse(resultSet.getString("dateRegister")));
                event.setHour(Time.valueOf(resultSet.getString("hour")));
                event.setPlace(resultSet.getString("place"));
                event.setDateEvent(simpleDateFormat.parse(resultSet.getString("dateEvent")));
                event.setGuests(resultSet.getString("guests"));
                EventList.add(event);
            }
                dataBaseConnection.closeConnection();  
        }catch(SQLException ex){
            EventList = null;
            Logger.getLogger(EventDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch(ParseException ex){
            EventList = null;
            Logger.getLogger(EventDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return EventList;
    }
    
    public Event createEvent(String [] data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Event event = new Event();
        try {
            event = new Event(data[0],data[1],data[2],simpleDateFormat.parse(data[3]),Time.valueOf(data[4]),data[5],simpleDateFormat.parse(data[6]),data[7]);
        } catch (ParseException ex) {
            Logger.getLogger(EventDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return event;
    }
}
