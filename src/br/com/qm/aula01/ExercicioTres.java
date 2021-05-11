package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Soma de três números");
		System.out.println("Digite três valores e eu" + "vou imprimir a soma deles :)");

		System.out.println("Digite o primeiro número\n");
		int primeiroLido = teclado.nextInt();
		System.out.println("Digite o segundo número");
		int segundoLido = teclado.nextInt();
		System.out.println("Digite o terceiro número\n");
		int terceiroLido = teclado.nextInt();

		int soma = primeiroLido + segundoLido + terceiroLido;

		System.out.printf("\nA soma dos números é: %d", soma);
		teclado.close();

	}

}
