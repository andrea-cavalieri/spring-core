package adv.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context {

	public static ClassPathXmlApplicationContext loadApplicationContextOf(Class<?> clazz) {
		return new ClassPathXmlApplicationContext(applicationXmlFor(clazz));
	}

	private static String applicationXmlFor(Class<?> clazz) {
		return clazz.getPackage().getName().replace('.', '/') + "/application.xml";
	}

}
