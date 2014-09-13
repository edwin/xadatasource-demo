/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baculsoft.model.db1;

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
public class CreditCardCustomer extends Human {

    private String cardNo;
    private String productCardCode;
    private BigDecimal limitMax;
    private BigDecimal limitUse;
    private Integer status;

    public CreditCardCustomer() {
    }

    
    /**
     * 
     * @param cardNo
     * @param productCardCode
     * @param limitMax
     * @param limitUse
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
    public CreditCardCustomer(String cardNo, String productCardCode, BigDecimal limitMax, BigDecimal limitUse, Integer status, String firstName, String middleName, String lastName, Long createdDate, Long modifDate, String createdBy, String modifBy, Short versioning) {
        super(firstName, middleName, lastName, createdDate, modifDate, createdBy, modifBy, versioning);
        this.cardNo = cardNo;
        this.productCardCode = productCardCode;
        this.limitMax = limitMax;
        this.limitUse = limitUse;
        this.status = status;
    }

    /**
     * 
     * @param cardNo
     * @param productCardCode
     * @param limitMax
     * @param limitUse
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param modifDate
     * @param modifBy
     * @param versioning 
     */
    public CreditCardCustomer(String cardNo, String productCardCode, BigDecimal limitMax, BigDecimal limitUse, Integer status, String firstName, String middleName, String lastName, Long modifDate, String modifBy, Short versioning) {
        super(firstName, middleName, lastName, modifDate, modifBy, versioning);
        this.cardNo = cardNo;
        this.productCardCode = productCardCode;
        this.limitMax = limitMax;
        this.limitUse = limitUse;
        this.status = status;
    }

    /**
     * 
     * @param cardNo
     * @param productCardCode
     * @param limitMax
     * @param limitUse
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param createdBy 
     */
    public CreditCardCustomer(String cardNo, String productCardCode, BigDecimal limitMax, BigDecimal limitUse, Integer status, String firstName, String middleName, String lastName, String createdBy) {
        super(firstName, middleName, lastName, createdBy);
        this.cardNo = cardNo;
        this.productCardCode = productCardCode;
        this.limitMax = limitMax;
        this.limitUse = limitUse;
        this.status = status;
    }

    /**
     * 
     * @param cardNo
     * @param productCardCode
     * @param limitMax
     * @param limitUse
     * @param status
     * @param firstName
     * @param middleName
     * @param lastName
     * @param other 
     */
    public CreditCardCustomer(String cardNo, String productCardCode, BigDecimal limitMax, BigDecimal limitUse, Integer status, String firstName, String middleName, String lastName, Base other) {
        super(firstName, middleName, lastName, other);
        this.cardNo = cardNo;
        this.productCardCode = productCardCode;
        this.limitMax = limitMax;
        this.limitUse = limitUse;
        this.status = status;
    }

    /**
     * 
     * @return cardNo
     */
    @Id
    @Column(length = 20) 
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 
     * @param cardNo 
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    
    /**
     * 
     * @return productCardCode
     */
    @Column(length = 3)                
    public String getProductCardCode() {
        return productCardCode;
    }

    /**
     * 
     * @param productCardCode 
     */
    public void setProductCardCode(String productCardCode) {
        this.productCardCode = productCardCode;
    }

    @Column
    public BigDecimal getLimitMax() {
        return limitMax;
    }

    public void setLimitMax(BigDecimal limitMax) {
        this.limitMax = limitMax;
    }

    @Column    
    public BigDecimal getLimitUse() {
        return limitUse;
    }

    public void setLimitUse(BigDecimal limitUse) {
        this.limitUse = limitUse;
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
        hash = 43 * hash + (this.cardNo != null ? this.cardNo.hashCode() : 0);
        hash = 43 * hash + (this.productCardCode != null ? this.productCardCode.hashCode() : 0);
        hash = 43 * hash + (this.limitMax != null ? this.limitMax.hashCode() : 0);
        hash = 43 * hash + (this.limitUse != null ? this.limitUse.hashCode() : 0);
        hash = 43 * hash + (this.status != null ? this.status.hashCode() : 0);
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
        final CreditCardCustomer other = (CreditCardCustomer) obj;
        if ((this.cardNo == null) ? (other.cardNo != null) : !this.cardNo.equals(other.cardNo)) {
            return false;
        }
        if ((this.productCardCode == null) ? (other.productCardCode != null) : !this.productCardCode.equals(other.productCardCode)) {
            return false;
        }
        if (this.limitMax != other.limitMax && (this.limitMax == null || !this.limitMax.equals(other.limitMax))) {
            return false;
        }
        if (this.limitUse != other.limitUse && (this.limitUse == null || !this.limitUse.equals(other.limitUse))) {
            return false;
        }
        if (this.status != other.status && (this.status == null || !this.status.equals(other.status))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CreditCardCustomer{" + "cardNo=" + cardNo + ", productCardCode=" + productCardCode + ", limitMax=" + limitMax + ", limitUse=" + limitUse + ", status=" + status + '}';
    }

 
    
}
