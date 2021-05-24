package sgp.ca.businesslogic;

/**
 *
 * @author Esteban
 */

import org.junit.Assert;
import org.junit.Test;
import sgp.ca.domain.Collaborator;

public class CollaboratorDaoTest {
    
    @Test
    public void addCollaborator(){
        int confirmation = 0;
        CollaboratorDao collaboratorDao = new CollaboratorDao();
        Collaborator collaborator = new Collaborator("Aldo","Marquez","Rodriguez","s19012021","Estudiante","Lolis@gmail.com","2291236457");
        confirmation=collaboratorDao.Collaborator(collaborator);
        Assert.assertEquals(confirmation, 1);
    }
}