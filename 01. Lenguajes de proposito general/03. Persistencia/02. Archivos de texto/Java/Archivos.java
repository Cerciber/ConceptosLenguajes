package prueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clase {

    public static void main(String[] args) {

        // Escribir en un archivo
        try {

            // Crear objeto de escritura
            FileWriter writer = new FileWriter("archivo.extensión");
            
            // Crear objeto de escritura directa
            BufferedWriter br = new BufferedWriter(writer);
            
            // Escribir texto
            br.write("Hola mundo");
            
            // Cerrar objeto escritura
            br.close();

        } catch (IOException ex) {
        }
        
        // Añadir información en un archivo
        try {

            // Crear objeto de escritura para añadir informacion
            FileWriter writer = new FileWriter("archivo.extensión", true);
            
            // Crear objeto de escritura directa
            BufferedWriter br = new BufferedWriter(writer);
            
            // Escribir texto sin borrar el existente
            br.write("Hola mundo");
            
            // Cerrar objeto escritura
            br.close();

        } catch (IOException ex) {
        }

        // Leer información de un archivo por caracteres
        try {

            // Crear objeto de lectura
            FileReader reader = new FileReader("archivo.extensión");
            
            // Crear objeto de lectura directa
            BufferedReader br = new BufferedReader(reader);
            
            while (true) {
                
                // leer caracter
                int valor = br.read();
                
                // Verificar si se ha llegado al final del archivo
                if(valor == -1){
                    break;
                } else {
                    System.out.print((char) valor);   
                }
                
            }
            
        } catch (IOException ex) {
        }
        
        // Leer información de un archivo por lineas
        try {

            // Crear objeto de lectura
            FileReader reader = new FileReader("archivo.extensión");
            
            // Crear objeto de lectura directa
            BufferedReader br = new BufferedReader(reader);
            
            while (true) {
                
                // leer linea
                String valor = br.readLine();
                
                // Verificar si se ha llegado al final del archivo
                if(valor == null){
                    break;
                } else {
                    System.out.println(valor);   
                }
                
            }
            
        } catch (IOException ex) {
        }
       
    }

}
