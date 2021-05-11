package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o primeiro número");		
		int primeiroNumero = teclado.nextInt();	
		System.out.println("Digite o segundo número");		
		int segundoNumero = teclado.nextInt();		
		if (primeiroNumero == segundoNumero)
		{System.out.printf("\n Os números são iguais");}
		else if (primeiroNumero > segundoNumero) {
		System.out.printf("\nO maior número é o %d",primeiroNumero);
		System.out.printf("\nA diferença entre eles é de %d",primeiroNumero-segundoNumero);}
		else if (segundoNumero > primeiroNumero) {
		System.out.printf("\nO maior número é o %d",segundoNumero);
		System.out.printf("\nA diferença entre eles é de %d",segundoNumero-primeiroNumero);}		
		teclado.close();
	}

}
