package com.yeogiseoja.domain.owner;

public interface OwnerValidator {
    void validateRegisterOwnerRequest(OwnerCommand.RegisterOwnerRequest owner);
    void validateUpdateOwnerRequest(OwnerCommand.UpdateOwnerRequest owner);
    void validateConfirmAuthRequest(String ownerEmail);
    void validateSearchOwnerRequest(String ownerEmail);
    void validateRemoveOwnerRequest(String ownerEmail);
}
