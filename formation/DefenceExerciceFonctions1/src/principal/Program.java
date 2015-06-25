package principal;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		int[] entiers1 = {1,2,3,4,6,7,9};
		int[] entiers2 = {101,20,31,14,11,27,59};
		
		System.out.println("nombre d'impaire dans " +
					Arrays.toString(entiers1) + " = "
					+ compteImpaire(entiers1));
		System.out.println("nombre d'impaire dans " +
				Arrays.toString(entiers2) + " = "
				+ compteImpaire(entiers2));
	}
	
	
	public static int compteImpaire(int[] tab) {
		int compteur = 0;
		for (int i : tab) {
			if (i % 2 != 0) {compteur++; }
		}
		return compteur;
	}

}
