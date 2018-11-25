package com.fh.area.common;

import java.io.Serializable;

/** 
 * <pre>项目名称：shop-admin 
 * 类名称：com.fh.shop.admin.common  
 * 类描述：    
 * 创建人：姜帅
 * 创建时间：2018年10月18日  
 * 修改人：姜帅
 * 修改时间：2018年10月18日   
 * 修改备注：     
 * @version </pre>    
 */
public class ServerResponce implements Serializable{
	private static final long serialVersionUID = -2376241350719750484L;
	private Integer code;
	private String mgs;
	private Object data;
	/**
	 * @param code
	 * @param mgs
	 * @param data
	 */
	public ServerResponce(Integer code, String mgs, Object data) {
		this.code = code;
		this.mgs = mgs;
		this.data = data;
	}
	public ServerResponce(Integer code, String mgs) {
		this.code = code;
		this.mgs = mgs;
	}
	public static ServerResponce success(Object data){
		return new ServerResponce(200,"ok",data);
		
	}
	public static ServerResponce success(){
		return new ServerResponce(200,"ok");
		
	}
	public static ServerResponce error(ResponseEnum responseEnum){
		return new ServerResponce(responseEnum.getCode(),responseEnum.getMsg());
		
	}
	public static ServerResponce error(){
		return new ServerResponce(500,"error");

	}public static ServerResponce error(Integer code, String mgs){
		return new ServerResponce(code,mgs);

	}
	/**
	 * 
	 */
	public ServerResponce() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @return the mgs
	 */
	public String getMgs() {
		return mgs;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	
	

}
