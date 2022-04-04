package com.flab.yeogiseoja.domain.authentication;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class JwtAuthentication {
    private String header;
    private String secret;
    private String tokenValidityInSeconds;

}
