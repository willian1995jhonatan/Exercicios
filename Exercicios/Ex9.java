package Exercicios;

import java.util.Scanner;

/*9- Um Departamento deseja saber quais alunos estariam cursando duas
disciplinas - X e Y. Fazer um programa que leia os n�meros de matr�cula (valor
entre 0 e 999) dos alunos que cursam cada uma das disciplinas (os n�meros
ser�o fornecidos desordenados) e emita um relat�rio com os n�meros de
matr�cula dos alunos que cursam as duas disciplinas simultaneamente ou, se tal
n�o ocorrer, a mensagem: Nenhum aluno cursa simultaneamente as disciplinas X
e Y. O n�mero de alunos por turma, tanto na turma X quanto na turma Y, � 60.*/

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matricula[] = new int[60], listaMatricula[] = new int [60];
		int i = 0, contador = 0, estaCursando;
		boolean sim = true, nao = false, disciplinaX[] = new boolean [60], disciplinaY[] = new boolean [60];
		
		for(i= 0; i < matricula.length; i++) {
			System.out.printf("Informe o n�mero da sua matr�cula: ");
			matricula[i] = sc.nextInt();
			while(matricula[i] > 999) {
				System.out.println("Matr�cula inval�da, d�gite novamente.");
				System.out.printf("Informe o n�mero da sua matr�cula: ");
				matricula[i] = sc.nextInt();
			}
			System.out.println("Voc� cursa a disciplina X ? SIM[1] NAO[2]");
			estaCursando = sc.nextInt();
			if(estaCursando == 1) {
				disciplinaX[i] = sim;
			} else {
				disciplinaX[i] = nao;
			}
			System.out.println("Voc� cursa a disciplina Y ? SIM[1] NAO[2]");
			estaCursando = sc.nextInt();
			
			if(estaCursando == 1) {
				disciplinaY[i] = sim;
			} else {
				disciplinaY[i] = nao;
			}
		}

		//Verificando os alunos que cursam a mesma disciplina
		for(i = 0; i < matricula.length; i++) {
			if(disciplinaX[i] == disciplinaY[i] && disciplinaX[i] != false && disciplinaY[i] != false) {
				contador += 1;
				listaMatricula[i] = matricula[i];
			}
		}
		
		//Mostrando quantos alunos que cursam a mesma disciplina
		if(contador > 0) {
			System.out.println(contador + " alunos est�o cursando as disciplinas X e Y simultaneamente");
			System.out.println("S�o eles:");
			
			//Mostrando o n�mero da matricula dos alunos que cursam a mesma disciplina
			for(i = 0; i < matricula.length; i++) {
				if(listaMatricula[i] > 0) {
					System.out.println("Matricula: " + listaMatricula[i]);
				}	
			}
			
		} else {
			System.out.println("Nenhum aluno cursa simultaneamente as disciplinas X e Y");
		}
		
	}
}
