package adv.springfxintro.p09_factorybeans.b_instancemethod;

import adv.springfxintro.p09_factorybeans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

import static adv.utils.Context.loadApplicationContextOf;

public class Application {

	public static void main(String[] args)
	throws Exception {
		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		new Application().run(context);

		context.destroy();
		context.close();
	}

	private void run(ApplicationContext context) {
		Map<String, Car> carBeansKeyedById = context.getBeansOfType(Car.class);

		for (Map.Entry<String, Car> bean : carBeansKeyedById.entrySet()) {
			String carId = bean.getKey();
			Car carInstance = bean.getValue();

			System.out.println(carId + " is a " + carInstance.describe());
		}
	}

}
