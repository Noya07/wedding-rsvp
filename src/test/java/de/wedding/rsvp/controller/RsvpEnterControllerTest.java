package de.wedding.rsvp.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest
public class RsvpEnterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testRsvpPage() throws Exception {
        mockMvc.perform(get("/rsvp"))
                .andExpect(status().isOk())
                .andExpect(view().name("rsvp"))
                .andExpect(content().string(
                        containsString("Welcome!")));
    }
}
