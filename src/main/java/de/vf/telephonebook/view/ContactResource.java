package de.vf.telephonebook.view;

import de.vf.telephonebook.control.ContactService;
import de.vf.telephonebook.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "contact" )
public class ContactResource {

    @Autowired
    private ContactService contactService;

  /*  @GetMapping
    public Contact find(@RequestParam String name){
        return contactService.findByName(name);
    }*/
    /*@GetMapping("{id}")
    public Contact findById(@PathVariable Integer id){
        return contactService.findById(id);
    }
    @GetMapping("all")*/
   // @RolesAllowed("2020")

    /*@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public   void find(@RequestBody Contact contact) {
        contactService.save(contact);
    }*/
    /*@PostConstruct
    private void init() {
        Contact c = new Contact();
        c.setName("qasim");
        ContactNumber cn = new ContactNumber();
        cn.setContactType(ContactType.WORK);
        cn.setTelephoneNumber("123334e");
        c.setContactNumbers(Arrays.asList(cn));
        contactService.save(c);
    }*/
    @GetMapping
    public List<Contact> findAll() {
        List<Contact> contacts = contactService.listContacts();
        return contacts;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contact add(@RequestBody Contact contact){
        return contactService.save(contact);
    }
}
