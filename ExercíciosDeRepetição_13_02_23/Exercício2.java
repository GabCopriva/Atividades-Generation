package Exerc�ciosDeRepeti��o_13_02_23;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// Exerc�cio 2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		//Scanner
		
		Scanner read = new Scanner (System.in);
		
		//Vari�veis
		
		int num = 0, par = 0, impar = 0;
		
		//FOR
		
		for (int i = 1; i<=10; i++) {
					
			if(num % 2 == 0) {
				par++;
			}
		
		
		}
			System.out.println("\nOs n�meros pares s�o:" +par);
			
	}

}
