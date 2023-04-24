import java.io.IOException;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String[] tipo = new String[3];
		
		String resultado = "";
		
		for (int i = 0; i < 3; i++) tipo[i] = sc.next();
		
		resultado = (tipo[0].equals("vertebrado"))
		            ? (tipo[1].equals("ave"))
		              ? (tipo[2].equals("carnivoro"))
		                ? "aguia"
		                : "pomba"
		              : (tipo[2].equals("onivoro"))
		                ? "homem"
		                : "vaca"
		            : (tipo[1].equals("inseto"))
		              ? (tipo[2].equals("hematofago"))
		                ? "pulga"
		                : "lagarta"
		              : (tipo[2].equals("hematofago"))
		                ? "sanguessuga"
		                : "minhoca";
		
		System.out.println(resultado);
		
		sc.close();
	}
}