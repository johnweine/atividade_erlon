import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        int[] num = new int[6];
        num[0] = 4;
        num[1] = 8;
        num[2] = 15;
        num[3] = 16;
        num[4] = 23;
        num[5] = 42;

        System.out.println("Digite um valor: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        boolean tem = false;

        for (int i =0; i < num.length; i++){
            if (numero == num[i]) {
                tem = true;
                break;
            }

        }
        if (tem){
            System.out.println("Está dentro da lista");
        } else {
            System.out.println("Não está dentro da lista");
        }
    }
}
