package adv.springfxintro.p09_factorybeans.c_interface;

import adv.springfxintro.p09_factorybeans.Car;
import org.springframework.beans.factory.FactoryBean;

import java.util.List;

public class CarFactory implements FactoryBean<Car> {

	private String       brand;
	private List<String> models;
	private int counter = 0;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModels(List<String> models) {
		this.models = models;
	}

	public Car getObject()
	throws Exception {
		return new Car(brand, nextModel());
	}

	public Class<?> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return false;
	}

	private String nextModel() {
		String model = models.get(counter);
		counter = (counter + 1) % models.size();
		return model;
	}

}
