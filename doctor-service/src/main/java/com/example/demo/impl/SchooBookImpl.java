package com.example.demo.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.ifaces.BookDao;

@Repository
public class SchooBookImpl implements BookDao{

	@Override
	public String getBestBook() {
		
		return "Indian History";
	}

}
