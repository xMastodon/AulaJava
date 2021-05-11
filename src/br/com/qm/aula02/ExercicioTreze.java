package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTreze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite a primeira nota: ");
		float primeiraNota = teclado.nextFloat();
		System.out.println("Digite a segunda note: ");
		float segundaNota = teclado.nextFloat();				
		float media =(primeiraNota+segundaNota)/2F;
		if (media<7) {	System.out.printf("Reprovado");}
		else if (media<10){System.out.printf("Aprovado");}		
		else  {System.out.printf("Aprovado com Distinção");}			
	teclado.close();
		}

	}


