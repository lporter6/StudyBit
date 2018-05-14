package Callender;

public class TimeHolder {

    /**
     ampm stores the int value of whether it is am or pm
     */
    private int ampm;

    /**
     hour stores the int value of the hour
     */
    private int hour;
    /**
     minute stores the int value of the minute
     */
    private int minute;


    /**
     getters and setters
     */
    public int getAmpm() {
        return ampm;
    }

    public void setAmpm(int ampm) {
        this.ampm = ampm;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public TimeHolder(int ampm, int hour) {
        this(ampm,hour,0);
    }

    public TimeHolder(int ampm, int hour, int minute) {
        this.ampm = ampm;
        this.hour = hour;
        this.minute = minute;
    }
}
