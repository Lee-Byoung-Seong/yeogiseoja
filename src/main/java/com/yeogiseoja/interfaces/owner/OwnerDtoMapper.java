package com.yeogiseoja.interfaces.owner;

import com.yeogiseoja.domain.owner.OwnerCommand;
import com.yeogiseoja.domain.owner.OwnerInfo;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface OwnerDtoMapper {

    OwnerCommand.RegisterOwnerRequest of(OwnerDto.RegisterOwnerRequest request);
    OwnerDto.summaryOwnerResponse of(OwnerInfo.OwnerSummaryInfo response);

    OwnerCommand.UpdateOwnerRequest of(OwnerDto.UpdateOwnerRequest request);

 }
