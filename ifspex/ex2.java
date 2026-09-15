package ifspex;
    
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
       double soma = 0;
      try{ 
       int i ;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um valor inteiro: ");
        int X = ler.nextInt();
        System.out.println("Informe um segundo valor inteiro: ");
        int Y = ler.nextInt();
        if(X>Y){
            int A = X ;
            X = Y ;
            Y = A ; 
        }
        for( i = X; i <= Y ; i++){
             if( i% 13 !=0){
                soma = soma + i;
             }
        }
    }catch(InputMismatchException e){
        System.out.println("Informe somente numeros!!!!!!");
    }
System.out.println("A soma dos numeros nao multiplos de 13 é: " + soma);
    }
}


