
package sgp.ca.businesslogic;

import org.junit.Test;
import sgp.ca.domain.Event;

/**
 *
 * @author Esteban
 */
public class EventDaoTest {
    @Test
    public void testRegisterEvent(){
        Event event = new Event(10,2021,15,"Xalapa");
        EventDao eventDao = new EventDao();
        eventDao.registerEvent(event);
    }
}
