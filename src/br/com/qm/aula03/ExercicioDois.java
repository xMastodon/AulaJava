package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDois {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MEDIA DE N INTEIROS ##");
		System.out.println("De quantos n�meros voc� quer tirar a m�dia?");
		int qtdNumeros = teclado.nextInt();
		
		int soma = 0;
		for (int i = 0; i < qtdNumeros; i++) {
			
			System.out.println("Digite um n�mero: ");
			soma += teclado.nextInt();
			
		}
		
		float media = soma / (float) qtdNumeros;
		System.out.printf("A m�dia dos n�meros lidos foi: %.2f", media);
		teclado.close();
	}
}