package se.mah.k3.robin;

public class Human {
	
	private Dog dog;
	private String name; 
	
	
	public Human(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	public String getInfo(){

		if (dog == null) {
			String info = getName() + " does not own a dog";
			return info;
		} else {
			String info = getName() + " owns a dog named " + dog.getDogName();
			return info;
		}
	}
	
}
