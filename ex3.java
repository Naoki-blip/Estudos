    import java.util.Scanner;
public class ex3 {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do aluno para calcular sua média: ");
        String nome = ler.nextLine();
        System.out.println(" Insira a primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.println(" Insira a segunda nota: ");
        double nota2 = ler.nextDouble();
        System.out.println(" Insira a terceira nota: ");
        double nota3 = ler.nextDouble();
        if((nota1 >=0 && nota1 <=10)&&(nota2>=0 && nota2 <=10)&&(nota3>=0 && nota3<=10)){
                    double media = ( nota1+nota2+nota3) / 3;
            if (media < 5){
            System.out.println("reprovado");
            }
            else if(media < 7){
            System.out.println("Recuperação");
            }
            else{
                System.out.println("Aprovado");
            }
        System.out.println("a média das notas é: " + media);
                }
                else{
                    System.out.println("Notas invalida");
          }
     }
 }

