package adv.springfxintro.p01_firstapp.b_spring;

import java.util.Arrays;
import java.util.List;

public class CustomerService {

	public void notifyShipmentTo(String receiver) {
		// Logica di invio notifiche qui...

		System.out.println("Shipment notification sent to " + receiver);
	}

	public List<String> getCustomerEmails() {
		return Arrays.asList("johndoe@example.com", "janedoe@example.com");
	}

}
