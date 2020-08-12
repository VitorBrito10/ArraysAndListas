import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Empregado;

public class MainEmpregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.printf("Quantos empregados vão ser cadastrados? ");
		int qtd = scan.nextInt();

		List<Empregado> list = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {
			System.out.printf("digite o id do empregado: ");
			int id = scan.nextInt();

			/*
			 * while (hasId(list, id)) {
			 * System.out.println(" Id já obtido. Tente novamente: "); id = scan.nextInt();
			 * }
			 */

			System.out.printf("digite o nome do empregado: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.printf("digite o salário do empregado: ");
			double salario = scan.nextDouble();
			list.add(new Empregado(id, nome, salario));
		}

		System.out.println("--------------------------------------");

		System.out.printf("digite o id do empregado que deseja aumentar o salário: ");
		int id = scan.nextInt();

		/*
		 * Tópicos avançados Empregado emp = list.stream().filter(x -> x.getId() ==
		 * id).findFirst().orElse(null);
		 */

		Integer pos = position(list, id);

		if (pos == null) {
			System.out.println("esse id não existe!");
		} else {
			System.out.println(" Digite a porcentagem: ");
			double porcentagem = scan.nextDouble();
			list.get(pos).aumentoSalario(porcentagem);

		}
		/*
		 * Tópicos avançados if (emp == null ) { System.out.println(
		 * " Este id não existe! " ); } else { System.out.println (
		 * " Digite a porcentagem: " ); double porcentagem = scan.nextDouble ();
		 * emp.aumentoSalario (porcentagem); }
		 */
		System.out.println();
		System.out.println("Lista de funcionários: ");

		for (Empregado x : list) {
			System.out.println(x);
		}

		scan.close();
	}

	/*
	 * Tópicos avançados public static boolean hasId (List <Empregado> list , int id
	 * ) { Empregado emp = list.stream().filter(x -> x.getId() ==
	 * id).findFirst().orElse(null); return emp != null ;
	 * 
	 * 
	 * }
	 */

	public static Integer position(List<Empregado> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}
}
