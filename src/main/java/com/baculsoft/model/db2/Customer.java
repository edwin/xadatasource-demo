/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.baculsoft.model.db2;

import com.baculsoft.demo.common.Base;
import com.baculsoft.model.common.Human;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;
import org.hibernate.annotations.SelectBeforeUpdate;

/**
 *
 * @author Administrator
 */
@Entity
@OptimisticLocking(type = OptimisticLockType.NONE)
@SelectBeforeUpdate(false)
@DynamicInsert(true)
@DynamicUpdate(true)
@BatchSize(size = 100)
public class Customer extends Human{
    private String cif;
    private String productCode;
    private String currencyCode;
    private BigDecimal balance;
    private BigDecimal outstandingBalance;
    private Integer status;

    public Customer() {
    }

    
    /**
     * 
     * @param cif
     * @param productCode
     * @param currencyCode
     * @param balance
     * @param outstandingBalance
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param createdDate
     * @param modifDate
     * @param createdBy
     * @param modifBy
     * @param versioning 
     */
    public Customer(String cif, String productCode, String currencyCode, BigDecimal balance, BigDecimal outstandingBalance, Integer status, String firstName, String middleName, String lastName, Long createdDate, Long modifDate, String createdBy, String modifBy, Short versioning) {
        super(firstName, middleName, lastName, createdDate, modifDate, createdBy, modifBy, versioning);
        this.cif = cif;
        this.productCode = productCode;
        this.currencyCode = currencyCode;
        this.balance = balance;
        this.outstandingBalance = outstandingBalance;
        this.status = status;
    }

    /**
     * 
     * @param cif
     * @param productCode
     * @param currencyCode
     * @param balance
     * @param outstandingBalance
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param modifDate
     * @param modifBy
     * @param versioning 
     */
    public Customer(String cif, String productCode, String currencyCode, BigDecimal balance, BigDecimal outstandingBalance, Integer status, String firstName, String middleName, String lastName, Long modifDate, String modifBy, Short versioning) {
        super(firstName, middleName, lastName, modifDate, modifBy, versioning);
        this.cif = cif;
        this.productCode = productCode;
        this.currencyCode = currencyCode;
        this.balance = balance;
        this.outstandingBalance = outstandingBalance;
        this.status = status;
    }

    /**
     * 
     * @param cif
     * @param productCode
     * @param currencyCode
     * @param balance
     * @param outstandingBalance
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param createdBy 
     */
    public Customer(String cif, String productCode, String currencyCode, BigDecimal balance, BigDecimal outstandingBalance, Integer status, String firstName, String middleName, String lastName, String createdBy) {
        super(firstName, middleName, lastName, createdBy);
        this.cif = cif;
        this.productCode = productCode;
        this.currencyCode = currencyCode;
        this.balance = balance;
        this.outstandingBalance = outstandingBalance;
        this.status = status;
    }

    /**
     * 
     * @param cif
     * @param productCode
     * @param currencyCode
     * @param balance
     * @param outstandingBalance
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param other 
     */
    public Customer(String cif, String productCode, String currencyCode, BigDecimal balance, BigDecimal outstandingBalance, Integer status, String firstName, String middleName, String lastName, Base other) {
        super(firstName, middleName, lastName, other);
        this.cif = cif;
        this.productCode = productCode;
        this.currencyCode = currencyCode;
        this.balance = balance;
        this.outstandingBalance = outstandingBalance;
        this.status = status;
    }

    
    /**
     * 
     * @return cif
     */
    @Id
    @Column(length = 10)                
    public String getCif() {
        return cif;
    }

    /**
     * 
     * @param cif 
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    
    
    @Column(length = 3)            
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Column(length = 3)            
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Column                
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    
    @Column                    
    public BigDecimal getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(BigDecimal outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    @Column                    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.cif != null ? this.cif.hashCode() : 0);
        hash = 59 * hash + (this.productCode != null ? this.productCode.hashCode() : 0);
        hash = 59 * hash + (this.currencyCode != null ? this.currencyCode.hashCode() : 0);
        hash = 59 * hash + (this.balance != null ? this.balance.hashCode() : 0);
        hash = 59 * hash + (this.outstandingBalance != null ? this.outstandingBalance.hashCode() : 0);
        hash = 59 * hash + (this.status != null ? this.status.hashCode() : 0);
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
        final Customer other = (Customer) obj;
        if ((this.cif == null) ? (other.cif != null) : !this.cif.equals(other.cif)) {
            return false;
        }
        if ((this.productCode == null) ? (other.productCode != null) : !this.productCode.equals(other.productCode)) {
            return false;
        }
        if ((this.currencyCode == null) ? (other.currencyCode != null) : !this.currencyCode.equals(other.currencyCode)) {
            return false;
        }
        if (this.balance != other.balance && (this.balance == null || !this.balance.equals(other.balance))) {
            return false;
        }
        if (this.outstandingBalance != other.outstandingBalance && (this.outstandingBalance == null || !this.outstandingBalance.equals(other.outstandingBalance))) {
            return false;
        }
        if (this.status != other.status && (this.status == null || !this.status.equals(other.status))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" + "cif=" + cif + ", productCode=" + productCode + ", currencyCode=" + currencyCode + ", balance=" + balance + ", outstandingBalance=" + outstandingBalance + ", status=" + status + '}';
    }
    
    
    
}
