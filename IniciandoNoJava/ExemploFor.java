package IniciandoNoJava;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, somaPar = 0, somaImpar = 0, valor;
		System.out.println("Entro com o valor: ");
		valor = sc.nextInt();
		sc.close();
		for(i=0; i <= valor; i++) {
			if(i % 2 == 0) {
				somaPar += i;
			} else {
				somaImpar += i;
			}
		}
		System.out.println("Soma de pares: " + somaPar);
		System.out.println("Soma de impares: " + somaImpar);
	}
}
