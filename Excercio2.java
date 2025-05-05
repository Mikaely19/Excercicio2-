public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        // Preenchendo o vetor com números fornecidos pelo usuário
        System.out.println("Por favor, insira 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior valor e sua posição
        int maiorValor = vetor[0];
        int posicao = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicao = i;
            }
        }

        // Exibindo o resultado
        System.out.println("O maior valor é " + maiorValor + " e está na posição " + posicao + " (índice 0-based).");
        scanner.close();
    }
}
