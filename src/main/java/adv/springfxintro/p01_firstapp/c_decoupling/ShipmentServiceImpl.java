package adv.springfxintro.p01_firstapp.c_decoupling;

public class ShipmentServiceImpl implements ShipmentService {

	private CustomerService customerService;

	/*
	 * Notare che ora CustomerService è un'interfaccia: ShipmentServiceImpl è disaccoppiata
	 * da CustomerServiceImpl e le due possono essere sostituite in modo indipendente
	 * l'una dall'altra semplicemente modificando l'Application Context.
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
