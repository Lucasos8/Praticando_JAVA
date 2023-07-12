package projectSalario;
import java.util.Scanner;
public class Funcionario {
	Scanner sc = new Scanner(System.in);
String nome;
double salario, imposto, porcentagem, salarioLiquido;

void salarioLiquido() {
	salarioLiquido = salario - (salario * 0.166667);
	System.out.println("Funcionario :" + nome + " , R$ " + salarioLiquido);
}

void aumentarSalario() {
	System.out.print("Digite a porcentagem que será adicionada ao salário ");
	porcentagem = sc.nextDouble();
	salarioLiquido = salarioLiquido + (salario * porcentagem / 100 );
	System.out.println("Atualização do salário :" + nome + ", " + " R$ " + salarioLiquido);
	
   }
}
