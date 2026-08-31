package aks;
import java.util.Scanner;
import java.lang.Math;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero decimal");
        double num1 = ler.nextDouble();
        System.out.println("Informe outro numero decimal");
        double num2 = ler.nextDouble();
        double num1round = Math.round(num1 * 100.0)/ 100.0;
        double num2round = Math.round(num2 * 100.0)/ 100.0;
        double soma = num1round + num2round;
        double somaround = Math.round(soma * 100.0)/ 100.0;
         System.out.println("\n--- Resultados ---");
        System.out.println("Primeiro número arredondado: " + num1round);
        System.out.println("Segundo número arredondado: " + num2round);
        System.out.println("Soma final arredondada: " + somaround);

    }
}
