package Escola;
import java.util.Scanner;
public class Aluno {
Scanner sc = new Scanner(System.in);
	String nome;
    double nota1, nota2, nota3, notaTotal; 	
	
	void notas() {
		System.out.println("Digite primeira nota do aluno " + nome);
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno " + nome);
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno " + nome);
		nota3 = sc.nextDouble();
		notaTotal = nota1 + nota2 + nota3;
	
	}
	void aprovacao() {
		if (notaTotal >= 60) {
			System.out.println("Nota final = " + notaTotal);
			System.out.println(nome + " aprovado !");
		}else {
			System.out.println("Nota final = " + notaTotal);
			System.out.println(nome + "reprovado");
			System.out.println("faltou para ser aprovado " + ((notaTotal - 60)* -1 ) + " Pontos");
		}
		
		
		
	}
	
	
	
}
