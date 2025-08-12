import java.util.Scanner;
public class divisao_resto_diferente_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número inicial;");
        int startingnumber = sc.nextInt();
        System.out.println("Quantos números você deseja informar?");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
          System.out.println("Digite um número:");
          int numero = sc.nextInt();

            if (numero < startingnumber) {
                continue;
            }
            if (numero % startingnumber != 0) {
                System.out.println("Resto diferente de zero. Encerrando...");
                break;
            }
            System.out.println("Número válido: " + numero);
        }
        sc.close();
    }
}
