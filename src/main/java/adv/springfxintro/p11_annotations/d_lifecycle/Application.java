package adv.springfxintro.p11_annotations.d_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static adv.utils.Context.loadApplicationContextOf;

public class Application {

	public static void main(String[] args)
	throws Exception {
		System.out.println("Context is being loaded");

		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		System.out.println("Context has been loaded");

		new Application().run(context);

		System.out.println("Context is being closed");

		context.close();

		System.out.println("Context has been closed");
	}

	private void run(ApplicationContext context) {
		Person john = context.getBean(Person.class);
		john.present();
	}

}
