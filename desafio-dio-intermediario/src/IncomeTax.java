/* 
====================================================
Acelera��o Global Dev #19 - GFT
====================================================
1/3 - Taxa de Imposto de Renda
====================================================
Desafio
H� um pa�s denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Loli, cujo s�mbolo � o R$.
Voc� ter� o desafio de ler um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
-----------------------------------------------------
| Renda                          | Imposto de Renda |
-----------------------------------------------------
| de 0.00 a R$ 2000.00           | Isento           |
-----------------------------------------------------
| de R$ 2000.01 at� R$ 3000.00   | 8 %              |
-----------------------------------------------------
| de R$ 3000.01 at� R$ 4500.00   | 18 %             |
-----------------------------------------------------
| acima de R$ 4500.00            | 28 %             |
-----------------------------------------------------
Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
Entrada
A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.
Sa�da
Imprima o texto "R$" seguido de um espa�o e do valor total devido de Imposto de Renda, com duas casas ap�s o ponto. Se o valor de entrada for menor ou igual a 2000, dever� ser impressa a mensagem "Isento".
-----------------------------------------
| Exemplo de Entrada | Exemplo de Sa�da |
-----------------------------------------
| 3002.00            | R$ 80.36         |
-----------------------------------------
| 1701.12            | Isento           |
-----------------------------------------
| 4520.00            | R$ 355.60        |
-----------------------------------------
SOLU��O ABAIXO: */

import java.io.IOException;
import java.util.Scanner;

public class IncomeTax {
	
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    double salary = sc.nextDouble();
    double amount = 0d;
    double tax = 0d;
    String text = "";
    
    if (salary > 4500.00) {
      amount = salary - 4500.00;
      tax += (amount * 0.28) + 350;
    } else if (salary > 3000.00) {
      amount = salary - 3000.00;
      tax += (amount * 0.18) + 80;
    } else if (salary > 2000.00) {
      amount = salary - 2000.00;
      tax += (amount * 0.08);
    }

    text = (tax == 0)? "Isento" : String.format("R$ %.2f", tax);
    
    System.out.printf(text);
  
    sc.close();
  }
}
