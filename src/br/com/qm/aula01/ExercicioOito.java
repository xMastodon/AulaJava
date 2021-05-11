package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o numero a ser analisado");			
		int numeroLido = teclado.nextInt();	
		int suc = (numeroLido*3)+1;
		int ant = (numeroLido*2)-1;	
		int soma=suc+ant;
		System.out.printf("\nA soma do sucessor de seu triplo que  %d com o antecessor de seu dobro é %d resulta em : %d",suc,ant,soma);
		teclado.close();

	}

}
