package com.atguigu.core.exception;

import io.swagger.models.auth.In;
import lombok.Getter;

/**
 * @author Admin
 */

@Getter
public enum SystemErrorType implements ErrorType {

    SYSTEM_ERROR(-1, "系统异常"),
    SYSTEM_BUSY(40, "系统繁忙,请稍候再试"),

    GATEWAY_NOT_FOUND_SERVICE(10404, "服务未找到"),
    GATEWAY_ERROR(10500, "网关异常"),
    GATEWAY_CONNECT_TIME_OUT(10002, "网关超时"),

    ARGUMENT_NOT_VALID(20000, "请求参数校验不通过"),
    UPLOAD_FILE_SIZE_LIMIT(20001, "上传文件大小超过限制"),

    DUPLICATE_PRIMARY_KEY(30000,"唯一键冲突");

    /**
     * 错误类型码
     */
    private Integer code;
    /**
     * 错误类型描述信息
     */
    private String msg;

    SystemErrorType(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
