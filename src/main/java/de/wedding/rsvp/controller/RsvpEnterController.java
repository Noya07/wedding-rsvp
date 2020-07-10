package de.wedding.rsvp.controller;

import de.wedding.rsvp.model.RsvpCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rsvp")
@Slf4j
public class RsvpEnterController {

    @GetMapping
    public String rsvpShowCodeEntry(Model model){
        model.addAttribute(new RsvpCode());
        return "rsvp";
    }

    @PostMapping
    public String processRsvpCode(RsvpCode rsvpCode){
        return "redirect:/rsvp/" + rsvpCode.getCode().trim();
    }
}
