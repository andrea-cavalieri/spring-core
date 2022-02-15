package adv.springfxintro.p01_firstapp.c_decoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBayApplication {

	public static void main(String[] args)
	throws Exception {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("adv/springfxintro/p01_firstapp/c_decoupling/application.xml");

		new MyBayApplication().run(context);

		context.close();
	}

	private void run(ApplicationContext context) {
		/*
		 * Spring fornisce il bean di tipo ShipmentServiceImpl
		 */
		ShipmentService shipmentService = context.getBean(ShipmentService.class);
		shipmentService.shipPackages();
	}

}
