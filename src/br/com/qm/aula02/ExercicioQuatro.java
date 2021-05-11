package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		
		System.out.println("Para informar a altura desejada em centimetros digite 1 e para informar em metros digite 2");
		int unidadedeMedida = teclado.nextInt();			
		if (unidadedeMedida == 1){
		System.out.println("\nDigite a altura do degrau");		
		int alturaDegrau = teclado.nextInt();	
		System.out.println("\nInforme a altura que deseja alcançar");
		int alturaDesejada = teclado.nextInt();
		int quantidadeDegraus=alturaDesejada/alturaDegrau;		
		System.out.printf("\nPara se alcançar a altura de %d, é necessário subir %d Degraus",alturaDesejada,quantidadeDegraus);}
		else if (unidadedeMedida == 2){
		System.out.println("\nDigite a altura do degrau");		
		float alturaDegrau = teclado.nextFloat();	
		System.out.println("\nInforme a altura que deseja alcançar");
		float alturaDesejada = teclado.nextFloat();
		float quantidadeDegraus=(alturaDesejada*100)/alturaDegrau;			
		System.out.printf("\nPara se alcançar a altura de %.2f é necessário subir %.2f Degraus",alturaDesejada,quantidadeDegraus);}
		else {		
		System.out.printf("\nUnidade de medida não reconhecida");}	
		teclado.close();


	}

}
