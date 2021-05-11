package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o  tamanho do lado do quadrado");		
		float tamanho = teclado.nextFloat();
		float area = (tamanho*2);		
		System.out.printf("\nA área do quadrado é: %.2f",area);
		teclado.close();

	}

}
