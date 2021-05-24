/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import sgp.ca.dataaccess.DataBaseConnection;
import sgp.ca.domain.Diary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aldo Ivan
 */
public class DiaryDao implements IDiaryDao {
    
    @Override
    public int modifyDiary(Diary diary, Time starTime){
        int confirmation = 1;
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String starTimeAux = dateFormat.format(diary.getStartTime());
        String endTime = dateFormat.format(diary.getEndTime());
        final String UPDATE = "UPDATE diary SET startTime = ?, endTime = ?, timeEstimated = ?, realTime = ?, numberDiary = ?, subjectAgenda = ?, leaderDiscussion = ? Where startTime = ?";
        try{
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1, starTimeAux);
            statement.setString(2, endTime);
            statement.setString(3, String.valueOf(diary.getTimeEstimated()));
            statement.setString(4, String.valueOf(diary.getRealTime()));
            statement.setString(5, String.valueOf(diary.getNumberDiary()));
            statement.setString(6, diary.getSubjectAgenda());
            statement.setString(7, diary.getLeaderDiscussion());
            statement.setString(8,dateFormat.format(starTime));
            int n=statement.executeUpdate();
            if(n>0){
                dataBaseConnection.closeConnection();
                confirmation = 1;
            }
        }catch(SQLException ex){
            confirmation = 0;
            Logger.getLogger(DiaryDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }

    @Override
    public String [] consultDiary() {
        String [] diary = new String[7];
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        final String GETLIST = "SELECT startTime, endTime, timeEstimated, realTime, numberDiary, subjectAgenda, leaderDiscussion FROM diary";
        Statement statement;
        ResultSet resultSet;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(GETLIST);
            while(resultSet.next()){
            diary[0]=resultSet.getString("startTime");
            diary[1]=resultSet.getString("endtime");
            diary[2]=resultSet.getString("timeEstimated");
            diary[3]=resultSet.getString("realTime");
            diary[4]=resultSet.getString("typeEvidence");
            diary[5]=resultSet.getString("subjectAgenda");
            diary[6]=resultSet.getString("leaderDiscussion");
            }
            dataBaseConnection.closeConnection();
        }catch(SQLException ex){
            diary = null;
            Logger.getLogger(DiaryDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return diary;
    }
}