import java.util.Scanner;

public class mediaexemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do(a) estudante.");
            String nome = entrada.nextLine();
        System.out.println("Digite a primeira nota.");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota.");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2)/2;
        if (media >= 6){
            System.out.println("Estudante: "+ nome + " aprovado(a). Parabens");
        }
        entrada.close();

    }
}