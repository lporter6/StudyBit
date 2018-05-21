package Calendar;

/**
 * DateHolder is used to hold a specific date to be dynamically created based on what a user might have saved to be a test
 * date or a quiz date that they need to study for
 *
 * DateHolder will be used by the program to retrieve data and graphically present that data to correct dates
 */

public class DateHolder{

    private int year; //stores the year value of the object
    private int month; //stores the month value of the object
    private int day; //stores the day value of the object
    private TimeHolder timeHolder; //stores a TimeHolder object that's used to tell time

    /**
     * @return the DateHolder object's year is returned in an int value
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year changes the objects year attribute
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return returns the month value of the object
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month is set to be the new month value of the object
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return returns the day value of the object
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day is set to be the new day value of the object
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * @return returns the TimeHolder object attribute of this object
     */
    public TimeHolder getTimeHolder() {
        return timeHolder;
    }

    /**
     * @param timeHolder is set to be the new TimeHolder of the object
     */
    public void setTimeHolder(TimeHolder timeHolder) {
        this.timeHolder = timeHolder;
    }

    /**
     * @param year is set to be the initial year value of the object
     * @param month is set to be the initial month value of the object
     *  @param day is set to be the initial day value of the object
     * @param timeHolder is set to be the initial timeHolder value of the object
     */
    public DateHolder(int year, int month, int day, TimeHolder timeHolder) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.timeHolder = timeHolder;
    }
}
