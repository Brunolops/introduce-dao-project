package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
//		System.out.println("\n=== TEST 1: department Insert ====");
//		Department dep = new Department(null,"D3");
//		depDao.insert(dep);
		
//		System.out.println("\n=== TEST 2: department Update ====");
//		Department dep1 = new Department(6,"Tables");
//		depDao.update(dep1);
//		
//		System.out.println("\n=== TEST 3: department Delete ====");
//		depDao.deleteById(8);
		
		System.out.println("\n=== TEST 4: department findById ====");
		Department dep = depDao.findById(3);
		System.out.println(dep);

	}

}
