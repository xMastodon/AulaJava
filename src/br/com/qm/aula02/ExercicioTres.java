package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite sua idade");			
		int idadeAtual = teclado.nextInt();	
		int anoAtual=2021;
		int anoNascimento=anoAtual-idadeAtual;		
		System.out.printf("\nSeu ano de nascimento é: %d",anoNascimento);		
		teclado.close();

	}

}
