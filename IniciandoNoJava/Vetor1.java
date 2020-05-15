package IniciandoNoJava;

import java.util.Scanner;

public class Vetor1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 9, 3, 78, 21, 30, 87, 60, 71};
		int[] arrayDois = {32, 54, 87, 63, 10, 3, 54, 52};
		
		float[] nota = new float[5];
		
		//Tamannho do Array
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do arrayDois - Maior que 8");
		} else {
			System.out.println("Tamanho do arrayDois - Menor que 8");
		}
		System.out.println("\nTamanho do arrayUm = " + arrayUm.length);
		
		//Utilizando o ForEach
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		//Populando um Array
		for(int i=0; i<5; i++) {
			System.out.println("Entre com uma nota:");
			nota[i] = sc.nextFloat();
		}
		sc.close();
		//Apresentado o Array 
		for(int i=0; i<5; i++) {
			System.out.println("Nota " + (i+1) + "=" + nota[i]);
		}
	}
}
