package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioTres {

	
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		System.out.println("## VALORES E O SEU QUADRADO ##");
		float[] numerosLidos = new float[5];
 		float[] quadrados = new float [5];
		
 		for(int i = 0; i < numerosLidos.length; i++) {
 			System.out.println("Entre com um valor: ");
 			numerosLidos[i] = teclado.nextFloat();
 			// SOU PREGUI�OSO E APROVEITEI ESSE LA�O
 			quadrados[i] = numerosLidos[i] * numerosLidos[i];
 		}
		
 		
 		System.out.println("\nN�meros lidos:");
 		for (float valor : numerosLidos) {
 			System.out.println(valor);
 		}
 		
 		System.out.println("\nCom um for normal");
 		for (int i = 0; i < numerosLidos.length; i++) {
 			System.out.println(numerosLidos[i]);
 		}
 		
 		System.out.println("\nQuadrados");
 		for (float valor : quadrados) {
 			System.out.println(valor);
 		}
 		
 		teclado.close();
	}
	
}