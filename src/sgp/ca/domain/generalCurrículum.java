
package sgp.ca.domain;

public class generalCurrículum {
    private String keyCa;
    private String academicBody;
    private String faculty;
    private int dateRegister;
    
    public generalCurrículum(String keyCa, String academicBody, String faculty, int dateRegister){
        this.keyCa=keyCa;
        this.academicBody=academicBody;
        this.faculty=faculty;
        this.dateRegister=dateRegister;
    }

    public generalCurrículum() {
        
    }
    public void setKeyCa(String keyCa){
        this.keyCa=keyCa;
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
    
    public String getKeyCa(){
        return keyCa;
    }
    public String getAcademicBody(){
        return academicBody;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getDateRegister(){
        return dateRegister;
    }
}
