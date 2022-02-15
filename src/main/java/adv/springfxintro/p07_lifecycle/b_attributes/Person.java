package adv.springfxintro.p07_lifecycle.b_attributes;

public class Person {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void present() {
		System.out.println(name + " is alive");
	}

	public void born() {
		System.out.println(name + " is born");
	}

	public void die() {
		System.out.println(name + " has died");
	}

}
