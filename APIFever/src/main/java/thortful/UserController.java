package main.java.thortful;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody User getHobby(
			@RequestParam(value="username", required=false, defaultValue="Toto") String username,
			@RequestParam(value="hobby", required=false, defaultValue="Video games") String hobby){
		return new User(username, hobby);
	}
}
