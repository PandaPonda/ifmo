package edu.itmo.zad.spaceships;

import edu.itmo.zad.spaceships.AntimatterEarner;
import edu.itmo.zad.spaceships.Shuttlecraft;
import edu.itmo.zad.spaceships.LongRangeReconnaissance;

public class Battleship {
	public String name;
	public String callsign;
	public boolean inHyperdrive=false;
	public int fighter=24, turrets=12, starDestroyerWeapon=1, rocketLaunchers=5, turbolasers=6;
	public int hp=316000, rank=0;
	public int hangar=50000;
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

	public String starDestroyer() {
		String bax="BAX BABAX AXAXAXAXAXAXAXAXAXAXXAXX!!!!!!";
		return bax;
	}
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
	public void hyperdriveOn() {
		inHyperdrive=true;
	}
	public void hyperdriveOff() {
		inHyperdrive=false;
	}
	public String getDecription() {
		return "линкор "+ name +" позывной "+callsign+" количество истребителей "+fighter+" террули пво "+turrets+" вооружение класса звёздный уничтожитель "+starDestroyerWeapon+" ракетных шахт "+rocketLaunchers+" батарей турболазеров "+turbolasers;
	}
	
}