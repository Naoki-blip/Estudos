import java.util.Scanner;
public class ex4 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe um numero inteiro: ");
    int num = ler.nextInt();
    System.out.println("Informe até onde devo executar o programa ( numero inteiro maior que o anterior)");
    int delimitacao = ler.nextInt();
    System.out.println("Deseja executar qual ação?");
    System.out.println("1 = mostrar numeros entre o periodo selecionado: ");
    System.out.println("2 = mostrar somente os numeros pares entre o periodo selecionado: ");
    int resposta = ler.nextInt();
    if(delimitacao>num){
    if(resposta == 1 ){
      for( int i = num; i<=delimitacao; i++ ){
        System.out.println(i);
      }  
    }
    else if(resposta == 2){
      for(int i = num; i<=delimitacao; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
      }
    }
    else    {
        System.out.println("Informe uma opção válida!");
        }
    }
    else{
        System.out.println("A delimitação deve ser maior que o numero inicial!!!!!");
    }
    }
}
