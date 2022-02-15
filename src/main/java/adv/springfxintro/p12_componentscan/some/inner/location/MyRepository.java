package adv.springfxintro.p12_componentscan.some.inner.location;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public void describe() {
		System.out.println(this);
	}

}
