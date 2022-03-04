package com.flab.yeogiseoja.domain.customer;

import com.flab.yeogiseoja.domain.owner.Account;
import com.flab.yeogiseoja.domain.owner.Owner;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class CustomerCommand {
    @Getter
    @Builder
    @ToString
    public static class RegisterCustomerRequest {
        private final String email;
        private final String nickName;
        private final String name;
        private final String password;
        private final String phoneNumber;

        public Customer toEntity() {
            return Customer.builder().name(name).nickName(nickName).email(email).password(password).phoneNumber(phoneNumber).build();
        }
    }
}