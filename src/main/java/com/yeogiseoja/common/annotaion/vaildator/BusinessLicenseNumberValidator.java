package com.yeogiseoja.common.annotaion.vaildator;

import com.yeogiseoja.common.annotaion.BusinessLicenseNumber;
import com.yeogiseoja.domain.policy.BusinessLicenseNumberPolicy;
import com.yeogiseoja.domain.policy.Policy;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BusinessLicenseNumberValidator implements ConstraintValidator<BusinessLicenseNumber, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Policy policy = new Policy(
                new BusinessLicenseNumberPolicy(value)
        );

        boolean isValid = policy.executePolicyStrategy();
        return isValid;
    }
}
