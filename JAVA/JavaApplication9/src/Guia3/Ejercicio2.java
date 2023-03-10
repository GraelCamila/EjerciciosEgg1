
package Guia3;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Intente descubrir la palabra secreta");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    }
}
