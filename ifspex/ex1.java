package ifspex;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        int num,soma = 0,valP = 0, valM = 0;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
          try{ 
             System.out.println("Informe um valor inteiro: ");
             num = ler.nextInt();
              
            if(num>0){
                valP++;
                 soma = soma+num;
            }
            else{
                valM--;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Informe um numero!! nao outra coisa!!!");
        } 
        }
        double media = (double)soma / 6 ;
        
        System.out.println("A quantidade de numeros positivos digitados é: " + valP);
        System.out.println("A média geral dos numeros digitados é: " + media);
    }
}
