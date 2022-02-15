package adv.springfxintro.p01_firstapp.b_spring;

public class ShipmentService {

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	/*
	 * Non più istanziato qui.
	 */
	private CustomerService customerService;

	private String test;

	/*
	 * Spring "inietterà" il bean di tipo CustomerService presente
	 * nell'Application Context.
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void shipPackages() {
		// Logica di spedizione ordini qui...

		for (String customerEmail : customerService.getCustomerEmails()) {
			customerService.notifyShipmentTo(customerEmail);
		}
	}

}
