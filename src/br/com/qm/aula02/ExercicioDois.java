package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite a velocidade em KM/H");			
		float veloKM = teclado.nextFloat();			
		float MS=veloKM*3.6F;		
		System.out.printf("\n%.2f KM/H se convertido em metros por segundo é: %.2f MS",veloKM,MS);		
		teclado.close();

	}

}
