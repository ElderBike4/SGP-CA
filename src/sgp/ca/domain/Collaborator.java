package sgp.ca.domain;

/**
 *
 * @author Esteban
 */
public class Collaborator {
    private String name;
    private String lastName;
    private String motherLastName;
    private String enrollmentOrId;
    private String type;
    private String mail;
    private String cellPhoneNumber;
    
    public Collaborator(){
        
    }
    public Collaborator(String name, String lastName, String motherLastName,String enrollmentOrId,String type,String mail, String cellPhoneNumber){
        this.name = name;
        this.lastName=lastName;
        this.motherLastName=motherLastName;
        this.enrollmentOrId=enrollmentOrId;
        this.type=type;
        this.mail=mail;
        this.cellPhoneNumber=cellPhoneNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setMotherLastName(String motherLastName){
        this.motherLastName=motherLastName;
    }
    
    public void setEnrollmentOrId(String enrollmentOrId){
        this.enrollmentOrId=enrollmentOrId;
    }
    
    public void setType(String type){
        this.type=type;
    }
    public void setCellPhoneNumber(String cellPhoneNumber){
        this.cellPhoneNumber=cellPhoneNumber;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMotherLastName(){
        return motherLastName;
    }
    
    public String getEnrollmentOrId(){
        return enrollmentOrId;
    }
    public String getType(){
        return type;
    }
    
    public String getCellPhoneNumber(){
        return cellPhoneNumber;
    }
    public String getMail(){
        return mail;
    }
}

