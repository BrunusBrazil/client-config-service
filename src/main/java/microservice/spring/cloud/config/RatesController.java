package microservice.spring.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatesController {

	@Value("${rate}")
	private String rate;

	@Value("${lanecount}")
	private String laneCount;
	
	@Value("${tollstart}")
	private String tollStart;

	@RequestMapping(value="/rates", method=RequestMethod.GET)
	public String getRates(){
		System.out.println("rates: "+rate+" LaneCOunt: "+laneCount+" tollCount: "+tollStart);
		return "index";
	}
	
}
