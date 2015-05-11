package edu.itmo.zad.spaceships;

public class Shuttlecraft {
	public String name;
	public String callsign;
	public int  turrets=1;
	public int seats=74;
	public int hp=24000;
	
	public String getName() {
		return name;
	}
	public String getCallsign() {
		return callsign;
	}

	public void setName(String s) {
		name = s;
	}
	public void setCallsign(String q) {
		callsign = q;
	}
}
