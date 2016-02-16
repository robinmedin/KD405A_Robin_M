package se.mah.k3.robin.Assignment_4B;

public class Cat extends Mammal {

	private int numberOfLifes;

	/**Constructor for creating cats*/
	public Cat(String latinName, int gestationTime, int numberOfLifes) {
		super(latinName, gestationTime);
		this.setNumberOfLifes(numberOfLifes);
	}

	/**Method for getting and returning the number of lives a cat has*/
	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	/**Method for setting the number of lives*/
	public void setNumberOfLifes(int numberOfLifes) {
		this.numberOfLifes = numberOfLifes;
	}

	/**Compiles the information about the cat into String getInfo for printing in the GUI*/
	@Override
	public String getInfo() {
		String info = "The cat with the latin name "+ latinName+ " nurses for " + gestationTime +" months an has " + getNumberOfLifes() +" lifes" + "\n";
		return info;
	}

}
