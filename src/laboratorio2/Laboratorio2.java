/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.io.IOException;
import laboratorio2.logica.Logica;
import laboratorio2.logica.Supermercado;

/**
 *
 * @author Parra G
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Supermercado s = new Supermercado("super", "asdas");
        Logica l =new Logica();
        l.Lectura(s);
        s.listarProductos();
        
    }
    
}
