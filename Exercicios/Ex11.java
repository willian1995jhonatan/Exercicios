package Exercicios;

import java.util.Scanner;

/*11- Escrever um sistema que lê uma matriz M(5,5) e cria 2 vetores SL(5) e SC(5)
que contenham, respectivamente, as somas das linhas e das colunas de M.
Escrever a matriz e os vetores criados.*/

public class Ex11 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int [][] M = new int[5][5];
		int [] SL = new int[5];
		int [] SC = new int[5];
		
		//Inserindo valores na matriz M
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("Insira o elemento M[%d][%d]: ",i+1, j+1);
				M[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println("\n---Matriz M---");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("\t%d\t", M[i][j]);
			}
			System.out.println();
		}
		
		//Somando as linhas
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				SL[i] += M[i][j];
			}	
		}
		//Somando as colunas
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				
				SC[j] += M[i][j];
			}	
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("A Soma da coluna " + (i+1) + " = " + SC[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("A Soma da linha " + (i+1) + " = " + SL[i]);
		}
	
	}
}
