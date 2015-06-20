package edu.itmo.zad.zadanie6;

public class Green {
	private String number;
	private String name;
	private String district;
	private String foundation;
	private String area;
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	


	public Green() {
		
	}
	
	public Green(String name, String district, String foundation, String area) {
		super();
		this.name = name;
		this.district = district;
		this.foundation =foundation;
		this.area =area;
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

	public String getFoundation() {
		return foundation;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
