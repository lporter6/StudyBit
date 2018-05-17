package IO;

import Calendar.DateHolder;
import Calendar.DescHolder;
import Calendar.TimeHolder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * SpecialFileReader will read the files this program will create
 */

public class SpecialFileReader {

    /**
     * readCalFile will interpret text from a txt file that the program will create
     * @param filePath is the path to the file that the function is reading
     * @return returns a HashMap of key,value pair DateHolder and DescHolder
     */
    public static HashMap<DateHolder, DescHolder> readCalFile(String filePath){

        try {

            BufferedReader br = new BufferedReader(new FileReader(filePath)); //buffered readed gets input based on how many lines there are
            LinkedList<String> list = new LinkedList<>(); //this linklist holds each line of text copied from the text
            HashMap<DateHolder,DescHolder> returnHash = new HashMap<>(); //this is the HashMap that will be returned, the program will add to it later

            for(int i = 0; i<SpecialFileReader.numberOfLines(filePath); i++){ //for every line of text in the file at filePath

                list.add(br.readLine()); //BufferedReader reads the line. This works every time because buffered reader counts the lines as well and knows to go to the next one upon calling it another time

            }

            br.close();

            for(String s: list){ //for every String in the linked list

                String[] local = s.split(":"); //splits the String at every ":". This will always work unless the text file is messed with by the user.
                int year = Integer.parseInt(local[0]);
                int hour = Integer.parseInt(local[1]);
                int minute = Integer.parseInt(local[2]);
                TimeHolder timeHolder = new TimeHolder(Integer.parseInt(local[3]), Integer.parseInt(local[4]), Integer.parseInt(local[5]));
                String title = local[6];
                String desc = local[7].split(";")[0]; //local[7] has a semicolon at the end, so by splitting it at the semicolon, i can easily then look at index 0 which will be whatever the string was without a ";"

                returnHash.put(new DateHolder(year,hour,minute,timeHolder), new DescHolder(title,desc)); //for every line from the text file, it analyzes and splits the text

            }

            return returnHash; //if all the above code runs correctly, the program will always return a HashMap


        }catch(IOException e) {

            System.out.println("Path invalid");
            return null;

        }

    }

    /**
     * @param filePath is the path of the file
     * @return returns the int value of the number of lines
     */
    public static int numberOfLines(String filePath){
        try{
            Scanner input = new Scanner(new File(filePath)); //the scanner object will loop through the filePath and see how many lines of text it is
            int local = 0;
            while(input.hasNextLine() == true) {
                local += 1;input.nextLine(); //for every line in the text, increase the local variable by one
            }
            input.close();
            return local; //return the local variable
        }catch(IOException e){
            System.out.println("File Not Found");
            return 0;
        }

    }

}
