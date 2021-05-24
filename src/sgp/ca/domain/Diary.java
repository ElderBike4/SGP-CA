package sgp.ca.domain;


import java.sql.Time;

/**
 *
 * @author Aldo Ivan
 */
public class Diary {
    private Time startTime;
    private Time endTime;
    private int timeEstimated;
    private int realTime;
    private int numberDiary;
    private String subjectAgenda;
    private String leaderDiscussion;

    public Diary(Time startTime, Time endTime, int timeEstimated, int realTime, int numberDiary, String subjectAgenda, String leaderDiscussion) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeEstimated = timeEstimated;
        this.realTime = realTime;
        this.numberDiary = numberDiary;
        this.subjectAgenda = subjectAgenda;
        this.leaderDiscussion = leaderDiscussion;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public int getTimeEstimated() {
        return timeEstimated;
    }

    public void setTimeEstimated(int timeEstimated) {
        this.timeEstimated = timeEstimated;
    }

    public int getRealTime() {
        return realTime;
    }

    public void setRealTime(int realTime) {
        this.realTime = realTime;
    }

    public int getNumberDiary() {
        return numberDiary;
    }

    public void setNumberDiary(int numberDiary) {
        this.numberDiary = numberDiary;
    }

    public String getSubjectAgenda() {
        return subjectAgenda;
    }

    public void setSubjectAgenda(String subjectAgenda) {
        this.subjectAgenda = subjectAgenda;
    }

    public String getLeaderDiscussion() {
        return leaderDiscussion;
    }

    public void setLeaderDiscussion(String leaderDiscussion) {
        this.leaderDiscussion = leaderDiscussion;
    }
    
    
}