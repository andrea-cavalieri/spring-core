package adv.springfxintro.p11_annotations.b_autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Foo {

	/*
	 * Autowiring by-type (Bar).
	 */
	@Autowired
	private Bar theBar;

	/*
	 * Autowiring by-name (alpha).
	 */
	@Autowired
	private Object alpha;

	/*
	 * Autowiring by-type (Baz) & by-name (bravo).
	 */
	@Autowired
	private Baz bravo;

	public void describe() {
		String thisName = this.getClass().getSimpleName();
		System.out.println(thisName + " knows " + theBar.getClass().getSimpleName());
		System.out.println(thisName + " knows " + ((Baz) alpha).getName());
		System.out.println(thisName + " knows " + bravo.getName());
	}

}
