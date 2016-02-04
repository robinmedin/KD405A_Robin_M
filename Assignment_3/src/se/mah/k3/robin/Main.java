package se.mah.k3.robin;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Arraylist som slumpar fram cyklar och printar ut dem i console
		ArrayList<Bike> myBikeList = new ArrayList<Bike>();
		
		Random sizeRandom = new Random();
		Random priceRandom = new Random();
		
		//Loopar fram 10 slumpade cyklar
		for(int i = 0; i < 10; i++){
			int randomSize = sizeRandom.nextInt(50) + 100;
			int randomPrice = priceRandom.nextInt(1800) + 1000;
			
			myBikeList.add(new Bike("Red", randomSize, randomPrice));
		}

		int index = 0; //Plats i array som ökar med 1 i värde i for-loopen med "index++"
		//Printar ut 10 slumpade cyklar
		for(Bike b:myBikeList){
			System.out.println("Cykel nummer " + index++ + " kostar " + b.getPrice() + " kronor, och är " + b.getSize() + " tum lång.");
		}
	}

}

