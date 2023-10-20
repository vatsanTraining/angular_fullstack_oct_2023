package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.BookDao;

/*
 * Three Types of DI
 *   Field Injection 
 *   Setter Injection
 *   Constructor Injection
 *   
 *   @Autowired 
 */
@Service
public class BookService {

	
//	@Autowired
//	@Qualifier("schooBookImpl")
	private BookDao dao;
	
	
	// constructor DI
	
//	@Autowired
//	public BookService(@Qualifier("schooBookImpl") BookDao dao) {
//		super();
//		this.dao = dao;
//	}


	


	public String getRecomendation() {
		
		return dao.getBestBook();
	}


	public BookService() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Autowired
	@Qualifier("collegeBookImpl")
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	
	
}
