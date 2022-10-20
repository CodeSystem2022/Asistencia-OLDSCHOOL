import javax.swing.*;
import java.util.Scanner;

//EJERCICIO FACTORIAL. FRANCISCO TONIDANDEL
public class AsistenciaOctubre {
    public static void main(String[] args) {
        long factorial = 1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial es " + factorial);



        //Ejercicio Yair Mathez.

        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for(int i=1; i<= 10; i++){
            System.out.println("Digite un numero");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;

        }
        System.out.println("\nLa suma de todos los numeros es: "+suma);
    
    
        //EJERCICIO JULIAN ANTEQUERA   
    
        Scanner entrada2 = new Scanner(System.in);
                float numero1;

                System.out.println("Digite un numero");
                numero1 = entrada2.nextFloat();

                float resultado = 0;
                float acc = 0;
                float suma2 = 0;

                while (numero1 > 0){;
                    suma2 = suma2 + numero1;
                    acc++;
                    System.out.println("Digite un numero");
                    numero1 = entrada2.nextFloat();
                }
                resultado = suma2 / acc;
                System.out.println("El promedio es: " + resultado)
    
            //YESSICA REYNOSO
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




}








