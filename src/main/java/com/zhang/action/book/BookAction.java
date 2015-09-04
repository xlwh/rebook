package com.zhang.action.book;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhang.beans.Book;
import com.zhang.service.book.BookService;

@Results({  
	  @Result(name="success",location="/WEB-INF/content/index.jsp")  
	}) 
public class BookAction extends ActionSupport implements ModelDriven<Object>{

	private static final long serialVersionUID = 1L;
	private List<Book> list;
	private Book model = new Book();
	
	@Override
	public Object getModel() {
		return (list != null ? list : model); 
	}
	
	@Action("book") 
	public String index(){
		System.out.println("------------------------------------------------------ok");
		list = new BookService().getAll();
		return SUCCESS;
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
    
	
}
