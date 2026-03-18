import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o período (M/V/N): ");
        char periodo = sc.next().toUpperCase().charAt(0);

        switch (periodo) {
            case 'M':
                System.out.println("Bom dia");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Valor inválido!");
        }

        sc.close();
    }
}