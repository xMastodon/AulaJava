package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o preço primeiro produto\n");
		int primeiroLido = teclado.nextInt();
		
		System.out.println("Digite o preço segundo produto");
		int segundoLido = teclado.nextInt();
		
		System.out.println("Digite o preço terceiro produto\n");
		int terceiroLido = teclado.nextInt();
		if (primeiroLido == segundoLido && segundoLido == terceiroLido) {
			System.out.printf("\n Todos os produtos tem o mesmo preço.");}		
		else if (primeiroLido < segundoLido && primeiroLido < terceiroLido) {
			System.out.printf("\nO primeiro produto que é vendido a R$%d reais é o mais barato", primeiroLido);}
		else if (segundoLido < primeiroLido && segundoLido < terceiroLido) {
			System.out.printf("\nO segundo produto que é vendido a R$%d reais é o mais barato", segundoLido);}
		else   {
				System.out.printf("\nO terceiro produto que é vendido a R$%d reais é o mais barato", terceiroLido);}
		teclado.close();
//complemntar com dois produtos com o mesmo preço
	}

}
