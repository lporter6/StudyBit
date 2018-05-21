package IO;

import Calendar.DateHolder;
import Calendar.DescHolder;

/**
 * Writes files in a special format
 */
public class SpecialFileWriter {

    /**
     * This function has a rediculous amount of parameters
     * It is much easier for me to write the function, though
     * @param pathName is the path of the file it is writing to
     * @param year is the year value of the assignment it will write
     * @param month is the month value of the assignment it will write
     * @param day is the day value of the assignment it will write
     * @param ampm is the ampm value of the assignment it will write
     * @param hour is the hour value of the assignment it will write
     * @param minute is the minute value of the assignment it will write
     * @param title is the title of the assignent
     * @param desc is the description of the assignment
     */
    public static void writeToCalFile(String pathName, String year, String month, String day, String ampm, String hour, String minute, String title, String desc){

    }

    /**
     * This function is much easier to use in the program but harder to write for the poor programmer
     * @param pathName is the pathName of the file
     * @param dateHolder is the DateHolder is will pull information from to write to the Cal file
     * @param descHolder is the DescHolder is will pull information from to write to the Cal file
     */
    public static void writeToCalFile(String pathName, DateHolder dateHolder, DescHolder descHolder){


    }

}
