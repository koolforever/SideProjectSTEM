//Absolutely.java

import java.util.*;
public class Absolutely{
	public static void main (String[] args) {
		Scanner keyb = new Scanner(System.in);
		int j, m , k;
		
		System.out.print("Enter a number: ");
		j = keyb.nextInt();
		
		System.out.print("Enter another number: ");
		m = keyb.nextInt();
		
		k = j * Math.abs(m);
		System.out.print(k);
		
	
	}
}

