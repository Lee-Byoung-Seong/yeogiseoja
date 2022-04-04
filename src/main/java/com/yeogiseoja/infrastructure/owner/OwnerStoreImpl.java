package com.yeogiseoja.infrastructure.owner;

import com.yeogiseoja.domain.owner.Owner;
import com.yeogiseoja.domain.owner.OwnerStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class OwnerStoreImpl implements OwnerStore {
    @Override
    public Owner storeOwner(Owner initOwner) {
        return null;
    }
}
