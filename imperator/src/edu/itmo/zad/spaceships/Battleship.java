package edu.itmo.zad.spaceships;

import edu.itmo.zad.spaceships.AntimatterEarner;
import edu.itmo.zad.spaceships.Shuttlecraft;
import edu.itmo.zad.spaceships.LongRangeReconnaissance;

public class Battleship {
	public String name;
	public String callsign;
	public boolean inHyperdrive=false;
	public int fighter=24, turrets=12, starDestroyerWeapon=1, rocketLaunchers=5, turbolasers=6;
	public int hp=768000, rank=0;
	public int hangar=50000;
	public double rank1=30000, rank2=140000, rank3=900000, rank4=10000000;
	int damage = rocketLaunchers*5400+turbolasers*2300; 
	
	public void nextrank() {
		System.out.println("piu piu PIU PIU PIU");
	}
	public void allFire() {
		System.out.println("piu piu PIU PIU PIU");
	}
	public void attackS(Shuttlecraft a) {
		System.out.println("нанесено урона "+damage);
		int newhp=a.hp-damage;
		if (newhp<=0){
			System.out.println("корабль "+a.name+" уничтожен");
			System.out.println("получен знак\"как конфетку у ребёнка\"");
		}
		else{
			a.hp=newhp;
		}
	}
	
	public void attackA(AntimatterEarner a) {
		System.out.println("нанесено урона "+damage);
		int newhp=a.hp-damage;
		if (newhp<=0){
			System.out.println("корабль "+a.name+" уничтожен");
			System.out.println("получен знак\"груз вёз, да недовёз\"");
		}
		else{
			a.hp=newhp;
			System.out.println("у цели осталось "+newhp+" hp ");
		}
	}

	public void attackS(LongRangeReconnaissance a) {
		System.out.println("нанесено урона "+damage);
		int newhp=a.hp-damage;
		if (a.invisibility==true){
			System.out.println("корабль "+a.name+" не обнаружен");
		}
		else if (newhp<=0){
			System.out.println("корабль "+a.name+" уничтожен");
			System.out.println("получен знак\"не успел убежать\"");
		}
		else  {
			a.hp=newhp;
			System.out.println("у цели осталось "+newhp+" hp ");
		}
	}

	public void starDestroyer() {
		System.out.println("bax babax AXAXAXAXAXAXAXAXAXAXAXA!");
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