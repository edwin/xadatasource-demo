/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baculsoft.demo.controller;

import com.baculsoft.demo.service.RegistrationService;
import com.baculsoft.model.db1.CreditCardCustomer;
import com.baculsoft.model.db2.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */

@Controller
@RequestMapping
public class IndexController {

    @Autowired
    private RegistrationService registrationService;

    private final List<String> productCodes=new ArrayList<String>(3);
    private final List<String> creditCardproductCodes=new ArrayList<String>(3);
    private final List<String> currencyCodes=new ArrayList<String>(5);
    
    private final Logger logger=LoggerFactory.getLogger(getClass());
    @PostConstruct
    private void init(){
        logger.info("Initialize Index Controller");
        productCodes.add("P1");
        productCodes.add("P2");
        productCodes.add("P3");
        
        creditCardproductCodes.add("C1");
        creditCardproductCodes.add("C2");
        creditCardproductCodes.add("C3");
        
        currencyCodes.add("IDR");
        currencyCodes.add("USD");
        currencyCodes.add("EUR");
        currencyCodes.add("YEN");
        currencyCodes.add("THB");
        logger.info("Succesfully Initialize Index Controller");        
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String view(ModelMap modelMap) {
        logger.info("Enter IndexController#View");
        List[] listAll = registrationService.getAllList();
        modelMap.put("creditcardcustomers", listAll[0]);
        modelMap.put("customers", listAll[1]);
        modelMap.put("productCodesList", productCodes);
        modelMap.put("ccProductCodesList", creditCardproductCodes);
        modelMap.put("currencyCodesList", currencyCodes);        
        return "view";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String save(@ModelAttribute Customer customer, @ModelAttribute CreditCardCustomer creditCardCustomer) {
        logger.info("Enter IndexController#Save");
        registrationService.saveCustomer(customer, creditCardCustomer);
        return "redirect:/";
    }

}
