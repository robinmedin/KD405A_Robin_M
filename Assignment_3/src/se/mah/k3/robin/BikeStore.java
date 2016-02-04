package se.mah.k3.robin;

import java.util.ArrayList;

public class BikeStore {
	
	/**Constructor, creating a bike store for the GUI*/
	public BikeStore(){
	}

	private ArrayList<Bike> allBikes = new ArrayList<Bike>();{	
	}
	
	/**Method that returns a string containing all the bikes in the ArrayList allBikes.*/
    public String getAllBikes() {
        String returnString = "";
        int counter = 1;
            for (Bike s : allBikes) {
                returnString = returnString + "Bike " + counter + " color: " + s.getColor() + ". Size: " + s.getSize() + " inches. Price: " + s.getPrice() + " SEK.\n";
                counter++; /**Iterate through for loop*/
           }
            return returnString;
    }

/** Method that adds a Bike with specific color, size and price to the arrayList bikes*/ 
public void addBike(String color, int size, int price){
	Bike b = new Bike(color, size, price);
	this.allBikes.add(b);
}
}