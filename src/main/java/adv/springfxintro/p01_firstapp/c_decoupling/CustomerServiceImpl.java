package adv.springfxintro.p01_firstapp.c_decoupling;

import java.util.Arrays;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

	public void notifyShipmentTo(String receiver) {
		// Logica di invio notifiche qui...

		System.out.println("Shipment notification sent to " + receiver);
	}

	public List<String> getCustomerEmails() {
		return Arrays.asList("johndoe@example.com", "janedoe@example.com");
	}

}
