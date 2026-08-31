package Nova pasta;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    try{
        System.out.println("Informe um numero inteiro. ");
    int num1 = ler.nextInt();
    System.out.println("Seu numero é " + num1);
    } catch(InputMismatchException e){
        System.out.println("Formato inválido!! ");
    }
}    
}
