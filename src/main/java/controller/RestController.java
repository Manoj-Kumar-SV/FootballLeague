package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@RequestMapping(value="/addStudent",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE ,produces=MediaType.TEXT_PLAIN_VALUE)
	String addStudent(@RequestBody Student st)
	{
		return "I got "+st.getFname();
	}
	
	@GetMapping("/hey")
	String saysHey()
	{
		return "Say Hey";
	}
	
	
}
