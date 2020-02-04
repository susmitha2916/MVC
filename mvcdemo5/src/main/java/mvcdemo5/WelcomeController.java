package mvcdemo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class WelcomeController {
	@RequestMapping(value="/listemp")

	public String listEmp(){
		return "listemp";
	}
	@RequestMapping(value="/saveemp")
	public String saveEmp(){
		return "saveemp";
	}
	@RequestMapping(value="p")
	@ResponseBody
	String anyName() {
		
		
		return "hahahahah";
	}
}

