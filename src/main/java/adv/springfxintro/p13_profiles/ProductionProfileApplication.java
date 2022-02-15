package adv.springfxintro.p13_profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static adv.utils.Context.loadApplicationContextOf;

public class ProductionProfileApplication {

	public static void main(String[] args)
	throws Exception {
		System.setProperty("spring.profiles.active", "production, cryptography-enabled");

		ClassPathXmlApplicationContext context = loadApplicationContextOf(ProductionProfileApplication.class);

		new ProductionProfileApplication().run(context);

		context.close();
	}

	private void run(ApplicationContext context) {
		System.out.println(context.getBeansOfType(SomeBean.class).keySet());
	}

}
