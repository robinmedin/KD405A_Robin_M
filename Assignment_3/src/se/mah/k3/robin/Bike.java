package se.mah.k3.robin;

public class Bike {

	private String color;
	private int price;
	private int size;

	/** Creates a new bike with two instance variables, color (String) and size (int). */
	public Bike(String color, int size) {
		this.color = color;
		this.size = size;

		
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
			this.color = "404 - Color not found!";
		}
	}

	/** CONSTRUCTOR */
	public Bike(String color, int size, int price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}

	/** METHODS */
	public String getColor() {
		return this.color;
	}

	public int getSize() {
		return this.size;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}