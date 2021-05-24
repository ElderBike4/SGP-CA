/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.Test;
import sgp.ca.domain.Diary;

/**
 *
 * @author Esteban
 */
public class DiaryTest {
    @Test
    public void consultDiaryTest(){
        
    }
    
    @Test
    public void updateDiaryTest(){
        int confirmation = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        Diary diary = new Diary(Time.valueOf("10:30:00"),Time.valueOf("11:00:00"),30,30,20,"Ejemplo","Agenda");
        DiaryDao diaryDao = new DiaryDao();
        confirmation = diaryDao.modifyDiary(diary,Time.valueOf("10:12:00"));
        Assert.assertEquals(confirmation, 1);
        
    }
}
