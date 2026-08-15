    import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome de usuario: ");
        String nome = ler.nextLine();
        System.out.println("Informe o saldo da conta bancaria: ");
        double saldo = ler.nextDouble();
        System.out.println("Informe o valor que deseja sacar: ");
        double saque = ler.nextDouble();
        if (saque > saldo){
            System.out.println("Saldo insuficiente");
        }        
        else if(saque == saldo){
            System.out.println(" Saque realizado com sucesso, seu saldo agora é de: R$ 0,00");
        }
        else if (saque <=1000){
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso, seu saldo agora é de: R$ " + saldo);
        }
        else{
            System.out.println("limite de saque excedido!!");
        }
    }   
}
