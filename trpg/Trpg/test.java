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
	    System.out.println("1.캐릭터 찾기 2.캐릭터 입력  3.종료");
	    System.out.print(">>>");
	    num = sc.nextInt();
	    switch (num) {
		case 1:{
			System.out.print("찾을 학생 학번 입력 : ");
			player = sc.nextInt();
			bl=ch.searchch(arr,player);
			if(bl == true){
				System.out.println("플레이어수 : "+ch.getPlayer());
				System.out.println("이름 : "+ch.getName());
				System.out.println("종족 : "+ch.getCountry());
				System.out.println("세부종족 : "+ch.getSejob());
				System.out.println("직업 : "+ch.getJob());
				System.out.println("레벨 : "+ch.getLv());
				System.out.println("경험치 : "+ch.getExp());
			}else{
				System.out.println("찾는 학생이 없습니다!!!");
			}
			break;
			
		}
		case 2:{	    if(arr.size() == 3) {
	    	System.out.println("더이상 캐릭터를 만들수 없습니다.");}
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
			    System.out.println("캐릭터 생성완료");
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

	    
	    
	    
	

