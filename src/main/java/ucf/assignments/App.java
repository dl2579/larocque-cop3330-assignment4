package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Damian LaRocque
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 480);
        stage.setTitle("To-do list application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        //Create ArrayList<toDoList> appLists for storing toDoLists
        //Rest of Pseudocode is in AppController.java
    }
}