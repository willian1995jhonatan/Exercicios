package Exercicios;

/*2- Escreva um sistema estruturado que gere os n�meros de 1000 a
1999 e escreva somente os n�meros que s�o divis�veis por 11 ou cujo resto � 5.*/

public class Ex2 {
	public static void main(String[] args) {
		for(int i = 1000; i < 2000; i++) {
			if(i % 11 == 0 || i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
