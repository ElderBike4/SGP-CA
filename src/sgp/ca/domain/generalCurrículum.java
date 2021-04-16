
package sgp.ca.domain;

public class generalCurrículum {
    private String key;
    private String academicBody;
    private String faculty;
    private int dateRegister;
    
    public generalCurrículum(String key, String academicBody, String faculty, int dateRegister){
        this.key=key;
        this.academicBody=academicBody;
        this.faculty=faculty;
        this.dateRegister=dateRegister;
    }
    public void setKey(String key){
        this.key=key;
    }
    public void setAcademicBody(String academicBody){
        this.academicBody=academicBody;
    }
    public void setFaculty(String faculty){
        this.faculty=faculty;
    }
    public void setDateRegister(int dateRegister){
        this.dateRegister=dateRegister;
    }
    
    public String getKey(){
        return key;
    }
    public String getAcademiBody(){
        return academicBody;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getDateRegister(){
        return dateRegister;
    }
}
