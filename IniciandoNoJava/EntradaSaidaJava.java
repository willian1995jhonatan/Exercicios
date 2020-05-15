package IniciandoNoJava;

import java.util.Scanner;

public class EntradaSaidaJava {
	public static void main (String args[]) {
		System.out.println("Entre com a idade do seu cachorro: ");
		try (Scanner in = new Scanner(System.in)) {
			int idadeCachorro = in.nextInt();
			idadeCachorro = idadeCachorro * 7;
			System.out.println("A idade do cachorro vezes 7 é: " + idadeCachorro + " anos");
		}
	}
}
