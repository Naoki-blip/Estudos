

import java.util.Scanner;

class SemLetraBException extends Exception {
    public SemLetraBException() {
        super("Erro: nao contem B");
    }
}

public class exercicio3 {
    public static void main(String[] args) throws SemLetraBException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String texto = ler.nextLine();
        if (!texto.contains("B") && !texto.contains("b")) {
            throw new SemLetraBException();
        }
        System.out.println("Texto aceito: " + texto);
    }
}
