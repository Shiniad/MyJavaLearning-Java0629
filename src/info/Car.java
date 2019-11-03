package info;

public class Car extends Vehicle{

	public Car() {
		super();  //Òþº¬ÒÑÐ´¸ÃÓï¾ä
		System.out.println("Car");
	}

	static {
		System.out.println("static Chuck:Car is run.");
	}
	
	public static void main(String[] args) {
		new Car();
	}

}

class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle");
	}
	
	public void run() {
		System.out.println("Vehicle is run.");
	}
	
	{
		System.out.println("Construction Chuck:Vehicle is run.");
	}
	
	static {
		System.out.println("static Chuck:Vehicle is run.");
	}
	
	public void DoWhat() {
		System.out.println("go home");
	}
	
}
