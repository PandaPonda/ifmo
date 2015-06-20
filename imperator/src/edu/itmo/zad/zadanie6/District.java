package edu.itmo.zad.zadanie6;

public class District {
	private String name;
	private int okato;
	
	public District(){
		
	}

	public District(String name, int okato) {
		super();
		this.name = name;
		this.okato = okato;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getOkato() {
		return okato;
	}

	public void setOkato(int okato) {
		this.okato = okato;
	}
	
	
}
