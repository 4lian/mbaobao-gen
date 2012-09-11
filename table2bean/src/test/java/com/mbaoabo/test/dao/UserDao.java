/**
 * mbaobao.com Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.mbaoabo.test.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.mbaoabo.test.bean.User;

/**
 *
 * This tools just a simple useful tools, gen table to javabean
 *
 * "I hope this tools can save your time"
 *
 * Generated by <tt>Tabl2Bean</tt> on 2012-09-11 20:42:51.
 *
 * @author fredzhu (kuci@mbaobao.com)
 * @version v1.0 2012-09-11 20:42:51 $
 */
 
public interface UserDao {

	public Integer insert(User user);
	
	public Integer getUserCount(User param);
	
	public List<User> findUsersByPage(@Param("param")User param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
}