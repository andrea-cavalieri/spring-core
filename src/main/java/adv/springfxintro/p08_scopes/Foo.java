package adv.springfxintro.p08_scopes;

public class Foo {

	private Bar delegate;

	public void setDelegate(Bar delegate) {
		this.delegate = delegate;
	}

	public String getMessage() {
		return "My delegate is: " + delegate;
	}

}
