package adv.springfxintro.p08_scopes;

import static adv.utils.Context.loadApplicationContextOf;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args)
	throws Exception {
		ClassPathXmlApplicationContext context = loadApplicationContextOf(Application.class);

		new Application().run(context);

		context.destroy();
		context.close();
	}

	private void run(ApplicationContext context) {
		Map<String, Foo> fooBeansKeyedById = context.getBeansOfType(Foo.class);

		for (Map.Entry<String, Foo> bean : fooBeansKeyedById.entrySet()) {
			String fooId = bean.getKey();
			Foo fooInstance = bean.getValue();

			System.out.println(fooId + ": " + fooInstance.getMessage());
		}

		// TODO Cosa succede decommentando queste righe?
		System.out.println(context.getBean("bar"));
		System.out.println(context.getBean("bar"));
		System.out.println(context.getBean("bar"));
	}

}
