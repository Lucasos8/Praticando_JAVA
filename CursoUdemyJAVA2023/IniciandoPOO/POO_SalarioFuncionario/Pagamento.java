package projectSalario;
import java.util.Scanner;
public class Pagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		System.out.print("Digite o nome do funcionário : ");
		f1.nome = sc.nextLine();
		System.out.print("Digite o salario bruto do " + f1.nome);
		f1.salario = sc.nextDouble();
		f1.salarioLiquido();
		f1.aumentarSalario();
		
	}

}
