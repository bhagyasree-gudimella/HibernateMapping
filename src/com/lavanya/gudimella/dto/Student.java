package com.lavanya.gudimella.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="roll_number")
	private int roll_number;
	
	@Column(name="address")
	private String address;
	
//	//One to One Mapping - Laptop is borrowed by student
//	@OneToOne(mappedBy="student")
//	private Laptop laptop;
	
	//One to Many - Student borrows many laptops
//	@OneToMany(cascade=CascadeType.ALL, mappedBy="student")
//	@JoinTable(name="Student_Laptop_Details", joinColumns=@JoinColumn(name="student_id"), inverseJoinColumns=@JoinColumn(name="laptop_id"))
//	private List<Laptop> laptops;
	
	//Many To Many Mapping
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Laptop_Details", joinColumns=@JoinColumn(name="student_id"), inverseJoinColumns=@JoinColumn(name="laptop_id"))
	private List<Laptop> laptops;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
}
