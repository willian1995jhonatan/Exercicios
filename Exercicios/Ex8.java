package Exercicios;

import java.util.Scanner;

/*8- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e
número de filhos. A prefeitura deseja saber:
a) média do salário da
população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até
R$100,00.*/

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario, totalSalario = 0, mediaSalario, maiorSalario = 0, mediaFilho = 0, percentual;
		int habitantes = 5, salario100 = 0, filho, totalFilho = 0;
		
		for(int i = 0; i < habitantes; i++) {
			System.out.println("Informe seu salário:");
			salario = sc.nextFloat();
			System.out.println("Informe a quantidade de filhos:");
			filho = sc.nextInt();
			
			totalFilho += filho;
			totalSalario += salario;
			
			//Verificar o maior salário
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			//Pessoal com salário abaixo de R$100,00
			if(salario <= 100) {
				salario100 += 1;
			}
		}
		sc.close();
		
		mediaSalario = totalSalario / habitantes;
		mediaFilho = totalFilho / habitantes;
		percentual = (salario100 * 100) / habitantes;
		
		System.out.printf("A média do salário da população é: %.2f \n", mediaSalario);
		System.out.printf("A média do número de filhos é: %.2f \n", mediaFilho);
		System.out.println("O maior salário foi de: " + maiorSalario);
		System.out.printf("O percentual de pessoas com o sálario abaixo de R$100,00 é: %.2f porcento", percentual);
		
	}
}
