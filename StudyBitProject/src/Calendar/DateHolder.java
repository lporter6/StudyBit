package Calendar;

/**
 DateHolder is used to hold a specific date to be dynamically created based on what a user might have saved to be a test
 date or a quiz date that they need to study for

 DateHolder will be used by the program to retrieve data and graphically present that data to correct dates
 */

public class DateHolder {


    /**
     year is used to store an int value of what year the object is set to
     */
    private int year;

    /**
     month is used to store and int value of what month the object is set to
     */
    private int month;

    /**
     day is used to store and int value of what day the object is set to
     */
    private int day;

    /**
     timeHolder will be a time holder that holds time
     imagine that
     it will be used to store the time of a given assignment
     */
    private TimeHolder timeHolder;


    /**
     * @return the DateHolder object's year is returned in an int value
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @param year changes the objects year attribute
     */
    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /**
     This starts the constructors for the TimeHolder class
     */

    public TimeHolder getTimeHolder() {
        return timeHolder;
    }

    public void setTimeHolder(TimeHolder timeHolder) {
        this.timeHolder = timeHolder;
    }
}
