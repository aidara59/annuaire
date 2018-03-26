package com.formation.annuaire.home;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Home {

	@GetMapping("/")
	@ResponseBody
	public String index() {

		return "<h>bonjour les amis </h>";
	}

	@GetMapping("/test")
	public String index2(@RequestParam(required= false, defaultValue= "defaut") String name, Model model ) {
		model.addAttribute("name", name);
		return "index";

	}
}
