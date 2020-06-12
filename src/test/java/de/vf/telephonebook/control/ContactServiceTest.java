package de.vf.telephonebook.control;

import de.vf.telephonebook.config.ContactConfig;
import de.vf.telephonebook.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ContactConfig.class)
class ContactServiceTest {

    @Autowired
    private ContactService contactService;

    @Test
    public void testFindAll() {
        Contact c = new Contact();
        c.setName("qasim");
        contactService.save(c);
        String name = contactService.listContacts().stream().findFirst().get().getName();
        System.out.println(name);
        Assertions.assertEquals("qasim",name);

    }
    @Test
    public void testJdbcTemplate() {

    }
}
