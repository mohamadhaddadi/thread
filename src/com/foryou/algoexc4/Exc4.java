package com.foryou.algoexc4;

public class Exc4 {

	public static void main(String[] args) {
		String phrase = "vima @ .";
		char carfin = '.';
		int nbcar = 0;
		int i = 0;

		while (phrase.replace(" ", "").charAt(i) != carfin) {
			// System.out.println(phrase.replace(" ", "").charAt(i));
			i = i + 1;
		}
		nbcar = i;
		System.out.println("nombre de carractère est " + nbcar);

	}

}
