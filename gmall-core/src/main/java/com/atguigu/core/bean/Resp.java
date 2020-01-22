package com.atguigu.core.bean;

import com.atguigu.core.exception.ErrorType;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.Instant;
import java.time.ZonedDateTime;

@ApiModel
@Data
public class Resp<T> {

    @ApiModelProperty(name = "code",value = "响应状态码")
    private Integer code;

    @ApiModelProperty(name = "msg",value = "提示消息")
    private String msg;

    //不序列号为空的数据
    @ApiModelProperty(name = "data",value = "响应数据")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    @ApiModelProperty(value = "请求结果生成时间戳")
    private Instant time;

    public Resp() {
        this.time = ZonedDateTime.now().toInstant();
    }


    public Resp(ErrorType errorType) {
        this.code = errorType.getCode();
        this.msg = errorType.getMsg();
        this.time = ZonedDateTime.now().toInstant();
    }


    public Resp(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @param errorType
     * @param data
     */
    public Resp(ErrorType errorType, T data) {
        this(errorType);
        this.data = data;
    }

    public Resp(T data) {
        this.data = data;
    }

    public static<T> Resp<T> ok(T data){
        Resp<T> resp = new Resp<T>(data);
        resp.setCode(0);//操作成功
        resp.setMsg("success");
        return resp;
    }

    public static<T> Resp<T> fail(ErrorType errorType){
        Resp<T> resp = new Resp<T>();
        resp.setCode(errorType.getCode());//操作失败
        resp.setMsg(errorType.getMsg());
        return resp;
    }


    /**
     * 系统异常类并返回结果数据
     *
     * @param errorType
     * @param data
     * @return Result
     */
    public static Resp fail(ErrorType errorType, Object data) {
        return new Resp<>(errorType, data);
    }

    public static<T> Resp<T> fail(String msg){
        Resp<T> resp = new Resp<T>();
        resp.setCode(1);//操作失败
        resp.setMsg(msg);
        return resp;
    }

    public static<T> Resp<T> fail(){
        Resp<T> resp = new Resp<T>();
        resp.setCode(1);//操作失败
        return resp;
    }

    public Resp<T> msg(String msg){
        this.setMsg(msg);
        return this;
    }

    public Resp<T> code(Integer code){
        this.setCode(code);
        return this;
    }


}
