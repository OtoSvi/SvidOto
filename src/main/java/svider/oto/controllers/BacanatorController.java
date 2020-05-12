package svider.oto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import svider.oto.service.BacanatorService;

@Controller
public class BacanatorController {

	@Autowired
	BacanatorService bacanatorService;

	@RequestMapping("/give-me-bacon/{howmuch}")
	public String giveMeBacon(@PathVariable int howmuch, Model model) {
		model.addAttribute("BACON", bacanatorService.bacanatorServiceMethod(howmuch));
		return "result-page";
	}

}
