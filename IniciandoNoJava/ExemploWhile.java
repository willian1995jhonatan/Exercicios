package IniciandoNoJava;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número inicial:");
		int numeroInicial = sc.nextInt();
		System.out.println("Digite o número final:");
		int numeroFinal = sc.nextInt();
		while(numeroInicial <= numeroFinal) {
			System.out.println(numeroInicial);
			numeroInicial++;
		}
		sc.close();
	}
}
