package Exercicios;

import java.util.Scanner;

/*10- Escreve um sistema que lê duas matrizes N1 (4,6) e N2(4,6) e
cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma
posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de
mesma posição das matrizes N1 e N2.*/

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] N1 = new int[4][6];
		int [][] N2 = new int[4][6]; 
		
		int [][] M1 = new int[4][6];
		int [][] M2 = new int[4][6];
		
		//Inserindo valores na matriz N1
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("Insira o elemento N1[%d][%d]: ",i+1, j+1);
				N1[i][j] = sc.nextInt();
			}
		}
		//Inserindo valores na matriz N2
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("Insira o elemento N2[%d][%d]: ",i+1, j+1);
				N2[i][j] = sc.nextInt();
			}
		}
		sc.close();
		//Atribuindo valores na matriz M1
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
			}
		}
		
		//Atribuindo valores na matriz M2
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		
		System.out.println("\n---Matriz M1---");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("\t %d \t", M1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n---Matriz M2---");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("\t %d \t", M2[i][j]);
			}
			System.out.println();
		}
		
	}
}
