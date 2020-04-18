package de.vf.telephonebook.control;

import de.vf.telephonebook.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

        Contact findByName(String name);
        List<Contact> findAllByName(String name);
        @Query("select c from Contact c ")
        List<Contact> findContacts();
}
