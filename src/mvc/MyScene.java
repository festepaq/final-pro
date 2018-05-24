/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class MyScene {

    private Scene scene;
    private GridPane grid;
    private TextField txtNombre;
    private TextField txtApellido;
    private Label lMensaje;
    private Button bt ;
    public MyScene() {
        grid = new GridPane();
        Label lNombre = new Label("Codigo Barras Producto");
        txtNombre = new TextField();
        Label lApellido = new Label("Cantidad");
        txtApellido = new TextField();
        lMensaje = new Label();
        bt = new Button("OK");
        grid.add(lNombre, 0, 0);
        grid.add(txtNombre, 1, 0);
        grid.add(lApellido, 0, 1);
        grid.add(txtApellido, 1, 1);
        grid.add(bt, 1, 2);
        grid.add(lMensaje, 0, 3, 2, 3);
        this.scene = new Scene(grid, 300, 300);
    }
    
    public void show(Stage stage){
      stage.setTitle("MyScene");
      stage.setScene(this.scene);
      stage.show();
    }

    public Button getBt() {
        return bt;
    }
    
    

}
