public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        
        System.out.println("Insira 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
        }
        int maiorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i]
            }
        }
        System.out.println("O maior valor é " + maiorValor + " e está na posição " + posicao + " (índice).");
        scanner.close();
    }
}
