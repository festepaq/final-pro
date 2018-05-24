/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.GuI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Parra G
 */
public class Main extends Application {
        public static void main(String[] args) {
	           System.out.println("sad");	
            launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
            
		primaryStage.setScene(new Scene(new Admn()));
             primaryStage.setTitle("Ajedrez");
		
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
}
