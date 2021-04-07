package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Soldier;
import dmacc.repository.SoldierRepository;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Apr 1, 2021
 */

@Controller
public class WebController {
	@Autowired
	SoldierRepository repo;
	
	@GetMapping({"/", "/viewAllSoldiers"})
	public String viewAllSoldiers(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewSoldier(model);
		}
		model.addAttribute("soldiers", repo.findAll());
		return "soldierResults";
	}
	
	@GetMapping("/inputSoldier")
	public String addNewSoldier(Model model) {
		Soldier s = new Soldier();
		model.addAttribute("newSoldier", s);
		return "inputSoldier";
	}
	
	@PostMapping("/inputSoldier")
	public String addNewSoldier(@ModelAttribute Soldier s, Model model) {
		repo.save(s);
		return viewAllSoldiers(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateSoldier(@PathVariable("id") long id, Model model) {
		Soldier s = repo.findById(id).orElse(null);
		model.addAttribute("newSoldier", s);
		return "inputSoldier";
	}
	
	@PostMapping("/update/{id}")
	public String reviseSoldier(Soldier s, Model model) {
		repo.save(s);
		return viewAllSoldiers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteSoldier(@PathVariable("id") long id, Model model) {
		Soldier s = repo.findById(id).orElse(null);
		repo.delete(s);
		return viewAllSoldiers(model);
	}
}
