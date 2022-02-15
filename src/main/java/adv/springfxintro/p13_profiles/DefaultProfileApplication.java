package adv.springfxintro.p13_profiles;

import static adv.utils.Context.loadApplicationContextOf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultProfileApplication {

	public static void main(String[] args) throws Exception {

		// TODO Cosa succede decommentando questa riga?
		System.setProperty("spring.profiles.default", "production");

		ClassPathXmlApplicationContext context = loadApplicationContextOf(DefaultProfileApplication.class);

		new DefaultProfileApplication().run(context);

		context.close();
	}

	private void run(ApplicationContext context) {
		System.out.println(context.getBeansOfType(SomeBean.class).keySet());
	}

}
