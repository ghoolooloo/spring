package jo.spring.rest.consumingrest;

import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumingRest implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(ConsumingRest.class);

	@Override
	public void run(String... args) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
