package edu.itmo.zad.spaceships;

public class LongRangeReconnaissance {
	public String name;
	public String callsign;
	public int  turrets=6, rocketLaunchers=1, turbolasers=3;;
	public int seats=74;
	public boolean invisibility=false;
	public boolean inHyperdrive=false;
	public int hp=150000;
	int damage = rocketLaunchers*5400+turbolasers*2300; 
	
	
	public int attackS(Shuttlecraft a) {
		int realdamage=(int) (Math.random()*damage);
		int newhp=a.hp-realdamage;
		return newhp;	
	}
	
	public int attackB(Battleship a) {
		int realdamage=(int) (Math.random()*damage);
		int newhp=a.hp-realdamage;
		return newhp;	
	}
	
	public int attackA(AntimatterEarner a) {
		int realdamage=(int) (Math.random()*damage);
		int newhp=a.hp-realdamage;
		return newhp;
	}

	public int attackL(LongRangeReconnaissance a) {
		int realdamage=(int) (Math.random()*damage);
		int newhp=a.hp-realdamage;
		return newhp;
	}
	
	
	public String getName() {
		return name;
	}
	public String getCallsign() {
		return callsign;
	}
	public void invisibilityOn() {
		invisibility=true;
	}
	public void invisibilityOff() {
		invisibility=false;
	}
	public void setName(String s) {
		name = s;
	}
	public void setCallsign(String q) {
		callsign = q;
	}

	public void hyperdriveOn() {
		inHyperdrive=true;
	}
	public void hyperdriveOff() {
		inHyperdrive=false;
	}
}
