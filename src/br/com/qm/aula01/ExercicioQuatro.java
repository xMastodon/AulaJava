package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero real");
		float numeroLido = teclado.nextFloat();
		float quadrado = numeroLido * numeroLido;
		System.out.printf("\nO Quadrado do %.2f �: %.2f", numeroLido, quadrado);
		teclado.close();

	}

}
