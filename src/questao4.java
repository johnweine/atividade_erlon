import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++){
            System.out.println("Digite um valor. ");
            Scanner leitor = new Scanner(System.in);
            num[i] = leitor.nextInt();

        }

        int maior = 0;
        int menor = 100000000;

        for (int i = 0; i< num.length; i++){
            if (num[i] > maior){
                maior = num[i];
            }
            if (num[i] < menor){
                    menor = num[i];
            }
        }

        System.out.printf("Esse é o maior numero, %d, o menor é %d", maior, menor);
    }
}
