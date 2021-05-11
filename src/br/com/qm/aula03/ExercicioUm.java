package br.com.qm.aula03;


public class ExercicioUm {
	
	public static void main(String[] args) {
		
		System.out.println("# FOR #");
		for (int i = 1; i <= 25; i++) {
			System.out.println(i);
		}
		
		System.out.println("# WHILE #");
		int i = 1;
		while (i <= 25) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("# DO WHILE #");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 25);
		
	}
	
}