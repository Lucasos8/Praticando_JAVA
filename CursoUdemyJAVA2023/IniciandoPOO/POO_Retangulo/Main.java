package infoRetangulo;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	 Rectangle r1 = new Rectangle();
     
	 System.out.println("Digite a altura do retangulo");
	 r1.altura = sc.nextDouble();
     System.out.println("Digite a largura do retangulo");
	 r1.largura = sc.nextDouble();
     r1.area();
     r1.perimetro();
     r1.diagonal();
     r1.imprimaResultado();


    
  }
}