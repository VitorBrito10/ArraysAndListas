import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class VetorComClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		for (int i=0; i<vect.length; i++) {
		sc.nextLine();
		String nome = sc.nextLine();
		double preco = sc.nextDouble();
		vect[i] = new Produto(nome, preco);
		}
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
		sum += vect[i].getPreco();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();

	}

}
