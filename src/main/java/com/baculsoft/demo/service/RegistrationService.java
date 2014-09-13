/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baculsoft.demo.service;

import com.baculsoft.model.db1.CreditCardCustomer;
import com.baculsoft.model.db2.Customer;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service
public class RegistrationService {

    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactoryPrimary;

    @Qualifier("sessionFactorySecondary")
    @Autowired
    private SessionFactory sessionFactorySecondary;

    private final Logger logger=LoggerFactory.getLogger(this.getClass());
    
    public List[] getAllList(){
        logger.info("#Enter getAllList()");
        Session session=sessionFactoryPrimary.openSession();
        List listCreditCardCustomer=session.createCriteria(CreditCardCustomer.class).list();
        session.close();
        
        Session session2=sessionFactorySecondary.openSession();
        List listCustomer=session2.createCriteria(Customer.class).list();
        session2.clear();
        logger.info("#End getAllList()");        
        return new List[]{listCreditCardCustomer,listCustomer};
        
    }
    /**
     * 
     * @param customer
     * @param creditCardCustomer 
     */
    @Transactional
    public void saveCustomer(Customer customer, CreditCardCustomer creditCardCustomer) {
        logger.info("Enter #saveCustomer with customer :{} , and creditCurdCustomer :{} ",customer,creditCardCustomer);
        sessionFactoryPrimary.getCurrentSession().save(creditCardCustomer);
        sessionFactorySecondary.getCurrentSession().save(customer);
    }
}
