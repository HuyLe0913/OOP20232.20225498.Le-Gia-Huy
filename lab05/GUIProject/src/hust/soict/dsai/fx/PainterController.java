package hust.soict.dsai.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
	String color = "#000000";
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton penButton;
    @FXML
    private RadioButton eraserButton;
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4);
    	newCircle.setFill(Paint.valueOf(color));;
    	drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();    
    }
    @FXML
    void penSelected(ActionEvent event) {
    	color = "#000000";
        eraserButton.setSelected(false);
    }
    @FXML
    void eraserSelected(ActionEvent event) {
    	color = "#FFFFFF";
        penButton.setSelected(false);
    }

    

}