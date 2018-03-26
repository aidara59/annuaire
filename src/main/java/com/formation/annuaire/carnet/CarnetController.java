package com.formation.annuaire.carnet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CarnetController {

	List<Carnet> listeCarnets = new ArrayList<Carnet>(Arrays.asList(
			new Carnet(1, Civilite.MONSIEUR, "Besson", "Luc", "1959-13-18", "0000000000", "5 avenue de l'Element",
					"75015", "Paris"),
			new Carnet(2, Civilite.MADAME, "Ullmann", "Liv", "1938-12-16", "0101010101", "1-16-5", "22", "Tokyo"),
			new Carnet(3, Civilite.MONSIEUR, "Lynch", "David", "1946-01-20", "0202020202", "423 Fire Terrace", "59801",
					"Missoula")));

	@GetMapping("/carnets")
	public List<Carnet> getAllRest() {
		return this.listeCarnets;
	}

	@GetMapping("/carnetshtml")
	public ModelAndView getAll(Model model) {
		ModelAndView mav = new ModelAndView("pages/carnets");
		mav.addObject("liste", listeCarnets);
		return mav;

	}

	@RequestMapping(value = "/carnets/{id}", method = RequestMethod.GET)
	public Carnet getById(@PathVariable Integer id) {
		for (Carnet c : this.listeCarnets) {
			if (((Integer) c.getId()).equals(id)) {
				return c;
			}
		}
		return null; 
	}
	@RequestMapping(value="/carnets" , method= RequestMethod.POST)
	public void add(@RequestBody Carnet carnet) {
	this.listeCarnets.add(carnet);
	
	}
@GetMapping(value="/formulaire")
public ModelAndView form (Model model) {
	ModelAndView mav = new ModelAndView("carnets/formulaire");
	mav.addObject("liste", listeCarnets);
	return mav;

}

}
