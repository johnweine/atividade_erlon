public class questao5 {
    public static void main(String[] args) {
        int[] num = new int[6];
        num[0] = 2;
        num[1] = 5;
        num[2] = 8;
        num[3] = 10;
        num[4] = 15;
        num[5] = 18;

        int qtd = 0;

        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0 ){
                qtd += 1;
            }
        }
            System.out.println("A quantidade de numero pares é " + qtd);
    }
}
