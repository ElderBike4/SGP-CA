
package sgp.ca.domain;

import java.sql.Time;
import java.util.Date;


public class Event {
    private String title;
    private String responsable;
    private String typeEvent;
    private Date dateRegister;
    private Time hour;
    private String place;
    private Date dateEvent;
    private String guests;
    
    
    
    
    public Event(String title,String responsable,String typeEvent,Date dateRegister, Time hour, String place,Date dateEvent,String guests){
        this.title=title;
        this.responsable=responsable;
        this.typeEvent=typeEvent;
        this.dateEvent=dateEvent;
        this.dateRegister=dateRegister;
        this.hour=hour;
        this.place=place;
        this.guests=guests;
    }

    public Event() {
        
    }
    public void setTitle(String title){
        this.title=title;
    }
    
    public void setDateEvent(Date dateEvent){
        this.dateEvent=dateEvent;
    }
    
    public void setDateRegister(Date dateRegister){
        this.dateRegister=dateRegister;
    }
    
    public void setHour(Time hour){
        this.hour=hour;
    }
    
    public void setPlace(String place){
        this.place=place;
    }
    public void setResponsable(String responsable){
        this.responsable=responsable;
    }
    public void setTypeEvent(String typeEvent){
        this.typeEvent=typeEvent;
    }
    public void setGuests(String guests){
        this.guests=guests;
    }
    public String getTitle(){
        return title;
    }
    public Date getDateEvent(){
        return dateEvent;
    }
    public Date getDateRegister(){
        return dateRegister;
    }
    public Time getHour(){
        return hour;
    }
    public String getPlace(){
        return place;
    }
    public String getResponsable(){
        return responsable;
    }
    public String getGuests(){
        return guests;
    }
    public String getTypeEvent(){
        return typeEvent;
    }
}
