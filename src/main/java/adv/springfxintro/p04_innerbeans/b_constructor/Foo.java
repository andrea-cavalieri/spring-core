package adv.springfxintro.p04_innerbeans.b_constructor;

import adv.springfxintro.p04_innerbeans.Bar;

public class Foo {

	private Bar delegate;

	public Foo(Bar delegate) {
		this.delegate = delegate;
	}

	public void printGreetings() {
		System.out.println("My delegate says: " + delegate.getMessage());
	}

}
