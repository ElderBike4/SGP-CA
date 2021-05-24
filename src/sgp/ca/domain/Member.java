package sgp.ca.domain;

/**
 *
 * @author Esteban
 */
public class Member {
    private String name;
    private String lastName;
    private String motherLastName;
    private String user;
    private String password;
    private String cellPhoneNumber;
    private String mail;
    private int age;
    private String profileProdep;
    private String LGCA;
    
    public Member(String name, String lastName, String motherLastName, String user, String password, String cellPhoneNumber, String mail,int age,String profileProdep,String LGCA){
        this.name=name;
        this.lastName=lastName;
        this.motherLastName=motherLastName;
        this.user=user;
        this.password=password;
        this.cellPhoneNumber=cellPhoneNumber;
        this.mail=mail;
        this.age=age;
        this.profileProdep = profileProdep;
        this.LGCA = LGCA;
    }

    public Member() {
        
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
    public void setUser(String user){
        this.user=user;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setCellPhoneNumber(String cellPhoneNumber){
        this.cellPhoneNumber=cellPhoneNumber;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setProfileProdep(String profileProdep){
        this.profileProdep = profileProdep;
    }
    public void setLGCA(String LGCA){
        this.LGCA = LGCA;
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
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return password;
    }
    public String getCellPhoneNumber(){
        return cellPhoneNumber;
    }
    public String getMail(){
        return mail;
    }
    public int getAge(){
        return age;
    }
    public String getProfileProdep(){
        return profileProdep;
    }
    public String getLGCA(){
        return LGCA;
    }
}
