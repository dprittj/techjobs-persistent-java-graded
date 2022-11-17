package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min=2, max=100, message="Location must be between 2 and 100 characters")
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer () { }

    public String getLocation() {
        return location;
    }

    public void setLocation(@Size(min=2, max=100, message="Location must be between 2 and 100 characters")String location) {
        this.location = location;
    }




}
