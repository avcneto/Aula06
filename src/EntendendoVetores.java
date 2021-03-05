import java.util.Scanner;

public class EntendendoVetores {
	public static final int TAMANHO = 10;

	public static void main(String[] args) {
		int vetor[] = new int[TAMANHO];

		Scanner leitor = new Scanner(System.in);

		System.out.println("O tamanho do vetor é: " + vetor.length);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digit o proximo valor: ");
			vetor[i] = leitor.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("O valor amarzenado é: " + vetor[i]);
		}

	}

}
