package Calendar;

/**
 * TimeHolder holds basic time values for convenience
 */
public class TimeHolder extends Holder{

    private int ampm; //stores the ampm value at 0 if its am and at 1 if its pm
    private int hour; //stores the hour value of the object
    private int minute; //stores the minute value of the object


    /**
     * @return returns the day/night value to be either 0 if day and 1 if night
     */
    public int getAmpm() {
        return ampm;
    }

    /**
     * @param ampm becomes this objects new ampm attribute
     */
    public void setAmpm(int ampm) {
        this.ampm = ampm;
    }

    /**
     * @return returns the hour value of the saved time
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour is set to the new hour of this object
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return returns the object's minute value
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @param minute is set to be the new minute value of this object
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * @param ampm is set to be the initial ampm value of the object
     * @param hour is set to be the initial hour value of the object
     */
    public TimeHolder(int ampm, int hour) {
        this(ampm,hour,0);
    }

    /**
     * @param ampm is set to be the initial ampm value of the object
     * @param hour is set to be the initial hour value of the object
     * @param minute is set to be the initial minute value of the object
     */
    public TimeHolder(int ampm, int hour, int minute) {
        this.ampm = ampm;
        this.hour = hour;
        this.minute = minute;
    }
}
