package edu.itmo.zad.spaceships;

public class LongRangeReconnaissance {
	public String name;
	public String callsign;
	public int  turrets=6, rocketLaunchers=1, turbolasers=3;;
	public int seats=74;
	public boolean invisibility=false;
	public int hp=150000;
	
	public String getName() {
		return name;
	}
	public String getCallsign() {
		return callsign;
	}
	public void invisibilityOn() {
		invisibility=true;
		System.out.println("невидимость активированна");
	}
	public void invisibilityOff() {
		invisibility=false;
		System.out.println("невидимость деактивированна");
	}
	public void setName(String s) {
		name = s;
	}
	public void setCallsign(String q) {
		callsign = q;
	}


}
