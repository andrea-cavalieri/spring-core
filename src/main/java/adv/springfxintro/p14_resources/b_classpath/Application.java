package adv.springfxintro.p14_resources.b_classpath;

import adv.springfxintro.p14_resources.MyResourceReader;
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
		MyResourceReader resourceReader = context.getBean(MyResourceReader.class);
		System.out.println(resourceReader.read());
	}

}
