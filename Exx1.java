import java.util.*;

public class Exx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor");
        int n1 = sc.nextInt();

        if (n1 >= 0) {
            System.out.println("O número informado é positivo.");
        } else {
            System.out.println("O número informado é negativo.");
        }
    }
}