package test.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class springfirst {
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message","hello Spring MVC Framework!");
		return "hello";
	}
}
