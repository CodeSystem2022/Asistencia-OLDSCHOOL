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
    }
}








