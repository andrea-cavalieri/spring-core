package adv.springfxintro.p09_factorybeans.c_interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

import static adv.utils.Context.loadApplicationContextOf;

public class Application {

	public static void main(String[] args)
	throws Exception {
		ClassPathXmlApplicationContext context =
				loadApplicationContextOf(Application.class);

		new Application().run(context);

		context.destroy();
		context.close();
	}

	private void run(ApplicationContext context) {
		Map<String, Customer> customersBeansKeyedById = context.getBeansOfType(Customer.class);

		for (Customer customer : customersBeansKeyedById.values()) {
			System.out.println(customer.getName() + " owns a " + customer.getCar().describe());
		}
	}

}
