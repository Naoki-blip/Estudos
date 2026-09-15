package ifspex;

import java.util.Scanner;

class NaoPodeException extends Exception {
    public NaoPodeException() {
        super("ERRO!!! insira numeros validos!!");
    }
}

public class ex4 {
    public static void main(String[] args) {
        try {
            int i, quad;
            long dobro, soma = 1;
            Scanner ler = new Scanner(System.in);
            System.out.println("Informe a quantidade de quadrados presentes no tabuleiro de damas (1 <= X <= 64): ");
            quad = ler.nextInt();
            if (quad < 1 || quad > 64) {
                throw new NaoPodeException();
            }
            dobro = 2;
            for (i = 1; i < quad; i++) {
                soma = soma + dobro;
                dobro = dobro * 2;
            }
            double kg = soma / 12000.0;
            System.out.println("A quantidade de kilos de graos de trigo correspondente é: " + kg);
        } catch (NaoPodeException e) {
            System.out.println(e.getMessage());
        }
    }
}