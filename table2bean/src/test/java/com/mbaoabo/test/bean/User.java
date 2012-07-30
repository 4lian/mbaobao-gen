/**
 * mbaobao.com Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.mbaoabo.test.bean;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.lang.Integer;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.Integer;
import java.lang.Integer;
import java.lang.String;
import java.lang.String;
import java.util.Date;
import java.util.Date;
import java.util.Date;

/**
 *
 * This tools just a simple useful tools, gen table to javabean
 *
 * "I hope this tools can save your time"--kuci
 *
 * Generated by <tt>Tabl2Bean</tt> on 2012-07-31 00:09:54.712.
 *
 * @author kuci@mbaobao.com
 * @version v1.0 2012-07-31 00:09:54.712 $
 */
public class User implements Serializable{

	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -1L;

	//========== properties ==========

	private Integer id;


	private String username;


	private String flowerName;


	private String password;


	private String phone;


	private String roleIds;


	private String appIds;


	private Integer isLock;


	private Integer isDel;


	private String addUser;


	private String lastLoginIp;


	private Date lastLoginTime;


	private Date createTime;


	private Date updateTime;


    //========== getters and setters ==========

	/**
	* Getter method for property <tt>id</tt>.
	*
	* @return property value of id
	*/
	public Integer getId() {
		return id;
	}
	
	/**
	* Setter method for property <tt>id</tt>.
	* 
	* @param id value to be assigned to property id
	*/
	public void setId(Integer id) {
		this.id = id;
	}
	

	/**
	* Getter method for property <tt>username</tt>.
	*
	* @return property value of username
	*/
	public String getUsername() {
		return username;
	}
	
	/**
	* Setter method for property <tt>username</tt>.
	* 
	* @param username value to be assigned to property username
	*/
	public void setUsername(String username) {
		this.username = username;
	}
	

	/**
	* Getter method for property <tt>flowerName</tt>.
	*
	* @return property value of flowerName
	*/
	public String getFlowerName() {
		return flowerName;
	}
	
	/**
	* Setter method for property <tt>flowerName</tt>.
	* 
	* @param flowerName value to be assigned to property flowerName
	*/
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	

	/**
	* Getter method for property <tt>password</tt>.
	*
	* @return property value of password
	*/
	public String getPassword() {
		return password;
	}
	
	/**
	* Setter method for property <tt>password</tt>.
	* 
	* @param password value to be assigned to property password
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	

	/**
	* Getter method for property <tt>phone</tt>.
	*
	* @return property value of phone
	*/
	public String getPhone() {
		return phone;
	}
	
	/**
	* Setter method for property <tt>phone</tt>.
	* 
	* @param phone value to be assigned to property phone
	*/
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	/**
	* Getter method for property <tt>roleIds</tt>.
	*
	* @return property value of roleIds
	*/
	public String getRoleIds() {
		return roleIds;
	}
	
	/**
	* Setter method for property <tt>roleIds</tt>.
	* 
	* @param roleIds value to be assigned to property roleIds
	*/
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}
	

	/**
	* Getter method for property <tt>appIds</tt>.
	*
	* @return property value of appIds
	*/
	public String getAppIds() {
		return appIds;
	}
	
	/**
	* Setter method for property <tt>appIds</tt>.
	* 
	* @param appIds value to be assigned to property appIds
	*/
	public void setAppIds(String appIds) {
		this.appIds = appIds;
	}
	

	/**
	* Getter method for property <tt>isLock</tt>.
	*
	* @return property value of isLock
	*/
	public Integer getIsLock() {
		return isLock;
	}
	
	/**
	* Setter method for property <tt>isLock</tt>.
	* 
	* @param isLock value to be assigned to property isLock
	*/
	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}
	

	/**
	* Getter method for property <tt>isDel</tt>.
	*
	* @return property value of isDel
	*/
	public Integer getIsDel() {
		return isDel;
	}
	
	/**
	* Setter method for property <tt>isDel</tt>.
	* 
	* @param isDel value to be assigned to property isDel
	*/
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	

	/**
	* Getter method for property <tt>addUser</tt>.
	*
	* @return property value of addUser
	*/
	public String getAddUser() {
		return addUser;
	}
	
	/**
	* Setter method for property <tt>addUser</tt>.
	* 
	* @param addUser value to be assigned to property addUser
	*/
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}
	

	/**
	* Getter method for property <tt>lastLoginIp</tt>.
	*
	* @return property value of lastLoginIp
	*/
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	
	/**
	* Setter method for property <tt>lastLoginIp</tt>.
	* 
	* @param lastLoginIp value to be assigned to property lastLoginIp
	*/
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	

	/**
	* Getter method for property <tt>lastLoginTime</tt>.
	*
	* @return property value of lastLoginTime
	*/
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	
	/**
	* Setter method for property <tt>lastLoginTime</tt>.
	* 
	* @param lastLoginTime value to be assigned to property lastLoginTime
	*/
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	

	/**
	* Getter method for property <tt>createTime</tt>.
	*
	* @return property value of createTime
	*/
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	* Setter method for property <tt>createTime</tt>.
	* 
	* @param createTime value to be assigned to property createTime
	*/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	

	/**
	* Getter method for property <tt>updateTime</tt>.
	*
	* @return property value of updateTime
	*/
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	* Setter method for property <tt>updateTime</tt>.
	* 
	* @param updateTime value to be assigned to property updateTime
	*/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	


	/**
	* 重载toString方法
	* @return
	*
	* @see java.lang.Object#toString()
	*/
	@Override
    public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

