import java.util.Scanner;
public class intervalo_par_ou_impar_decrescente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int number1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int number2 = sc.nextInt();
        while (number2 <= number1) {
            System.out.println("O segundo número deve ser maior que o primeiro número! ");
         number2 = sc.nextInt();
        }
        System.out.println("Você quer ver apenas números 'par' ou 'impar' ?");
        String choice = sc.next();

        for (int i = number2; i >= number1; i--) {
            if (choice.equalsIgnoreCase("par") && i % 2 == 0) {
            System.out.println(i);
            } else if (choice.equalsIgnoreCase("impar") && i % 2 != 0) {
              System.out.println(i);
            }
        }
    }
}
