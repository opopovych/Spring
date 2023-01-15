package com.example.les18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.les18.domain.Participant;
import com.example.les18.service.ServiceLayer;

@Controller
public class ParticipantControler {

	@Autowired
	private ServiceLayer serviceLayer;


	@GetMapping("/")
	public String show(Model model) {
		model.addAttribute("participants", serviceLayer.findAll());

		return "all";
	}

	@GetMapping("/addParticipant")
	public String create(Model model) {
Participant participant = new Participant();
model.addAttribute("participant", participant);
		return "create";
	}

	@PostMapping("/addParticipant")
	public String createParticipant(@ModelAttribute("participant") Participant participant) {
		serviceLayer.create(participant);



		return "redirect:/";
	}
	@GetMapping("/update/{id}")
	public String update(@PathVariable(value = "id") int id,Model model) {
		Participant participant = serviceLayer.findOne(id);

		model.addAttribute("participant", participant);


		return "update";
	}
	@PostMapping("/updatePost")
	public String updatePost(@ModelAttribute("participant") Participant participant) {


		serviceLayer.update(participant);


		return "redirect:/";
	}
	@GetMapping("/{id}/delete")
	public String deleteParticipant(@PathVariable(value = "id") int id, Model model) {
		serviceLayer.delete(id);
		model.addAttribute("participants", serviceLayer.findAll());

		return "redirect:/";
	}
}
