package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis{

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o primeiro número");		
		int primeiroNumero = teclado.nextInt();	
		System.out.println("Digite o segundo número");		
		int segundoNumero = teclado.nextInt();
		if (primeiroNumero > segundoNumero) {
		System.out.printf("\nO maior número é o %d",primeiroNumero);}
		else if (segundoNumero > primeiroNumero) {
		System.out.printf("\nO maior número é o %d",segundoNumero);}
		else {System.out.printf("\n Os números são iguais");}
		teclado.close();

	}

}
