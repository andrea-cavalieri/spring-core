package adv.springfxintro.p07_lifecycle.a_interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void present() {
		System.out.println(name + " is alive");
	}

	public void afterPropertiesSet()
	throws Exception {
		System.out.println(name + " is born");
	}

	public void destroy()
	throws Exception {
		System.out.println(name + " has died");
	}

}
