package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite um n�mero");		
		int numeroLido = teclado.nextInt();	
	
		if (numeroLido>0) {
		System.out.printf("\nO numero %d � positivo",numeroLido);}
		else if (numeroLido<0) {
			System.out.printf("\nO numero %d � negativo",numeroLido);}
		else {System.out.printf("\n O n�mero � nulo");}
		teclado.close();

	}

}
