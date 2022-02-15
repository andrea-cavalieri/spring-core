package adv.springfxintro.p09_factorybeans.b_instancemethod;

import adv.springfxintro.p09_factorybeans.Car;

public class CarFactory {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car assemble(String model) {
		return new Car(brand, model);
	}

}
