package Calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * CalHolder holds data for dates and descriptions of assignments
 */

public class CalHolder {

    private HashMap<DateHolder,DescHolder> dates; //stores multiple DateHolder,DescHolder key value pair objects in order to display tests/quizzes/etc that the user has programmed in

    /**
     * @return return the current array of DateHolders
     */
    public HashMap<DateHolder,DescHolder> getDates() {
        return dates;
    }

    /**
     * I would not advise using this function because this Map will need to be dynamically added to
     * @param dates is set to be the new HashMap of the object
     */
    public void setDates(HashMap<DateHolder,DescHolder> dates) {
        this.dates = dates;
    }

    /**
     * Basic constructor for the CalHolder with no params
     */
    public CalHolder(){

        this(null);

    }

    /**
     * @param dates becomes the initial HashMap for the CalHolder object
     */
    public CalHolder(HashMap<DateHolder,DescHolder> dates){

        this.dates = dates;

    }


}
