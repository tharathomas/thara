package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomController {
	@RequestMapping("/Login")
	public String showLoginpage(){
		return "Login";
	}


@PostMapping("/Insert")
public String insert(Model model,@ModelAttribute("name")String name,@ModelAttribute("rollno")String rollno,@ModelAttribute("address")String address,HttpServletRequest req){
	System.out.println("name="+name);
	System.out.println("rollno="+rollno);
	System.out.println("address="+address);
	model.addAttribute("message","User account is correct.");
	return  "show";
}
@PostMapping("/create")
public String create(Model model,@ModelAtttribute("student")Student student,HttpServletRequest req)
System.out.println("name="+student.getName());
model.addAttribute("message",student.getName()+""+student.getRollno()+""+student.getAddress());
return"show";
}
}
