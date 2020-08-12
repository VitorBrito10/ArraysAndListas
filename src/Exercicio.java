import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		System.out.println("Olá!");
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a quantidade de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.println("digite a quantidade de colunas da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.printf("digite o número para encontrar elementos próximos a ele na matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("==========================");
					System.out.println(" Posição: " + i + " , " + j );
					if (j > 0) {
						System.out.println(" Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println(" Cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println(" Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println(" Baixo: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
