package Morpion;


import java.util.ArrayList;
import java.util.Collections;

public class NombrePalindrome {

	public static void main(String[] args) {
		palindrome(448844);
		
	}
	
	public static void palindrome(int n) {
		int i=0;
		//int pa=0;
		int k=n;
		ArrayList<Integer> digits =new ArrayList<Integer>();
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		
		while (n>0) {
			//int quotient= n/10;
			int reste=n%10;
			digits.add(reste);
			n=(n-reste)/10;
			
		}
		
		for(int i1=digits.size()-1;i1>-1;i1--) {
			reverse.add(digits.get(i1));
			
		}
		//System.out.println(digits);
		//System.out.println(pa);
		
		if(digits.equals(reverse)) {
			System.out.println(k+" est un nombre palindrome");
		}else {
			System.out.println(k+" n'est pas un nombre palindrome");
		}
	}
}
