import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu plano (A/B/C): ");
        char plano = sc.next().charAt(0);

        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();

        double novosalaroio;

        switch (plano) {
            case 'A':
                novosalaroio = salario * 1.10;
                break;
            case 'B':
                novosalaroio = salario * 1.15;
                break;
            case 'C':
                novosalaroio = salario * 1.20;
                break;
            default:
                System.out.println("Plano invalido");
                sc.close();
            return;    
        }
        System.out.println("Novo Salario : R$ " + novosalaroio);
        sc.close();
    }
}
