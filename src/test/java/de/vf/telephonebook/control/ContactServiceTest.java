package de.vf.telephonebook.control;

import de.vf.telephonebook.config.ContactConfig;
import de.vf.telephonebook.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(ContactConfig.class)
class ContactServiceTest {
@Autowired
    private ContactService contactService;
    /*@BeforeAll
    public void init(){
        System.out.println(contactRepository);
    }
*/
    @Test
    public void testFindAll() {

        Contact c = new Contact();
        c.setName("qasim");
        contactService.save(c);
        String name = contactService.listContacts().stream().findFirst().get().getName();
        System.out.println(name);
        Assertions.assertEquals("qasim",name);

    }
}
