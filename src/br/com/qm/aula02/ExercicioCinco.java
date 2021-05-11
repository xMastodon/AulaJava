package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Digite o valor do produto");		
		float valorProduto = teclado.nextFloat();		
		float valorcomDesconto=valorProduto*0.88F;		
		System.out.printf("\nO valor do produto com desconto de 12%% é de: %.2f ",valorcomDesconto);	
		teclado.close();

	}

}
