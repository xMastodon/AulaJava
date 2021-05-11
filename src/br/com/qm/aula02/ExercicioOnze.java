package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número\n");
		int primeiroLido = teclado.nextInt();
		System.out.println("Digite o segundo número");
		int segundoLido = teclado.nextInt();
		System.out.println("Digite o terceiro número\n");
		int terceiroLido = teclado.nextInt();
		if (primeiroLido > segundoLido && primeiroLido>terceiroLido) {
			System.out.printf("\nO número %d  é o maior", primeiroLido);}
		else if (segundoLido > primeiroLido && segundoLido > terceiroLido) {
			System.out.printf("\nO número %d  é o maior", segundoLido);}
			else {
				System.out.printf("\nO número %d  é o maior", terceiroLido);}
		teclado.close();
	}
}
