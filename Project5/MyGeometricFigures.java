import javafx.application.Application;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
//creating mygeometricfigures class
public class MyGeometricFigures extends Application 
{
   //creating the shapes
	public Circle c = new Circle(50);	
	public Rectangle rec = new Rectangle(); 
	public Ellipse els = new Ellipse(); 

	@Override 
   //creating the start method
	public void start(Stage primaryStage) 
   {
		c.setStroke(Color.BLACK);
		c.setFill(Color.WHITE);
		rec.setStroke(Color.BLACK);
		rec.setWidth(200);
		rec.setFill(Color.WHITE);
		rec.setHeight(125);        //declaring attributes of the shapes
		els.setFill(Color.WHITE);
		els.setStroke(Color.BLACK);
		els.setRadiusX(160);
		els.setRadiusY(40);


  		HBox shapeButtons = new HBox(5);
		shapeButtons.setAlignment(Pos.CENTER); //creating a hbox and the buttons for the shapes
		RadioButton cButton = new RadioButton("Circle"); 
		RadioButton recButton = new RadioButton("Rectangle"); 
		RadioButton elsButton = new RadioButton("Ellipse"); 

		ToggleGroup toggleShapes = new ToggleGroup();
		cButton.setToggleGroup(toggleShapes);
		recButton.setToggleGroup(toggleShapes); //creating a togglegroup for the shape buttons
		elsButton.setToggleGroup(toggleShapes);
		
		CheckBox fill = new CheckBox("Fill"); //creating the check box whether the shapes are filled or not

		shapeButtons.getChildren().addAll(cButton, 
			recButton, elsButton, fill); //add the buttons to the hbox

		StackPane shapePane = new StackPane();
		shapePane.setStyle("-fx-border-color: black");

		BorderPane bPane = new BorderPane();
		bPane.setBottom(shapeButtons); //add the stackpane and the hbox to a borderpane
		bPane.setCenter(shapePane);

		cButton.setOnAction(e -> 
      {
			if (cButton.isSelected()) //if circle is clicked clear the pane and add a circle
         {
				shapePane.getChildren().clear();
				shapePane.getChildren().add(c);
			}
		});



		recButton.setOnAction(e -> 
      {
			if (recButton.isSelected()) //if rectangle is clicked the pane is cleared and the rectangle is displayed
         {
				shapePane.getChildren().clear();
				shapePane.getChildren().add(rec);
			}
		});



		elsButton.setOnAction(e -> 
      {
			if (elsButton.isSelected()) //if ellipse is selected then the pane is cleared and the ellipse is displayed
         {
				shapePane.getChildren().clear();
				shapePane.getChildren().add(els);
			}
		});



		fill.setOnAction(e -> 
      {
			if (fill.isSelected()) 
         {
				c.setFill(Color.BLUE);
				rec.setFill(Color.RED); //if fill is checked then the shapes are filled with colors
				els.setFill(Color.PURPLE);

			} else 
         {

				c.setFill(Color.WHITE);
				rec.setFill(Color.WHITE);  //else the shapes are just white
				els.setFill(Color.WHITE);			
         }

		});

		Scene scene = new Scene(bPane, 500, 250);
		primaryStage.setTitle("Geometric Figures"); 
		primaryStage.setScene(scene); //creating the scene and creating a title
		primaryStage.show();  //showing the stage

	}
   //creating the main method
	public static void main(String[] args) 
   {
	    launch(args);
	}
}