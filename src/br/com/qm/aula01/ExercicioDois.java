package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero real");
		float realLido = teclado.nextFloat();
		System.out.printf("\nO n�mero lido foi: %.2f", realLido);
		teclado.close();

	}

}
