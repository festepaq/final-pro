/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Parra G
 */
public class Logica {
    File inventario;
    public void crearInventario() throws IOException{
    inventario = new File("inventario.txt");
        if(inventario.exists()){
        }else{
            inventario.createNewFile();
        }
    }
    public void Lectura(Supermercado s)throws FileNotFoundException, IOException{
        Scanner sc = new Scanner("inventario.txt");
        sc.useDelimiter(":");
        while(sc.hasNext()){
            int codigo = sc.nextInt();
            double precio = sc.nextDouble();
            int cantidad = sc.nextInt();
            String nombre = sc.next();
            Producto p = new Producto(codigo, precio, cantidad, nombre);
            s.addProducto(p);
            
        }
    }
}
