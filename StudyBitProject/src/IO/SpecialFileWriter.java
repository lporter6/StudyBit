package IO;

import Calendar.DateHolder;
import Calendar.DescHolder;
import Main.Main;

import java.io.*;
import java.util.LinkedList;

/**
 * Writes files in a special format
 */
public class SpecialFileWriter {

    /**
     * This function has a rediculous amount of parameters
     * It is much easier for me to write the function, though
     * @param year is the year value of the assignment it will write
     * @param month is the month value of the assignment it will write
     * @param day is the day value of the assignment it will write
     * @param ampm is the ampm value of the assignment it will write
     * @param hour is the hour value of the assignment it will write
     * @param minute is the minute value of the assignment it will write
     * @param title is the title of the assignent
     * @param desc is the description of the assignment
     */
    public static void writeToCalFile(String year, String month, String day, String ampm, String hour, String minute, String title, String desc){

        try{

            BufferedReader br = new BufferedReader(new FileReader(Main.universalPathName));
            LinkedList<String> previousText = new LinkedList<>();

            String line;

            while((line = br.readLine()) != null){

                previousText.add(line);

            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(Main.universalPathName));

            for(String s: previousText){

                bw.write(s);
                bw.newLine();

            }


            String colon = ":";
            String semicolon = ";";

            bw.write(year+colon+month+colon+day+colon+ampm+colon+hour+colon+minute+colon+title+colon+desc+semicolon);

        }catch(FileNotFoundException e){

        }catch(IOException e){

        }

    }

    /**
     * This function is much easier to use in the program but harder to write for the poor programmer
     * @param dateHolder is the DateHolder is will pull information from to write to the Cal file
     * @param descHolder is the DescHolder is will pull information from to write to the Cal file
     */
    public static void writeToCalFile(DateHolder dateHolder, DescHolder descHolder){

        try {

            BufferedReader br = new BufferedReader(new FileReader(Main.universalPathName));
            LinkedList<String> previousText = new LinkedList<>();

            String line;

            while((line = br.readLine()) != null){

                previousText.add(line);

            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(Main.universalPathName));

            for(String s: previousText){

                bw.write(s);
                bw.newLine();

            }

            String year = String.valueOf(dateHolder.getYear());
            String month = String.valueOf(dateHolder.getMonth());
            String day = String.valueOf(dateHolder.getDay());
            String ampm = String.valueOf(dateHolder.getTimeHolder().getAmpm());
            String hour = String.valueOf(dateHolder.getTimeHolder().getHour());
            String minute = String.valueOf(dateHolder.getTimeHolder().getMinute());
            String title = descHolder.getTitle();
            String desc = descHolder.getDesc();
            String colon = ":";
            String semicolon = ";";

            bw.write(year+colon+month+colon+day+colon+ampm+colon+hour+colon+minute+colon+title+colon+desc+semicolon);

        }catch(FileNotFoundException e){

            System.out.println("File not found: \"" + Main.universalPathName + "\"");
            e.printStackTrace();

        }catch(IOException io){

            System.out.println("Error Reading File");
            io.printStackTrace();

        }
    }

}
