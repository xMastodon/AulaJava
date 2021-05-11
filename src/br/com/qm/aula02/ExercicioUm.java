package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o valor em polegadas");			
		float numeroPolegada = teclado.nextFloat();			
		float CM=numeroPolegada*2.54F;		
		System.out.printf("\nO número %.2f em polegadas se convertido em centímetros é: %.2f",numeroPolegada,CM);		
		teclado.close();

	}

}
