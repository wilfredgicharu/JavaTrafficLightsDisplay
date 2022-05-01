
import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.control.RadioButton;

import javafx.scene.control.ToggleGroup;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

public class TrafficLight extends Application {


    private Circle red, yellow, green;

    private RadioButton redBtn, yellowBtn, greenBtn;

    @Override

    public void start(Stage primaryStage) {



        Rectangle rect = new Rectangle(50, 50, 100, 300);

        rect.setFill(Color.WHITE);

        rect.setStroke(Color.BLACK);


        red = new Circle(100, 100, 40);

        red.setFill(null);

        red.setStroke(Color.BLACK);

        yellow = new Circle(100, 200, 40);

        yellow.setFill(null);

        yellow.setStroke(Color.BLACK);

        green = new Circle(100, 300, 40);

        green.setFill(null);

        green.setStroke(Color.BLACK);


        Group lights = new Group(rect, red, yellow, green );


        redBtn = new RadioButton("Red");

        yellowBtn = new RadioButton("Yellow");

        greenBtn = new RadioButton("Green");



        ToggleGroup group = new ToggleGroup();

        redBtn.setToggleGroup(group);

        yellowBtn.setToggleGroup(group);

        greenBtn.setToggleGroup(group);


        redBtn.setOnAction(e -> update());

        yellowBtn.setOnAction(e -> update());

        greenBtn.setOnAction(e -> update());


        HBox buttons = new HBox(redBtn, yellowBtn, greenBtn );

        buttons.setSpacing(20); //gap between cells

        buttons.setAlignment(Pos.CENTER);


        VBox root = new VBox(lights, buttons);

        root.setSpacing(20); //gap between cells

        root.setAlignment(Pos.CENTER);

        root.setPadding(new Insets(20)); //padding


        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Traffic Light");

        primaryStage.show();

    }


    public void update() {


        if (redBtn.isSelected()) {

            red.setFill(Color.RED);

            yellow.setFill(null);

            green.setFill(null);


        } else if (yellowBtn.isSelected()) {

            red.setFill(null);

            yellow.setFill(Color.YELLOW);

            green.setFill(null);


        } else  {

            red.setFill(null);

            yellow.setFill(null);

            green.setFill(Color.GREEN);


        }

    }

    public static void main(String[] args) {

        launch(args);

    }

}
