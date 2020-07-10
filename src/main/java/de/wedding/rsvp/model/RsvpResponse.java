package de.wedding.rsvp.model;

import lombok.Data;

import java.util.UUID;

@Data
public class RsvpResponse {
    private UUID id;
    private String name;
    private Diet diet;
    private boolean partner;
    private boolean friday;
    private boolean breakfast;
    private Integer children;

    public static enum Diet {
        MEAT, FISH, VEGETARIAN, VEGAN
    }

}
