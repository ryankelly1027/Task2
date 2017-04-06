package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumbersController {

	@GetMapping("/numbers")
	public String numbersForm(Model model) {
		model.addAttribute("numbers", new Numbers());
		return "numbers";
	}
	
	@PostMapping("/numbers")
	public String numbersSubmit(@ModelAttribute Numbers numbers) {
		
		
		numbers.setNum1(5);
		numbers.setNum2(5);
		return "result";
	}
	
	@GetMapping("/result")
	public void getSum(Model model) {
		
	}
}