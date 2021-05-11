package br.com.qm.aula01;
import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o numero a ser analisado");	
		int numeroLido = teclado.nextInt();	
		int ant = numeroLido-1;	
		int suc = numeroLido+1;
		System.out.printf("\nO antecessor é: %d e o sucessor é: %d",ant,suc);
		teclado.close();

	}

}
