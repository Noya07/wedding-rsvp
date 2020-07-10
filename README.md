# wedding-rsvp
Wedding RSVP service using Spring 

## Idea

Now that I got engaged, the wedding planning is starting!
We have gathered the guest list and as a developer, I thought it would be a fun project to create an RSVP service to keep track of all the guests needs.

### Ground Rules
There are some things that I really do not want my guests to do, so here are some ground rules.
#### No Accounts
I don't want anyone creating accounts, usernames, password etc... \
**SOLUTION**: Easy, don't implement authentication ;)

### Personal
Even without accounts, I must identify users to keep track of each guest individually. Otherwise it's just a random list and if someone is bringing 14 children, I have no idea who to talk to! \
**SOLUTION**: Generate RSVP code which will be used as an identifier

### Easy to use
It should not be complicated to access your RSVP data.\
**SOLUTION**: Generate RSVP code for each guest, print the code on the invitation for computer users and a QR code with RSVP code for mobile users.


### Multi-lingual
We will have guests from all over the world. Although we only need German/English support, it does not take any effort to add extra translations so each guest feels more welcome! \
**SOLUTION**: Use the Spring i18n libraries to implement languages using `?lang=[locale]`

## Tech Stack
The tech stack will be very simple to make it as quick and smooth as possible:
* Spring MVC
* Gradle
* Thymeleaf
* Bootstrap
