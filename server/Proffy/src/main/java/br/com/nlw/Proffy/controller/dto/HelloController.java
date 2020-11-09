package br.com.nlw.Proffy.controller.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody // nao navega para outra pagina
	public String hello() {
		return "Hello World!!?!!";
	}
	

}
