package adv.springfxintro.p05_multipleinstances;

import static adv.utils.Context.loadApplicationContextOf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		new Application().run(context);

		context.close();
	}

	private void run(ApplicationContext context) {
		Person john = context.getBean("john", Person.class);
		Person jane = context.getBean("jane", Person.class);
		Person andrew = context.getBean("andrew", Person.class);

		john.present();
		jane.present();
		andrew.present();

		// TODO Cosa succede decommentando questa riga?
		context.getBean(Person.class);
	}

}
