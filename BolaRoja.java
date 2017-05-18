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
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class BolaRoja extends Application
{

    static int dx = 1;
    static int dy = 1;
    
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
    Timeline tl = new Timeline();
    tl.setCycleCount(Animation.INDEFINITE);
    KeyFrame moveBall = new KeyFrame(Duration.seconds(.0200),
                new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {
                        
                        
                        bolaRoja.setTranslateX(bolaRoja.getTranslateX() + dx);
                        bolaRoja.setTranslateY(bolaRoja.getTranslateY() + dy);

                        
                            }
                });
    
    
    
    tl.getKeyFrames().add(moveBall);
    tl.play();
    
       
  		
    
    
    Scene escena = new Scene(grupo, 500, 500);
    escenario.setScene(escena);
    escenario.show();
      
  }
}