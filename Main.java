import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = sc.nextLine();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        if (sexo.equals("M") || sexo.equals("m")){
            double pesoIdealm = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg", pesoIdealm);
        } else if (sexo.equals("F") || sexo.equals("f")) {
            double pesoIdealf = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg", pesoIdealf);
        }

    }
}