/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.GuI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Parra G
 */
public class Admn extends Pane {
    private Label titulo;
    public Admn(){
        
        this.setPrefSize(700, 800);
        titulo = new MyLabel("",100,50,500,100);
        titulo.setAlignment(Pos.TOP_CENTER);
        titulo.setId("Admin");
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20, 30, 40, 50));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        pane.add(new Label("Bienvenido Administrador"), 0, 5);
        
        
    }
            
    
}
