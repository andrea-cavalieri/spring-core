package adv.springfxintro.p12_componentscan;

import adv.springfxintro.p12_componentscan.some.inner.location.MyComponent;
import adv.springfxintro.p12_componentscan.some.inner.location.MyRepository;
import adv.springfxintro.p12_componentscan.some.inner.location.MyService;
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
		MyComponent component = context.getBean(MyComponent.class);
		MyService service = context.getBean(MyService.class);
		MyRepository repository = context.getBean(MyRepository.class);

		component.describe();
		service.describe();
		repository.describe();
	}

}
