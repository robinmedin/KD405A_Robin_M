package se.mah.k3.robin;

public class Bikestore_Test {

	/**Set as main class*/
	public static void main(String[] args) {

		/**Create new bikestore*/
		BikeStore Cykelshoppen = new BikeStore();
		
		/**Add bikes to bikestore*/
		Cykelshoppen.addBike("Red", 150, 1500);
		Cykelshoppen.addBike("Blue", 125, 1399);
		Cykelshoppen.addBike("Crimson", 100, 899);
	
		/**Prints out bikes in console*/
		System.out.println(Cykelshoppen.getAllBikes());
	}

}
