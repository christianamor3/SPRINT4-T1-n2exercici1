package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t01.n02.S04T01N02AmorLopezChristian.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	@ResponseBody
	public static String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
		return "Hola "+nom+". Estas executant un projecte Gradle";
	}
	
	@GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
	public static String saluda2(@PathVariable(required = false) String nom) {
		return "Hola "+nom+". Estas executant un projecte Gradel";
	}
}
	