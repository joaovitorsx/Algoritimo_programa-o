import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a opção (M/S/P/D): ");
        char op = sc.next().toUpperCase().charAt(0);

        switch (op) {
            case 'M':
                double media = (n1 + n2) / 2;
                System.out.println("Média: " + media);
                break;

            case 'S':
                double diferenca = Math.abs(n1 - n2);
                System.out.println("Diferença: " + diferenca);
                break;

            case 'P':
                double produto = n1 * n2;
                System.out.println("Produto: " + produto);
                break;

            case 'D':
                if (n2 != 0) {
                    double divisao = n1 / n2;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
