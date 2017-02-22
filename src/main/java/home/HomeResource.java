package home;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class HomeResource {
	@RequestMapping(value = "/getPerson", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String home() {
        return "Hello Docker World";
    }

}
