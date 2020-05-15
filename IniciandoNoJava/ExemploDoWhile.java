package IniciandoNoJava;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		//Looping do-while
		Scanner sc = new Scanner(System.in);
		int x = 0; //Onde vamos armazenar a operação desejada
		double num1, num2, resultado = 0;
		
		do {
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			
			System.out.println("Didite o código da operação desejada:");
			x = sc.nextInt();
			
			if(x != 0) {
				System.out.println("Digite o primeiro número:");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo número:");
				num2 = sc.nextDouble();
				
				if(x == 1) {
					resultado = num1 + num2;
				} else {
					if(x == 2) {
						resultado = num1 - num2;
					} else {
						if(x == 3) {
							resultado = num1 * num2;
						} else {
							if(x == 4) {
								resultado = num1 / num2;
							}
						}
					}
					System.out.println();
					System.out.println("O resultado é: " + resultado);
					System.out.println();
				}
			
			} else {
				resultado = 0;
			}
		} while(x != 0);
		sc.close();
	}
}
