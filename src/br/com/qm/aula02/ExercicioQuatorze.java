package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatorze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o dia da semana: ");
		int dia = teclado.nextInt();
		switch(dia) {		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
			}
		teclado.close();

	}
}
