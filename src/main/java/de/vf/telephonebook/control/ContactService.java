package de.vf.telephonebook.control;

import de.vf.telephonebook.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class ContactService {

    private ContactRepository contactRepository;
    private JdbcTemplate contactTemplate;

    public ContactService(ContactRepository contactRepository, DataSource dataSource) {
        this.contactRepository = contactRepository;
        this.contactTemplate = new JdbcTemplate(dataSource);
    }

    public Contact save(Contact contact) {
        System.out.println(contactTemplate);
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
