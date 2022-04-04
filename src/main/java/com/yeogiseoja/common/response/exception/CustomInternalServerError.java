package com.yeogiseoja.common.response.exception;

import com.yeogiseoja.common.response.messages.error.ErrorCode;

public class CustomInternalServerError extends BaseException {
    public CustomInternalServerError(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public CustomInternalServerError(ErrorCode errorCode) {
        super(errorCode.getErrorMsg(), errorCode);
    }
}
