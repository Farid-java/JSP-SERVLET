package com.dao;

import java.util.List;

import com.model.Register;

public interface Dao {
	
	public int insert(Register register);
	public int delete(String id);
	public void update(Register bean);
	public List<Register> fetch();
	public Register login(String email);

}
