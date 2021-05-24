/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import sgp.ca.domain.Diary;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author Aldo Ivan
 */
public interface IDiaryDao {
    public String [] consultDiary();
    public int modifyDiary(Diary diary, Time startTime) throws SQLException;
}
