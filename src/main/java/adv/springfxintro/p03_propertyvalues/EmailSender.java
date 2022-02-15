package adv.springfxintro.p03_propertyvalues;

public class EmailSender {

	private String  server;
	private int     port;
	private boolean deliveryNotification;

	public void setServer(String server) {
		this.server = server;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setDeliveryNotification(boolean deliveryNotification) {
		this.deliveryNotification = deliveryNotification;
	}

	public void send(String recipient, String message) {
		// Logica di invio mail qui...

		System.out.println("Recipient: " + recipient);
		System.out.println("Sent message: " + message);
		System.out.println("Using server: " + server);
		System.out.println("Using port: " + port);
		System.out.println("Request delivery notification: " + deliveryNotification);
	}

}
