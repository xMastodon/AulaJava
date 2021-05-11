package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite a primeira: ");
		float primeiraNota = teclado.nextFloat();
		System.out.println("Digite a primeira: ");
		float segundaNota = teclado.nextFloat();
		System.out.println("Digite a primeira: ");
		float terceiraNota = teclado.nextFloat();		
		float media =(primeiraNota * 1F + segundaNota * 1F + terceiraNota * 2F) / (1F + 1F + 2F);
		if (media>=6) {		
		System.out.printf("O aluno foi aprovado com média %.2f",media);
		}
		else {
			System.out.printf("O aluno foi reprovado com média %.2f",media);
		}
		
	teclado.close();
		}

	}


