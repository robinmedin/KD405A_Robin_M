
public class House { //KLASSNAMN
	
	private int yearBuilt; //INSTANSVARIABLER
	private int size;
	private final int minSize = 10;
	private final int maxSize = 1000;
	private final int yearOld = 1800;
	private final int yearNew = 2015;
	
	public House(int yearBuilt,int size){ //KONSTRUKTOR
	//this.yearBuilt = yearBuilt;
	
	if (size >= minSize && size <= maxSize){
		this.size = size;
	} else {
		this.size = 0;
	}
	if (yearBuilt >= yearOld && yearBuilt <= yearNew){
		this.yearBuilt = yearBuilt;
	} else {
		this.yearBuilt = 0;
	}
	}
	
	
	public int getYearBuilt(){
	return this.yearBuilt;
	}
	
	public int getSize(){
	return this.size;
	}
}
