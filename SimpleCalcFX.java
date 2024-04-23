import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleCalcFX extends Application{
   public void start(Stage stage){
   
      TextField val1TextField = new TextField();
      val1TextField.setMaxWidth(250);
      
      TextField val2TextField = new TextField();
      val2TextField.setMaxWidth(250);
      
      Label outputLabel = new Label();
      outputLabel.setTextFill(Color.BLACK);
      outputLabel.setFont(Font.font("Arial", 20));
      
      
      Button addButton = new Button();
      addButton.setText("add");
      addButton.setOnAction(e -> {
        int value1 = Integer.parseInt(val1TextField.getText());
      int value2 = Integer.parseInt(val2TextField.getText());
      int out;
        out = value1 + value2;
        outputLabel.setText(String.valueOf(out));
      });
      
      Button subButton = new Button();
      subButton.setText("subtract");
      subButton.setOnAction(e -> {
      int value1 = Integer.parseInt(val1TextField.getText());
      int value2 = Integer.parseInt(val2TextField.getText());
      int out;
        out = value1 - value2;
        outputLabel.setText(String.valueOf(out));
      });
      
      Button multButton = new Button();
      multButton.setText("multiply");
      multButton.setOnAction(e -> {
      int value1 = Integer.parseInt(val1TextField.getText());
      int value2 = Integer.parseInt(val2TextField.getText());
      int out;
        out = value1 * value2;
        outputLabel.setText(String.valueOf(out));
      });
      
      Button divButton = new Button();
      divButton.setText("divide");
      divButton.setOnAction(e -> {
      int value1 = Integer.parseInt(val1TextField.getText());
      int value2 = Integer.parseInt(val2TextField.getText());
      int out;
        out = value1 / value2;
        outputLabel.setText(String.valueOf(out));
      });
      
      
      VBox root = new VBox();
      root.setSpacing(10);
      root.setAlignment(Pos.CENTER);
      
      root.getChildren().addAll(val1TextField, val2TextField, addButton, subButton, multButton, divButton, outputLabel);
     
      Scene scene = new Scene(root, 350, 150);
      
      stage.setScene(scene);
      stage.setTitle("GuessGameGab");
      stage.show();   
   }
   
   public void calculate(Int val 1 ){
   
   }
   
   public static void main(String [] args){
      launch(args);
   }
}