public class TesteTres {

    public static int encontrarMaiorValor(int[] numeros) {
        int maior = Integer.MIN_VALUE;
        // Faz a Verificação
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        System.out.println(encontrarMaiorValor(new int[] { 334, 568, 123, 796, 225 }));
        // Retorna o Maior Valor
    }
}