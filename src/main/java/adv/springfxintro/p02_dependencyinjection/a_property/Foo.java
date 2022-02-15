package adv.springfxintro.p02_dependencyinjection.a_property;

import adv.springfxintro.p02_dependencyinjection.Bar;

public class Foo {

	private Bar bar;

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public String scriviPotenza() {
		return "Potenza motore" + bar.getPotenza();
	}

}
