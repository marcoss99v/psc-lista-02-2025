import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        String numero = scanner.nextLine();
        System.out.println("O número informado foi " + numero);
        
        scanner.close();
    }
}