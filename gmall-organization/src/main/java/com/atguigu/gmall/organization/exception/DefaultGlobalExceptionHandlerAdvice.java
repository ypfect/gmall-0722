package com.atguigu.gmall.organization.exception;


import com.atguigu.core.bean.Resp;
import com.atguigu.core.exception.BaseException;
import com.atguigu.core.exception.SystemErrorType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartException;

import java.util.Objects;

@Slf4j
public class DefaultGlobalExceptionHandlerAdvice {

    @ExceptionHandler(value = {MissingServletRequestParameterException.class})
    public Resp missingServletRequestParameterException(MissingServletRequestParameterException ex) {
        log.error("missing servlet request parameter exception:{}", ex.getMessage());
        return Resp.fail(SystemErrorType.ARGUMENT_NOT_VALID);
    }

    @ExceptionHandler(value = {MultipartException.class})
    public Resp uploadFileLimitException(MultipartException ex) {
        log.error("upload file size limit:{}", ex.getMessage());
        return Resp.fail(SystemErrorType.UPLOAD_FILE_SIZE_LIMIT);
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public Resp serviceException(MethodArgumentNotValidException ex) {
        log.error("service exception:{}", ex.getMessage());
        return Resp.fail(SystemErrorType.ARGUMENT_NOT_VALID, Objects.requireNonNull(ex.getBindingResult().getFieldError()).getDefaultMessage());
    }

    @ExceptionHandler(value = {DuplicateKeyException.class})
    public Resp duplicateKeyException(DuplicateKeyException ex) {
        log.error("primary key duplication exception:{}", ex.getMessage());
        return Resp.fail(SystemErrorType.DUPLICATE_PRIMARY_KEY);
    }

    @ExceptionHandler(value = {BaseException.class})
    public Resp baseException(BaseException ex) {
        log.error("base exception:{}", ex.getMessage());
        return Resp.fail(ex.getErrorType());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Resp exception() {
        return Resp.fail();
    }

    @ExceptionHandler(value = {Throwable.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Resp throwable() {
        return Resp.fail();
    }
}