package com.lavanya.gudimella.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="laptop_id")
	private int laptop_id;
	
	@Column(name="name")
	private String name;
	
//	//One to One Mapping - Laptop is borrowed by student
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="student_id", nullable=false, referencedColumnName="id")
	private Student student;
	
	//Many To One Mapping
////	@ManyToOne
//	@JoinColumn(name="student_id", nullable=false, referencedColumnName="id")
//	private Student student;

	@ManyToMany(mappedBy="laptops")
	private List<Student> students;

	public int getLaptop_id() {
		return laptop_id;
	}

	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
}
