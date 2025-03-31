import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("preço do litro da gasolina: R$ ");
        double precoPorLitro = scanner.nextDouble();
        System.out.print("Litros vendidos: ");
        double quantidadeLitros = scanner.nextDouble();
        double valorTotal = precoPorLitro * quantidadeLitros;
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}