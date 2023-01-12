package com.example.lesson17;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "univercity")
public class Univercity {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private int accredatationLevel;
	@Column
	private int countOfInstitute;
	@Column
	private int countOfStudent;
	@Column
	private String address;

	

	public Univercity() {
		super();
	}


	public Univercity(String name, int accredatationLevel, int countOfInstitute, int countOfStudent, String address) {
		super();
		this.name = name;
		this.accredatationLevel = accredatationLevel;
		this.countOfInstitute = countOfInstitute;
		this.countOfStudent = countOfStudent;
		this.address = address;
	}


	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccredatationLevel() {
		return accredatationLevel;
	}

	public void setAccredatationLevel(int accredatationLevel) {
		this.accredatationLevel = accredatationLevel;
	}

	public int getCountOfInstitute() {
		return countOfInstitute;
	}

	public void setCountOfInstitute(int countOfInstitute) {
		this.countOfInstitute = countOfInstitute;
	}

	public int getCountOfStudent() {
		return countOfStudent;
	}

	public void setCountOfStudent(int countOfStudent) {
		this.countOfStudent = countOfStudent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", name=" + name + ", accredatationLevel=" + accredatationLevel
				+ ", countOfInstitute=" + countOfInstitute + ", countOfStudent=" + countOfStudent + ", address="
				+ address + "]";
	}

}
