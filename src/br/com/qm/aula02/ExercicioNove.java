package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.println("Digite seu sal�rio: ");
	float salario = teclado.nextFloat();
	System.out.println("Digite o valor da ptesta��o: ");
	float prestacao = teclado.nextFloat();
	boolean emprestimoConcedido = prestacao < salario*0.2F;
	if (emprestimoConcedido) {
		System.out.println("Emprestimo concedido");
	}
	else {
		System.out.println("Emprestimo n�o concedido");
	}
	
teclado.close();
	}

}
