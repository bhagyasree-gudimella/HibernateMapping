package com.lavanya.gudimella.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.lavanya.gudimella.dao.LaptopDao;
import com.lavanya.gudimella.dao.StudentDao;
import com.lavanya.gudimella.dto.Laptop;
import com.lavanya.gudimella.dto.Student;
public class Client {
	
	private static StudentDao studentDao;
	private static LaptopDao laptopDao;
	
	public static void main(String[] args) {
		studentDao =  new StudentDao();
		laptopDao = new LaptopDao();
		
//		Laptop laptop = new Laptop();
//		laptop.setName("DELL");
//		
//		Student student  = new Student();
//		student.setName("Laali");
//		student.setRoll_number(2322);	
//		student.setAddress("ashjvjh");

		//One to One Mapping - Laptop is borrowed by student
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
		
//		laptopDao.saveLaptop(laptop);
		
		//One to Many Mapping
//		Laptop laptop1 = new Laptop();
//		laptop1.setName("HP");
//		
//		Laptop laptop2 = new Laptop();
//		laptop2.setName("Dell");
//		
//		List<Laptop> laptops = new ArrayList<Laptop>();
//		laptops.add(laptop1);
//		laptops.add(laptop2);
//		
//		//bi-directional relationship
//		student.setLaptops(laptops);
//		
//		laptop1.setStudent(student);
//		laptop2.setStudent(student);
//		
//		studentDao.saveStudent(student);
		
		
		//Many To Many Mapping
		//add laptops
		Laptop laptop1 = new Laptop();
		laptop1.setName("HP");
		
		Laptop laptop2 = new Laptop();
		laptop2.setName("Dell");
		
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		
		//add students
		Student student1  = new Student();
		student1.setName("Laali");
		student1.setRoll_number(2322);	
		student1.setAddress("ashjvjh");
		
		Student student2  = new Student();
		student2.setName("Srujan");
		student2.setRoll_number(2331);	
		student2.setAddress("sdcjbbsdk");
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		
		student1.setLaptops(laptops);
		student2.setLaptops(laptops);
		
		laptop1.setStudents(students);
		laptop2.setStudents(students);
		
		studentDao.saveStudent(student1);
		studentDao.saveStudent(student2);
	}
}
