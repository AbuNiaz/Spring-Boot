package mainpakage;

public class Computer {

	private String brand;

	public Computer() {
		super();
		System.out.println("No arg contructor called(computer class)");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("All arg contructor called(computer class)");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}
