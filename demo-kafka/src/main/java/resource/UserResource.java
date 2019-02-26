package resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")

public class UserResource {

	private static final String TOPIC = "kafka_Example";

	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {
		return "Published successfuly";
	}

	public static String getTopic() {
		return TOPIC;
	}

}
