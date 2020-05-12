package svider.oto.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConnectionOfInput {
	static final String URL = "https://baconipsum.com/api/?type=all-meat&paras=1";

	public String connectionOfInput() {
		RestTemplate resttemplate = new RestTemplate();
		URI uri = null;
		try {
			uri = new URI(URL);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		ResponseEntity<String> response = resttemplate.getForEntity(uri, String.class);
		return response.getBody();
	}
}