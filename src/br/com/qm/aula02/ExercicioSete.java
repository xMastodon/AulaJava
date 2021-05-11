package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite um número");		
		int numeroLido = teclado.nextInt();	
	
		if (numeroLido>0) {
		System.out.printf("\nO numero %d é positivo",numeroLido);}
		else if (numeroLido<0) {
			System.out.printf("\nO numero %d é negativo",numeroLido);}
		else {System.out.printf("\n O número é nulo");}
		teclado.close();

	}

}
