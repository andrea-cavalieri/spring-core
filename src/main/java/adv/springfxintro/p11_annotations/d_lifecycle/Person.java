package adv.springfxintro.p11_annotations.d_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void present() {
		System.out.println(name + " is alive");
	}

	@PostConstruct
	public void born() {
		System.out.println(name + " is born");
	}

	@PreDestroy
	public void die() {
		System.out.println(name + " has died");
	}

}
