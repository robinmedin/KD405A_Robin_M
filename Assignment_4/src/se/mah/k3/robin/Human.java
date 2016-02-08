package se.mah.k3.robin;

public class Human {
	
	private String dog;
	private String name; 
	private String info;
	
	public Human(String name){
	}
	
	public String getName(){
		return name;
	}
	
	public String buyDog(){
		return dog;
	}
	
	public String getInfo(){
		return info = "x äger en hund som heter y, x äger inte en hund";
	}
	

}


/**getInfo returnerar: "x äger en hund som heter y" eller " x äger inte en hund"*/


/**

-dog:Dog
-name:String
+Human(name:String)
+getName():String
+buyDog(dog:Dog)
+getInfo():String

*/