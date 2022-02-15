package adv.springfxintro.p02_dependencyinjection.a_property;

import static adv.utils.Context.loadApplicationContextOf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	/*
	 * Carica il contesto solo per verificare che non ci siano errori di
	 * configurazione
	 */
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		Foo f = context.getBean(Foo.class);

		System.out.println(f.scriviPotenza());

		context.close();

		System.out.println("OK!");
	}

}
