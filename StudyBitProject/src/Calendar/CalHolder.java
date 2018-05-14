package Calendar;

public class CalHolder {

    private DateHolder[] dates;

    public DateHolder[] getDates() {
        return dates;
    }

    public void setDates(DateHolder[] dates) {
        this.dates = dates;
    }

    public CalHolder(){

        this(null);

    }
    public CalHolder(DateHolder[] dates){

        this.dates = dates;

    }


}
