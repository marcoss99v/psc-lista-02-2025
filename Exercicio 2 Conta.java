import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Segundo número: ");
        double numero2 = scanner.nextDouble();
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração do primeiro pelo segundo é: " + subtracao);
        System.out.println("A multiplicação do primeiro pelo segundo é: " + multiplicacao);

        scanner.close();
    }
}