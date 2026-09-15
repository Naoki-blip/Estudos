
import java.util.Scanner;

class SemNadaException extends Exception{
    public SemNadaException (){
        super("Erro: nada digitado.!");
    }
}
 class NomeformatException extends Exception{
        public NomeformatException (){
            super("Erro: nao pode conter numeros!!!");}
        }

public class exercicio5 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
   try{
     System.out.println("Informe o seu nome: ");
    String nome = ler.nextLine();
    System.out.println("Informe sua média de notas: ");
    String notat = ler.nextLine();
    System.out.println("Informe o percentual de faltas");
    String faltat = ler.nextLine();
    if(nome.matches(".*\\d.*")){
        throw new NomeformatException();
    }
    if(nome.isBlank() || notat.isBlank() || faltat.isBlank()){
        throw new SemNadaException();
    }
    else{
        int nota = Integer.parseInt(notat);
        int falta = Integer.parseInt(faltat);
    }
   }
    catch (SemNadaException e){
    System.out.println(e.getMessage());

   }
   catch(NumberFormatException e){
    System.out.println(e.getMessage());

   }
   
   catch(NomeformatException e){
    System.out.println(e.getMessage());

   }
    }
    
}

