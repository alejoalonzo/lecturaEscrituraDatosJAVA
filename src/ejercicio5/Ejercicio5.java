
package ejercicio5;

//Libreria control  de error y Scanner
import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        String fich1, fich2, fich3;
        
        //Interaccion con el cliente-------------------------------------------------
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca la ruta del fichero 1: ");
        fich1 = scn.nextLine();
        System.out.println("Introduzca la ruta del fichero 2: ");
        fich2 = scn.nextLine();
        System.out.println("Introduzca la ruta del fichero donde quiere guardar los datos de  fichero 1 y 2: ");
        fich3 = scn.nextLine();
        //----------------------------------------------------------------------------
        
        
        //Creacion del tercer fichero-------------------------------------------------------------------------------
        try{//Codigo susceptible a error
            
            //Declaro  ficheros los cuales esta dentro del proyecto
            File fichero = new File(fich1);
            File fichero2 = new File(fich2);
            File fichero3 = new File(fich3);
            
            //Abro el flujo de lectura y escritura
            BufferedReader lector = new BufferedReader ( new FileReader (fichero));
            BufferedReader lector2 = new BufferedReader ( new FileReader (fichero2));
            BufferedWriter escritor = new BufferedWriter ( new FileWriter (fichero3));
            
            String linea;
            /*Nuestro programa leera lineas hasta que no haya nada (null) primero el primer while
            para fichero1 y luego el segundo para fichero2, en cada lectura escribira en fichero3
            */
          
            while ((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }
                    
            while ((linea = lector2.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }
            
            //!importante
            lector.close();
            lector2.close();
            escritor.close();
            
        }catch (IOException e){
            System.out.println("Error en la escritura del fichero3");
        }
        //----------------------------------------------------------------------------------------------------------  
    }   
}
