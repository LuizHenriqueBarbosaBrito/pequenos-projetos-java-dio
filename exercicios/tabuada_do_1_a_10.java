import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class tabuada_do_1_a_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número;");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);

        }
    }
}