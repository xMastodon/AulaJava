package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioQuatro {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## SOMA POR POSICAO ##");
		int[] numerosLidos = new int[4];
		
		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.println("Entre com um valor: ");
			numerosLidos[i] = teclado.nextInt();
		}
		
		int posicaoX = -1;
		while(posicaoX < 0 || posicaoX >= numerosLidos.length) {
			System.out.println("Digite uma posicao do vetor: ");
			posicaoX = teclado.nextInt();
		}
		
		
		System.out.println("Digite outra posicao do vetor: ");
		int posicaoY = teclado.nextInt();
		
		int soma = numerosLidos[posicaoX] + numerosLidos[posicaoY];
		
		for (int valor : numerosLidos) {
			System.out.printf("%d ", valor);
		}
		
		System.out.printf("\nA soma dos valores nas posições %d e %d é: %d", 
				posicaoX, posicaoY, soma);
		
		teclado.close();
	}
	
}