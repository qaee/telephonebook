package de.vf.telephonebook.control;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


class ContactServiceTest {

    private ContactRepository contactRepository;
    /*@BeforeAll
    public void init(){
        System.out.println(contactRepository);
    }
*/
    @Test
    public void testFindAll() {
        System.out.println(contactRepository);
    }
}
