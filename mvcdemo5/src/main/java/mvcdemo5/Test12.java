package mvcdemo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class Test12 {
	@RequestMapping("/hello")
	public ModelAndView hello1(){    	
    	return new ModelAndView("hello");
    }
	  
	   @RequestMapping("/add")
	    public ModelAndView hello(){    	
	    	return new ModelAndView("welcomeadd");
	    }
	 }
