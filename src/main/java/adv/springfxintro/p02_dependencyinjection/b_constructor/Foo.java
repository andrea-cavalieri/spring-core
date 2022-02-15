package adv.springfxintro.p02_dependencyinjection.b_constructor;

import adv.springfxintro.p02_dependencyinjection.Bar;

public class Foo {

	private Bar bar;

	public Foo(Bar bar) {
		this.bar = bar;
	}

}
