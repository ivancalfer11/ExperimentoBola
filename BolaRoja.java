import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.shape.Circle;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.Group;
public class BolaRoja extends Application
{
  public static void main(String[] args){
    launch(args);
  }
  
  @Override
  public void start(Stage escenario)
  {
    Group grupo = new Group();
    
    Circle bolaRoja = new Circle();
    bolaRoja.setCenterX(250);
    bolaRoja.setCenterY(250);
    bolaRoja.setRadius(20);
    Color c = Color.RED;
    bolaRoja.setFill(c);
    
    
    grupo.getChildren().add(bolaRoja);
       
  		
    
    
    Scene escena = new Scene(grupo, 500, 500);
    escenario.setScene(escena);
    escenario.show();
      
  }
}