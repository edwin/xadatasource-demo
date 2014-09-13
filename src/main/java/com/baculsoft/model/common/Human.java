/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.baculsoft.model.common;

import com.baculsoft.demo.common.Base;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Administrator
 */
@MappedSuperclass
public abstract class Human extends Base{
    private String firstName;
    private String middleName;
    private String lastName;

    public Human() {
    }

    
    /**
     * 
     * @param firstName
     * @param middleName
     * @param lastName
     * @param createdDate
     * @param modifDate
     * @param createdBy
     * @param modifBy
     * @param versioning 
     */
    public Human(String firstName, String middleName, String lastName, Long createdDate, Long modifDate, String createdBy, String modifBy, Short versioning) {
        super(createdDate, modifDate, createdBy, modifBy, versioning);
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * 
     * @param firstName
     * @param middleName
     * @param lastName
     * @param modifDate
     * @param modifBy
     * @param versioning 
     */
    public Human(String firstName, String middleName, String lastName, Long modifDate, String modifBy, Short versioning) {
        super(modifDate, modifBy, versioning);
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * 
     * @param firstName
     * @param middleName
     * @param lastName
     * @param createdBy 
     */
    public Human(String firstName, String middleName, String lastName, String createdBy) {
        super(createdBy);
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * 
     * @param firstName
     * @param middleName
     * @param lastName
     * @param other 
     */
    public Human(String firstName, String middleName, String lastName, Base other) {
        super(other);
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Column(length = 20)    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(length = 20)        
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(length = 20)            
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 67 * hash + (this.middleName != null ? this.middleName.hashCode() : 0);
        hash = 67 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if ((this.middleName == null) ? (other.middleName != null) : !this.middleName.equals(other.middleName)) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Human{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + '}';
    }
    
    
        
}
