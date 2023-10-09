/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacionarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author trini
 */
public class ManipulacionArchivos {
    
    
    
    
    
    public static void leerArchivos(String name) throws FileNotFoundException, IOException{
        File archivo; // Apunta a un archivo fisico del dd
        FileReader reader; // LLave con permiso de solo lectura 
        BufferedReader bufer; // Recuperar info. del archivo
        String linea;
        
        try{
            // Crear un apuntador al archivo fisico
            archivo = new File("C:\\prueba\\" + name+".txt");
            // Abrir el archivo para lectura 
            reader= new FileReader(archivo);
            // Configurar el bufer para leer datos del archivo
            bufer=new BufferedReader(reader);
            // Lectura del contenido del archivo
            while((linea= bufer.readLine())!= null){
                System.out.println("Linea leida: "+linea);
            }
            reader.close();
        } catch( Exception e){
            System.out.println("Errro al leer el archivo: "+ e.toString());
        }
        
    } 

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader bufer= new BufferedReader(
                new InputStreamReader(System.in));
        String fileName;
        
        System.out.println("Lectura de un archivo de texto");
        System.out.println("Escribe el nombre del archivo");
        fileName = bufer.readLine();
        leerArchivos(fileName);
        
    }
    
}
