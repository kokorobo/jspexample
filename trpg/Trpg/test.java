package Trpg;

import java.util.ArrayList;
import java.util.Scanner;

import Trpg.chtInfo;

public class test {
	public static final String name = "skumi";

	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    ArrayList<chtInfo> arr = new ArrayList<chtInfo>();
	    chtInfo ch = new chtInfo();
	    Plaing pl = new Plaing();
	    String country = null;
		String sejob = null;
		String job = null;
		String name = "skumi";
		int hp = 0;
		int maxhp = 0;
		int ac = 0;
		int str = 0;
		int dex = 0;
		int hel = 0;
		int intel = 0;
		int wis = 0;
		int chr = 0;
		int luc = 0;
		int kar = 0;
		int sin = 0;
		int player = 1;
		int num;
	    boolean bl;
	    while(true) {
	    System.out.println("1.ĳ���� ã�� 2.ĳ���� �Է�  3.����");
	    System.out.print(">>>");
	    num = sc.nextInt();
	    switch (num) {
		case 1:{
			System.out.print("ã�� �л� �й� �Է� : ");
			player = sc.nextInt();
			bl=ch.searchch(arr,player);
			if(bl == true){
				System.out.println("�÷��̾�� : "+ch.getPlayer());
				System.out.println("�̸� : "+ch.getName());
				System.out.println("���� : "+ch.getCountry());
				System.out.println("�������� : "+ch.getSejob());
				System.out.println("���� : "+ch.getJob());
				System.out.println("���� : "+ch.getLv());
				System.out.println("����ġ : "+ch.getExp());
			}else{
				System.out.println("ã�� �л��� �����ϴ�!!!");
			}
			break;
			
		}
		case 2:{	    if(arr.size() == 3) {
	    	System.out.println("���̻� ĳ���͸� ����� �����ϴ�.");}
	    	else if(arr.size() < 3){
	    		player = pl.player;ch.setPlayer(player);
	    		name = pl.name;ch.setName(name);
	    		country = pl.country;ch.setCountry(country);
	    		sejob = pl.sejob;ch.setSejob(sejob);
	    		job = pl.job;ch.setJob(job);
	    		hp = pl.hp;ch.setHp(maxhp);
			    maxhp = pl.maxhp;ch.setMaxhp(maxhp);
			    str = pl.str;ch.setStr(str);
			    dex = pl.dex;ch.setDex(dex);
			    ac = pl.ac;ch.setAc(ac);
			    hel = pl.hel;ch.setHel(hel);
			    intel = pl.intel;ch.setIntel(intel);
			    wis = pl.wis;ch.setWis(wis);
			    chr = pl.chr;ch.setChr(chr);
			    luc = pl.luc;ch.setLuc(luc);
			    kar = pl.kar;ch.setKar(kar);
			    sin = pl.sin;ch.setSin(sin);
			    arr.add(ch);
			    System.out.println("ĳ���� �����Ϸ�");
			    break;
	    	}
			
		}
		case 3:{
			
			return;
		}
		default:{
			break;
		}
		}
	    }	   
	}
}

	    
	    
	    
	

