 package com.pluralsight;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class ControllerServlet
 */
 //@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	public ControllerServlet() {
		super();
		//Agregar libros al array
		bookList.add(new Book("To kill a mockingbird","Harper Lee",  5.50f));
		bookList.add(new Book("1984", "George Orwell", 4.50f));
		bookList.add(new Book("Frankenstein","Mary Shelly", 4.00f));
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/* @WebServlet("/books/*")*/  
   // public ControllerServlet() {
      //  super();
        //   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*PrintWriter output = response.getWriter();
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		
		output.println("Book Title: " + title);
		output.println("Author: " + author);*/
		
		/*request.setAttribute("book_title", "1984");
		RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
		dispatcher.forward(request, response);*/
		
		request.setAttribute("book_list", bookList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
