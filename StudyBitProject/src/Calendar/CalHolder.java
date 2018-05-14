package Calendar;

import java.util.ArrayList;
import java.util.Date;

public class CalHolder {

    private ArrayList<DateHolder> dates; //stores multiple DateHolder objects in order to display tests/quizzes/etc that the user has programmed in

    /**
     * @return return the current array of DateHolders
     */
    public ArrayList<DateHolder> getDates() {
        return dates;
    }

    /**
     * I would not advise using this function because this array will need to be
     * @param dates is set to be the new array of the
     */
    public void setDates(ArrayList<DateHolder> dates) {
        this.dates = dates;
    }

    /**
     * Basic constructor for the CalHolder with no params
     */
    public CalHolder(){

        this(null);

    }

    /**
     * @param dates becomes the initial ArrayList for the CalHolder object
     */
    public CalHolder(ArrayList<DateHolder> dates){

        this.dates = dates;

    }


}
