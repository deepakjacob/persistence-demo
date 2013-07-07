package persistence.demo.entity;

import java.util.Date;

/**
 * Represents a employee entity in the system.
 */
public class Employee extends Entity {

    private static final long serialVersionUID = 1L;
    private Name name;
    private Phone landPhone;
    private Band band;
    /**
     * Date of joining the project *
     */
    private Date doj;
    /**
     * Date of leaving the project *
     */
    private Date dol;
    private String bloodGroup;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Phone getLandPhone() {
        return landPhone;
    }

    public void setLandPhone(Phone landPhone) {
        this.landPhone = landPhone;
    }



    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Date getDol() {
        return dol;
    }

    public void setDol(Date dol) {
        this.dol = dol;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}