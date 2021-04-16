package sgp.ca.businesslogic;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class IEventDao {

    void registerEventConfirmation(int confirmation) {
        if(1==confirmation){
            JOptionPane.showMessageDialog(null, "Event saved ");
        }else{
            JOptionPane.showMessageDialog(null,"Error in the connection with the data base");
        }
    }
    
}
