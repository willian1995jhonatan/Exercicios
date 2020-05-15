package Exercicios;

import java.util.Scanner;

/*8- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e
n�mero de filhos. A prefeitura deseja saber:
a) m�dia do sal�rio da
popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at�
R$100,00.*/

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario, totalSalario = 0, mediaSalario, maiorSalario = 0, mediaFilho = 0, percentual;
		int habitantes = 5, salario100 = 0, filho, totalFilho = 0;
		
		for(int i = 0; i < habitantes; i++) {
			System.out.println("Informe seu sal�rio:");
			salario = sc.nextFloat();
			System.out.println("Informe a quantidade de filhos:");
			filho = sc.nextInt();
			
			totalFilho += filho;
			totalSalario += salario;
			
			//Verificar o maior sal�rio
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			//Pessoal com sal�rio abaixo de R$100,00
			if(salario <= 100) {
				salario100 += 1;
			}
		}
		sc.close();
		
		mediaSalario = totalSalario / habitantes;
		mediaFilho = totalFilho / habitantes;
		percentual = (salario100 * 100) / habitantes;
		
		System.out.printf("A m�dia do sal�rio da popula��o �: %.2f \n", mediaSalario);
		System.out.printf("A m�dia do n�mero de filhos �: %.2f \n", mediaFilho);
		System.out.println("O maior sal�rio foi de: " + maiorSalario);
		System.out.printf("O percentual de pessoas com o s�lario abaixo de R$100,00 �: %.2f porcento", percentual);
		
	}
}
