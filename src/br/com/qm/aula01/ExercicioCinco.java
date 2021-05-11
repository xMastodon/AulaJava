package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioCinco
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite um número real");			
		float numeroLido = teclado.nextFloat();		
		float quinta = numeroLido/5F;		
		System.out.printf("\nA quinta parte do numero %.2f é: %.2f",numeroLido,quinta);
		teclado.close();

	}

}
