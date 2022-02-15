package adv.springfxintro.p05_multipleinstances;

public class Person {

	private String name;
	private Person father;
	private Person mother;

	public void setName(String name) {
		this.name = name;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public void present() {
		System.out.println("Hello, I am " + name);
		if (father != null && mother != null) {
			System.out.println("\t...my father is " + father.name + " and my mother is " + mother.name);
		}
	}

}
