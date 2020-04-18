package de.vf.telephonebook.view;

import de.vf.telephonebook.control.ContactService;
import de.vf.telephonebook.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactResource {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public Contact find(@RequestParam String name){
        return contactService.findByName(name);
    }
    @GetMapping("{id}")
    public Contact findById(@PathVariable Integer id){
        return contactService.findById(id);
    }
    @GetMapping("all")
    @RolesAllowed("2020")
    public List<Contact> findAll() {
        List<Contact> contacts = contactService.listContacts();
        return contacts;
    }
    @PostMapping
    public Contact add(@RequestBody Contact contact){
        return contactService.save(contact);
    }
}
