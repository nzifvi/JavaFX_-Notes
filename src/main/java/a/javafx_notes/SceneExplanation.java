package a.javafx_notes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.*;

/*
WHAT IS SCENE?
The Scene object is a container for all the content in the Scene graph. A scene object must be loaded into a
Stage object, using the .setScene(Scene sceneObj) method.

- Only 1 Scene object can be loaded into a Stage object at any time.

WHAT IS THE SCENE GRAPH?
A Scene Graph is a tree data structure that contains the Nodes of a Scene object.

- Nodes are a single element, within the Scene graph, that stores an individual piece of content. Each Node represents a
  piece of content within the Scene graph.

- A Scene Graph's structure (how the Nodes are related) determines on the Data Structure passed to the constructor when
  the Scene object is initialised.

  Scene sceneObj = new Scene(sceneGraphStructure, double xWidth, double yHeight);
  sceneGraphStructure is the data structure that determines how the Nodes will be handled.

 WHAT DATA STRUCTURES CAN I MAKE THE SCENE'S SCENE GRAPH'S STRUCTURE BE?

1) Group
2) Pane
3) StackPane
4) VBox
* */

//BEGINNING OF CODE |---------------------------------------------------------------------------------------------------

public class SceneExplanation extends Application {
    final int GENERATE_Group = 1;
    final int GENERATE_Pane = 2;
    final int GENERATE_StackPane = 3;
    final int GENERATE_VBox = 4;

    public static void main(String[] args) { //REFER TO StageExplanation FOR EXPLANATION
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = createSceneGraphStructure(GENERATE_Group);
        Scene sceneObj;

        if(root != null){

            sceneObj = new Scene(root, 800, 600);
            stage.setScene(sceneObj);

        }

        /*
        Stage object's .setScene(Scene sceneObj) method is used to set the scene of a stage.
        */
        stage.show();
    }

    /*Parent class is the base class for all nodes that have children in the scene
    * this class handles all the hierarchical scene graph operations, */
    private Parent createSceneGraphStructure(final int generateWhat) {
        switch(generateWhat){
            case GENERATE_Group:
                return new Group();
            case GENERATE_Pane:
                return new Pane();
            case GENERATE_StackPane:
                return new StackPane();
            case GENERATE_VBox:
                return new VBox();
            default:
                System.out.println("    ! Unexpected graph structure attempted to be loaded, returning null");
                return null;
        }
    }
}