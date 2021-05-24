/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import java.util.ArrayList;
import sgp.ca.domain.generalCurrículum;

/**
 *
 * @author Esteban
 */
public interface IGeneralCurrículumDao {
    public int editGeneralCurrículum(generalCurrículum generalCurriculum, int yearAux);
    public ArrayList<generalCurrículum> displayGeneralCurriculum();
    
}
