package magicBallPkg;

import javafx.animation.FadeTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class MagicEightBall extends StackPane {
    private WiseSayings wiseSayings;
    private Text answer;

    public MagicEightBall() {
        this.wiseSayings = new WiseSayings();
        this.answer = new Text("...");
        this.answer.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 25));
        this.answer.setFill(Color.WHITE); // Set answer text color to white

        // Load the image file
        Image image = new Image("https://cdn.frankerfacez.com/emoticon/218530/4");

        // Create an ImageView and set its image to the loaded image
        ImageView imageView = new ImageView(image);

        // Set the position of the ImageView to the bottom of the StackPane
        StackPane.setAlignment(imageView, javafx.geometry.Pos.BOTTOM_CENTER);

        // Add the ImageView and the answer Text to the StackPane
        this.getChildren().addAll(answer, imageView);
    }

    public void showMystery() {
        //  Don't know what to do for this
    }

    public void showSaying() {
        String saying = wiseSayings.getRandomSaying();
        FadeTransition ft = new FadeTransition(Duration.millis(1000), this.answer); // Create a fade in animation
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play(); // Play the animation
        this.answer.setText(saying);
    }
}
