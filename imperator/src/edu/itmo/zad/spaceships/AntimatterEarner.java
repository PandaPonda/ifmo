package edu.itmo.zad.spaceships;

public class AntimatterEarner {
	public String name;
	public String callsign;
	public int  turrets=2;
	public int capacity=32000;
	public int hp=210000;
	
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
