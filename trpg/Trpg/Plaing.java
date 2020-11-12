package Trpg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Trpg.DB.armor;
import Trpg.DB.enemy;
import Trpg.DB.weapon;


public class Plaing {
	enemy en = new enemy();
	armor am = new armor();
	weapon wp = new weapon();
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	public static  int ranen = 0;
	public static int selme = 0;
	public static int player = 1;
	public static boolean gostop = true;
	public static String country = null;
	public static String sejob = null;
	public static String job = null;
	public static String name = null;
	//능력치
	public static int lv = 1;
	public static int need = 500;
	public static int hp = 0;
	public static int maxhp = 0;
	public static int ac = 0;
	public static int str = 0;
	public static int dex = 0;
	public static int hel = 0;
	public static int intel = 0;
	public static int wis = 0;
	public static int chr = 0;
	public static int luc = 0;
	public static int kar = 0;
	public static int sin = 0;
	public static int exp = 0;
	public static int wpacc = 0;
	public static int wpdice = 0;
	public static int wpdcr = 0;
	public static int enhp1 = 0;
	public static int enhp2 = 0;
	public static int enhp3 = 0;
	public static int stun = 0;
	public static int encount = 0;
	public static int money = 0;
	public static String eqwp = null;
	public static String eqam = null;
	public static int clrc = 0;
	int count = 0;
	public static int x = 0;
	public static String skna = null;
	public static long strp = 0; 
	public static long dexp = 0; 
	public static long help = 0; 
	public static long intelp = 0; 
	public static long wisp = 0; 
	public static long chrp = 0; 
	public static String enemyname = null;
	ArrayList statnam = new ArrayList();
	
	void reset() {
		 ranen = 0;
		 selme = 0;
		 player = 1;
		 gostop = true;
		 country = null;
		 sejob = null;
		 job = null;
		 name = null;
		//능력치
		 lv = 1;
		 need = 500;
		 hp = 0;
		 maxhp = 0;
		 ac = 0;
		 str = 0;
		 dex = 0;
		 hel = 0;
		 intel = 0;
		 wis = 0;
		  chr = 0;
		  luc = 0;
		  kar = 0;
		  sin = 0;
		  exp = 0;
		  wpacc = 0;
		  wpdice = 0;
		  wpdcr = 0;
		  enhp1 = 0;
		  enhp2 = 0;
		  enhp3 = 0;
		  stun = 0;
		  encount = 0;
		  money = 0;
		 eqwp = null;
		 eqam = null;
		count = 0;
		 x = 0;
		 skna = null;
		 strp = 0; 
		 dexp = 0; 
		 help = 0; 
		 intelp = 0; 
		 wisp = 0; 
		 chrp = 0; 
		 enemyname = null;
	}

