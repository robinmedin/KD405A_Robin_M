package se.mah.k3.robin.Assignment_4B;

public abstract class Mammal extends Animal {
	
	protected int gestationTime;
	
	/**Constructor for creating a general mammal, parameters latinName and gestationTime*/
	public Mammal(String latinName, int gestationTime){
		super(latinName);
		this.gestationTime = gestationTime;
	}
	/**Method for getting the gestationTime*/
	public int getGestationTime(){
		return this.gestationTime;
	}

}
