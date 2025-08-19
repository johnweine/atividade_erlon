import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quando você ganha por hora: ");
        double valordaHora = leitor.nextDouble();

        System.out.println("Quantas horas você trabalha por mês: ");
        double horasTrabalhadas = leitor.nextDouble();

        double salarioBruto = valordaHora * horasTrabalhadas;
        System.out.print("Salário bruto: " + salarioBruto);

        double impostoDeRenda = salarioBruto * 0.11;
        System.out.print("Imposto de renda (11%): " + impostoDeRenda);

        double inss = salarioBruto * 0.08;
        System.out.print("INSS (8%): " + inss);

        double sindicato =  salarioBruto * 0.05;
        System.out.print("Sindicato (5%): " + sindicato);

        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
        System.out.print("Salario Liquido: " + salarioLiquido);
    }

}
