/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
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
        Scanner sc = new Scanner(inventario).useLocale(Locale.US);
        sc.useDelimiter(":");
        int cantidad = 0;
        int disponible = 0;
        int codigo = 0;
        double precio = 0.0;
        String nombre = null;
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                codigo = sc.nextInt();
            }
        
            if(sc.hasNextDouble()){
                precio = sc.nextDouble();
            }
            if(sc.hasNextInt()){
                cantidad = sc.nextInt();
            }
            if (sc.hasNextInt()){
                disponible = sc.nextInt();
            }
             nombre = sc.next();
            Producto p = new Producto(codigo, precio, cantidad,disponible, nombre);
            s.addProducto(p);
          sc.nextLine();
          sc.close();
        }
    }
}
