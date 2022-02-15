package adv.springfxintro.p12_componentscan.some.inner.location;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	public void describe() {
		System.out.println(this);
	}

}
