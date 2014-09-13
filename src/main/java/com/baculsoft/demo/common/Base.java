/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baculsoft.demo.common;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Administrator
 */
@MappedSuperclass
public abstract class Base implements Serializable, Cloneable {

    public final Short INIT_VERSION = Short.valueOf("0");

    protected Long createdDate;
    protected Long modifDate;
    protected String createdBy;
    protected String modifBy;
    protected Short versioning;

    public Base() {
        versioning = INIT_VERSION;
    }

    /**
     *
     * @param modifDate
     * @param modifBy
     * @param versioning
     */
    public Base(final Long modifDate, final String modifBy, final Short versioning) {
        this.modifDate = modifDate;
        this.modifBy = modifBy;
        this.versioning = versioning;
    }

    /**
     *
     * @param createdDate
     * @param modifDate
     * @param createdBy
     * @param modifBy
     * @param versioning
     */
    public Base(final Long createdDate, final Long modifDate, final String createdBy, final String modifBy, final Short versioning) {
        this.createdDate = createdDate;
        this.modifDate = modifDate;
        this.createdBy = createdBy;
        this.modifBy = modifBy;
        this.versioning = versioning;
    }

    /**
     *
     * @param createdBy
     */
    public Base(final String createdBy) {
        this.createdBy = createdBy;
        this.createdDate = System.currentTimeMillis();
        this.versioning = INIT_VERSION;
    }

    /**
     *
     * @param other
     */
    public Base(Base other) {
        this.createdBy = other.createdBy;
        this.createdDate = other.createdDate;
        this.modifBy = other.modifBy;
        this.modifDate = other.modifDate;
        this.versioning = other.versioning;
    }

    /**
     *
     * @return createdDate
     */
    @Column(length = 14, updatable = false)
    public Long getCreatedDate() {
        return createdDate;
    }

    /**
     *
     * @param createdDate
     */
    public void setCreatedDate(final Long createdDate) {
        this.createdDate = createdDate;
    }

    /**
     *
     * @return modifDate
     */
    @Column(length = 14, insertable = false)
    public Long getModifDate() {
        return modifDate;
    }

    /**
     *
     * @param modifDate
     */
    public void setModifDate(final Long modifDate) {
        this.modifDate = modifDate;
    }

    /**
     *
     * @return createdBy
     */
    @Column(length = 20, updatable = false)
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     *
     * @param createdBy
     */
    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     *
     * @return modifBy
     */
    @Column(length = 20, insertable = false)
    public String getModifBy() {
        return modifBy;
    }

    /**
     *
     * @param modifBy
     */
    public void setModifBy(final String modifBy) {
        this.modifBy = modifBy;
    }

    /**
     *
     * @return versioning
     */
    @Column
    public Short getVersioning() {
        return versioning;
    }

    /**
     *
     * @param versioning
     */
    public void setVersioning(final Short versioning) {
        this.versioning = versioning;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.createdDate != null ? this.createdDate.hashCode() : 0);
        hash = 73 * hash + (this.modifDate != null ? this.modifDate.hashCode() : 0);
        hash = 73 * hash + (this.createdBy != null ? this.createdBy.hashCode() : 0);
        hash = 73 * hash + (this.modifBy != null ? this.modifBy.hashCode() : 0);
        hash = 73 * hash + (this.versioning != null ? this.versioning.hashCode() : 0);
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
        final Base other = (Base) obj;
        if (this.createdDate != other.createdDate && (this.createdDate == null || !this.createdDate.equals(other.createdDate))) {
            return false;
        }
        if (this.modifDate != other.modifDate && (this.modifDate == null || !this.modifDate.equals(other.modifDate))) {
            return false;
        }
        if ((this.createdBy == null) ? (other.createdBy != null) : !this.createdBy.equals(other.createdBy)) {
            return false;
        }
        if ((this.modifBy == null) ? (other.modifBy != null) : !this.modifBy.equals(other.modifBy)) {
            return false;
        }
        if (this.versioning != other.versioning && (this.versioning == null || !this.versioning.equals(other.versioning))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Base{" + "createdDate=" + createdDate + ", modifDate=" + modifDate + ", createdBy=" + createdBy + ", modifBy=" + modifBy + ", versioning=" + versioning + '}';
    }
    
    
}
