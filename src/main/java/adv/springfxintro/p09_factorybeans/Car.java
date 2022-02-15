package adv.springfxintro.p09_factorybeans;

public class Car {

	private String brand;
	private String model;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String describe() {
		return brand + " " + model;
	}

}
