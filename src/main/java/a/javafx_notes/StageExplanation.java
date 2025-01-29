package a.javafx_notes; //IntelliJ does this, not sure why.

import javafx.application.Application;
/*
WHAT IS APPLICATION CLASS?
Application is the class responsible for booting the system dependencies.

The process is initiated, in main, using launch(). One parameter, args (parameter of main itself), can be passed
*/
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*
WHAT IS STAGE?
Stage is the class responsible for handling a window that will be opened upon the .show() method being called.
Via methods of a Stage object, a window can be customised and a Scene (later discussed) can be
* */

public class StageExplanation extends Application {
    /*
By setting main class to be child of Application, main has a copy of Application's methods, allowing them to be
called without an Application object being initialised.
*/

    public static void main(String[] args){
        launch(args); /*
        launch, a method from Application, starts the booting of system dependencies. Once all dependencies have
        been set up properly, start() is called and a stage is passed to it. The passed stage is the primary stage.
        */
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.show(); //Stage object represents a window that can be opened, modified, and have a scene attached./*

    }
}
