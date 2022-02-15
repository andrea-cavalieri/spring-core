package adv.springfxintro.p11_annotations.a_value;

import org.springframework.beans.factory.annotation.Value;

public class EmailSender {

	/*
	 * Valore prelevato da file di properties.
	 */
	@Value("${smtp.server.name}")
	private String server;

	/*
	 * Valore da properties o valore di default.
	 */
	@Value("${simulate.missing.property.smtp.server.port:25}")
	private int port;

	/*
	 * Valore costante.
	 */
	@Value("false")
	private boolean deliveryNotification;

	public void send(String recipient, String message) {
		// Logica di invio mail qui...

		System.out.println("Recipient: " + recipient);
		System.out.println("Sent message: " + message);
		System.out.println("Using server: " + server);
		System.out.println("Using port: " + port);
		System.out.println("Request delivery notification: " + deliveryNotification);
	}

}
