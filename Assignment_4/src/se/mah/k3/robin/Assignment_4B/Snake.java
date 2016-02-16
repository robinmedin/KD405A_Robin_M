package se.mah.k3.robin.Assignment_4B;

public class Snake extends Animal {

	/**Declaring a boolean regarding whether a snake is poisonous or not, initially stated as false*/
	private boolean poisonous = false;

	/**Constructor for creating a snake with parameters latinName and state of toxicity*/
	public Snake(String latinName, boolean poisonous) {
		super(latinName);
		this.poisonous = poisonous;
	}

	public boolean isPoisonous() {
		return this.poisonous;
	}

	/**Compile information about snake and returns String info*/
	@Override
	public String getInfo() {
		String poisonousOrNot = "not poisonous";
		if(isPoisonous()){
			poisonousOrNot = "poisonous";
		}
		String info = "The snake with the latin name "+latinName + " is " +poisonousOrNot +"\n";
		return info;
	}

}
