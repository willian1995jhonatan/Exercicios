package Exercicios;

import java.util.Scanner;

/*7- Escrever um sistema que lê um valor N inteiro e positivo e que calcula e
escreve o valor de E. E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!*/

public class Ex7 {
	//Método para calcular o fatorial
	private static int fatorial(int numero) {
		if(numero <= 1) {
			return 1;
		} else {
			return numero * fatorial(numero - 1);
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		float num, acumula = 0, aux = 0;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		sc.close();
		
		
		for(int i = 1; i <= num; i++) {
			aux = fatorial(i);
			acumula += 1 / aux;
			aux = 0;
		}
		System.out.printf("E = %.2f", (acumula + 1));
	}
}
