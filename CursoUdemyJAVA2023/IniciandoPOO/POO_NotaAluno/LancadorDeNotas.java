package Escola;
import java.util.Scanner;
public class LancadorDeNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Aluno a1 = new Aluno();
		System.out.print("Digite o nome do aluno");
		a1.nome = sc.nextLine();
		a1.notas();
		a1.aprovacao();
		
	
	}

}
