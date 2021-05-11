package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número real");
		float realLido = teclado.nextFloat();
		System.out.printf("\nO número lido foi: %.2f", realLido);
		teclado.close();

	}

}
