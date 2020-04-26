package de.vf.telephonebook.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ContactNumber {

    @Id
    @GeneratedValue
    private Integer id;
    private String telephoneNumber;
    private Enum ContactType;
}
