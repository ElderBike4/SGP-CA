/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgp.ca.businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sgp.ca.dataaccess.DataBaseConnection;
import sgp.ca.domain.Collaborator;

/**
 *
 * @author Esteban
 */
public class CollaboratorDao implements ICollaboratorDao{
    @Override
    public int Collaborator(Collaborator collaborator){
    int confirmation = 0;
    DataBaseConnection dataBaseConnection = new DataBaseConnection();
    Connection connection = dataBaseConnection.connection();
    String sql;
    
    sql="INSERT INTO collaborator(name,lastName,motherLastName,enrollmentOrId,type,mail,cellPhoneNumber) VALUES (?,?,?,?,?,?,?)";
    
    try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,collaborator.getName());
            preparedStatement.setString(2,collaborator.getLastName());
            preparedStatement.setString(3,collaborator.getMotherLastName());
            preparedStatement.setString(4,collaborator.getEnrollmentOrId());
            preparedStatement.setString(5,collaborator.getType());
            preparedStatement.setString(6,collaborator.getMail());
            preparedStatement.setString(7,collaborator.getCellPhoneNumber());
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
    public Collaborator createCollaborator(String [] data){
        Collaborator collaborator = new Collaborator(data[0],data[1],data[2],data[3],data[4],data[5],data[6]);
        return collaborator;
    }
    @Override
    public boolean verifyCollaborator(Collaborator collaborator){
        boolean confirmation = false;
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try{
            preparedStatement=connection.prepareStatement("SELECT * From collaborator Where Name = ? and lastName = ? and motherLastName = ?");
            preparedStatement.setString(1, collaborator.getName());
            preparedStatement.setString(2, collaborator.getLastName());
            preparedStatement.setString(3, collaborator.getMotherLastName());
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                confirmation = true;    
            }
            dataBaseConnection.closeConnection();
        }catch(SQLException ex){
            Logger.getLogger(MemberDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return confirmation;
    }
    
}
