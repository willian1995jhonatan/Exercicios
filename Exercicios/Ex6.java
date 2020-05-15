package Exercicios;

import java.util.Scanner;

/*6- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma
região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar
um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
• o número de pessoas calmas;
• o número de mulheres nervosas;
• o número de homens agressivos;
• o número de pessoas nervosas com mais de 40 anos;
• o número de pessoas calmas com menos de 18
anos.*/

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sexo, personalidade, idade, calmas = 0, mulheresNervosas = 0, homensAgressivos = 0, nervosas40 = 0, calmas18 = 0;
		
		for(int i = 0; i < 150; i++) {
			System.out.println("Informe o seu sexo: Feminino[1] - Masculino[2]");
			sexo = sc.nextInt();
			System.out.println("Sua personalidade: Calma[1] - Nervosa[2] - Agressiva[3]");
			personalidade = sc.nextInt();
			System.out.println("Informe sua idade:");
			idade = sc.nextInt();
			
			if(personalidade == 1) calmas += 1;
			if(sexo == 1 && personalidade == 2) mulheresNervosas += 1;
			if(sexo == 2 && personalidade == 3) homensAgressivos += 1;
			if(idade > 40 && personalidade == 2) nervosas40 += 1;
			if(idade < 18 && personalidade == 1) calmas18 += 1;
		}
		sc.close();
		System.out.println("Total de pessoas calmas: " + calmas);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total de homens agressivos: " + homensAgressivos);
		System.out.println("Total de pessoas nervosas acima de 40 anos: " + nervosas40);
		System.out.println("Total de pessoas calmas com menos de 18 anos: " + calmas18);
	}
}
