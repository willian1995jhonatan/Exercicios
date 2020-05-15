package Exercicios;

import java.util.Scanner;

/*5- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O
programa deve fazer as leituras dos valores enquanto o usuário estiver
fornecendo valores positivos. Ou seja, o programa deve parar quando o
usuário fornecer um valor negativo.*/

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, contador = 0 ;
		float media = 0, soma = 0;
		boolean continua = true;
	
		while(continua) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			if(num > 0) {
				soma += num;
				contador += 1;
			} else {
				continua = false;
			}
		}
		sc.close();
		media = soma / contador;
		
		System.out.println("O total somatório foi: " + soma);
		System.out.println("A média dos números digitados foi: " + media);
		System.out.println("O total de números digitados foi: " + contador);
	}
}
