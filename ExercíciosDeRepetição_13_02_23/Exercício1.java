package ExercíciosDeRepetição_13_02_23;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		// Exercício 1. Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		Scanner leia = new Scanner (System.in);		
					
		// FOR
		for (int i =1000; i <=1999; i++) {
			if(5 == i%11) {
				System.out.println(i);	
			}

		}
	}
}



