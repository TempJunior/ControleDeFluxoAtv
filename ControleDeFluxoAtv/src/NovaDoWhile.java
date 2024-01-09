import java.util.Scanner;

public class NovaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite a nota " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
            contador++;
        } while (contador < 4);

        double media = soma / 4;
        System.out.println("A média das notas é: " + media);

        if (soma >= 7) {
            System.out.println("Voce esta aprovado!");
        } else if (soma >= 5 && soma <= 7) {
            System.out.println("Voce esta de recuperação!");
        } else {
            System.out.println("Voce esta reprovado!");
        }
    }
}





