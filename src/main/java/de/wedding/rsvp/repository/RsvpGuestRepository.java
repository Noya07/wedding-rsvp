package de.wedding.rsvp.repository;

import de.wedding.rsvp.model.Guest;

public interface RsvpGuestRepository {

    Guest getByRsvpCode(String rsvpCode);

}
