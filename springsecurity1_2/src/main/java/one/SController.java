package one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SController {
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}

	
}
