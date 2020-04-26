package de.vf.telephonebook.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Contact {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ContactNumber> contactNumbers;

}
