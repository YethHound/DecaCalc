package main.java.decacalc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcController {
	@GetMapping("/decacalc")
    public String showPage(Model model) {
    	model.addAttribute("eventModel", new EventModel());
    	return "decacalc";
    }
    
    @PostMapping("/decacalc")
    public String calcPoints(@ModelAttribute EventModel eventModel) {
    	eventModel.setPoints(PointCalculator.points(eventModel.getEventName(), eventModel.getResult()));
    	return "result";
    }
}
