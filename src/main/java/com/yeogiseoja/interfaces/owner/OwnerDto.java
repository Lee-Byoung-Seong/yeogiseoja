package com.yeogiseoja.interfaces.owner;

import com.yeogiseoja.common.annotaion.BusinessLicenseNumber;
import com.yeogiseoja.common.annotaion.PhoneNumber;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class OwnerDto {

    @Getter
    @Setter
    @ToString
    public static class RegisterOwnerRequest {
        @NotEmpty(message = "대표자명은 필수값입니다")
        private String representationName;

        @Email(message = "email 형식에 맞아야 합니다")
        @NotEmpty(message = "email 은 필수값입니다")
        private String email;

        @BusinessLicenseNumber
        private String businessLicenseNumber;

        @NotEmpty(message = "사업자번호는 필수값입니다")
        private String password;

        @PhoneNumber
        private String phoneNumber;
        private String depositBankCode;
        private String depositAccountNumber;
        private String depositAccountHolderName;
        private String settledBankCode;
        private String settledAccountNumber;
        private String settledAccountHolderName;
    }

    @Getter
    @Setter
    @ToString
    public static class UpdateOwnerRequest {
        @Email(message = "email 형식에 맞아야 합니다")
        @NotEmpty(message = "email 은 필수값입니다")
        private String email;

        @NotEmpty(message = "비밀번호는 필수 값 입니다.")
        private String password;

        @PhoneNumber
        private String phoneNumber;
        private String depositBankCode;
        private String depositAccountNumber;
        private String depositAccountHolderName;
        private String settledBankCode;
        private String settledAccountNumber;
        private String settledAccountHolderName;
    }

    @Getter
    @Setter
    @ToString
    public static class ConfirmAuthRequest {
        @Email(message = "email 형식에 맞아야 합니다")
        @NotEmpty(message = "email 은 필수값입니다")
        private String email;

        @NotEmpty(message = "인증 토큰은 필수 값 입니다")
        private String authToken;
    }

    @Getter
    @Setter
    @ToString
    public static class summaryOwnerResponse {
        private long ownerId;
        private String email;
        private String representationName;
    }

}
