package adv.springfxintro.p11_annotations.b_autowired;

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
		Foo foo = context.getBean(Foo.class);
		foo.describe();
	}

}
