package edu.itmo.zad.zadanie6;

public class Water {
	private int number;
	private String name;
	private String type;
	private String district;
	
	
	public Water(){
		
	}

	public Water(String number, String type, String name, String district) {
		super();
		this.type = type;
		this.name = name;
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
