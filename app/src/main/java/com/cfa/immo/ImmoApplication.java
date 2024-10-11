package com.cfa.immo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@SpringBootApplication
public class ImmoApplication {

	// On crée une route
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(){
		return "bonjour le CFA<br/><a href='/about'>about</a>";
	}

	// On crée une deuxieme route
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "Nous sommes sur about<br/><a href='/'>home</a>";
	}

	public static void main(String[] args) {
		SpringApplication.run(ImmoApplication.class, args);
	}

}
