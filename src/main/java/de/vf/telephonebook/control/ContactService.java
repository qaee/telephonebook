package de.vf.telephonebook.control;

import de.vf.telephonebook.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact save(Contact contact) {
         return contactRepository.save(contact);
    }
    public Contact findByName(String name) {
        return contactRepository.findByName(name);
    }
    public Contact findById(Integer id){
        return contactRepository.findById(id).get();
    }
    public List<Contact> listContacts() {
        return contactRepository.findAll();
    }
}
