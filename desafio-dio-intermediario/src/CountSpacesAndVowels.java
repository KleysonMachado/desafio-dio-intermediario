/*
====================================================
Desafios Intermedi�rios - Banco PAN Java Developer
====================================================
4/5 - Conta Espa�os e Vogais
====================================================
Desafio
Jorginho � professor do prim�rio de uma determinada escola. Ele tem 100000 alunos e precisa criar um programa que verifica quantos espa�os em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avalia��o final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!
Entrada
A entrada ser� uma frase no formato de string. 
Sa�da
A sa�da dever� retornar quantos espa�os em branco e quantas vogais existem na determinada string, conforme exemplo abaixo:
----------------------------------------------------------
| Exemplo de Entrada              | Exemplo de Sa�da     |
----------------------------------------------------------
| �Amo a DIO�                     | Espacos em branco: 2 |
|                                 | Vogais: 5            |
----------------------------------------------------------
| �Esse desafio foi facil�        | Espacos em branco: 3 |
|                                 | Vogais: 10           |
----------------------------------------------------------
| �Navegar nas aguas do teu mar�  | Espacos em branco: 5 |
|                                 | Vogais: 11           |
----------------------------------------------------------
SOLU��O ABAIXO: */

import java.util.Scanner;
import java.util.regex.Pattern;

public class CountSpacesAndVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String regexVogais = "[aeiou]";
    String regexEspaco = "\\s";
     
    final Pattern patternVogais = Pattern.compile(regexVogais, Pattern.CASE_INSENSITIVE);
    final Pattern patternEspaco = Pattern.compile(regexEspaco, Pattern.CASE_INSENSITIVE);
    
    int espacosEmBranco = 0, quantVogais = 0;
    
    for (char item : str.toCharArray()) {
      if (patternVogais.matcher(String.valueOf(item)).matches()) quantVogais++;
      else if (patternEspaco.matcher(String.valueOf(item)).matches()) espacosEmBranco++;
    }
    
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    
    sc.close();
  }
}