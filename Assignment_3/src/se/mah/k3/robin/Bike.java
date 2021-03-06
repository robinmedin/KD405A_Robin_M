package se.mah.k3.robin;

public class Bike {

	private String color;
	private int price;
	private int size;

	/** Creates a new bike with two instance variables, color (String) and size (int). */
	public Bike(String color, int size) {
		this.color = color;
		this.size = size;

		
	}

	/** Constructor for creating new bikes, with parameters of color, size and price */
	public Bike(String color, int size, int price) {
		//this.color = color;
		//this.size = size;
		//this.price = price;
		
		 /** Loops through colors to check if a color is set in the Constants.java*/
		boolean trueColor = false;
		for (int i = 0; i < Constants.APPROVED_COLORS.length; i++) {
			if (Constants.APPROVED_COLORS[i].equals(color)) {
				trueColor = true;
			}
		}
		/**If a color is the same as one of the colors in Constants.java, */
		if (trueColor == true) {
			this.color = color;
		} else {
			this.color = "0";
		}
		
		if (size <= Constants.MAX_SIZE && size >= Constants.MIN_SIZE){
			this.size = size;
		} else {
			this.size = 0;
		}
		
		if (price <= Constants.MAX_PRICE && price >= Constants.MIN_PRICE){
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	/** Method for returning color of bike*/
	public String getColor() {
		return this.color;
	}
	
	/**Method for returning size of bike*/
	public int getSize() {
		return this.size;
	}

	/**Method for returning price of bike*/
	public int getPrice() {
		return this.price;
	}

	/**Method for setting the price of a bike)*/
	public void setPrice(int price) {
		this.price = price;
	}
}