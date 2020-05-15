package Exercicios;
/*1- Desenvolver um sistema que efetue a soma de todos os números ímpares
que são múltiplos de três e que se encontram no conjunto dos números de 1
até 500.*/

public class Ex1 {
	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 0; i < 500; i++) {
			if(i % 3 == 0 && i % 2 == 0) {
				soma += i;
			}
		}
		System.out.println("A soma dos números impares de 1 a 500 multiplos de 3 é: " + soma);
	}
}
