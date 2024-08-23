package Soma;

import java.util.*;

public class Soma 
{

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int x;
		int y;
		
		System.out.println("Digite um numero: ");
		x = scanner.nextInt();
		
		System.out.println("Digite um  outro numero: ");
		y = scanner.nextInt();
		
		int soma = x + y;
		
		
		System.out.println("A soma  destes dois numeros e: "+soma);
		
		scanner.close();
	}

}
