package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioSeis {	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MAIOR MENOR DENTRO DE UM VETOR ##");
		int[] numerosLidos = new int[4];
		
		int posMaior = 0;
		int posMenor = 0;
		
		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.println("Digite um valor: ");
			numerosLidos[i] = teclado.nextInt();
			
			
			
			if (numerosLidos[i] > numerosLidos[posMaior]) {
				posMaior = i;
			}
			
			if (numerosLidos[i] < numerosLidos[posMenor]) {
				posMenor = i;
			}
			
		}
		// {1, 4, -2, 2} // posMaior = 1 // posMenor = 2
		System.out.printf("O menor valor é %d e ele se encontra na posição %d\n", 
				numerosLidos[posMenor], posMenor);
		System.out.printf("O maior valor é %d e ele se encontra na posição %d", 
				numerosLidos[posMaior], posMaior);
		
		teclado.close();
	}
}