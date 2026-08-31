package aks;
import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        double divisao = 0;
        Scanner ler = new Scanner(System.in);
       
        try{
             System.out.println("Informe um número inteiros divisiveis: ");
        int num1 = ler.nextInt();
        System.out.println("Informe o segundo número inteiro divisivel:");
        int num2 = ler.nextInt();
            divisao = (double) num1 / num2 ;
            System.out.println("O resultado da divisao é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("INFORME UM NUMERO DIFERENTE DE 0!!!!!!!!!");
         }
    }
}
