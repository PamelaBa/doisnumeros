package doisnumeros;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        int x,y, soma;
		
		System.out.println("Enter two values: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		soma = x + y;
		
		System.out.println("Soma = " + soma);
		
		
		sc.close();
	

	}

}
