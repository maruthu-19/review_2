package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class moddetails {
	@Id
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private int rpower;
	private int lpower;
	private String frametype;
	private String uvprotectin;
	private String bluerayprotection;
	private String phoneno;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getRpower() {
		return rpower;
	}
	public void setRpower(int rpower) {
		this.rpower = rpower;
	}
	public int getLpower() {
		return lpower;
	}
	public void setLpower(int lpower) {
		this.lpower = lpower;
	}
	public String getFrametype() {
		return frametype;
	}
	public void setFrametype(String frametype) {
		this.frametype = frametype;
	}
	public String getUvprotectin() {
		return uvprotectin;
	}
	public void setUvprotectin(String uvprotectin) {
		this.uvprotectin = uvprotectin;
	}
	public String getBluerayprotection() {
		return bluerayprotection;
	}
	public void setBluerayprotection(String bluerayprotection) {
		this.bluerayprotection = bluerayprotection;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
}
