package adv.springfxintro.p04_innerbeans.a_property;

import adv.springfxintro.p04_innerbeans.Bar;

public class Foo {

	private Bar delegate;

	public void setDelegate(Bar delegate) {
		this.delegate = delegate;
	}

	public void printGreetings() {
		System.out.println("My delegate says: " + delegate.getMessage());
	}

}
