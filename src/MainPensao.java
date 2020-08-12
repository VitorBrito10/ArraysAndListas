import java.util.Locale;
import java.util.Scanner;
import entidades.Pensao;

public class MainPensao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos quartos vão ser alugados? ");
		int qtd = scan.nextInt();
		Pensao[] vect = new Pensao[10];

		for (int i = 0; i < qtd; i++) {
			System.out.printf("Qual o número do quarto? ");
			int numQuarto = scan.nextInt();
			scan.nextLine();
			System.out.printf("Nome do responsável: ");
			String nome = scan.nextLine();
			System.out.printf("E-mail:");
			String email = scan.nextLine();
			vect[numQuarto] = new Pensao(nome, email);

		}

		System.out.println("Quartos alugados: ");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {
				System.out.printf("Quarto: " + i);
				System.out.println(vect[i]);
			}
		}
		scan.close();

	}

}
