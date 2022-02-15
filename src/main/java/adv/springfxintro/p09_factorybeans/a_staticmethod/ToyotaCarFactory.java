package adv.springfxintro.p09_factorybeans.a_staticmethod;

import adv.springfxintro.p09_factorybeans.Car;

public class ToyotaCarFactory {

	public static Car assemble(String model) {
		return new Car("Toyota", model);
	}

}
