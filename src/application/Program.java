package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao  sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ====");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		System.out.println("\n=== TEST 3: seller findAll ====");
		 list = sellerDao.findall();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 4: seller Insert ====");
		
		Seller newSeller = new Seller(null, "Greg", "greg@hotmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		
		System.out.println("done!" + newSeller.getId());
		
		System.out.println("\n=== TEST 5: Update Seller ====");
		
		seller = sellerDao.findById(1);
		seller.setName("Marta Purple");
		sellerDao.update(seller);
		
		
	}

}
