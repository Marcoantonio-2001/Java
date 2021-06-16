import java.util.*;

public class Exx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double N1 = sc.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double N2 = sc.nextDouble();

        if (N1 >= 0 && N2 >= 0) {
            System.out.println("Verdadeiro.");
        }

        else if (N1 < 0 && N2 < 0) {
            System.out.println("Falso.");
        }
    }
}