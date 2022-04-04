package com.yeogiseoja.domain.policy;

import com.yeogiseoja.common.response.messages.error.ErrorCode;
import org.springframework.util.Assert;


public class AuthTokenPolicy implements PolicyStrategy {
    private final String authToken;

    public AuthTokenPolicy(String authToken) {
        this.authToken = authToken;
    }

    private void checkEmailEmpty(String authToken) {
        Assert.hasText(authToken, ErrorCode.AUTH_TOKEN_CONFIRM_FAIL.getErrorMsg());
    }

    @Override
    public boolean isSatisfiedBy() {
        checkEmailEmpty(authToken);
        return true;
    }
}
