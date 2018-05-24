/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Estudiante
 */
public class ControladorMyScene {
    private DataBean modelo;
    private MyScene scene;

    public ControladorMyScene(DataBean modelo) {
      this.modelo = modelo;
      this.scene = new MyScene();
      this.scene.getBt().setOnAction(new BtEvent());
    }
    
    public void show (){
      this.scene.show(modelo.getPrimaryStage());
    }
   
    private class BtEvent implements EventHandler<ActionEvent>{

       @Override
       public void handle(ActionEvent t) {
            EntradaVC entrada = new EntradaVC(modelo);
            entrada.show();
       }
    }
}
