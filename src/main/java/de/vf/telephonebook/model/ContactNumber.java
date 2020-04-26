package de.vf.telephonebook.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ContactNumber {

    @Id
    @GeneratedValue
    private Integer id;
    private String telephoneNumber;
    private Enum ContactType;
}
