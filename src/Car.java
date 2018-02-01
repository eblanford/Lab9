
public class Car {

	// data members
	private String make;
	private String model;
	private int year;
	private double price;

	// default constructor
	public Car() {
		make = "Ford";
		model = "Focus";
		year = 2009;
		price = 20000.00;
	}

	// constructor
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// getters & setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return make + " " + model + " " + year + " " + price;
	}

}
