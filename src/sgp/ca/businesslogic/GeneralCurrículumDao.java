package sgp.ca.businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sgp.ca.dataaccess.DataBaseConnection;
import sgp.ca.domain.generalCurrículum;

/**
 *
 * @author Esteban
 */
public class GeneralCurrículumDao implements IGeneralCurrículumDao{
    @Override
    public int editGeneralCurrículum(generalCurrículum generalCurriculum, int yearAux){
       int confirmation = 0;
       DataBaseConnection dataBaseConnection = new DataBaseConnection();
       Connection connection = dataBaseConnection.connection();
       String keyCa = generalCurriculum.getKeyCa();
       String academicBody = generalCurriculum.getAcademicBody();
       String faculty = generalCurriculum.getFaculty();
       String yearRegister = Integer.toString(generalCurriculum.getDateRegister());
       String year = String.valueOf(yearAux);
       String sql = "UPDATE generalcurriculum SET keyCa = ?, academicBody = ?, faculty = ?, yearRegister = ? Where yearRegister = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,keyCa);
            preparedStatement.setString(2,academicBody);
            preparedStatement.setString(3,faculty);
            preparedStatement.setString(4,yearRegister);
            preparedStatement.setString(5,year);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                dataBaseConnection.closeConnection();
                confirmation = 1;
            }
        }catch(SQLException ex){
            confirmation = 2;
            Logger.getLogger(GeneralCurrículumDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }
    
    @Override
    public ArrayList<generalCurrículum> displayGeneralCurriculum(){
        ArrayList<generalCurrículum> curriculumList = new ArrayList<generalCurrículum>();
        String sql = "SELECT * FROM generalcurriculum";
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                generalCurrículum curriculum = new generalCurrículum();
                curriculum.setKeyCa(resultSet.getString("keyCa"));
                curriculum.setAcademicBody(resultSet.getString("academicBody"));
                curriculum.setFaculty(resultSet.getString("faculty"));
                curriculum.setDateRegister(resultSet.getInt("yearRegister"));
                curriculumList.add(curriculum);
                }
                dataBaseConnection.closeConnection();
        }catch(SQLException ex){
            curriculumList = null;
            Logger.getLogger(GeneralCurrículumDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return curriculumList;
    }
}
