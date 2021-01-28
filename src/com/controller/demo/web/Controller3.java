package com.controller.demo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.demo.domain.Products;
import com.controller.demo.service.ProductsService;
import com.controller.demo.service.imp.ProductsServiceImp;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller3")
public class Controller3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProductsService product=new ProductsServiceImp();
    public Controller3() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String category=request.getParameter("value");
		if("submit".equals(action)) {
			List<Products> productlist=product.queryByCategory(category);
			request.setAttribute("productlist",productlist);
			request.getRequestDispatcher("ProductsList.jsp").forward(request, response);
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
