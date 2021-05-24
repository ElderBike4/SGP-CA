package sgp.ca.businesslogic;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import sgp.ca.domain.generalCurrículum;

/**
 *
 * @author Esteban
 */
public class GeneralCurriculumTest {
    @Test
    public void testEditGeneralCurriculum(){
        int confirmation = 0;
        generalCurrículum curriculum = new generalCurrículum ("1A3D5FS6S","LIS","FEI",2010);
        GeneralCurrículumDao curriculumDao = new GeneralCurrículumDao();
        confirmation = curriculumDao.editGeneralCurrículum(curriculum,2010);
        Assert.assertEquals(confirmation,1);
    }
    @Test
    public void displayGeneralCurriculum(){
        ArrayList<generalCurrículum> curriculumList = new ArrayList<generalCurrículum>();
        GeneralCurrículumDao displayCurriculum = new GeneralCurrículumDao();
        curriculumList = displayCurriculum.displayGeneralCurriculum();
        Assert.assertNotNull(curriculumList);
    }
}
