import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor para a Alemanha: R$ ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Valor para Portugal: R$ ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Valor para a Itália: R$ ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Quantidade de pessoas para Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();
        System.out.print("Quantidade de pessoas para Portugal: ");
        int pessoasPortugal = scanner.nextInt();
        System.out.print("Quantidade de pessoas para Itália: ");
        int pessoasItalia = scanner.nextInt();
        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        double valorTotal = totalAlemanha + totalPortugal + totalItalia;
        System.out.printf("O valor total da viagem é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
