package com.mysite.sbb;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	public User getUserByUsername(String username);

}
