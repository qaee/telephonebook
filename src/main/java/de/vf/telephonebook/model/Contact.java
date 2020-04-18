package de.vf.telephonebook.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_contact")
@Data
public class Contact {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String phoneNumber;
}
