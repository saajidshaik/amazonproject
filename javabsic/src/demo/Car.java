package demo;

public class Car {
	
	private String color;
	private String enginetype;
		
	public Car(String colorofcar, String typeofengine) {
		color = colorofcar;
		enginetype= typeofengine;
		
	} 
	public void printCarInfo() {
		System.out.println("color ofengine" + color);
		System.out.println("type of engine" +enginetype);		
	}
	public static void maiin(String[] args) {
		
		Car Mercedes = new Car("silver" , "petrol");
		Car audi = new Car("black, Diesel", "color");
	}
}
