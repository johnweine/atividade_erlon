import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota do Primeiro bimestre");
        float nota1 = leitor.nextFloat();
        System.out.println("Informe a nota do Segundo bimestre");
        float nota2 = leitor.nextFloat();
        System.out.println("Informe a nota do Terceiro bimestre");
        float nota3 = leitor.nextFloat();
        System.out.println("Informe a nota do Quarto bimestre");
        float nota4 = leitor.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua media é " + media);
    }
}
