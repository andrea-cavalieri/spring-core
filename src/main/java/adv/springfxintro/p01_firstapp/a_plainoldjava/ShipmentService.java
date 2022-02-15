package adv.springfxintro.p01_firstapp.a_plainoldjava;

public class ShipmentService {

	/*
	 * Notare questa creazione di "service delegate". Essendo cablata nel codice, crea forte accoppiamento fra le due
	 * classi. Essendo inoltre nascosta dall'ambiente esterno, rende difficile testare ShipmentService o pilotarne
	 * completamente il comportamento.
	 */
	private CustomerService customerService = new CustomerService();

	public void shipPackages() {
		// Logica di spedizione ordini qui...

		for (String customerEmail : customerService.getCustomerEmails()) {
			customerService.notifyShipmentTo(customerEmail);
		}
	}

}
