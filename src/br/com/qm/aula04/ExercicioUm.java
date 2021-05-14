package br.com.qm.aula04;

public class ExercicioUm {

	

	
	public static void main(String[] args) {
		
		int[] A = {1, 0, 5, -2, -5, 7};	
		
		int posicao = 0;
		int soma = A[posicao] + A[1] + A[5];
		System.out.printf("A soma das posições 0, 1 e 5 é: %d\n", soma);
		
		A[4] = 100;
		
		System.out.println("Esta é a impressão com o for normal");
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		
		System.out.println("Esta é a impressão com o foreach");
		for (int valor : A) {
			System.out.println(valor);
		}
		
		
	}
	
}