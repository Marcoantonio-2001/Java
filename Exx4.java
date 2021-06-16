import java.util.*;

public class Exx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calculo = 0;

        System.out.println("Informe o primeiro valor: ");
        double N1 = sc.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double N2 = sc.nextDouble();
        System.out.println("Escolha uma opção: 1) Subtração. 2) Soma. 3) Multiplicação. 4) Divisão.");
        int escolha = sc.nextInt();
        switch (escolha) {

            case 1:
                calculo = N1 - N2;
                System.out.println(N1 + " - " + N2 + " = " + calculo);
                break;

            case 2:
                calculo = N1 + N2;
                System.out.println(N1 + " + " + N2 + " = " + calculo);
                break;

            case 3:
                calculo = N1 * N2;
                System.out.println(N1 + " x " + N2 + " = " + calculo);
                break;

            case 4:
                calculo = N1 / N2;
                System.out.println(N1 + "/" + N2 + " = " + calculo);
                break;

        }
    }
}