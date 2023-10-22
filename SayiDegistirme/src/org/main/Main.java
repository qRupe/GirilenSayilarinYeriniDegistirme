package org.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayıyı girin: ");
		int x = scanner.nextInt();
		System.out.print("İkinci sayıyı girin: ");
		int y = scanner.nextInt();
		int z = x;
		x = y;
		y = z;
		
		System.out.println("Sayı 1: " + x + " Sayı 2: " + y);
		
	}

}
