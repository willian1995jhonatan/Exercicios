package Exercicios;
 
/*3- Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de
3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/

public class Ex3 {
	public static void main (String[] args) {
		int i;
		for (i=229;i<=454;i++) {
			if(i>298 && i<=398) {
				i=i+2;
				System.out.println("De 3 em 3: " + i);
			}
			else {
				i=i+4;
				System.out.println("De 5 em 5: " + i);		
			}
		}
	}
}