package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuinze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite 1 para soma, 2 para subtra��o, 3 para multiplica��o e 4 para divis�o");
		int opcao = teclado.nextInt();
		if (opcao<1 || opcao>=5) {System.out.printf("Op��o inv�lida");}
		else {
		switch(opcao) {	
			
		case 1:
			System.out.println("Digite o primeiro valor");
			float primeiroValorSoma = teclado.nextFloat();
			System.out.println("Digite o segundo valor");
			float segundoValorSoma = teclado.nextFloat();
			float soma=primeiroValorSoma+segundoValorSoma;
			System.out.printf("A soma dos valores �: %.2f",soma);			
			break;
		case 2:
			System.out.println("Digite o primeiro valor");
			float primeiroValorSub = teclado.nextFloat();
			System.out.println("Digite o segundo valor");
			float segundoValorSub = teclado.nextFloat();
			float subtracao=primeiroValorSub-segundoValorSub;
			System.out.printf("A subtracao enre os n�meros �: %.2f",subtracao);			
			break;
		case 3:
			System.out.println("Digite o primeiro valor");
			float primeiroValorMult = teclado.nextFloat();
			System.out.println("Digite o segundo valor");
			float segundoValorMult = teclado.nextFloat();
			float vezes=primeiroValorMult*segundoValorMult;
			System.out.printf("A multiplica��o entre os valores �: %.2f",vezes);			
			break;
		case 4:
			System.out.println("Digite o primeiro valor");
			float primeiroValorDiv = teclado.nextFloat();
			System.out.println("Digite o segundo valor");
			float segundoValorDiv = teclado.nextFloat();
			float div=primeiroValorDiv/segundoValorDiv;
			System.out.printf("A soma dos valores �: %.2f",div);			
			break;		
			}
		}
		teclado.close();
	}

}
