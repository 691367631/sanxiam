package com.sanxia.market.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("返回json") 
public class ApiResult<T> {

	@ApiModelProperty(value = "code(0000表示成功，其他失败)" ,dataType = "String") 
	private String error_code;
	
	@ApiModelProperty(value = "描述信息" ,dataType = "String") 
	private String message;
	
	@ApiModelProperty(value = "返回结果" ) 
	private T data;
	
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ApiResult(String error_code,String message){
		this.error_code=error_code;
		this.message =message;
	}
	
	
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ApiResult(){
		this.error_code="0000";
		this.message ="请求成功";
	}
}
