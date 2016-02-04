package se.mah.k3.robin;

public class TestCat {

	public static void main(String[] args) {
		System.out.println("Detta är en testmetod för CAT");
		System.out.println("**Start test");
		
		Cat c = new Cat();
		Cat a = new Cat("Brown", "Missen");
		System.out.println("One cat: " + c.getName() + " and one: " + a.getName());

	}

}
