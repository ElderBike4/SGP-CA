
package sgp.ca.domain;


public class Event {
    private int dateEvent;
    private int dateRegister;
    private int hour;
    private String place;
    
    public Event(int dateEvent, int dateRegister, int hour, String place){
        this.dateEvent=dateEvent;
        this.dateRegister=dateRegister;
        this.hour=hour;
        this.place=place;
    }
    
    public void setDateEvent(int dateEvent){
        this.dateEvent=dateEvent;
    }
    
    public void setDateRegister(int dateRegister){
        this.dateRegister=dateRegister;
    }
    
    public void setHour(int hour){
        this.hour=hour;
    }
    
    public void setPlace(String place){
        this.place=place;
    }
    
    public int getDateEvent(){
        return dateEvent;
    }
    public int getDateRegister(){
        return dateRegister;
    }
    public int getHour(){
        return hour;
    }
    public String getPlace(){
        return place;
    }
}
