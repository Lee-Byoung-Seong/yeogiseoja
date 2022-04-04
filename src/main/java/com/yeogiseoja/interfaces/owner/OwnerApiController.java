package com.yeogiseoja.interfaces.owner;

import com.yeogiseoja.application.owner.OwnerFacade;
import com.yeogiseoja.common.response.CommonResponse;
import com.yeogiseoja.common.response.messages.normal.NormalCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/owner")
public class OwnerApiController {
    private final OwnerFacade ownerFacade;
    private final OwnerDtoMapper ownerDtoMapper;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public CommonResponse registerOwner(@RequestBody @Valid OwnerDto.RegisterOwnerRequest request) {
        var ownerCommand = ownerDtoMapper.of(request);
        var ownerInfo = ownerFacade.registerOwner(ownerCommand);
        var response = ownerDtoMapper.of(ownerInfo);
        return CommonResponse.success(response, NormalCode.REQUIRE_AUTH.getNormalMsg());
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public CommonResponse updateOwner(@RequestBody @Valid OwnerDto.UpdateOwnerRequest request) {
        var ownerCommand = ownerDtoMapper.of(request);
        var ownerInfo = ownerFacade.updateOwner(ownerCommand);
        var response = ownerDtoMapper.of(ownerInfo);
        return CommonResponse.success(response, NormalCode.UPDATE_SUCCESS.getNormalMsg());
    }


}
