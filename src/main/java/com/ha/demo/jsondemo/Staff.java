package com.ha.demo.jsondemo;

public class Staff {
	
	private String name;
	private int age;
	private String position;
	
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(String name, int age, String position) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + position + "]";
	}
	
	

}
