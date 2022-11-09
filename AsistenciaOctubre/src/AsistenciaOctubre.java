
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
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un numero");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;

        }
        System.out.println("\nLa suma de todos los numeros es: " + suma);

        //EJERCICIO JULIAN ANTEQUERA   
        Scanner entrada2 = new Scanner(System.in);
        float numero1;

        System.out.println("Digite un numero");
        numero1 = entrada2.nextFloat();

        float resultado = 0;
        float acc = 0;
        float suma2 = 0;

        while (numero1 > 0) {
            ;
            suma2 = suma2 + numero1;
            acc++;
            System.out.println("Digite un numero");
            numero1 = entrada2.nextFloat();
        }
        resultado = suma2 / acc;
        System.out.println("El promedio es: " + resultado);

        //YESSICA REYNOSO
        Scanner entrada3 = new Scanner(System.in);
        int numero2, suma3 = 0;
        do {
            System.out.println("Digite un numero:");
            numero2 = Integer.parseInt(entrada3.nextLine());
            suma3 += numero2;

        } while (numero2 != 0);
        System.out.println("La suma de todos los numeros que ingreso es de:" + suma3);

        //ANDREA REYNOSO
        int numero4, conteo = 0, suma4 = 0;
        float promedio = 0;

        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero4 >= 0) {//mientras el numero no sea negativo
            suma4 += numero4;
            conteo++;
            numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));

        }
        if (conteo == 0) {
            JOptionPane.showMessageDialog(null, "Error La division entre cero no existe");

        } else {
            promedio = (float) suma4 / conteo;

            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        }

        //Ejercicio Gustavo Malaniuk
        long factorial15 = 1;
        int numero7 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for (int i = 1; i <= numero7; i++) {
            factorial15 *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial del número ingresado es: " + factorial15);

        // EJERCICIO TOMAS CA�ETE
        long res1 = 1;
        for (int a = 1; a <= 20; a += 2) {
            res1 *= a;
        }
        JOptionPane.showMessageDialog(null, "Producto de numeros impares es: ");
    }

}
