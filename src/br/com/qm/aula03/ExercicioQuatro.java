package br.com.qm.aula03;

public class ExercicioQuatro {

	// 4. Fa�a um programa que calcule e mostre a soma dos 
	// 50 primeiros n�meros �mpares.
	public static void main(String[] args) {
	
		// Abordagem 1
		int soma = 0;
		for (int i = 1; i <= 99; i += 2) {
			soma += i;
		}
		
		System.out.printf("A soma dos 50 primeiros "
				+ "n�meros �mpares � %d", soma);
		
		// Abordagem 2
		soma = 0;
		int contador = 0;
		int numero = 1;
		while (contador < 50) {
			
			if (numero % 2 != 0) {
				soma += numero;
				contador++;
			}
			
			numero++;
		}
		
		System.out.printf("\nA soma dos 50 primeiros "
				+ "n�meros �mpares � %d", soma);
		
	}
	
}