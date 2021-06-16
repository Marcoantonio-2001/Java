import java.util.*;

public class Exx3 {

    public static void main(String[] args) {
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int N1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int N2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int N3 = sc.nextInt();

        if (N1 < N2 && N1 < N3) {
            soma = N2 + N3;
            System.out.println("A soma dos dois valores, " + N2 + " e " + N3 + "");
        } else if (N2 < N1 && N2 < N3) {
            soma = N1 + N3;
            System.out.println("A soma dos dois valores, " + N1 + " e " + N3 + "");
        } else {
            soma = N1 + N2;
            System.out.println("A soma dos dois valores, " + N1 + " e " + N2 + "");
        }
    }
}