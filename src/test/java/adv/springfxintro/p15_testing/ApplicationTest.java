package adv.springfxintro.p15_testing;

import adv.springfxintro.p01_firstapp.c_decoupling.CustomerService;
import adv.springfxintro.p01_firstapp.c_decoupling.ShipmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static java.util.Collections.singletonList;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@ContextConfiguration({"application.xml"})
@ActiveProfiles({"test"})
public class ApplicationTest {

	@Autowired
	private ShipmentService shipmentService;

	@Autowired
	private CustomerService customerService;

	@Test
	public void shipmentNotificationIsSent() {
		doReturn(singletonList("test@email.com")).when(customerService).getCustomerEmails();

		shipmentService.shipPackages();

		verify(customerService).notifyShipmentTo("test@email.com");
	}

}
