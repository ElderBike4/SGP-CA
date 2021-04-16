package sgp.ca.businesslogic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sgp.ca.dataaccess.DataBaseConnection;
import sgp.ca.domain.Member;
/**
 *
 * @author Esteban
 */
public class MemberDao {
    
    public void Member(Member member1){
    IMemberDao iMemberDao = new IMemberDao();
    DataBaseConnection dbc = new DataBaseConnection();
    Connection connection = dbc.connection();
    String sql;
    String name=member1.getName();
    String lastName=member1.getLasName();
    String motherLastName=member1.getMotherLastName();
    String user=member1.getUser();
    String password=member1.getPassword();
    String cellPhone=member1.getCellPhoneNumber();
    String mail=member1.getMail();
    
    sql="INSERT INTO member(name,lastName,motherLastName,user,password,cellPhoneNumber,mail) VALUES (?,?,?,?,?,?,?)";
    
    try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,motherLastName);
            preparedStatement.setString(4,user);
            preparedStatement.setString(5,password);
            preparedStatement.setString(6,cellPhone);
            preparedStatement.setString(7, mail);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                iMemberDao.registerMemberConfirmation(1);
                connection.close();
            }
        }catch(SQLException e){
            iMemberDao.registerMemberConfirmation(2);
        }
}
    public void searchMember(String nameMember){
        
    }
        
    
    public void deleteMember(String user){
        IMemberDao iMemberDao = new IMemberDao();
        String sql = "DELETE FROM member WHERE User = ? ";
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                iMemberDao.deleteMemberConfirmation(1);
                connection.close();
            }
        }catch(SQLException e){
            iMemberDao.deleteMemberConfirmation(2);
        }
    }
    
    public void diplayMembers(){
        IMemberDao iMemberDao = new IMemberDao();
        String [] register= new String[7];
        String sql = "SELECT * FROM member";
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            register[0]=resultSet.getString("name");
            register[1]=resultSet.getString("lastName");
            register[2]=resultSet.getString("motherLastName");
            register[3]=resultSet.getString("user");
            register[4]=resultSet.getString("password");
            register[5]=resultSet.getString("cellPhoneNumber");
            register[6]=resultSet.getString("mail");
            iMemberDao.displayMembers(register);
            }
            connection.close();
        }catch(SQLException ex){
            iMemberDao.registerMemberConfirmation(2);
        }
    }
}