	void mainpage() throws InterruptedException, IOException {
		while(gostop) {
			System.out.println("해모기의 여행기");
			System.out.println("================");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1.새로운 모험");
			System.out.println("2.이어하기 ");
			System.out.println("3.특전");
			System.out.println("4.끝내기");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				this.mainpage();
			}finally {
				this.selmenu(selme);
				break;
			}

			
		}// while
	} // mainpage
	void selmenu(int i) throws InterruptedException, IOException {
		selme = i;
		while(gostop) {
			switch	(i) {
			case 1:{
//				count ++;
//				player = (String)count;
				this.country();
				break;
				}//case
			case 2:{
				System.out.println("이전 모험 데이터를 불러 옵니다.");
				Load ld = new Load();
				System.out.println("===============");
				System.out.println("플레이하던 캐릭의 이름을 입력해 주세요");
				System.out.print(">>>");
				String name2 = sc.next();
				ld.load(name2);

				this.mainpage();
				break;
			}//case 2
			case 3:{
				System.out.println("도움 제작 주신 분들");
//				this.cusmer();

				this.mainpage();
				break;
			}//case 3
			case 4:{
				System.out.println("해당 모험은 끝나지 않았네");
				System.out.println("다시 돌아 올때까지 기다리겠네");
				gostop = false;
				break;
			}
			default :{
				System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				this.mainpage();
				break;
			}
			}//switch	
		}//while
	}//selmenu
	void country() throws InterruptedException, IOException {
		System.out.println("플레이 하실 캐릭을 선택 해주세요");
		System.out.println("1.인간 2.엘프 3.드워프 4.몬스터");
		System.out.print(">>>");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("대충 입력 하셨기에 몬스터로 시작합니다.");
			selme = 4;
		}finally {
			this.sejob(selme);
		}//try
	}//country
	void sejob(int i) throws InterruptedException, IOException {
		selme = i;
		while(gostop) {
			switch(selme) {
			case 1:{
				this.country = "인간";
				System.out.println("인간은 백인, 황인, 흑인 3종족이 있습니다.");
				System.out.println("1.백인 2.황인 3.흑인");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("종족을 잘못 입력하였기 때문에 랜덤으로 선택 됩니다.");
					selme = (int)(Math.random()*5)+1;
					if(selme == 4) {
						selme = 99;
						break;
					}else if(selme == 5) {
						selme = 98;
						break;
					}
				}finally {
					this.job(selme);
					break;
			}
			}//case 1
			case 2:{
				this.country = "엘프";
				System.out.println("엘프는 하이엘프, 우드엘프, 다크엘프 3종족이 있습니다.");
				System.out.println("1.하이엘프 2.우드엘프 3.다크엘프");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("종족을 잘못 입력하였기 때문에 랜덤으로 선택 됩니다.");
					selme = (int)(Math.random()*5)+1;
					if(selme == 4) {
						selme = 99;
						break;
					}else if(selme == 5) {
						selme = 98;
						break;
					}
				}finally {
					this.job(selme);
					break;
					}
				
			}//case 2
			case 3:{
				this.country = "드워프";
				System.out.println("드워프는4 불꽃드워프, 강철드워프, 대지드워프 3종족이 있습니다.");
				System.out.println("1.불꽃드워프 2.강철드워프 3.대지드워프");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("종족을 잘못 입력하였기 때문에 랜덤으로 선택 됩니다.");
					selme = (int)(Math.random()*5)+1;
					if(selme == 4) {
						selme = 99;
						break;
					}else if(selme == 5) {
						selme = 98;
						break;
					}
				}finally {
					this.job(selme);
					break;
					}
			}//case 3
			case 4:{
				this.country = "몬스터";
				System.out.println("몬스터는 고블린, 늑대, 오우거 3종족이 있습니다.");
				System.out.println("1.고블린 2.늑대 3.오우거");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("잘못 입력하면 몬스터는 랜덤으로 시작됩니다.");
					this.job((int)(Math.random()*3)+1);
				}finally {
					this.job(selme);
					break;
					}
			}//case 4
			default:{
				System.out.println("대충 입력 하셨기에 몬스터로 시작합니다.");
				selme = 4;
				break;
			}
		}//switch
	}//while
}//sejob


	void job(int i) throws InterruptedException, IOException {
		selme = i;
		if(country.equals("몬스터")) {
			System.out.println("몬스터 시나리오는 아직 준비 되지 않았습니다.");
			System.out.println("메인 화면으로 돌아갑니다.");
			this.mainpage();
		}else if(country.equals("인간")||
				country.equals("엘프")||
				country.equals("드워프")){
				switch (selme) {
			case 1:{
			if(country.equals("인간")) {
				this.sejob = "백인";
			}else if(country.equals("엘프")) {
				this.sejob = "하이엘프";
			}else if(country.equals("드워프")) {
				this.sejob = "불꽃드워프";
			}
			System.out.println("직업은 전사,도적,마법사,궁수,무투가");
			System.out.println("성기사 ,사제가 있습니다.");
			System.out.println("1.전사 2.도적 3.마법사 4.궁수 5.무투가");
			System.out.println("6.성기사 .7사제");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				selme = 77;
			}finally {
				this.setjob(selme);
				break;
				}//try
		}//case 1
		case 2:{
			if(country.equals("인간")) {
				this.sejob = "황인";
			}else if(country.equals("엘프")) {
				this.sejob = "우드엘프";
			}else if(country.equals("드워프")) {
				this.sejob = "강철드워프";
			}
			System.out.println("직업은 전사,도적,마법사,궁수,무투가");
			System.out.println("성기사 ,사제가 있습니다.");
			System.out.println("1.전사 2.도적 3.마법사 4.궁수 5.무투가");
			System.out.println("6.성기사 .7사제");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				selme = 77;
			}finally {
				this.setjob(selme);
				break;
				}//try
		}//case 2
		case 3:{
			if(country.equals("인간")) {
				this.sejob = "흑인";
			}else if(country.equals("엘프")) {
				this.sejob = "다크엘프";
			}else if(country.equals("드워프")) {
				this.sejob = "대지드워프";
			}
			System.out.println("직업은 전사,도적,마법사,궁수,무투가");
			System.out.println("성기사 ,사제가 있습니다.");
			System.out.println("1.전사 2.도적 3.마법사 4.궁수 5.무투가");
			System.out.println("6.성기사 .7사제");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				selme = 77;
			}finally {
				this.setjob(selme);
				break;
				}//try
			}//case 3
		case 98:{
			if(country.equals("인간")) {
				sejob = "혼혈";
			}else if(country.equals("엘프")) {
				sejob = "엘프혼혈";
			}else if(country.equals("드워프")) {
				sejob = "드래곤드워프";
			}
			System.out.println("직업은 전사,도적,마법사,궁수,무투가");
			System.out.println("성기사 ,사제가 있습니다.");
			System.out.println("1.전사 2.도적 3.마법사 4.궁수 5.무투가");
			System.out.println("6.성기사 .7사제");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				selme = 77;
			}finally {
				this.setjob(selme);
				break;
				}//try
		}//case 4
		case 99:{
			if(country.equals("인간")) {
				sejob = "갸루";
			}else if(country.equals("엘프")) {
				sejob = "버림받은엘프";
			}else if(country.equals("드워프")) {
				sejob = "마족드워프";
			}
			System.out.println("직업은 전사,도적,마법사,궁수,무투가");
			System.out.println("성기사 ,사제가 있습니다.");
			System.out.println("1.전사 2.도적 3.마법사 4.궁수 5.무투가");
			System.out.println("6.성기사 .7사제");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				selme = 77;
			}finally {
				this.setjob(selme);
				break;
				}//try
		}
		default:{
			System.out.println("종족을 잘못 입력하였기 때문에 랜덤으로 선택 됩니다.");
			selme = (int)(Math.random()*5)+1;
			if(selme == 4) {
				selme = 99;
			}else if(selme == 5) {
				selme = 98;
			}
			this.job(selme);
			}break;
		
		}//switch
	}// else
	}// job 
	void setjob(int i) throws InterruptedException, IOException {
		selme = i;
		switch(selme) {
			case 1:{
				job ="전사";
				this.name();
				break;
				}
			case 2:{
				job ="도적";
				this.name();
				break;
				}
			case 3:{
				job ="마법사";
				this.name();
				break;
				}
			case 4:{
				job ="궁수";
				this.name();
				break;
				}
			case 5:{
				job ="무투가";
				this.name();
				break;
				}
			case 6:{
				job ="성기사";
				this.name();
				break;
			}
			case 7:{
				job ="사제";
				this.name();
				break;
			}
			case 99: job ="네크로멘서";this.name();break;
			case 98: job ="농부";this.name();break;
			default :{
				int sum = (int)(Math.random()*8)+1;
				System.out.println(sum);
				if(sum ==15 || sum == 7) {
					System.out.println("랜덤으로 전사가 선택 되었습니다.");
					selme = 1;
					this.setjob(selme);
					break;
				}else if(sum == 16 || sum ==8) {
					System.out.println("랜덤으로 도적이 선택 되었습니다.");
					selme = 2;
					this.setjob(selme);
					break;
				}else if(sum == 6 || sum == 12) {
					System.out.println("랜덤으로 마법사가 선택 되었습니다.");
					selme = 3;
					this.setjob(selme);
					break;
				}else if(sum == 5 || sum == 13) {
					System.out.println("랜덤으로 궁수가 선택 되었습니다.");
					selme = 4;
					this.setjob(selme);
					break;
				}else if(sum == 10 || sum == 11) {
					System.out.println("랜덤으로 무투가가 선택 되었습니다.");
					selme = 5;
					this.setjob(selme);
					break;
				}else if(sum == 2 || sum == 9) {
					System.out.println("랜덤으로 성기사가 선택 되었습니다.");
					selme = 6;
					this.setjob(selme);
					break;
				}else if(sum == 14 || sum == 3) {
					System.out.println("랜덤으로 사제가 선택 되었습니다.");
					selme = 7;
					this.setjob(selme);
					break;
				}else if(sum == 4) {
					System.out.println("랜덤으로 히든 직업(네크로멘서)가 선택 되었습니다.");
					selme = 99;
					this.setjob(selme);
					break;
				}else if(sum == 1) {
					System.out.println("랜덤으로 히든 직업(농부)가 선택 되었습니다.");
					selme = 98;
					this.setjob(selme);
					break;
				}
				break;
		}
		}
	}
	public void name() throws InterruptedException, IOException {
		
		System.out.println("이름을 입력해 주세요"); 
		System.out.print(">>>");
		name = sc.next();
		if (name != null) {
			System.out.println("설정을 보여드립니다.");
			this.showname();
		} 
	} //name
	void showname() throws InterruptedException, IOException {
		System.out.println("이름 :" + name);
		System.out.println("종족 :" +country);
		System.out.println("세부 :" +sejob);
		System.out.println("직업 :"+ job);
		System.out.println("============");
		this.statset();
		
	}// showname
	void showstat() {
		strp = (str - 10) / 3; 
		dexp = (dex - 10) / 3; 
		help = (hel - 10) / 3; 
		intelp = (intel - 10) / 3; 
		wisp = (wis - 10) / 3; 
		chrp = (chr - 10) / 3;
		if(str < 10) {
			strp = (((10 - str -1)/3)+1) *-1; 
		}
		if(dex < 10) {
			dexp = (((10 - dex -1)/3)+1) *-1; 
		}
		if(hel < 10) {
			help = (((10 - hel- 1)/3)+1) *-1; 
		}
		if(intel < 10) {
			intelp = (((10 - intel- 1)/3)+1) *-1; 
		}
		if(wis < 10) {
			wisp = (((10 - wis- 1)/3)+1) *-1; 
		}
		if(chr < 10) {
			chrp = (((10 - chr- 1)/3)+1) *-1; 
		}
		System.out.println("이름 :" +name);
		System.out.println("종족 :" +country);
		System.out.println("세부 :" +sejob);
		System.out.println("직업 :"+ job);
		System.out.println("골드 :"+ money);
		System.out.println("============");
		System.out.println("레벨 : "+lv);
		System.out.println("체력 : "+hp + " / " +maxhp);
		System.out.println("아머 : "+ac);
		System.out.println("경험 : "+exp);
		System.out.println("============");
		System.out.println("착용 무기 : "+ eqwp);
		System.out.println("착용 갑옷 : "+ eqam);
		System.out.println("근력 : "+str + "("+strp+")");
		System.out.println("민첩 : "+dex+ "("+dexp+")");
		System.out.println("건강 : "+hel+ "("+help+")");
		System.out.println("지능 : "+intel+ "("+intelp+")");
		System.out.println("지혜 : "+wis+ "("+wisp+")");
		System.out.println("매력 : "+chr+ "("+chrp+")");
		System.out.println("행운 : "+luc);
		System.out.println("선함 : "+kar);
		System.out.println("신앙 : "+sin);
		}	
	void statset() throws InterruptedException, IOException {
		if(country.equals("인간")) {
			if(sejob.equals("백인")) {
				System.out.println("백인 특 : 행운 + 2, 선함 -2");
				System.out.println("'인간들 중에서도 가장 우위에 있다고 착각하는 자들이지.");
				System.out.println("아둔함에 눈이 멀어 세상 어떻게 돌아가는지 모르고");
				System.out.println("기술력 하나로 똑똑 하다고 생각하니...'");
				ArrayList statwhite = new ArrayList();
				statwhite.add(15);
				statwhite.add(13);
				statwhite.add(10);
				statwhite.add(8);
				statwhite.add(8);
				statwhite.add(4);
				
				luc += 2;
				kar -= 2;
				
				
				
				System.out.println(statwhite);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statwhite.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statwhite.get(i)+"점을 부여합니다.");
						str = (int) statwhite.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statwhite.get(i)+"점을 부여합니다.");
						dex = (int) statwhite.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statwhite.get(i)+"점을 부여합니다.");
						hel = (int) statwhite.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statwhite.get(i)+"점을 부여합니다.");
						intel = (int) statwhite.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statwhite.get(i)+"점을 부여합니다.");
						wis = (int) statwhite.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statwhite.get(i)+"점을 부여합니다.");
						chr = (int) statwhite.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
			}else if(sejob.equals("황인")) {
				System.out.println("황인 특 : 행운 -2, 선함 +2 신앙심 +10");
				System.out.println("'인간들중 가장 오래 되었다는 종족이지");
				System.out.println("옛날에 특이한 황인들은 호랑이와 담배도 피고 ");
				System.out.println("드래곤과 목욕도 했다지, 다 옛날 일이지만 말이야...'");
				ArrayList statbrown = new ArrayList();
				statbrown.add(12);
				statbrown.add(11);
				statbrown.add(10);
				statbrown.add(9);
				statbrown.add(8);
				statbrown.add(7);
				
				luc -= 2;
				kar += 2;
				sin += 10;
				
				
				System.out.println(statbrown);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statbrown.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statbrown.get(i)+"점을 부여합니다.");
						str = (int) statbrown.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statbrown.get(i)+"점을 부여합니다.");
						dex = (int) statbrown.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statbrown.get(i)+"점을 부여합니다.");
						hel = (int) statbrown.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statbrown.get(i)+"점을 부여합니다.");
						intel = (int) statbrown.get(i);
						System.out.println("황인 숨겨진 특성 지능 +1 부여합니다.");
						intel += 1;
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statbrown.get(i)+"점을 부여합니다.");
						wis = (int) statbrown.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statbrown.get(i)+"점을 부여합니다.");
						chr = (int) statbrown.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
				
			}else if(sejob.equals("흑인")) {
				System.out.println("흑인 특 : 행운 -4");
				System.out.println("'그들의 힘과 민첩은 가히 동물과도 같은 능력을 가지고 있지");
				System.out.println("다만 그들에게는 너무나 큰 불행이 따르고 있을 뿐이야");
				System.out.println("어찌보면 뒤쳐진 것 일지도 모르지...'");
				ArrayList statblack = new ArrayList();
				statblack.add(15);
				statblack.add(15);
				statblack.add(10);
				statblack.add(6);
				statblack.add(6);
				statblack.add(4);
				
				luc -= 4;
				kar = 0;
				
				
				
				System.out.println(statblack);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statblack.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statblack.get(i)+"점을 부여합니다.");
						str = (int) statblack.get(i);
						System.out.println("흑인 숨겨진 특성 근력 +1 부여합니다.");
						str += 1;
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statblack.get(i)+"점을 부여합니다.");
						dex = (int) statblack.get(i);
						System.out.println("흑인 숨겨진 특성 민첩 +1 부여합니다.");
						dex += 1;
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statblack.get(i)+"점을 부여합니다.");
						hel = (int) statblack.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statblack.get(i)+"점을 부여합니다.");
						intel = (int) statblack.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statblack.get(i)+"점을 부여합니다.");
						wis = (int) statblack.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statblack.get(i)+"점을 부여합니다.");
						chr = (int) statblack.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
				
			}else if(sejob.equals("갸루")) {
				System.out.println("갸루 특 : 행운 +4 선함 +4");
				System.out.println("'갸루족도 종류가 다양했지, 전투를 책임지는 야맘바,");
				System.out.println("금전 수급을 담당하는 블랙갸루, 전쟁인원을 확보하는 히메갸루");
				System.out.println("이세계를 넘어온 저 갸루는 어떤 갸루일까?'");
				ArrayList statgal = new ArrayList();
				statgal.add(13);
				statgal.add(12);
				statgal.add(11);
				statgal.add(10);
				statgal.add(9);
				statgal.add(8);
				
				luc += 4;
				kar += 4;
				
				
				
				System.out.println(statgal);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statgal.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statgal.get(i)+"점을 부여합니다.");
						str = (int) statgal.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statgal.get(i)+"점을 부여합니다.");
						dex = (int) statgal.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statgal.get(i)+"점을 부여합니다.");
						hel = (int) statgal.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statgal.get(i)+"점을 부여합니다.");
						intel = (int) statgal.get(i);
						System.out.println("갸루 숨겨진 특성 지능 -3 부여합니다.");
						intel -= 3;
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statgal.get(i)+"점을 부여합니다.");
						wis = (int) statgal.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statgal.get(i)+"점을 부여합니다.");
						chr = (int) statgal.get(i);
						System.out.println("갸루 숨겨진 특성 매력 +3 부여합니다.");
						chr += 3;
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for	
			}else if(sejob.equals("혼혈")) {
				System.out.println("혼혈 특 : 행운 +1 선함 +1");
				System.out.println("'다른 종족과 피를 섞어 더 뛰어난 개체를 만든다.");
				System.out.println("가능만 하다면 훨씬 뛰어난 개체가 태어나겠지");
				System.out.println("혹은 반대인 경우도 있지만 말이야.'");
				ArrayList stathm = new ArrayList();
				stathm.add(13);
				stathm.add(12);
				stathm.add(11);
				stathm.add(10);
				stathm.add(9);
				stathm.add(8);
				
				luc += 1;
				kar += 1;
				
				System.out.println(stathm);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(stathm.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+stathm.get(i)+"점을 부여합니다.");
						str = (int) stathm.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+stathm.get(i)+"점을 부여합니다.");
						dex = (int) stathm.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+stathm.get(i)+"점을 부여합니다.");
						hel = (int) stathm.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+stathm.get(i)+"점을 부여합니다.");
						intel = (int) stathm.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+stathm.get(i)+"점을 부여합니다.");
						wis = (int) stathm.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+stathm.get(i)+"점을 부여합니다.");
						chr = (int) stathm.get(i);
						System.out.println("혼혈 숨겨진 특성 매력 +1 부여합니다.");
						chr += 1;
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
				System.out.println("혼혈 숨겨진 특성 랜덤 능력치에 +1 부여합니다.");
				int ran = 0;
				ran = (int)(Math.random()*5);
				switch (ran) {
				case 0:{
					System.out.println("혼혈 특성으로 근력에 +1 되었습니다.");
					str += 1;
					break;}
				case 1:{
					System.out.println("혼혈 특성으로 민첩에 +1 되었습니다.");
					dex += 1;
					break;}
				case 2:{
					System.out.println("혼혈 특성으로 건강에 +1 되었습니다.");
					hel += 1;
					break;}
				case 3:{
					System.out.println("혼혈 특성으로 지능에 +1 되었습니다.");
					intel += 1;
					break;}
				case 4:{
					System.out.println("혼혈 특성으로 지능에 +1 되었습니다.");
					wis += 1;
					break;}
				case 5:{
					System.out.println("혼혈 특성으로 매력에 +1 되었습니다.");
					chr += 1;
					break;}
	
				}
			}
		}else if(country.equals("엘프")) {
			if(sejob.equals("하이엘프")) {
				System.out.println("하이엘프 특 : 행운 +3 선함 +2 신앙심 +10");
				System.out.println("'하이엘프는 엘프중에서도 몇 안되는 적은 개체를 유지하고 있지");
				System.out.println("태어나지 않아서가 아니야...");
				System.out.println("자기들의 권력을 위해서지'");
				ArrayList stathl = new ArrayList();
				stathl.add(15);
				stathl.add(12);
				stathl.add(10);
				stathl.add(8);
				stathl.add(8);
				stathl.add(6);
				
				luc += 3;
				kar += 2;
				sin += 10;
				
				
				System.out.println(stathl);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(stathl.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+stathl.get(i)+"점을 부여합니다.");
						str = (int) stathl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+stathl.get(i)+"점을 부여합니다.");
						dex = (int) stathl.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+stathl.get(i)+"점을 부여합니다.");
						hel = (int) stathl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+stathl.get(i)+"점을 부여합니다.");
						intel = (int) stathl.get(i);
						System.out.println("하이엘프 숨겨진 특성 지능 +1 부여합니다.");
						intel += 1;
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+stathl.get(i)+"점을 부여합니다.");
						wis = (int) stathl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+stathl.get(i)+"점을 부여합니다.");
						chr = (int) stathl.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
			}else if(sejob.equals("우드엘프")) {
				System.out.println("우드엘프 특 : 행운 +4");
				System.out.println("'우드엘프는 숲을 사랑하는 제일 흔한 엘프지");
				System.out.println("제일 흔하다 해도 제일 보기가 힘들어");
				System.out.println("죽기 전에는 숲에서 절대 볼수가 없으니까'");
				ArrayList statwl = new ArrayList();
				statwl.add(15);
				statwl.add(13);
				statwl.add(10);
				statwl.add(8);
				statwl.add(7);
				statwl.add(6);
				
				luc += 4;
				kar = 0;
				
				
				
				System.out.println(statwl);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statwl.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statwl.get(i)+"점을 부여합니다.");
						str = (int) statwl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statwl.get(i)+"점을 부여합니다.");
						dex = (int) statwl.get(i);
						System.out.println("우드엘프 숨겨진 특성 민첩 +1 부여합니다.");
						dex += 1;
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statwl.get(i)+"점을 부여합니다.");
						hel = (int) statwl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statwl.get(i)+"점을 부여합니다.");
						intel = (int) statwl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statwl.get(i)+"점을 부여합니다.");
						wis = (int) statwl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statwl.get(i)+"점을 부여합니다.");
						chr = (int) statwl.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
			}else if(sejob.equals("다크엘프")) {
				System.out.println("다크엘프 특 : 행운 -2 선함 -5 신앙심 -5");
				System.out.println("'다크엘프는 하이엘프 우드엘프 할거 없이 타락하면 되는 종족이야");
				System.out.println("어찌보면 제일 엘프중에선 다른 의미로 착하다고 할수 있지.");
				System.out.println("적어도 지들만의 세상에 갖혀 살진 않으니까'");
				ArrayList statdl = new ArrayList();
				statdl.add(15);
				statdl.add(13);
				statdl.add(10);
				statdl.add(8);
				statdl.add(7);
				statdl.add(6);
				
				luc -= 2;
				kar -= 5;
				sin -= 5;
				
				
				System.out.println(statdl);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statdl.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statdl.get(i)+"점을 부여합니다.");
						str = (int) statdl.get(i);
						System.out.println("다크엘프 숨겨진 특성 민첩 +1 부여합니다.");
						str += 1;
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statdl.get(i)+"점을 부여합니다.");
						dex = (int) statdl.get(i);
						System.out.println("다크엘프 숨겨진 특성 민첩 +2 부여합니다.");
						dex += 2;
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statdl.get(i)+"점을 부여합니다.");
						hel = (int) statdl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statdl.get(i)+"점을 부여합니다.");
						intel = (int) statdl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statdl.get(i)+"점을 부여합니다.");
						wis = (int) statdl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statdl.get(i)+"점을 부여합니다.");
						chr = (int) statdl.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
			}else if(sejob.equals("버림받은엘프")) {
				System.out.println("버림받은엘프 특 : 행운 -4 선함 -4");
				System.out.println("'엘프는 대체로 무리 생활을 지어 살지");
				System.out.println("엘프라고 다 착한 것만은 아니야");
				System.out.println("그 대표적인 증거가 이 종족이니까...'");
				ArrayList statsl = new ArrayList();
				statsl.add(14);
				statsl.add(12);
				statsl.add(10);
				statsl.add(8);
				statsl.add(6);
				statsl.add(5);
				
				luc -= 4;
				kar -= 4;
				
				
				
				System.out.println(statsl);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statsl.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statsl.get(i)+"점을 부여합니다.");
						str = (int) statsl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statsl.get(i)+"점을 부여합니다.");
						dex = (int) statsl.get(i);
						System.out.println("버림받은엘프 숨겨진 특성 민첩 +2 부여합니다.");
						dex += 2;
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statsl.get(i)+"점을 부여합니다.");
						hel = (int) statsl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statsl.get(i)+"점을 부여합니다.");
						intel = (int) statsl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statsl.get(i)+"점을 부여합니다.");
						wis = (int) statsl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statsl.get(i)+"점을 부여합니다.");
						chr = (int) statsl.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for
			}else if(sejob.equals("엘프혼혈")) {
				System.out.println("엘프혼혈 특 : 행운 -1 선함 +1");
				System.out.println("'간혹 엘프들 중에서도 완전 다른 이종족이랑 사랑에 빠지곤 하지");
				System.out.println("하지만 엘프 내에서는 수치라고 생각하거든");
				System.out.println("그래서 결과가 썩 좋지많은 않더라고...'");
				ArrayList statsl = new ArrayList();
				statsl.add(14);
				statsl.add(13);
				statsl.add(11);
				statsl.add(9);
				statsl.add(7);
				statsl.add(6);
				
				luc -= 1;
				kar += 1;
				
				
				
				System.out.println(statsl);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statsl.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statsl.get(i)+"점을 부여합니다.");
						str = (int) statsl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statsl.get(i)+"점을 부여합니다.");
						dex = (int) statsl.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statsl.get(i)+"점을 부여합니다.");
						hel = (int) statsl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statsl.get(i)+"점을 부여합니다.");
						intel = (int) statsl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statsl.get(i)+"점을 부여합니다.");
						wis = (int) statsl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statsl.get(i)+"점을 부여합니다.");
						chr = (int) statsl.get(i);
						System.out.println("엘프혼혈 숨겨진 특성 매력 -1 부여합니다.");
						chr -= 1;
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for		
				System.out.println("혼혈 숨겨진 특성 랜덤 능력치에 +1 부여합니다.");
				int ran = 0;
				ran = (int)(Math.random()*5);
				switch (ran) {
				case 0:{
					System.out.println("혼혈 특성으로 근력에 +1 되었습니다.");
					str += 1;
					break;}
				case 1:{
					System.out.println("혼혈 특성으로 민첩에 +1 되었습니다.");
					dex += 1;
					break;}
				case 2:{
					System.out.println("혼혈 특성으로 건강에 +1 되었습니다.");
					hel += 1;
					break;}
				case 3:{
					System.out.println("혼혈 특성으로 지능에 +1 되었습니다.");
					intel += 1;
					break;}
				case 4:{
					System.out.println("혼혈 특성으로 지능에 +1 되었습니다.");
					wis += 1;
					break;}
				case 5:{
					System.out.println("혼혈 특성으로 매력에 +1 되었습니다.");
					chr += 1;
					break;}
	
				}
		}//엘프
		}else if(country.equals("드워프")) {
			if(sejob.equals("불꽃드워프")) {
				System.out.println("불꽃드워프 특 : 행운 +1 선함 +1 신앙심 +5");
				System.out.println("'불꽃드워프는 공방에 불꽃을 신으로 모시는 종족이야.");
				System.out.println("불꽃.. 참 좋아 요리를 하거나, 도구를 만들거나");
				System.out.println("모든것을 태워 버리거나...'");
				ArrayList statfd = new ArrayList();
				statfd.add(17);
				statfd.add(13);
				statfd.add(10);
				statfd.add(7);
				statfd.add(7);
				statfd.add(4);
				
				luc += 1;
				kar += 1;
				sin += 5;
				
				
				System.out.println(statfd);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statfd.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statfd.get(i)+"점을 부여합니다.");
						str = (int) statfd.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statfd.get(i)+"점을 부여합니다.");
						dex = (int) statfd.get(i);
						System.out.println("불꽃드워프 숨겨진 특성 민첩 +1 부여합니다.");
						dex += 1;
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statfd.get(i)+"점을 부여합니다.");
						hel = (int) statfd.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statfd.get(i)+"점을 부여합니다.");
						intel = (int) statfd.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statfd.get(i)+"점을 부여합니다.");
						wis = (int) statfd.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statfd.get(i)+"점을 부여합니다.");
						chr = (int) statfd.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for	
			}else if(sejob.equals("강철드워프")) {
				System.out.println("강철드워프 특 : 행운 +1 선함 +1 신앙심 +5");
				System.out.println("'강철드워프는 모든 도구의 기본 재료인 철을 신앙하지");
				System.out.println("모든것은 철을 가공해서 만든다나 뭐라나...");
				System.out.println("그렇긴 하지 최고의 무기들은 금속이니까.'");
				ArrayList statid = new ArrayList();
				statid.add(16);
				statid.add(15);
				statid.add(11);
				statid.add(7);
				statid.add(5);
				statid.add(4);
				
				luc += 1;
				kar += 1;
				sin += 5;
				
				
				System.out.println(statid);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statid.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statid.get(i)+"점을 부여합니다.");
						str = (int) statid.get(i);
						System.out.println("강철드워프 숨겨진 특성 근력 +1 부여합니다.");
						str += 1;
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statid.get(i)+"점을 부여합니다.");
						dex = (int) statid.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statid.get(i)+"점을 부여합니다.");
						hel = (int) statid.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statid.get(i)+"점을 부여합니다.");
						intel = (int) statid.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statid.get(i)+"점을 부여합니다.");
						wis = (int) statid.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statid.get(i)+"점을 부여합니다.");
						chr = (int) statid.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for	
				
			}else if(sejob.equals("대지드워프")) {
				System.out.println("대지드워프 특 : 행운 +1 선함 +1 +5");
				System.out.println("'대지는 모든 재료들은 다 땅에서 나온다고 생각 하는 종족이야");
				System.out.println("불꽃, 광물, 그렇기 때문에 다른 드워프 보다 고귀하다 생각 하지.");
				System.out.println("죽으면 다시 돌아 간다는 생각까지...'");
				ArrayList statld = new ArrayList();
				statld.add(17);
				statld.add(14);
				statld.add(11);
				statld.add(6);
				statld.add(5);
				statld.add(5);
				
				luc += 1;
				kar += 1;
				sin += 5;
				
				
				
				System.out.println(statld);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statld.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statld.get(i)+"점을 부여합니다.");
						str = (int) statld.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statld.get(i)+"점을 부여합니다.");
						dex = (int) statld.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statld.get(i)+"점을 부여합니다.");
						hel = (int) statld.get(i);
						System.out.println("대지드워프 숨겨진 특성 민첩 +1 부여합니다.");
						hel += 1;
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statld.get(i)+"점을 부여합니다.");
						intel = (int) statld.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statld.get(i)+"점을 부여합니다.");
						wis = (int) statld.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statld.get(i)+"점을 부여합니다.");
						chr = (int) statld.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for	
				
			}else if(sejob.equals("드래곤드워프")) {
				System.out.println("드래곤드워프 특 : 행운 +4 선함 -1 신앙심 -5");
				System.out.println("'드래곤드워프는 드래곤 밑에서 도구를 만드는 기술자들이지");
				System.out.println("다만 드래곤의 모든 통재하에 놓여 있기에 갖혀 지내는 상황이지");
				System.out.println("그러다 드래곤들이 멸망한 지금은 무엇을 해야 할지도 몰라...'");
				ArrayList statdd = new ArrayList();
				statdd.add(15);
				statdd.add(14);
				statdd.add(11);
				statdd.add(8);
				statdd.add(6);
				statdd.add(5);
				
				luc += 4;
				kar -= 1;
				sin -= 5;
				
				
				System.out.println(statdd);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statdd.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.지혜 6.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statdd.get(i)+"점을 부여합니다.");
						str = (int) statdd.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statdd.get(i)+"점을 부여합니다.");
						dex = (int) statdd.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statdd.get(i)+"점을 부여합니다.");
						hel = (int) statdd.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statdd.get(i)+"점을 부여합니다.");
						intel = (int) statdd.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("지혜에 "+statdd.get(i)+"점을 부여합니다.");
						wis = (int) statdd.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("매력에 "+statdd.get(i)+"점을 부여합니다.");
						chr = (int) statdd.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for	
				
			}else if(sejob.equals("마족드워프")) {
				System.out.println("마족드워프 특 : 행운 -2 선함 -2 신앙심 -10");
				System.out.println("'마족드워프는 마족의 무구를 만드는 자들이지");
				System.out.println("마족의 무구를 만들다가 결국 마족의 직위를 얻어 마족이 되었어");
				System.out.println("다만 그 선택이 좋은 결과가 아니었던 것도 모르고 말이야...'");
				ArrayList statmd = new ArrayList();
				statmd.add(16);
				statmd.add(10);
				statmd.add(10);
				statmd.add(10);
				statmd.add(8);
				statmd.add(4);
				
				luc -= 2;
				kar -= 2;
				sin -= 10;
				
				
				System.out.println(statmd);
				System.out.println("분배 합니다.");
				System.out.println("높은 순으로 부여 할 능력치를 선택 하여주세요.");
				for(int i = 0 ; i < 5 ; i ++) {
				System.out.println(statmd.get(i) + "를 부여할 스탯은?");
				System.out.println("1.근력 2.민첩 3.건강 4.지능 5.매력");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("숫자확인 후 입력 부탁드립니다.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 5) {
					if(selme == 1 && str == 0) {
						System.out.println("근력에 "+statmd.get(i)+"점을 부여합니다.");
						str = (int) statmd.get(i);
						System.out.println("마족드워프 숨겨진 특성 힘 +2 부여합니다.");
						str += 2;
					}else if(selme == 2 && dex == 0) {
						System.out.println("민첩에 "+statmd.get(i)+"점을 부여합니다.");
						dex = (int) statmd.get(i);
						System.out.println("마족드워프 숨겨진 특성 민첩 +2 부여합니다.");
						dex += 2;
					}else if(selme == 3 && hel == 0) {
						System.out.println("건강에 "+statmd.get(i)+"점을 부여합니다.");
						hel = (int) statmd.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("지능에 "+statmd.get(i)+"점을 부여합니다.");
						intel = (int) statmd.get(i);
					}else if(selme == 5 && chr == 0) {
						System.out.println("매력에 "+statmd.get(i)+"점을 부여합니다.");
						chr = (int) statmd.get(i);
					}else {
						System.out.println("해당 능력치엔 이미 부여 되어있습니다.");
						System.out.println("다른 능력치를 선택하세요");
						i--;
					}
				}else {
					System.out.println("능력치를 다시 확인 후 부여해주세요.");
					i--;
				}
		}//for	
					System.out.println("마족드워프는 지혜롭지 못한 선택으로 인해 지혜는 고정됩니다.");
					System.out.println("지혜에 "+statmd.get(5)+"점을 부여합니다.");
					wis = (int) statmd.get(5);
				
			}
		}//종족별 if문
		if(job.equals("네크로멘서")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("신앙심 - 20 지능 + 10 지혜 + 3");
			sin -= 20;
			intel += 10;
			wis += 3;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 낫 2. 해골");
			System.out.println("낫은 물공특화"); int here;
			System.out.println("해골은 마공특화");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기 장착하지 않고 진행합니다");
				eqwp = "맨손";
		
			}finally {
				if(selme == 1) {
					System.out.println("낫을 장착 했습니다.");
					eqwp = "낫";
				}else if(selme == 2) {
					System.out.println("해골을 장착 했습니다.");
					eqwp = "해골";
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.누더기 2.넝마");
			System.out.println("그게 그거");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("누더기를 장착 했습니다.");
					eqam = "누더기";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("넝마를 장착 했습니다.");
					eqam = "넝마";
					ac = am.amac(eqam);
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("사제")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("신앙심 +10 지능 +5 지혜 +5");
			sin += 10;
			intel += 5;
			wis += 5;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 지팡이 2. 책");
			System.out.println("지팡이는 마공"); int here;
			System.out.println("책은 물공 (숨겨진 크리티컬)");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기를 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("지팡이를 장착 했습니다.");
					eqwp = "지팡이";
				}else if(selme == 2) {
					System.out.println("책을 장착 했습니다.");
					eqwp = "책";
				}else {
					System.out.println("무기를 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.사제복 2.가죽갑옷");
			System.out.println("사제복은 지능");int here2;
			System.out.println("가죽갑옷은 민첩");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("사제복을 장착 했습니다.");
					eqam = "사제복";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("가죽갑옷을 장착 했습니다.");
					eqam = "가죽갑옷";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("성기사")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("신앙심 +5 근력 +5 건강 +3 지능+2");
			sin += 5;
			str += 5;
			hel += 3;
			intel += 2;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 8");
			maxhp = 8;
			hp = 8;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 모닝스타 2. 건틀릿");
			System.out.println("모닝스타는 힘"); int here;
			System.out.println("건틀릿은 힘");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기를 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("모닝스타를 장착 했습니다.");
					eqwp = "모닝스타";
				}else if(selme == 2) {
					System.out.println("건틀렛을 장착 했습니다.");
					eqwp = "건틀렛";
				}else {
					System.out.println("무기를 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.사제복 2.철갑옷");
			System.out.println("사제복은 지능");int here2;
			System.out.println("철갑옷은 힘");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("사제복을 장착 했습니다.");
					eqam = "사제복";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("철갑옷을 장착 했습니다.");
					eqam = "철갑옷";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("무투가")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("근력 +4 민첩 +3 건강 +3");
			str += 4;
			dex += 3;
			hel += 3;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 8");
			maxhp = 8;
			hp = 8;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 건틀렛 2. 글러브");
			System.out.println("건틀렛은 힘"); int here;
			System.out.println("글러브는 민첩");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기를 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("건틀렛을 장착 했습니다.");
					eqwp = "건틀렛";
				}else if(selme == 2) {
					System.out.println("글러브를 장착 했습니다.");
					eqwp = "글러브";
				}else {
					System.out.println("무기를 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.도복 2.가죽갑옷");
			System.out.println("도복은 무관");int here2;
			System.out.println("가죽갑옷은 민첩");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("도복을 장착 했습니다.");
					eqam = "도복";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("가죽갑옷을 장착 했습니다.");
					eqam = "가죽갑옷";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("궁수")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("민첩 +7 지혜 +3");
			dex += 7;
			wis += 3;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 6");
			maxhp = 6;
			hp = 6;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 활 2. 표창");
			System.out.println("활은 민"); int here;
			System.out.println("표창은 민");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("활을 장착 했습니다.");
					eqwp = "활";
				}else if(selme == 2) {
					System.out.println("표창을 장착 했습니다.");
					eqwp = "표창";
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1. 가죽갑옷 2. 닌자옷");
			System.out.println("그게 그거");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("가죽갑옷을 장착 했습니다.");
					eqam = "가죽갑옷";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("닌자옷을 장착 했습니다.");
					eqam = "닌자옷";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("마법사")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("지능 +6 지혜 +4");
			intel += 6;
			wis += 4;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 지팡이 2. 책");
			System.out.println("지팡이는 마공"); int here;
			System.out.println("책은 물공");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("지팡이를 장착 했습니다.");
					eqwp = "지팡이";
				}else if(selme == 2) {
					System.out.println("책을 장착 했습니다.");
					eqwp = "책";
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.로브 2.가죽갑옷");
			System.out.println("그게 그거");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("로브를 장착 했습니다.");
					eqam = "로브";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("가죽갑옷를 장착 했습니다.");
					eqam = "가죽갑옷";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("도적")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("민첩 +10");
			dex += 10;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 6");
			maxhp = 6;
			hp = 6;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 단검 2. 낫");
			System.out.println("단검은 민"); int here;
			System.out.println("낫은 민힘 ");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("단검을 장착 했습니다.");
					eqwp = "단검";
				}else if(selme == 2) {
					System.out.println("낫을 장착 했습니다.");
					eqwp = "낫";
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.가죽갑옷 2.죄수복");
			System.out.println("그게 그거");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("가죽갑옷을 장착 했습니다.");
					eqam = "가죽갑옷";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("죄수복 장착 했습니다.");
					eqam = "죄수복";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("전사")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("근력 +5 건강 +5");
			str += 5;
			hel += 5;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 8");
			maxhp = 8;
			hp = 8;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 한손검 2. 일본도");
			System.out.println("한손검은 방어"); int here;
			System.out.println("일본도는 민");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("한손검을 장착 했습니다.");
					eqwp = "한손검";
				}else if(selme == 2) {
					System.out.println("일본도를 장착 했습니다.");
					eqwp = "일본도";
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.철갑옷 2.가죽갑옷");
			System.out.println("그게 그거");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("철갑옷을 장착 했습니다.");
					eqam = "철갑옷";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("가죽갑옷을 장착 했습니다.");
					eqam = "가죽갑옷";
					ac = am.amac(eqam);
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("농부")) {
			System.out.println(job + "직업 추가 능력치");
			System.out.println("근력 +5 건강 -3");
			str += 5;
			hel -= 3;
			System.out.println("체력을 정합니다.");
			System.out.println(job + "기본 체력은 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "의 무기를 선택합니다.");
			System.out.println("1. 낫 2. 허수아비");
			System.out.println("낫은 물공"); int here;
			System.out.println("허수아비는 친구");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("무기 장착하지 않고 진행합니다");
				eqwp = "맨손";
			}finally {
				if(selme == 1) {
					System.out.println("낫을 장착 했습니다.");
					eqwp = "낫";
				}else if(selme == 2) {
					System.out.println("허수아비을 장착 했습니다.");
					eqwp = "허수아비";
				}else {
					System.out.println("무기 장착하지 않고 진행합니다");
					eqwp = "맨손";
				}
			}
			System.out.println(job + "의 방어구를 방어구를 선택합니다.");
			System.out.println("1.누더기 2.넝마");
			System.out.println("그게 그거");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("방어구를 장착하지 않고 진행합니다");
				eqam = "알몸";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("누더기를 장착 했습니다.");
					eqam = "누더기";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("넝마를 장착 했습니다.");
					eqam = "넝마";
					ac = am.amac(eqam);
				}else {
					System.out.println("방어구를 장착하지 않고 진행합니다");
					eqam = "알몸";
					ac = am.amac(eqam);
					
				}
			}
		}
		strp = (str - 10) / 3; 
		dexp = (dex - 10) / 3; 
		help = (hel - 10) / 3; 
		intelp = (intel - 10) / 3; 
		wisp = (wis - 10) / 3; 
		chrp = (chr - 10) / 3;
		if(str < 10) {
			strp = (((10 - str -1)/3)+1) *-1; 
		}
		if(dex < 10) {
			dexp = (((10 - dex -1)/3)+1) *-1; 
		}
		if(hel < 10) {
			help = (((10 - hel- 1)/3)+1) *-1; 
		}
		if(intel < 10) {
			intelp = (((10 - intel- 1)/3)+1) *-1; 
		}
		if(wis < 10) {
			wisp = (((10 - wis- 1)/3)+1) *-1; 
		}
		if(chr < 10) {
			chrp = (((10 - chr- 1)/3)+1) *-1; 
		}
		System.out.println("능력치 배분을 완료 했습니다.");
		System.out.println("----- 현재 스탯 -----");
		this.showstat();
		System.out.println("맞으면 1. 틀리면 2.");
		System.out.println(">>>");
		ch1 ch1 = new ch1();
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("대충 입력 했기 때문에 강제로 스토리가 진행 됩니다.");
			ch1.sc1();
		}finally {
			if(selme == 1) {
				int here2;
				gostop = false;
				ch1.sc1();
			}else if(selme == 2) {
				reset();
				this.statset();
			}else {
				System.out.println("대충 입력 했기 때문에 강제로 스토리가 진행 됩니다.");
				gostop = false;
				ch1.sc1();
			}
		}
	}//statset
	void walk1(int i) throws InterruptedException, IOException  {
		x = i;
		for(x =i; x >= 0  ; x-- ) {
			System.out.println("길을 걷는 중");
			System.out.println("===============");
			ranen = (int) ((Math.random()*6)+1);
			if(x == 0) {
				System.out.println("시스템 : 목적지에 도착했습니다.");
				ch1.sc2();
			}else if(ranen == 1 || ranen ==2 ) {
				System.out.println("시스템 : 1Km 전진 완료");
				System.out.println("남은 거리 : " + x);
			}else if(ranen == 4 || ranen == 3) {
				System.out.println("몬스터와 조우 전투 준비");
				System.out.println("===============");
				int ran = (int)(Math.random()*6)+lv;
				if(ran >= 1 && ran <= 6) {
					System.out.println("고블린을 만났다.");
					meetenemy("고블린");
					break;
//				}if(ran > 3 && ran <= 6) {
//					meetenemy("늑대");
				}
			}else if(ranen == 5) {
				System.out.println("상인을 만났다.");
				System.out.println("남은 거리 :" + x);
			}else if(ranen == 6) {
				System.out.println("캠핑장을 찾았다.");
				System.out.println("10초간의 휴식으로 hp가 전체 회복");
				Thread.sleep(1000);
				hp = maxhp;
				showstat();
				System.out.println("다시 여행을 떠난다.");
			}
		}
	}
	
	
	void wpinfo(String wn) {
		weapon wp = new weapon();
		wpacc = wp.wpacc(wn);
		wpdice = wp.wpdice(wn);
		wpdcr = wp.wpdcr(wn);
		System.out.println(wpacc);
		System.out.println(wpdice);
		System.out.println(wpdcr);
	}
	
	void ftchoice(String enemyname) throws InterruptedException, IOException {
		if(stun > 0) {
			System.out.println("스턴에 걸려 이번턴은 쉽니다.");
			stun --;
			defence(enemyname);
		}
		System.out.println("행동을 선택하세요.");
		System.out.println("1.평타 2.스킬 3.아이템 4.도망");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("잘못 선택 하셨기에 평타로 진행 합니다.");
			selme = 1;
		}switch (selme) {
		case 1:{
			this.attack(enemyname);
			break;
		}
		case 2:{
			System.out.println("스킬을 사용합니다.");
			this.skill1(job,enemyname);
			break;}
		case 3:{
//			this.item();
			System.out.println("아이템은 아직 미구현 입니다.");
			System.out.println("선택 메뉴로 돌아갑니다.");
			this.ftchoice(enemyname);
			break;}
		case 4:{
//			this.run();
			
			break;}
		default:{
			break;
		}
		}
	}
		
	void attack(String enemyname) throws InterruptedException, IOException {
		
			int eac = en.eneac(enemyname);
			String wpt = wp.wpty(eqwp);
			int pac = 0;
			strp = (str - 10) / 3; 
			dexp = (dex - 10) / 3; 
			help = (hel - 10) / 3; 
			intelp = (intel - 10) / 3; 
			wisp = (wis - 10) / 3; 
			chrp = (chr - 10) / 3;
			if(str < 10) {
				strp = (((10 - str -1)/3)+1) *-1; 
			}
			if(dex < 10) {
				dexp = (((10 - dex -1)/3)+1) *-1; 
			}
			if(hel < 10) {
				help = (((10 - hel- 1)/3)+1) *-1; 
			}
			if(intel < 10) {
				intelp = (((10 - intel- 1)/3)+1) *-1; 
			}
			if(wis < 10) {
				wisp = (((10 - wis- 1)/3)+1) *-1; 
			}
			if(chr < 10) {
				chrp = (((10 - chr- 1)/3)+1) *-1; 
			}
			if(wpt.equals("근력")) {
				pac += strp;
			}
			if(wpt.equals("민첩")) {
				pac += dexp;
			}
			if(wpt.equals("지능")) {
				pac += intelp;
			}
			if(wpt.equals("체력")) {
				pac += help;
			}
			if(wpt.equals("지혜")) {
				pac += wisp;
			}
			if(wpt.equals("매력")) {
				pac += chrp;
			}
				int target = 0;
				System.out.println("대상을 선택해 주세요.");
				System.out.println(enemyname +"1 의 체력 :"+enhp1);
				System.out.println(enemyname +"2 의 체력 :"+enhp2);
				System.out.println(enemyname +"3 의 체력 :"+enhp3);
				System.out.print(">>>");
				gostop = true;
				System.out.println("===== 내 공격 =====");
				while(gostop) {
				try {
					 target = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("대상확인 후 입력 부탁드립니다.");
					continue;
				}finally {
					if(enhp1 <= 0 && target == 1) {
						System.out.println("해당 몬스터는 이미 죽었습니다.");
						continue;
					}else if(enhp2 <= 0 && target == 2) {
						System.out.println("해당 몬스터는 이미 죽었습니다.");
						continue;
					}else if(enhp3 <= 0 && target == 3) {
						System.out.println("해당 몬스터는 이미 죽었습니다.");
						continue;
					}
					switch (target) {
					case 1:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
						System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
						if(attrn == 1){
							System.out.println("아 공격이 완전히 빗나갔습니다.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1;
								enhp1 -= dmg;
								System.out.println(dmg + "만큼 대미지를 입혔습니다.");
								System.out.println("적 1 의 남은 체력 : " + enhp1);
								gostop = false;
							}break;
						}if(attrn == 20) {
							System.out.println("치명타가 터졌습니다.");
							System.out.println("모든 대미지 2배");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp1 -= dmg*2;
							System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
							System.out.println("적 1 의 남은 체력 : " + enhp1);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("아쉽게 빗나 갔습니다.");
							gostop = false;
							break;
						}
					}
					case 2:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
						System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
						if(attrn == 1){
							System.out.println("아 공격이 완전히 빗나갔습니다.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1;
								enhp2 -= dmg;
								System.out.println(dmg + "만큼 대미지를 입혔습니다.");
								System.out.println("적 2 의 남은 체력 : " + enhp2);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("치명타가 터졌습니다.");
							System.out.println("모든 대미지 2배");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp2 -= dmg*2;
							System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
							System.out.println("적 2 의 남은 체력 : " + enhp3);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("아쉽게 빗나 갔습니다.");
							gostop = false;
							break;
						}
					}case 3:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
						System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
						if(attrn == 1){
							System.out.println("아 공격이 완전히 빗나갔습니다.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1;
								enhp3 -= dmg;
								System.out.println(dmg + "만큼 대미지를 입혔습니다.");
								System.out.println("적 3 의 남은 체력 : " + enhp3);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("치명타가 터졌습니다.");
							System.out.println("모든 대미지 2배");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp3 -= dmg*2;
							System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
							System.out.println("적 3 의 남은 체력 : " + enhp3);
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("아쉽게 빗나 갔습니다.");
							gostop = false;
							break;
						}
					}
					default: System.out.println("해당상대는 없습니다.");
						continue;
					}
				}
				if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
					System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
					this.win(enemyname);
				}else {
					defence(enemyname);
				}
			}
		}//attack
			
	
		
			
	private void skill1(String job2 ,String enemy) throws InterruptedException, IOException {
		if(job2.equals("전사")) {
			if(lv == 1) {
				System.out.println("1. 강타 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "강타";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
		}
	}
		 if(job2.equals("도적")) {
			if(lv == 1) {
				System.out.println("1. 빠른베기 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "빠른베기";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("마법사")) {
			if(lv == 1) {
				System.out.println("1. 화염화살 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "화염화살";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("궁수")) {
			if(lv == 1) {
				System.out.println("1. 저격 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "저격";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("무투가")) {
			if(lv == 1) {
				System.out.println("1. 정권지르기 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "정권지르기";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("성기사")) {
			if(lv == 1) {
				System.out.println("1. 내려찍기 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "내려찍기";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("사제")) {
			if(lv == 1) {
				System.out.println("1. 회복 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "회복";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("농부")) {
			if(lv == 1) {
				System.out.println("1. 밭갈기 2.나가기");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("메뉴에 맞는 숫자를 입력하세요.");
				}finally {
					if(selme == 1) {
						job2 = "밭갈기";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("네크로멘서")) {
			System.out.println("1. 뼈화살 2.나가기");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("메뉴에 맞는 숫자를 입력하세요.");
			}finally {
				if(selme == 1) {
					job2 = "뼈화살";
					this.skill2(job2,enemy);
				}else if(selme == 2) {
					ftchoice(enemy);
				}
		}
		}
	}// skill
	

	private void skill2(String job2, String enemy) throws InterruptedException, IOException {
		if(job2.equals("강타")) {
			gostop =true;
			enemyname = enemy;
			int eac = en.eneac(enemyname);
			String wpt = wp.wpty(eqwp);
			int pac = 0;
			strp = (str - 10) / 3; 
			dexp = (dex - 10) / 3; 
			help = (hel - 10) / 3; 
			intelp = (intel - 10) / 3; 
			wisp = (wis - 10) / 3; 
			chrp = (chr - 10) / 3;
			if(str < 10) {
				strp = (((10 - str -1)/3)+1) *-1; 
			}
			if(dex < 10) {
				dexp = (((10 - dex -1)/3)+1) *-1; 
			}
			if(hel < 10) {
				help = (((10 - hel- 1)/3)+1) *-1; 
			}
			if(intel < 10) {
				intelp = (((10 - intel- 1)/3)+1) *-1; 
			}
			if(wis < 10) {
				wisp = (((10 - wis- 1)/3)+1) *-1; 
			}
			if(chr < 10) {
				chrp = (((10 - chr- 1)/3)+1) *-1; 
			}
			if(wpt.equals("근력")) {
				pac += strp;
			}
			if(wpt.equals("민첩")) {
				pac += dexp;
			}
			if(wpt.equals("지능")) {
				pac += intelp;
			}
			if(wpt.equals("체력")) {
				pac += help;
			}
			if(wpt.equals("지혜")) {
				pac += wisp;
			}
			if(wpt.equals("매력")) {
				pac += chrp;
			}
				int target = 0;
				System.out.println("스킬의 대상을 선택해 주세요.");
				System.out.println(enemyname +"1 의 체력 :"+enhp1);
				System.out.println(enemyname +"2 의 체력 :"+enhp2);
				System.out.println(enemyname +"3 의 체력 :"+enhp3);
				System.out.print(">>>");
				gostop = true;
				System.out.println("===== 내 공격 =====");
				while(gostop) {
				try {
					 target = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("대상확인 후 입력 부탁드립니다.");
					continue;
				}finally {
					if(enhp1 <= 0 && target == 1) {
						System.out.println("해당 몬스터는 이미 죽었습니다.");
						continue;
					}else if(enhp2 <= 0 && target == 2) {
						System.out.println("해당 몬스터는 이미 죽었습니다.");
						continue;
					}else if(enhp3 <= 0 && target == 3) {
						System.out.println("해당 몬스터는 이미 죽었습니다.");
						continue;
					}
					switch (target) {
					case 1:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
						System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
						if(attrn == 1){
							System.out.println("아 공격이 완전히 빗나갔습니다.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							System.out.println("스킬 강타!");
							System.out.println("모든 대미지 +2");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1+2;
								enhp1 -= dmg;
								System.out.println(dmg + "만큼 대미지를 입혔습니다.");
								System.out.println("적 1 의 남은 체력 : " + enhp1);
								gostop = false;
							}break;
						}if(attrn == 20) {
							System.out.println("스킬 강타!");
							System.out.println("모든 대미지 +2");
							System.out.println("치명타가 터졌습니다.");
							System.out.println("모든 대미지 2배");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1+2;
							enhp1 -= dmg*2;
							System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
							System.out.println("적 1 의 남은 체력 : " + enhp1);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("아쉽게 빗나 갔습니다.");
							gostop = false;
							break;
						}
					}
					case 2:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
						System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
						if(attrn == 1){
							System.out.println("아 공격이 완전히 빗나갔습니다.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							System.out.println("스킬 강타!");
							System.out.println("모든 대미지 +2");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1+2;
								enhp2 -= dmg;
								System.out.println(dmg + "만큼 대미지를 입혔습니다.");
								System.out.println("적 2 의 남은 체력 : " + enhp2);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("스킬 강타!");
							System.out.println("모든 대미지 +2");
							System.out.println("치명타가 터졌습니다.");
							System.out.println("모든 대미지 2배");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1+2;
							enhp2 -= dmg*2;
							System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
							System.out.println("적 2 의 남은 체력 : " + enhp3);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("아쉽게 빗나 갔습니다.");
							gostop = false;
							break;
						}
					}case 3:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
						System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
						if(attrn == 1){
							System.out.println("아 공격이 완전히 빗나갔습니다.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							System.out.println("스킬 강타!");
							System.out.println("모든 대미지 +2");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1+2;
								enhp3 -= dmg;
								System.out.println(dmg + "만큼 대미지를 입혔습니다.");
								System.out.println("적 3 의 남은 체력 : " + enhp3);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("스킬 강타!");
							System.out.println("모든 대미지 +2");
							System.out.println("치명타가 터졌습니다.");
							System.out.println("모든 대미지 2배");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1+2;
							enhp3 -= dmg*2;
							System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
							System.out.println("적 3 의 남은 체력 : " + enhp3);
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("아쉽게 빗나 갔습니다.");
							gostop = false;
							break;
						}
					}
					default: System.out.println("해당상대는 없습니다.");
						continue;
					}
				}
				if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
					System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
					this.win(enemyname);
				}else {
					defence(enemyname);
				}
			}
	}else if(job2.equals("빠른베기")) {
		gostop =true;
		enemyname = enemy;
		int eac = en.eneac(enemyname);
		String wpt = wp.wpty(eqwp);
		int pac = 0;
		strp = (str - 10) / 3; 
		dexp = (dex - 10) / 3; 
		help = (hel - 10) / 3; 
		intelp = (intel - 10) / 3; 
		wisp = (wis - 10) / 3; 
		chrp = (chr - 10) / 3;
		if(str < 10) {
			strp = (((10 - str -1)/3)+1) *-1; 
		}
		if(dex < 10) {
			dexp = (((10 - dex -1)/3)+1) *-1; 
		}
		if(hel < 10) {
			help = (((10 - hel- 1)/3)+1) *-1; 
		}
		if(intel < 10) {
			intelp = (((10 - intel- 1)/3)+1) *-1; 
		}
		if(wis < 10) {
			wisp = (((10 - wis- 1)/3)+1) *-1; 
		}
		if(chr < 10) {
			chrp = (((10 - chr- 1)/3)+1) *-1; 
		}
		if(wpt.equals("근력")) {
			  
			pac += strp;
		}
		if(wpt.equals("민첩")) {
			pac += dexp;
		}
		if(wpt.equals("지능")) {
			pac += intelp;
		}
		if(wpt.equals("체력")) {
			pac += help;
		}
		if(wpt.equals("지혜")) {
			pac += wisp;
		}
		if(wpt.equals("매력")) {
			pac += chrp;
		}
			int target = 0;
			System.out.println("스킬의 대상을 선택해 주세요.");
			System.out.println(enemyname +"1 의 체력 :"+enhp1);
			System.out.println(enemyname +"2 의 체력 :"+enhp2);
			System.out.println(enemyname +"3 의 체력 :"+enhp3);
			System.out.print(">>>");
			gostop = true;
			System.out.println("===== 내 공격 =====");
			while(gostop) {
			try {
				 target = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("대상확인 후 입력 부탁드립니다.");
				continue;
			}finally {
				if(enhp1 <= 0 && target == 1) {
					System.out.println("해당 몬스터는 이미 죽었습니다.");
					continue;
				}else if(enhp2 <= 0 && target == 2) {
					System.out.println("해당 몬스터는 이미 죽었습니다.");
					continue;
				}else if(enhp3 <= 0 && target == 3) {
					System.out.println("해당 몬스터는 이미 죽었습니다.");
					continue;
				}
				switch (target) {
				case 1:{
					weapon wp = new weapon();
					int wpacc = wp.wpacc(eqwp);
					System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
					System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
					int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
					if (attrn > 20) {attrn = 20;}
					System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
					if(attrn == 1){
						System.out.println("아 공격이 완전히 빗나갔습니다.");
						stun += 1;
						gostop = false;
						break;
					}if(eac < attrn && attrn < 20 && attrn >1) {
						System.out.println("스킬 빠른베기");
						System.out.println("모든 대미지 주사위 +1");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp1 -= dmg;
							System.out.println(dmg + "만큼 대미지를 입혔습니다.");
							System.out.println("적 1 의 남은 체력 : " + enhp1);
							gostop = false;
						}break;
					}if(attrn == 20) {
						System.out.println("스킬 빠른베기");
						System.out.println("모든 대미지 주사위 +1");
						System.out.println("치명타가 터졌습니다.");
						System.out.println("모든 대미지 2배");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
						int dmg = (int) (Math.random()*wpdice)+1;
						enhp1 -= dmg*2;
						System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
						System.out.println("적 1 의 남은 체력 : " + enhp1);
						
					}
						gostop = false;break;
					}if(eac >= attrn) {
						System.out.println("아쉽게 빗나 갔습니다.");
						gostop = false;
						break;
					}
				}
				case 2:{
					weapon wp = new weapon();
					int wpacc = wp.wpacc(eqwp);
					System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
					System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
					int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
					if (attrn > 20) {attrn = 20;}
					System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
					if(attrn == 1){
						System.out.println("아 공격이 완전히 빗나갔습니다.");
						stun += 1;
						gostop = false;
						break;
					}if(eac < attrn && attrn < 20 && attrn >1) {
						System.out.println("스킬 빠른베기!");
						System.out.println("모든 대미지 주사위 +1");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp2 -= dmg;
							System.out.println(dmg + "만큼 대미지를 입혔습니다.");
							System.out.println("적 2 의 남은 체력 : " + enhp2);
							gostop = false;
							break;
						}break;
					}if(attrn == 20) {
						System.out.println("스킬 빠른베기");
						System.out.println("모든 대미지 주사위 +1");
						System.out.println("치명타가 터졌습니다.");
						System.out.println("모든 대미지 2배");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
						int dmg = (int) (Math.random()*wpdice)+1;
						enhp2 -= dmg*2;
						System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
						System.out.println("적 2 의 남은 체력 : " + enhp3);
						
					}
						gostop = false;break;
					}if(eac >= attrn) {
						System.out.println("아쉽게 빗나 갔습니다.");
						gostop = false;
						break;
					}
				}case 3:{
					weapon wp = new weapon();
					int wpacc = wp.wpacc(eqwp);
					System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
					System.out.println("캐릭터 스탯에 "+ pac +"만큼 보정치가 있습니다.");
					int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
					if (attrn > 20) {attrn = 20;}
					System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
					if(attrn == 1){
						System.out.println("아 공격이 완전히 빗나갔습니다.");
						stun += 1;
						gostop = false;
						break;
					}if(eac < attrn && attrn < 20 && attrn >1) {
						System.out.println("스킬 빠른베기!");
						System.out.println("모든 대미지 주사위 +1");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp3 -= dmg;
							System.out.println(dmg + "만큼 대미지를 입혔습니다.");
							System.out.println("적 3 의 남은 체력 : " + enhp3);
							gostop = false;
							break;
						}break;
					}if(attrn == 20) {
						System.out.println("스킬 빠른베기!");
						System.out.println("모든 대미지 주사위 +1");
						System.out.println("치명타가 터졌습니다.");
						System.out.println("모든 대미지 2배");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
						int dmg = (int) (Math.random()*wpdice)+1;
						enhp3 -= dmg*2;
						System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
						System.out.println("적 3 의 남은 체력 : " + enhp3);
					}
						gostop = false;break;
					}if(eac >= attrn) {
						System.out.println("아쉽게 빗나 갔습니다.");
						gostop = false;
						break;
					}
				}
				default: System.out.println("해당상대는 없습니다.");
					continue;
				}
			}
			if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
				System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
				this.win(enemyname);
			}else {
				defence(enemyname);
			}
		}
}if(job2.equals("화염화살")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "지능";
	int pac = 0;
	strp = (str - 10) / 3; 
	dexp = (dex - 10) / 3; 
	help = (hel - 10) / 3; 
	intelp = (intel - 10) / 3; 
	wisp = (wis - 10) / 3; 
	chrp = (chr - 10) / 3;
	if(str < 10) {
		strp = (((10 - str -1)/3)+1) *-1; 
	}
	if(dex < 10) {
		dexp = (((10 - dex -1)/3)+1) *-1; 
	}
	if(hel < 10) {
		help = (((10 - hel- 1)/3)+1) *-1; 
	}
	if(intel < 10) {
		intelp = (((10 - intel- 1)/3)+1) *-1; 
	}
	if(wis < 10) {
		wisp = (((10 - wis- 1)/3)+1) *-1; 
	}
	if(chr < 10) {
		chrp = (((10 - chr- 1)/3)+1) *-1; 
	}
	if(wpt.equals("근력")) {
		  
		pac += strp;
	}
	if(wpt.equals("민첩")) {
		pac += dexp;
	}
	if(wpt.equals("지능")) {
		pac += intelp;
	}
	if(wpt.equals("체력")) {
		pac += help;
	}
	if(wpt.equals("지혜")) {
		pac += wisp;
	}
	if(wpt.equals("매력")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("스킬의 대상을 선택해 주세요.");
		System.out.println(enemyname +"1 의 체력 :"+enhp1);
		System.out.println(enemyname +"2 의 체력 :"+enhp2);
		System.out.println(enemyname +"3 의 체력 :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== 내 공격 =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("대상확인 후 입력 부탁드립니다.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("화염화살 스킬에 지능보정이 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 화염화살!");
					System.out.println("모든 대미지 주사위 6 으로 변경 , 3회 굴림");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
						int dmg = (int) (Math.random()*6)+1;
						enhp1 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 1 의 남은 체력 : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 화염화살!");
					System.out.println("모든 대미지 주사위 6 으로 변경 , 3회 굴림");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
					int dmg = (int) (Math.random()*6)+1;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 1 의 남은 체력 : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("화염화살 스킬에 지능보정이 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 화염화살!");
					System.out.println("모든 대미지 주사위 6 으로 변경 , 3회 굴림");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
						int dmg = (int) (Math.random()*6)+1;
						enhp2 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 2 의 남은 체력 : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 화염화살!");
					System.out.println("모든 대미지 주사위 6 으로 변경 , 3회 굴림");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
					int dmg = (int) (Math.random()*6)+1;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 2 의 남은 체력 : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("화염화살 스킬에 지능보정이 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 화염화살!");
					System.out.println("모든 대미지 주사위 6 으로 변경 , 3회 굴림");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
						int dmg = (int) (Math.random()*6)+1;
						enhp3 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 3 의 남은 체력 : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 화염화살!");
					System.out.println("모든 대미지 주사위 6 으로 변경 , 3회 굴림");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
					int dmg = (int) (Math.random()*6)+1;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 3 의 남은 체력 : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("해당상대는 없습니다.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("정권지르기")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = wp.wpty(eqwp);
	int pac = 0;
	strp = (str - 10) / 3; 
	dexp = (dex - 10) / 3; 
	help = (hel - 10) / 3; 
	intelp = (intel - 10) / 3; 
	wisp = (wis - 10) / 3; 
	chrp = (chr - 10) / 3;
	if(str < 10) {
		strp = (((10 - str -1)/3)+1) *-1; 
	}
	if(dex < 10) {
		dexp = (((10 - dex -1)/3)+1) *-1; 
	}
	if(hel < 10) {
		help = (((10 - hel- 1)/3)+1) *-1; 
	}
	if(intel < 10) {
		intelp = (((10 - intel- 1)/3)+1) *-1; 
	}
	if(wis < 10) {
		wisp = (((10 - wis- 1)/3)+1) *-1; 
	}
	if(chr < 10) {
		chrp = (((10 - chr- 1)/3)+1) *-1; 
	}
	if(wpt.equals("근력")) {
		pac += strp;
	}
	if(wpt.equals("민첩")) {
		pac += dexp;
	}
	if(wpt.equals("지능")) {
		pac += intelp;
	}
	if(wpt.equals("체력")) {
		pac += help;
	}
	if(wpt.equals("지혜")) {
		pac += wisp;
	}
	if(wpt.equals("매력")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("스킬의 대상을 선택해 주세요.");
		System.out.println(enemyname +"1 의 체력 :"+enhp1);
		System.out.println(enemyname +"2 의 체력 :"+enhp2);
		System.out.println(enemyname +"3 의 체력 :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== 내 공격 =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("대상확인 후 입력 부탁드립니다.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("캐릭터에 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 정권지르기!");
					System.out.println("대미지 주사위 8로 고정");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr; i++) {
						int dmg = (int) 8;
						enhp1 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 1 의 남은 체력 : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 정권지르기!");
					System.out.println("대미지 주사위 8로 고정");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr; i++) {
					int dmg = (int) 8;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 1 의 남은 체력 : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("캐릭터에 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 정권지르기!");
					System.out.println("대미지 주사위 8로 고정");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int)8;
						enhp2 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 2 의 남은 체력 : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 정권지르기!");
					System.out.println("대미지 주사위 8로 고정");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 8;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 2 의 남은 체력 : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("캐릭터에 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 정권지르기!");
					System.out.println("대미지 주사위 8로 고정");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 8;
						enhp3 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 3 의 남은 체력 : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 정권지르기");
					System.out.println("대미지 주사위 8로 고정");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 8;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 3 의 남은 체력 : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("해당상대는 없습니다.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("저격")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "민첩";
	int pac = 0;
	strp = (str - 10) / 3; 
	dexp = (dex - 10) / 3; 
	help = (hel - 10) / 3; 
	intelp = (intel - 10) / 3; 
	wisp = (wis - 10) / 3; 
	chrp = (chr - 10) / 3;
	if(str < 10) {
		strp = (((10 - str -1)/3)+1) *-1; 
	}
	if(dex < 10) {
		dexp = (((10 - dex -1)/3)+1) *-1; 
	}
	if(hel < 10) {
		help = (((10 - hel- 1)/3)+1) *-1; 
	}
	if(intel < 10) {
		intelp = (((10 - intel- 1)/3)+1) *-1; 
	}
	if(wis < 10) {
		wisp = (((10 - wis- 1)/3)+1) *-1; 
	}
	if(chr < 10) {
		chrp = (((10 - chr- 1)/3)+1) *-1; 
	}
	if(wpt.equals("근력")) {
		  
		pac += strp;
	}
	if(wpt.equals("민첩")) {
		pac += dexp;
	}
	if(wpt.equals("지능")) {
		pac += intelp;
	}
	if(wpt.equals("체력")) {
		pac += help;
	}
	if(wpt.equals("지혜")) {
		pac += wisp;
	}
	if(wpt.equals("매력")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("스킬의 대상을 선택해 주세요.");
		System.out.println(enemyname +"1 의 체력 :"+enhp1);
		System.out.println(enemyname +"2 의 체력 :"+enhp2);
		System.out.println(enemyname +"3 의 체력 :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== 내 공격 =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("대상확인 후 입력 부탁드립니다.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("저격 스킬에 민첩보정이 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 저격!");
					System.out.println("대미지 주사위 6으로 고정");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 6;
						enhp1 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 1 의 남은 체력 : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 저격!");
					System.out.println("대미지 주사위 6으로 고정");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 6;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 1 의 남은 체력 : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("저격 스킬에 민첩 보정이 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 저격!");
					System.out.println("대미지 주사위 6으로 고정");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 6;
						enhp2 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 2 의 남은 체력 : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 저격!");
					System.out.println("대미지 주사위 6으로 고정");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 6;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 2 의 남은 체력 : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("저격 스킬에 민첩 보정이 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 저격!");
					System.out.println("대미지 주사위 6으로 고정");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 6;
						enhp3 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 3 의 남은 체력 : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 저격!");
					System.out.println("대미지 주사위 6으로 고정");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 6;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 3 의 남은 체력 : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("해당상대는 없습니다.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("내려찍기")){
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "근력";
	int pac = 0;
	strp = (str - 10) / 3; 
	dexp = (dex - 10) / 3; 
	help = (hel - 10) / 3; 
	intelp = (intel - 10) / 3; 
	wisp = (wis - 10) / 3; 
	chrp = (chr - 10) / 3;
	if(str < 10) {
		strp = (((10 - str -1)/3)+1) *-1; 
	}
	if(dex < 10) {
		dexp = (((10 - dex -1)/3)+1) *-1; 
	}
	if(hel < 10) {
		help = (((10 - hel- 1)/3)+1) *-1; 
	}
	if(intel < 10) {
		intelp = (((10 - intel- 1)/3)+1) *-1; 
	}
	if(wis < 10) {
		wisp = (((10 - wis- 1)/3)+1) *-1; 
	}
	if(chr < 10) {
		chrp = (((10 - chr- 1)/3)+1) *-1; 
	}
	if(wpt.equals("근력")) {
		  
		pac += strp;
	}
	if(wpt.equals("민첩")) {
		pac += dexp;
	}
	if(wpt.equals("지능")) {
		pac += intelp;
	}
	if(wpt.equals("체력")) {
		pac += help;
	}
	if(wpt.equals("지혜")) {
		pac += wisp;
	}
	if(wpt.equals("매력")) {
		pac += chrp;
	}

		System.out.println(enemyname +"1 의 체력 :"+enhp1);
		System.out.println(enemyname +"2 의 체력 :"+enhp2);
		System.out.println(enemyname +"3 의 체력 :"+enhp3);
		gostop = true;
		System.out.println("===== 내 공격 =====");
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("내려찍기 스킬에 근력 보정이 붙어"+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 내려찍기!");
					System.out.println("대미지 주사위 3으로 고정, 모든 적 공격");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) 3;
						enhp1 -= dmg;
						enhp2 -= dmg;
						enhp3 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 1 의 남은 체력 : " + enhp1);
						System.out.println("적 2 의 남은 체력 : " + enhp2);
						System.out.println("적 3 의 남은 체력 : " + enhp3);
						gostop = false;
				}
				}if(attrn == 20) {
					System.out.println("스킬 내려찍기");
					System.out.println("대미지 주사위 3으로 고정, 모든 적 공격");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) 3;
					enhp1 -= dmg*2;
					enhp2 -= dmg*2;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 1 의 남은 체력 : " + enhp1);
					System.out.println("적 2 의 남은 체력 : " + enhp2);
					System.out.println("적 3 의 남은 체력 : " + enhp3);
					}
						gostop = false;
					}if(eac >= attrn) {
						System.out.println("아쉽게 빗나 갔습니다.");
						gostop = false;

					}
			
			
			if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
				System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
				this.win(enemyname);
			}else {
				defence(enemyname);
			}
	
}if(job2.equals("뼈화살")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "지능";
	int pac = 0;
	strp = (str - 10) / 3; 
	dexp = (dex - 10) / 3; 
	help = (hel - 10) / 3; 
	intelp = (intel - 10) / 3; 
	wisp = (wis - 10) / 3; 
	chrp = (chr - 10) / 3;
	if(str < 10) {
		strp = (((10 - str -1)/3)+1) *-1; 
	}
	if(dex < 10) {
		dexp = (((10 - dex -1)/3)+1) *-1; 
	}
	if(hel < 10) {
		help = (((10 - hel- 1)/3)+1) *-1; 
	}
	if(intel < 10) {
		intelp = (((10 - intel- 1)/3)+1) *-1; 
	}
	if(wis < 10) {
		wisp = (((10 - wis- 1)/3)+1) *-1; 
	}
	if(chr < 10) {
		chrp = (((10 - chr- 1)/3)+1) *-1; 
	}
	if(wpt.equals("근력")) {
		  
		pac += strp;
	}
	if(wpt.equals("민첩")) {
		pac += dexp;
	}
	if(wpt.equals("지능")) {
		pac += intelp;
	}
	if(wpt.equals("체력")) {
		pac += help;
	}
	if(wpt.equals("지혜")) {
		pac += wisp;
	}
	if(wpt.equals("매력")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("스킬의 대상을 선택해 주세요.");
		System.out.println(enemyname +"1 의 체력 :"+enhp1);
		System.out.println(enemyname +"2 의 체력 :"+enhp2);
		System.out.println(enemyname +"3 의 체력 :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== 내 공격 =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("대상확인 후 입력 부탁드립니다.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("해당 몬스터는 이미 죽었습니다.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("뼈화살 스킬에 지능보정치가 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 뼈화살!");
					System.out.println("모든 대미지 주사위 20으로 변경 , 1회 굴림");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) (Math.random()*20)+1;
						enhp1 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 1 의 남은 체력 : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 뼈화살!");
					System.out.println("모든 대미지 주사위 20 으로 변경 , 1회 굴림");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) (Math.random()*20)+1;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 1 의 남은 체력 : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("뼈화살 스킬에 지능보정치가 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 뼈화살!");
					System.out.println("모든 대미지 주사위 20 으로 변경 , 1회 굴림");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) (Math.random()*20)+1;
						enhp2 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 2 의 남은 체력 : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 뼈화살!");
					System.out.println("모든 대미지 주사위 20 으로 변경 , 1회 굴림");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) (Math.random()*20)+1;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 2 의 남은 체력 : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("무기의 " + wpacc+"만큼 보정치가 있습니다.");
				System.out.println("뼈화살 스킬에 지능보정치가 붙어 "+ pac +"만큼 보정치가 있습니다.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
				if(attrn == 1){
					System.out.println("아 공격이 완전히 빗나갔습니다.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("스킬 뼈화살!");
					System.out.println("모든 대미지 주사위 20 으로 변경 , 1회 굴림");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) (Math.random()*20)+1;
						enhp3 -= dmg;
						System.out.println(dmg + "만큼 대미지를 입혔습니다.");
						System.out.println("적 3 의 남은 체력 : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("스킬 뼈화살!");
					System.out.println("모든 대미지 주사위 20 으로 변경 , 1회 굴림");
					System.out.println("치명타가 터졌습니다.");
					System.out.println("모든 대미지 2배");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) (Math.random()*20)+1;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "만큼 대미지를 입혔습니다.");
					System.out.println("적 3 의 남은 체력 : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("아쉽게 빗나 갔습니다.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("해당상대는 없습니다.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("몬스터의 체력이 0 이 되었음으로 승리 했습니다.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("회복")){
	gostop =true;
	int intelp = (intel - 10)/3;
	int wisp = (wis - 10)/3;
	if(intel < 10) {
		intelp = (((10 - intel- 1)/3)+1) *-1; 
	}
	if(wis < 10) {
		wisp = (((10 - wis- 1)/3)+1) *-1; }
	int heal =  (int)(intelp + wisp);
	hp += heal;
	if(hp > maxhp) {
		hp = maxhp;
	}
	System.out.println(heal + "만큼 회복 되었습니다.");
	System.out.println("현재 체력 : "+hp +" / "+ maxhp);
	System.out.println("체력 회복 후 때릴 대상을 찾습니다.");
	this.attack(enemy);
}if(job2.equals("밭갈기")) {
	gostop =true;
	hp -= 1;
	if(hp <=0) {
		System.out.println("농사일을 하다 죽었습니다.");
		System.out.println("game over");
		System.out.println("===============");
		System.out.println("메인 화면으로 돌아 갑니다");
		this.reset();
		this.gostop = true;
		this.mainpage();
	}
	System.out.println("농부가 아무렇지 않게 밭을 갈고 있습니다.");
	System.out.println("당황한 "+enemy +" 허둥지둥 대며 돌아갑니다.");
	System.out.println("밭을 갈았기 때문에 체력이 1 감소 합니다.");
	System.out.println("현재 체력 :" + hp + " / " + maxhp);
	this.defence(enemy);
//	this.runsuc();
}
}//skill2

	void defence(String enemyname) throws InterruptedException, IOException {
		int end = en.enemy(enemyname);
		System.out.println("===== 적 공격 =====");
		for(int i = 1; i <= encount ; i++) {
		int attrn = (int)((Math.random()*20)+1);
		if (attrn > 20) {attrn = 20;}
		System.out.println(attrn + "만큼의 주사위 수가 나왔습니다.");
		if(attrn == 1){
			System.out.println("아 공격이 완전히 빗나갔습니다.");
		}else if(ac < attrn && attrn < 20 && attrn > 1) {
				int dmg = (int) (Math.random()*end)+1;
				hp -= dmg;
				System.out.println(dmg + "만큼 대미지를 입었습니다.");
				System.out.println("나의 남은 체력 : " + hp);
		}else if(attrn == 20) {
			System.out.println("치명타가 터졌습니다.");
			System.out.println("모든 대미지 2배");
			int dmg = (int) (Math.random()*end)+1;
			hp -= dmg*2;
			System.out.println(dmg*2 + "만큼 대미지를 입었습니다.");
			System.out.println("나의 남은 체력 : " + hp);
		}else if(ac >= attrn) {
			System.out.println("아쉽게 빗나 갔습니다.");
		}
		}
		
		if(hp <= 0) {
			System.out.println("나의 체력이 0이 되어 패배 했습니다.");
			System.out.println("===============");
			System.out.println("게임 over");
			System.out.println("===============");
			reset();
			gostop = true;
			mainpage();
		}else if(enhp1 > 0 || enhp2 > 0 || enhp3 > 0){
			this.ftchoice(enemyname);
		}
		
	} // defence
	void meetenemy(String enemyname) throws InterruptedException, IOException {
		encount = (int)(Math.random()*3)+1;
		int[] enhp = new int[3];
		int enhpd = en.enhpd(enemyname);
		for(int i = 0 ; i <= encount-1 ; i ++) {
			int ranhp = (int)(Math.random()*enhpd)+1;
			enhp[i] = (int)(ranhp * (int)((Math.random()*3)+1));
		}
		enhp1 = enhp[0];
		enhp2 = enhp[1];
		enhp3 = enhp[2];
		System.out.println(enemyname + "1 : " +enhp1);
		if (enhp2 > 0) {
		System.out.println(enemyname + "2 : " +enhp2);
		}if (enhp3 > 0) {
			System.out.println(enemyname + "3 : " +enhp3);
		}
		this.ftchoice(enemyname);
	} //meetenemy
	void win(String enemyname) throws InterruptedException, IOException {
		int exp1 = en.exp(enemyname);
		for(int i = 1; i<= encount; i ++) {
		System.out.println(exp1 + "의 경험치를 획득 했습니다.");
		exp += exp1;
		}
		encount = 0;
		this.enemyname = null;
		if(exp > need) {
			System.out.println("레벨업 하였습니다.");
			System.out.println("현재 LV 은 " + lv +"입니다.");
		}
		System.out.println("어떻게 하시겠습니까?");
		System.out.println("1. 계속 여행 2.여기까지 3.현재 능력치 보기");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("메뉴에 맞는 숫자를 입력하세요.");
		}finally {
			if(selme == 1) {
				walk1(x);
			}else if(selme == 2) {
				gostop = true;
				mainpage();
			}else if(selme == 3) {
				showstat();
			}
			
		}
	}


}


