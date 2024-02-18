package week03.datetime;

public class CustomTime {
    private int hour, minute, second;

    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        normalizeTime();
    }

    public CustomTime(){
        this(0,0,0);
    }

    public CustomTime(int hour){
        this(hour,0,0);
    }

    public CustomTime(int hour, int minute){
        this(hour,minute,0);
    }

    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String toStandardString() {
        int newHour;
        String AmPm;

        if(hour == 0 || hour == 12){
             newHour = 12;
        }
        else{
             newHour = hour%12;
        }

        if(hour < 12){
            AmPm = "AM"; 
        }
        else{
            AmPm = "PM";
        }

        return String.format("%d:%02d:%02d %s", newHour, minute, second, AmPm);
    }

    public void normalizeTime() {
        int extraMinutes = second / 60;
        second %= 60;
        minute += extraMinutes;

        int extraHours = minute / 60;
        minute %= 60;
        hour += extraHours;

        hour %= 24; 
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
