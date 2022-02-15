package adv.springfxintro.p13_profiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static adv.utils.Context.loadApplicationContextOf;

public class TestProfileApplication {

	public static void main(String[] args)
	throws Exception {
		System.setProperty("spring.profiles.active", "test, debugging-enabled");

		ClassPathXmlApplicationContext context = loadApplicationContextOf(TestProfileApplication.class);

		new TestProfileApplication().run(context);

		context.close();
	}

	private void run(ApplicationContext context) {
		System.out.println(context.getBeansOfType(SomeBean.class).keySet());
	}

}
