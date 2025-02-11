package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {


    Person newOnwer;
    Long id;


    public Animal() {
        this.newOnwer = new Person();
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */


    public Animal(Long id, Person owner) {
        this.id = id;
        this.newOnwer = owner;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return this.newOnwer;
    }

    public void setOwner(Person owner) {
        this.newOnwer = owner;
    }

    public Address getAddress() {
        return this.newOnwer.getAddress();
    }
}
