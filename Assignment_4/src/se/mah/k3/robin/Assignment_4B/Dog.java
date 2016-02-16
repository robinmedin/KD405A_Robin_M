package se.mah.k3.robin.Assignment_4B;

public class Dog extends Mammal{
	
	private boolean stupid;

	/**Constructor for creating a dog with the parameters latinName, gestationTime and stupidity*/
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid=stupid;
	}
	/**Costructor for creating a dog with the parameters latinName, gestationTime, stupidity and friendlyName*/
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		this(latinName, gestationTime, stupid);
		this.setFriendlyName(friendlyName);
	}
	/**A boolean that decides whether or not a dog is stupid, returns true or false*/
	public boolean isStupid(){
		return this.stupid;
	}

	/**Method for printing the dogs stupidity. */
	@Override
	public String getInfo() {
		String smartOrStupid = "not stupid";
		if(isStupid()==true){
			smartOrStupid = "stupid";
		}
		
		/**Creates String info to be printed, compiled by the data regarding the dog*/
		String info = "The dog named \"" + getFriendlyName()+ "\" with the latin name "+ latinName+" nurses for "+ gestationTime + " months and is " +smartOrStupid + "\n";
		return info;
	}

}
