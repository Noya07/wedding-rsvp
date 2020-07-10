package de.wedding.rsvp.controller;

import de.wedding.rsvp.model.Guest;
import de.wedding.rsvp.model.RsvpResponse;
import de.wedding.rsvp.repository.RsvpGuestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/rsvp/{code}")
public class RsvpGuestController {

    private final RsvpGuestRepository rsvpGuestRepository;

    @Autowired
    public RsvpGuestController (RsvpGuestRepository rsvpGuestRepository) {
        this.rsvpGuestRepository = rsvpGuestRepository;
    }

    @GetMapping
    public String retrieveGuestFromRsvpCode(@PathVariable String code, Model model){
        Guest guest = rsvpGuestRepository.getByRsvpCode(code);
        if(guest == null){
            return "guest404";
        }
        model.addAttribute(guest);
        model.addAttribute(new RsvpResponse());
        return "rsvpGuest";
    }

    @PostMapping
    public String submitRsvpResponse(RsvpResponse rsvpResponse){
        return "redirect:/rsvp";
    }
}
