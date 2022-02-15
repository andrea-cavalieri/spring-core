package adv.springfxintro.p14_resources;

import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class MyResourceReader {

	/*
	 * Al componente non interessa sapere dove la risorsa risieda fisicamente.
	 */
	private Resource resource;

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String read() {
		InputStream inputStream = null;
		try {
			inputStream = resource.getInputStream();
			return StreamUtils.copyToString(inputStream, Charset.defaultCharset());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
				}
			}
		}
	}

}
