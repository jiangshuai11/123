/**
 * 
 */
package com.fh.area.common;

/** 
 * <pre>项目名称：shop-admin 
 * 类名称：com.fh.shop.admin.annotation  
 * 类描述：    
 * 创建人：姜帅
 * 创建时间：2018年10月18日  
 * 修改人：姜帅
 * 修改时间：2018年10月18日   
 * 修改备注：     
 * @version </pre>    
 */
public enum ResponseEnum {
	LOGIN_OK(200,"ok"),
	LOGIN_ERROR(201,"error"),
	LOGIN_LOCK(105,"此账户已被锁定"),
	RESPONSE_ENUM_USERNAME(102,"用户名错误"),
	RESPONSE_ENUM_USEPASS(103,"用户密码错误"),
	RESPONSE_ENUM_INFO(100,"用户信息不完整"),
	RESPONSE_ENUM_IMGAUTHIMG(101,"验证码错误"),
	ISEMPTY(2001,"手机号不能为空"),
	ILLEGAL(2002,"手机号不合法"),
	RESPONSE_ENUM_LOGLOCK(104,"用户名错误"),
	SSM_CODE_EMPTY (106,"验证码不能为空"),
	USER_IS_EMPTY(107,"用户名不能为空"),
	USER_LENGTH_CODE(108,"密码长度不能小于6位"),
	EMIL_IS_EMPOPTY(109,"邮箱不能为空"),
	BIRTHDAY_IS_EMPTY(110,"生日不能为空"),
	BIRTHDAY_NOT_EMPTY(111,"此用户已存在");


	
	private int code;
	private String msg;
	
	private ResponseEnum(int code,String msg){
		this.code=code;
		this.msg = msg;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	
}
