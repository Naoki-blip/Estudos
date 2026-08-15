import java.util.Scanner;
public class Projetos {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o seu nome: ");
    String nome = ler.nextLine();
    System.out.println("Informe a distância em km da sua viagem: ");
    double distancia = ler.nextDouble();
    System.out.println("Informe a velocidade média em km/h do veiculo: ");
    double velocidade = ler.nextDouble();
    System.out.println("Informe o consumo médio de combustivel em km/l: ");
    double consumo = ler.nextDouble();
    System.out.println("Informe o preço do combustivel por litro: ");
    double preco = ler.nextDouble();
    double tempo =  distancia / velocidade;
    double litros = distancia / consumo;
    double custo = litros * preco;
    System.out.println(nome);
    System.out.println("O tempo estimado para completar a viagem é de: " + tempo + " horas");
    System.out.println("A quantidade de litros de combustivel gasto na viagem é de: " + litros + " litros");
    System.out.println("O custo estimado da viagem é de: R$ " + custo);
      if (custo != 0){
       if (custo < 100){
         System.out.println("A viagem é barata");
       }
       else if (custo <= 500){
         System.out.println("A viagem tem o preço comum");
       }
        else if (custo > 500 && custo <= 1000){
          System.out.println("A viagem é cara");
        }
        else{
          System.out.println("A viagem é muito cara");
        }
    }
    else{
      System.out.println("Viagem grátis");
    }
  }
}

