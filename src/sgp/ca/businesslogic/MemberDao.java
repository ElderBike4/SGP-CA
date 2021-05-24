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
import sgp.ca.domain.Member;
/**
 *
 * @author Esteban
 */
public class MemberDao implements IMemberDao{
    @Override
    public int Member(Member member1){
    int confirmation = 0;
    DataBaseConnection dataBaseConnection = new DataBaseConnection();
    Connection connection = dataBaseConnection.connection();
    String sql;
    String name=member1.getName();
    String lastName=member1.getLastName();
    String motherLastName=member1.getMotherLastName();
    String user=member1.getUser();
    String password=member1.getPassword();
    String cellPhone=member1.getCellPhoneNumber();
    String mail=member1.getMail();
    String age = String.valueOf(member1.getAge());
    String profileProdep = member1.getProfileProdep();
    String LGCA = member1.getLGCA();
    
    sql="INSERT INTO member(name,lastName,motherLastName,user,password,cellPhoneNumber,mail,age,profilePRODEP,LGCA) VALUES (?,?,?,?,?,?,?,?,?,?)";
    
    try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,motherLastName);
            preparedStatement.setString(4,user);
            preparedStatement.setString(5,password);
            preparedStatement.setString(6,cellPhone);
            preparedStatement.setString(7, mail);
            preparedStatement.setString(8, age);
            preparedStatement.setString(9,profileProdep);
            preparedStatement.setString(10,LGCA);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                dataBaseConnection.closeConnection();
                confirmation=1;
            }
        }catch(SQLException ex){
            confirmation=2;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch(NullPointerException ex){
            confirmation=2;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }
    return confirmation;
}
    @Override
    public ArrayList<Member> searchMember(String nameMember){
        ArrayList<Member> MemberList = new ArrayList<Member>();
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try{
            preparedStatement=connection.prepareStatement("SELECT * From member Where Name = ?");
            preparedStatement.setString(1, nameMember);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Member member = new Member();
                member.setName(resultSet.getString("name"));
                member.setLastName(resultSet.getString("lastName"));
                member.setMotherLastName(resultSet.getString("motherLastName"));
                member.setUser(resultSet.getString("user"));
                member.setPassword(resultSet.getString("password"));
                member.setCellPhoneNumber(resultSet.getString("cellPhoneNumber"));
                member.setMail(resultSet.getString("mail"));
                member.setAge(Integer.parseInt(resultSet.getString("age")));
                member.setProfileProdep(resultSet.getString("profilePRODEP"));
                member.setLGCA(resultSet.getString("lGCA"));
                
                MemberList.add(member);
            }
            dataBaseConnection.closeConnection();  
        }catch(SQLException ex){
            MemberList = null;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return MemberList;
    }
        
    @Override
    public int deleteMember(String user){
        int confirmation = 0;
        String sql = "DELETE FROM member WHERE User = ? ";
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user);
            int n=preparedStatement.executeUpdate();
            if(n>0){
                confirmation = 1;
                dataBaseConnection.closeConnection();
            }
        }catch(SQLException ex){
            confirmation = 2;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }
    
    @Override
    public ArrayList<Member> displayMembers(){
        ArrayList<Member> MemberList = new ArrayList<Member>();
        String sql = "SELECT * FROM member";
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            Member member = new Member();
            member.setName(resultSet.getString("name"));
            member.setLastName(resultSet.getString("lastName"));
            member.setMotherLastName(resultSet.getString("motherLastName"));
            member.setUser(resultSet.getString("user"));
            member.setPassword(resultSet.getString("password"));
            member.setCellPhoneNumber(resultSet.getString("cellPhoneNumber"));
            member.setMail(resultSet.getString("mail"));
            member.setAge(Integer.parseInt(resultSet.getString("age")));
            member.setProfileProdep(resultSet.getString("profilePRODEP"));
            member.setLGCA(resultSet.getString("LGCA"));
            MemberList.add(member);
            }
            dataBaseConnection.closeConnection();
        }catch(SQLException ex){
            MemberList = null;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return MemberList;
    }

    public Member createMember(String [] data) {
        String ageAux = data[7];
        int age = Integer.parseInt(ageAux);
        Member member = new Member(data[0],data[1],data[2],data[3],data[4],data[5],data[6],age,data[8],data[9]);
        return member;
    }

    public boolean verifyMember(Member member){
        boolean confirmation = false;
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try{
            preparedStatement=connection.prepareStatement("SELECT * From member Where Name = ? and lastName = ? and motherLastName = ?");
            preparedStatement.setString(1, member.getName());
            preparedStatement.setString(2, member.getLastName());
            preparedStatement.setString(3, member.getMotherLastName());
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                confirmation = true;    
            }
            dataBaseConnection.closeConnection();
        }catch(SQLException ex){
            confirmation = false;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch(NullPointerException ex){
            confirmation = false;
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }
}