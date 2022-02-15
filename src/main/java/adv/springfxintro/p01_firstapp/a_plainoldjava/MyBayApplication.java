package adv.springfxintro.p01_firstapp.a_plainoldjava;

public class MyBayApplication {

	private ShipmentService shipmentService = new ShipmentService();

	public static void main(String[] args) {
		MyBayApplication app = new MyBayApplication();

		app.shipmentService.shipPackages();
	}

}
