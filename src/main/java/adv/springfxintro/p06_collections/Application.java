package adv.springfxintro.p06_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static adv.utils.Context.loadApplicationContextOf;

public class Application {

	public static void main(String[] args)
	throws Exception {
		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		new Application().run(context);

		context.close();
	}

	private void run(ApplicationContext context) {
		ComplexObject complexObject = context.getBean(ComplexObject.class);
		complexObject.print();
	}

}
