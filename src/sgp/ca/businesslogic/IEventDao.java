/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import java.util.ArrayList;
import sgp.ca.domain.Event;

/**
 *
 * @author Esteban
 */
public interface IEventDao {
    public int registerEvent(Event eventAux);
    public int editEvent(Event eventAux, String titleAux);
    public ArrayList<Event> searchEvent(String title);
}
