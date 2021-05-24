
package sgp.ca.businesslogic;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import sgp.ca.domain.Event;

/**
 *
 * @author Esteban
 */
public class EventDaoTest {
    /*
    @Test
    public void testRegisterEvent() throws ParseException{
        int confirmation = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Event event = new Event("Consejo","Esteban","Evento Colegiado",simpleDateFormat.parse("2000-12-23"),Time.valueOf("12:30:00"),"Xalapa",simpleDateFormat.parse("2000-12-24"),"Aldo,Alfredo,Arantza");
        EventDao eventDao = new EventDao();
        confirmation = eventDao.registerEvent(event);
        Assert.assertEquals(confirmation,1);
    }
    */
    /*
    @Test
    public void testEditEvent() throws ParseException{
        int confirmation = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Event event = new Event("Consejo","Esteban","Evento Colegiado",simpleDateFormat.parse("2000-12-23"),Time.valueOf("12:30:00"),"Xalapa",simpleDateFormat.parse("2000-12-24"),"Aldo,Alfredo,Arantza");
        EventDao eventDao = new EventDao();
        confirmation = eventDao.editEvent(event, "Expoanime");
        Assert.assertEquals(confirmation, 1);
    }
    */
    @Test
    public void testSearchEvent(){
       ArrayList<Event> EventList = new ArrayList<Event>();  
       EventDao searchEvent = new EventDao();
       EventList=searchEvent.searchEvent("ExpoFeria");
       Assert.assertNotNull(EventList);
    }
    
    
    
}
