package com.example.mvc_form_demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailDomainConstraintValidator implements ConstraintValidator<EmailDomain, String> {

    private String domainName;

    @Override
    public void initialize(EmailDomain emailDomain) {
        domainName = emailDomain.value();
    }

    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext constraintValidatorContext) {
        if(emailAddress.endsWith(domainName)){
            return true;
        }else{
            return false;
        }
    }


}
