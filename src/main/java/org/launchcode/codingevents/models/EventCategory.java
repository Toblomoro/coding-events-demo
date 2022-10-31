package org.launchcode.codingevents.models;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventCategory {
@Id
@GeneratedValue
    public int id;
    public String name;

    public EventCategory() {
    }

    public EventCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
