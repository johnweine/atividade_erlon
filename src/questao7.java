import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        float[] nota = new float[5];

        for (int i = 0; i < nota.length; i++){
            System.out.println("Digite suas notas ");
            Scanner leitor = new Scanner(System.in);
            nota[i] = leitor.nextInt();
        }
        float media = (nota[0] + nota[1] + nota[2] + nota[3] + nota[4]) / 5;
        System.out.println("Sua media é: " + media);
    }

}
