package com.day1009.examPart3;

public class Region {
	private String ID;
	private String name;
	private int salary;
	private String boss;
	private String superID;
	private Region region;
	
	public Region() {
		super();
	}

	public Region(String iD, String name, int salary, String boss, String superID, Region region) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.boss = boss;
		this.superID = superID;
		this.region = region;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public String getSuperID() {
		return superID;
	}

	public void setSuperID(String superID) {
		this.superID = superID;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "地区："+this.getID() + "  \t名字：" + this.getName() + "\t平均收入：" + this.getSalary() + "\t所属地区：" + this.getSuperID() + "\t老大:" + this.getBoss();
	}
	
}
