
package Ciclos06;

//Ejercicio 6: Perdir numeros hasta que se tecleo 0 mostrar la suma de todos los numeros introducidos. 

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in); 
        int numero,suma =0;
        do{
            System.out.println("Digite un numero:");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
            
        }while(numero !=0);
        System.out.println("La suma de todos los numeros que ingreso es de:"+suma);
    }
    
    
}
