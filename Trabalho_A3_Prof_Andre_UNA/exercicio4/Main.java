
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int lidia, jose, lillian, bryan, oliver, nulo, n, totalVoto, maior, maior2;
        totalVoto = 0; 
        n = 0;
        lidia = 0;
        jose = 0;
        lillian = 0;
        bryan = 0;
        oliver = 0;
        nulo = 0;
        maior = 0;
        maior2 = 0;
        String candidatoVencedor  = "";
        String candidatoSegundoLugar = "";
        System.out.println("Aviso! para encerrar a votação tecle -1.");
        while (n != -1) {
            System.out.println("Bem Vindo!");
            System.out.println("Escolha seu canditado.");
            System.out.println("1-Lidia, 2-Jose, 3-Lillian, 4-Bryan, 5-Oliver ou 6-Nulo");
            n = teclado.nextInt();
            if (n == 1) {
                lidia = lidia + 1;
                System.out.println("Você votou na Lidia");
            } else if (n == 2) {
                jose = jose + 1;
                System.out.println("Você votou no Jose");
            } else if (n == 3) {
                lillian = lillian + 1;
                System.out.println("você votou na Lillian");
            } else if (n == 4) {
                bryan = bryan + 1;
                System.out.println("você votou no Bryan");
            } else if (n == 5) {
                oliver = oliver + 1;
                System.out.println("você votou na Oliver");
            }else if (n == 6) {
                nulo = nulo + 1;
                System.out.println("voce votou Nulo");
            } else {
                System.out.println("voto invalido, tente novamente \n");
             }
            }
            System.out.println("encerrada a votação \n");
            //achando o primeiro lugar.
            if (lidia > maior) {
              maior = lidia;
              candidatoVencedor = "Lidia";
            }
            if (jose > maior) {
             maior = jose;  
              candidatoVencedor = "Jose";
            }
            if (lillian > maior) {
             maior = lillian; 
              candidatoVencedor = "Lillian";
            }
            if (bryan > maior) {
            maior = bryan;  
              candidatoVencedor = "Bryan";
            }
            if (oliver > maior) {
            maior = oliver;
              candidatoVencedor = "Oliver";
            }
            //achando o segundo lugar. 
            if (lidia > maior2 & lidia < maior) {
              maior2 = lidia;
              candidatoSegundoLugar = "Lidia";
            }
            if (jose > maior2 & jose < maior) {
             maior2 = jose;  
              candidatoSegundoLugar = "Jose";
            }
            if (lillian > maior2 & lillian < maior) {
             maior2 = lillian; 
              candidatoSegundoLugar = "Lillian";
            }
            if (bryan > maior2 & bryan < maior) {
            maior2 = bryan;  
              candidatoSegundoLugar = "Bryan";
            }
            if (oliver > maior2 & oliver < maior) {
            maior2 = oliver;
              candidatoSegundoLugar = "Oliver";
            }
           
            totalVoto = lidia + jose + lillian + bryan + oliver;
            int metadeVoto = totalVoto / 2;
            if(maior > metadeVoto){
            System.out.println("O ganhador foi " + candidatoVencedor + " com mais de 50% dos votos, assim não precisando de um segundo turno.");
            System.out.println("Segue agora os dados da votação \n");
            System.out.println("Canditado Lidia =" + lidia);
            System.out.println("Canditado Jose =" + jose);
            System.out.println("Canditado Lillian  =" + lillian );
            System.out.println("Canditado Bryan =" + bryan);
            System.out.println("Canditado Oliver =" + oliver);
            System.out.println("Canditado Nulo =" + nulo);
            System.out.println("Totais de votos feitos = " + totalVoto + "\n");  
            }else {           
            System.out.println("o candidato mais votado foi " + candidatoVencedor + " mas devido ser abaixo de 50% averá um segundo turno com o candidato " + candidatoSegundoLugar);
          
          
            //entrada do segundo turno
            maior = 0;
            maior2 = 0;  
            nulo = 0;
            System.out.println("Segundo turno");
            System.out.println("Aviso! para encerrar a votação tecle -2.");
            while (n != -2) {
            System.out.println("Bem Vindo!");
            System.out.println("Escolha seu canditado.");
            System.out.println("1-" + candidatoVencedor + " 2-" + candidatoSegundoLugar );
            n = teclado.nextInt();
            if (n == 1) {
                maior = maior + 1;
                System.out.println("Você votou em " + candidatoVencedor);
            } else if (n == 2) {
                maior2 = maior2 + 1;
                System.out.println("Você votou em " + candidatoSegundoLugar);
            }else if (n == 3) {
                nulo = nulo + 1;
                System.out.println("voce votou Nulo");
            } else {
                System.out.println("voto invalido, tente novamente \n");
            }
            }
            //descobrindo o vencedor.
            if (maior > maior2) {
              System.out.println("O vencedor é " + candidatoVencedor + " com " + maior + " votos");
            }else{
              System.out.println("O vencedor é " + candidatoSegundoLugar + " com " + maior2 + " votos");
            }
          } 
        }
      }
