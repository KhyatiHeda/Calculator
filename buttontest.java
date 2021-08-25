package application;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.TextField;  
import javafx.scene.text.Text; 
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.TextAlignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.awt.*;
import java.io.FileInputStream;

public class buttontest extends Application {
	 @Override
	 public void start(Stage primaryStage) throws Exception{
	 Button b1= new Button("*");
	 Button b2= new Button("+");
	 Button b3= new Button("/");
	 Button b4= new Button("-");
	 
     
	 TextField t1= new TextField("");
     TextField t2= new TextField("");
	 Label l1= new Label("");
	 Label l2= new Label("");
     
	b1.setMinWidth(100);
	b2.setMinWidth(100);
	b3.setMinWidth(100);
	b4.setMinWidth(100);
	l1.setMaxWidth(320);
	l2.setMaxWidth(320);
	t1.setMaxWidth(300);
	t2.setMaxWidth(300);
	
	 GridPane root= new GridPane();
	 root.add(t1, 2, 0);
	 root.add(t2, 1, 0);
	 root.add(b1, 3, 1);
	 root.add(b2, 2, 1);
	 root.add(b3, 1, 1);
	root.add(b4, 0, 1);
	 root.add(l1, 1,3);
	 root.add(l2, 2 , 3);
	 
	 b1.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle(ActionEvent actionEvent) {
		 String selected="";

		 selected+= b1.getText();
		 selected+=" ";

		 
		 l1.setText(t1.getText()+" "+selected+" "+t2.getText());
		 String num1= t1.getText();
		 String num2=t2.getText();
		 int result= Integer.parseInt(num1)*Integer.parseInt(num2);
		 
		 l2.setText(String.valueOf(result));
		 
		 }
		 });
	 
	 b2.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle(ActionEvent actionEvent) {
		 String selected="";
	 
		 selected+= b2.getText();
		 selected+=" ";

		 
		 l1.setText(t1.getText()+" "+selected+" "+t2.getText());
		 String num1= t1.getText();
		 String num2=t2.getText();
		 int result= Integer.parseInt(num1)+Integer.parseInt(num2);
		 
		 l2.setText(String.valueOf(result));
		 
		 }
		 });
	 
	 b3.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle(ActionEvent actionEvent) {
		 String selected="";

		 selected+= b3.getText();
		 selected+=" ";

		 
		 l1.setText(t1.getText()+" "+selected+" "+t2.getText());
		 String num1= t1.getText();
		 String num2=t2.getText();
		 int result= Integer.parseInt(num1)/Integer.parseInt(num2);
		 
		 l2.setText(String.valueOf(result));
		 
		 }
		 });
	 
	 b4.setOnAction(new EventHandler<ActionEvent>() {
		 @Override
		 public void handle(ActionEvent actionEvent) {
		 String selected="";

		 selected+= b4.getText();
		 selected+=" ";

		 
		 l1.setText(t1.getText()+" "+selected+" "+t2.getText());
		 String num1= t1.getText();
		 String num2=t2.getText();
		 int result= Integer.parseInt(num1)-Integer.parseInt(num2);
		 
		 l2.setText(String.valueOf(result));
		 
		 }
		 });
	 Scene sc= new Scene(root);
	 l1.setStyle("-fx-border-color:black; -fx-background-color: white; ");
	 l2.setStyle("-fx-border-color:black; -fx-background-color: white; ");
	 l1.setAlignment(Pos.CENTER_LEFT);
	 l1.setTextAlignment(TextAlignment.CENTER);
	 l2.setTextAlignment(TextAlignment.CENTER);
	 l2.setAlignment(Pos.CENTER_RIGHT);
	root.setAlignment(Pos.CENTER);
	root.setHgap(20);
	root.setVgap(20);
	 primaryStage.setTitle("Javafx UI by Khyati Heda ");
//	 primaryStage.getTitle();
	 primaryStage.setHeight(500);
	 primaryStage.setWidth(500);
	 primaryStage.setScene(sc);
	 primaryStage.show();
	 }
	 //Khyati Heda
	 public static void main(String[] args) {
	 launch(args);
	 }
	}