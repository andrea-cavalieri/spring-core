package adv.springfxintro.p09_factorybeans.c_interface;

import adv.springfxintro.p09_factorybeans.Car;

public class Customer {

	private String name;
	private Car    car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
