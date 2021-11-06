package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: department findById ====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println();
        System.out.println("==== TEST 2: department findAll ====");
        List<Department> deps = departmentDao.findAll();
        deps = departmentDao.findAll();
        for (Department obj : deps) {
            System.out.println(obj);
        }

//        System.out.println();
//        System.out.println("==== TEST 3: department insert ====");
//        Department newDepartment = new Department(1, "Phones");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println();
        System.out.println("==== TEST 4: department update ====");
        Department dep = departmentDao.findById(2);
        dep.setName("House automation");
        departmentDao.update(dep);
        System.out.println("Update completed");

        System.out.println("=== TEST 5: department delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();

    }
}
