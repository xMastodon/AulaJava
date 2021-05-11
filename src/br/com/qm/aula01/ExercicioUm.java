package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int inteiroLido = teclado.nextInt();
		System.out.printf("\nO número lido foi: %d", inteiroLido);
		teclado.close();

	}

}
