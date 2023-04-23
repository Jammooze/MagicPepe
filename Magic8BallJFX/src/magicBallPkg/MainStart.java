package magicBallPkg;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainStart extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
        	
        	// New Background for GUI
            Image backgroundImage = new Image("https://wallpapers.com/images/hd/pepe-the-frog-poggers-thhxp73p0lmgcfyf.jpg");
            // Create an ImageView
            ImageView backgroundImageView = new ImageView(backgroundImage);
                	
            // Create a new MagicEightBall object
            MagicEightBall magicEightBall = new MagicEightBall();
            
            VBox vBox = new VBox();
            vBox.setAlignment(Pos.CENTER);
            vBox.setSpacing(20);
            vBox.setPadding(new Insets(0, 0, 20, 0));
            
            Button buttonAsk = new Button("Ask Question");
            
            // Define Button Commands
            buttonAsk.setOnAction(event -> { // Pressing Button prints out random String
                magicEightBall.showSaying();
            });
             
            // Making new Border Pane
            BorderPane root = new BorderPane();
            
            // Set StackPane Background to ImageView
            root.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false))));
            root.getChildren().add(backgroundImageView);
             
            // Add MagicEightBall object to Stack Pane
            StackPane centerPane = new StackPane(magicEightBall);
            root.setCenter(centerPane);
            
            vBox.getChildren().addAll(buttonAsk);
            root.setBottom(vBox);
             
            Scene scene = new Scene(root,300,300);
            primaryStage.setTitle("Magic Pepe");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
