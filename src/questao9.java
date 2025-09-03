import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero multiplicador: ");
        int mult = input.nextInt();

        for (int i = 0; i < num.length; i++) {
            int multi = num[i] * mult;
            System.out.println(multi);
        }
    }
}
