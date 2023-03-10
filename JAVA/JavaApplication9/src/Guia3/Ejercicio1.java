
package Guia3;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        int result = num%2;
        
        if (result == 0){
            System.out.println("El numero es par");
        } else{
            System.out.println("El numero es impar");
        }
    }
}
