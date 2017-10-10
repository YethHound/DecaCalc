package main.java.decacalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	
	@RequestMapping("/apicalc")
	public double points(@RequestParam(value="result") Double result, @RequestParam(value="eventName") String eventName) {
        return PointCalculator.points(eventName, result);
    }

}