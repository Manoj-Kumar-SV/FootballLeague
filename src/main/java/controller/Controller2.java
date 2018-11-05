package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controller2 {
@GetMapping("/hello")
public String helloworld()
{
	return "Demo.html";
}
}
