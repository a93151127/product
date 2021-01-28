package com.controller.demo.dao.imp;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.controller.demo.dao.ProductsDao;
import com.controller.demo.domain.Products;

public class ProductsDaoJdbcImp implements ProductsDao{
	
	public static Connection connect() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/interview?useUnicode=true&characterEncoding=utf-8";
		String user="root";
		String password="1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("no connection");
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
		}
		
		return conn;
	}

	@Override
	public List<Products> findByCategory(String category) {
		List<Products> list=new ArrayList<Products>();
		String sql="select * from interview.products where category=?";
		Connection conn=connect();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,category);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Products product=new Products();
				product.setProductName(rs.getString("productName"));
				product.setProductPrice(rs.getInt("productPrice"));
				product.setStock(rs.getInt("stock"));
				product.setCategory(category);
				list.add(product);
				
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
