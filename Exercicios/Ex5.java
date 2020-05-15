package Exercicios;

import java.util.Scanner;

/*5- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O
programa deve fazer as leituras dos valores enquanto o usu�rio estiver
fornecendo valores positivos. Ou seja, o programa deve parar quando o
usu�rio fornecer um valor negativo.*/

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, contador = 0 ;
		float media = 0, soma = 0;
		boolean continua = true;
	
		while(continua) {
			System.out.println("Digite um n�mero: ");
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
		
		System.out.println("O total somat�rio foi: " + soma);
		System.out.println("A m�dia dos n�meros digitados foi: " + media);
		System.out.println("O total de n�meros digitados foi: " + contador);
	}
}
