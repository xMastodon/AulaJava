package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro");
		int inteiroLido = teclado.nextInt();
		System.out.printf("\nO n�mero lido foi: %d", inteiroLido);
		teclado.close();

	}

}
