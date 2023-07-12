package infoRetangulo;
public class Rectangle {

double largura, altura, diagonal, perimetro, area;
   
  void area() {
   area = largura * altura;  
 
  }
  void perimetro() {
   perimetro = 2 * (largura + altura); 
 
  }
  void diagonal() {
   diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2)); 
 
  }
  void imprimaResultado(){
   System.out.println("A area é " + area);
   System.out.println("O perimetro é " + perimetro);
   System.out.println("A diagonal é " + diagonal); 
  
  }  
}