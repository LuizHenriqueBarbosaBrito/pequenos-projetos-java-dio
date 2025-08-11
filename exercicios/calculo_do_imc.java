import java.awt.*;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class calculo_do_imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe seu peso:");
        double peso = sc.nextDouble();
        System.out.println("Me informe sua altura:");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obsidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obsidade Grau II (Severa)");
        } else {
            System.out.println("Obsidade Grau III (Mórbida)");
        }
    }
}
