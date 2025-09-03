import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class questao2 {
    public static void main (String[] args){

        int[] numero = new int[5];
        numero[0] = 5;
        numero[1] = 15;
        numero[2] = 25;
        numero[3] = 35;
        numero[4] = 45;

        System.out.println("Digite um numero entre 1 e 5");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();


        if (num == 1){
            System.out.println("Seu numero é " + numero[0]);
        } else if (num == 2) {
            System.out.println("Seu numero é " + numero[1]);

        } else if (num == 3) {
            System.out.println("Seu numero é " + numero[2]);
        } else if (num == 4) {
            System.out.println("Seu numero é " + numero[3]);
        } else if (num == 5) {
            System.out.println("Seu numero é " + numero[4]);
        } else {
            System.out.println("Opção invalida");
        }

    }
}
