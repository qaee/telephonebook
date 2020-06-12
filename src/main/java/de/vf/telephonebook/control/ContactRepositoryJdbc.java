package de.vf.telephonebook.control;

import de.vf.telephonebook.model.Contact;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContactRepositoryJdbc {

    private JdbcTemplate  contactTemplate;

    public ContactRepositoryJdbc(DataSource dataSource) {
        this.contactTemplate = new JdbcTemplate(dataSource);
    }

    public void addContact() {
        //contactTemplate.per
    }

    public List<Contact> getContacts() {
        return new ArrayList<>();
    }
}
