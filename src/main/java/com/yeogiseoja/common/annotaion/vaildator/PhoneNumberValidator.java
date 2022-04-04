package com.yeogiseoja.common.annotaion.vaildator;

import com.yeogiseoja.common.annotaion.BusinessLicenseNumber;
import com.yeogiseoja.domain.policy.PasswordPolicy;
import com.yeogiseoja.domain.policy.Policy;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<BusinessLicenseNumber, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Policy policy = new Policy(
                new PasswordPolicy(value)
        );

        boolean isValid = policy.executePolicyStrategy();
        return isValid;
    }
}
