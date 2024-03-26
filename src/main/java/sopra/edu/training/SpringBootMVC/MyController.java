package sopra.edu.training.SpringBootMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class MyController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public ModelAndView start() {
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping("/index")
	public ModelAndView index(int n1,int n2,String calc) {
		ModelAndView mv = new ModelAndView();
		int res = service.calculate(n1, n2, calc);
		mv.addObject("msg","The result for "+calc+" is "+ res);
		mv.setViewName("index.jsp");
		return mv;
			
	}
	
}
