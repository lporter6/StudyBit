package Main;

import Calendar.DateHolder;
import Calendar.DescHolder;
import Calendar.TimeHolder;
import IO.SpecialFileReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {

    public static BorderPane root = new BorderPane(); //root Pane of the Scene
    public static GridPane center = new GridPane(); //center of the BorderPane

    public static TextField year = new TextField();
    public static TextField month = new TextField();
    public static TextField day = new TextField();
    public static TextField ampm = new TextField();
    public static TextField hour = new TextField();
    public static TextField minute = new TextField();
    public static TextField title = new TextField();
    public static TextField desc = new TextField();

    public static Label yearL = new Label("Year:");
    public static Label monthL = new Label("Month:");
    public static Label dayL = new Label("Day:");
    public static Label ampmL = new Label("AM/PM:");
    public static Label hourL = new Label("Hour:");
    public static Label minuteL = new Label("Minute:");
    public static Label titleL = new Label("Title:");
    public static Label descL = new Label("Description:");

    public static Button enter = new Button("Enter");

    public static HashMap<DateHolder, DescHolder> hash = new HashMap<>();

    @Override
    public void start(Stage primaryStage) throws Exception{

        root.setCenter(center);

        center.add(yearL, 0,0);
        center.add(monthL, 0,1);
        center.add(dayL, 0,2);
        center.add(ampmL, 0,3);
        center.add(hourL, 0,4);
        center.add(minuteL, 0,5);
        center.add(titleL, 0,6);
        center.add(descL, 0,7);

        center.add(year, 1,0);
        center.add(month, 1,1);
        center.add(day, 1,2);
        center.add(ampm, 1,3);
        center.add(hour, 1,4);
        center.add(minute, 1,5);
        center.add(title, 1,6);
        center.add(desc, 1,7);

        center.add(enter, 1,8);

        enter.setOnAction(onClick -> buttonClick());

        center.setAlignment(Pos.CENTER);


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }

    public static void buttonClick(){
        if(!year.getText().equals("")){
            if(!month.getText().equals("")) {
                if (!day.getText().equals("")) {
                    if (!ampm.getText().equals("")) {
                        if (!hour.getText().equals("")) {
                            if (!minute.getText().equals("")) {
                                if (!title.getText().equals("")) {
                                    if (!desc.getText().equals("")) {

                                        int yearS = Integer.parseInt(year.getText());
                                        int monthS = Integer.parseInt(month.getText());
                                        int dayS = Integer.parseInt(day.getText());
                                        int ampmS = Integer.parseInt(ampm.getText());
                                        int hourS = Integer.parseInt(hour.getText());
                                        int minuteS = Integer.parseInt(minute.getText());
                                        String titleS = title.getText();
                                        String descS = desc.getText();

                                        DateHolder dateHolder = new DateHolder(yearS, monthS, dayS, new TimeHolder(ampmS, hourS, minuteS));
                                        DescHolder descHolder = new DescHolder(titleS, descS);

                                        hash.put(dateHolder, descHolder);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else{

            System.out.println("Error");

        }



    }
    public static void main(String[] args) {
        launch(args);
    }
}
