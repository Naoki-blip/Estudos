package ifspex;


    
import java.util.Scanner;
class NaopodeException extends Exception{
    public NaopodeException(){
        super("ERRO: nao pode ser maior que 46!!!");
    }
}
public class ex3 {

public static void main(String[] args) {
  int n;
    try{ 
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe um numero MENOR que 46 pra saber sua sequencia na serie de Fibonacci: ");
     n = ler.nextInt();
    if(n > 46){
        throw new NaopodeException();
    }
    int atual =0, proximo =1;

     for(int i = 1 ; i <= n; i++){
        System.out.print(atual + " ");
        int soma = atual + proximo;
        atual = proximo ;
        proximo = soma ;
    }
  }catch(NaopodeException e){
    System.out.println(e.getMessage());
            }
        }
    }


