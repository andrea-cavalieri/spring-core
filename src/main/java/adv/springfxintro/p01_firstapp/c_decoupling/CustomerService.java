package adv.springfxintro.p01_firstapp.c_decoupling;

import java.util.List;

public interface CustomerService {

	void notifyShipmentTo(String receiver);

	List<String> getCustomerEmails();

}
