package se.mah.k3.robin.Assignment_4B;

public abstract class Animal {
	
	protected String latinName;
	private String friendlyName = "noname";
	
	/**Constructor for creating a general animal, only with the parameter latinName*/
	public Animal(String latinName){
		this.latinName = latinName;
	}
	
	/**Declares a string, getInfo*/
	public abstract String getInfo();
	
	/**Method for setting a name*/
	public void setFriendlyName(String name){
		this.friendlyName = name;
	}
	
	/**Method for getting a name*/
	public String getFriendlyName(){
		return this.friendlyName;
	}
	
	

}
