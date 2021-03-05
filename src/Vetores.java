import java.util.Scanner;

public class Vetores {

	public static final int TAMANHO = 10;

	public static void main(String[] args) {
		double total = 0;
		int alunos[] = new int[TAMANHO];
		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < TAMANHO; i++) {
			System.out.println("Por favor, digite o consumo do " + alunos[i] + " aluno");
			alunos[i] = leitor.nextInt();
		}

		for (int i = 0; i < TAMANHO; i++) {
			System.out.println("O aluno 1 consumiu R$" + alunos[i]);
			total = total + alunos[i];
		}

		leitor.close();

	}

}
