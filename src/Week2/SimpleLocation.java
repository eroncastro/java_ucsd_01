package Week2;

/*
 * The scope of a variable is the area where it is defined to have a value.
 * Types:
 * 	- local variables: variables declared inside a method.
 *  - parameters: behave like local variables.
 *  - members: declared outside any method and their scope is the entire class.
 *  
 *  In Java, this keyword refers to the calling object;
 *  this stores a reference to the object we have just created.
 *  
 *  When a method ends, its scope is gone.
 * */

public class SimpleLocation {
	// Member variables
	public double lat;
	public double lon;
	
	// Constructor variables
	public SimpleLocation(double latIn, double lonIn) {
		// this keyword for member variables is optional; when Java
		// does not find a variable in the local scope, it will look for members.
		this.lat = latIn;
		this.lon = lonIn;
	}
	
    public static void main(String[] args) {
        SimpleLocation loc1 = new SimpleLocation(39.9, 116.4);
        SimpleLocation loc2 = new SimpleLocation(55.8, 37.6);
        loc1 = loc2;
        loc1.lat = -8.3;
        System.out.println(loc2.lat + ", " + loc2.lon);
    }
}
