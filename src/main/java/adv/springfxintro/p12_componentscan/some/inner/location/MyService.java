package adv.springfxintro.p12_componentscan.some.inner.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	private MyRepository repository;

	public void describe() {
		System.out.println(this);
		System.out.println("\tdelegates to: " + repository);
	}

}
