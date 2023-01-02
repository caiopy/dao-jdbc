package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"teste");
		
		Seller slr = new Seller(30,"jhon","jhond@gmail.com",new Date(), 20000.0,obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(slr);

	}

}
