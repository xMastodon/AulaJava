package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Soma de tr�s n�meros");
		System.out.println("Digite tr�s valores e eu" + "vou imprimir a soma deles :)");

		System.out.println("Digite o primeiro n�mero\n");
		int primeiroLido = teclado.nextInt();
		System.out.println("Digite o segundo n�mero");
		int segundoLido = teclado.nextInt();
		System.out.println("Digite o terceiro n�mero\n");
		int terceiroLido = teclado.nextInt();

		int soma = primeiroLido + segundoLido + terceiroLido;

		System.out.printf("\nA soma dos n�meros �: %d", soma);
		teclado.close();

	}

}
