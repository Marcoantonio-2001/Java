import java.util.*;

public class Exx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int N1 = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        int N2 = sc.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int N3 = sc.nextInt();
        if (N1 > N2 && N1 > N3) {
            System.out.println("O primeiro valor, " + N1 + ", é o maior valor.");
        }
        if (N2 > N1 && N2 > N3) {
            System.out.println("O segundo valor, " + N2 + ", é o maior valor.");
        }
        if (N3 > N1 && N3 > N2) {
            System.out.println("O terceiro valor, " + N3 + ", é o maior valor.");
        }

    }

}