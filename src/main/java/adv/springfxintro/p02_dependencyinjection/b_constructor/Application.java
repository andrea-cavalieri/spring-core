package adv.springfxintro.p02_dependencyinjection.b_constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static adv.utils.Context.loadApplicationContextOf;

public class Application {

	/*
	 * Carica il contesto solo per verificare che non ci siano errori di configurazione
	 */
	public static void main(String[] args)
	throws Exception {
		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		context.close();

		System.out.println("OK!");
	}

}
