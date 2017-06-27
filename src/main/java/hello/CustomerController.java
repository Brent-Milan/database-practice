package hello;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.CustomerRepository;

@Controller
public class CustomerController {
	
	@Resource
	CustomerRepository repository;

		
	@RequestMapping("/customers")
	public String fetchCustomers(Model model) {
		model.addAttribute("customersAsCollection", repository.findAll());
		return "customers";
	}
	
//	@RequestMapping("/onereview")
//    public String fetchOne(@RequestParam(value="id") Long id, Model model) {
//         model.addAttribute("onereview", repository.findOne(id));
//         return "onereview";
//     }
//}
}
