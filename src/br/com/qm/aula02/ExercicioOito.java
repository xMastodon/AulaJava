package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o primeiro n�mero");		
		int primeiroNumero = teclado.nextInt();	
		System.out.println("Digite o segundo n�mero");		
		int segundoNumero = teclado.nextInt();		
		if (primeiroNumero == segundoNumero)
		{System.out.printf("\n Os n�meros s�o iguais");}
		else if (primeiroNumero > segundoNumero) {
		System.out.printf("\nO maior n�mero � o %d",primeiroNumero);
		System.out.printf("\nA diferen�a entre eles � de %d",primeiroNumero-segundoNumero);}
		else if (segundoNumero > primeiroNumero) {
		System.out.printf("\nO maior n�mero � o %d",segundoNumero);
		System.out.printf("\nA diferen�a entre eles � de %d",segundoNumero-primeiroNumero);}		
		teclado.close();
	}

}
