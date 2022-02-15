package adv.springfxintro.p01_firstapp.b_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBayApplication {

	public static void main(String[] args)
	throws Exception {
		/*
		 * Carica l'application context -> Avvia l'applicazione
		 */
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("adv/springfxintro/p01_firstapp/b_spring/application.xml");

		/*
		 * Esegue l'applicazione
		 */
		new MyBayApplication().run(context);

		/*
		 * Chiude l'application context -> Arresta l'applicazione
		 */
		context.close();
	}

	private void run(ApplicationContext context) {
		/*
		 * Preleva il bean di tipo ShipmentService dall'application context e ne esegue la logica
		 */
		ShipmentService shipmentService = context.getBean(ShipmentService.class);
		shipmentService.shipPackages();
	}

}
