package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o valor em polegadas");			
		float numeroPolegada = teclado.nextFloat();			
		float CM=numeroPolegada*2.54F;		
		System.out.printf("\nO n�mero %.2f em polegadas se convertido em cent�metros �: %.2f",numeroPolegada,CM);		
		teclado.close();

	}

}
