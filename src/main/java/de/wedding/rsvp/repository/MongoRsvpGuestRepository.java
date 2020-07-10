package de.wedding.rsvp.repository;

import com.mongodb.client.MongoClients;
import de.wedding.rsvp.model.Guest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Repository
public class MongoRsvpGuestRepository implements RsvpGuestRepository {

    @Override
    public Guest getByRsvpCode(String rsvpCode) {
        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "rsvp");
        Guest guest = mongoOps.findOne(new Query(where("rsvpCode").is(rsvpCode)), Guest.class);
        mongoOps.dropCollection("rsvp");
        return guest;
    }
}
