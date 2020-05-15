package Exercicios;

import java.util.Scanner;

/*4- Ler o nome de um aluno e as suas duas notas A e B, e após calcular a média
ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
procedimento para uma turma composta por cinco alunos, usando o comando
While.

Exemplo de tela de saída: Entre com o
nome do aluno: Fulano da Silva Entre com
o grau A: 5.0 Entre com o grau B: 6.0 O
aluno Fulano da Silva tem uma media: 5.66
Entre com o nome do aluno: Ciclano da
Silva Entre com o grau A: 12.5 Nota
invalida! Entre com o grau A: 2.5 ...*/

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, media;
		int i = 0;
		String nome;
		while(i < 5) {
			System.out.println("Digite o seu nome:");
			nome = sc.next();
			
			System.out.println("Digite a primeira nota:");
			n1 = sc.nextFloat();
			if(n1 > 10) { 
				System.out.println("Nota Invalida"); 
				do {
					System.out.println("Digite a primeira nota");
					n1 = sc.nextFloat();
				}
				while(n1 > 10);
			}
			
			System.out.println("Digite a segunda nota:");
			n2 = sc.nextFloat();
			if(n2 > 10) { 
				System.out.println("Nota Invalida"); 
				do {
					System.out.println("Digite a segunda nota");
					n2 = sc.nextFloat();
				}
				while(n2 > 10);
			}
			
			media = (n1 + n2) / 2;
			System.out.println(nome + " sua média ficou: " + media + "\n");
			i++;
		}
		sc.close();
	}
}

