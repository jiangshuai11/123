/**
 * 
 */
package com.fh.area.po.area;

import java.io.Serializable;

/**
 * <pre>项目名称：shop-admin 
 * 类名称：com.fh.shop.admin.po.area  
 * 类描述：    
 * 创建人：姜帅
 * 创建时间：2018年10月8日  
 * 修改人：姜帅
 * 修改时间：2018年10月8日   
 * 修改备注：     
 * @version </pre>    
 */
public class Area implements Serializable {

	private static final long serialVersionUID = -4485446331038933049L;
	private Integer aid;
	private String aname;
	private Integer pid;
	/**
	 * @return the aid
	 */
	public Integer getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}
	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Area [aid=" + aid + ", aname=" + aname + ", pid=" + pid + "]";
	}
	
	

}
