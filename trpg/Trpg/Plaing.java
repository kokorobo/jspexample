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
	//�ɷ�ġ
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
		//�ɷ�ġ
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
			System.out.println("�ظ���� �����");
			System.out.println("================");
			System.out.println("�޴��� ������ �ּ���.");
			System.out.println("1.���ο� ����");
			System.out.println("2.�̾��ϱ� ");
			System.out.println("3.Ư��");
			System.out.println("4.������");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
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
				System.out.println("���� ���� �����͸� �ҷ� �ɴϴ�.");
				Load ld = new Load();
				System.out.println("===============");
				System.out.println("�÷����ϴ� ĳ���� �̸��� �Է��� �ּ���");
				System.out.print(">>>");
				String name2 = sc.next();
				ld.load(name2);

				this.mainpage();
				break;
			}//case 2
			case 3:{
				System.out.println("���� ���� �ֽ� �е�");
//				this.cusmer();

				this.mainpage();
				break;
			}//case 3
			case 4:{
				System.out.println("�ش� ������ ������ �ʾҳ�");
				System.out.println("�ٽ� ���� �ö����� ��ٸ��ڳ�");
				gostop = false;
				break;
			}
			default :{
				System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				this.mainpage();
				break;
			}
			}//switch	
		}//while
	}//selmenu
	void country() throws InterruptedException, IOException {
		System.out.println("�÷��� �Ͻ� ĳ���� ���� ���ּ���");
		System.out.println("1.�ΰ� 2.���� 3.����� 4.����");
		System.out.print(">>>");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("���� �Է� �ϼ̱⿡ ���ͷ� �����մϴ�.");
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
				this.country = "�ΰ�";
				System.out.println("�ΰ��� ����, Ȳ��, ���� 3������ �ֽ��ϴ�.");
				System.out.println("1.���� 2.Ȳ�� 3.����");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("������ �߸� �Է��Ͽ��� ������ �������� ���� �˴ϴ�.");
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
				this.country = "����";
				System.out.println("������ ���̿���, ��忤��, ��ũ���� 3������ �ֽ��ϴ�.");
				System.out.println("1.���̿��� 2.��忤�� 3.��ũ����");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("������ �߸� �Է��Ͽ��� ������ �������� ���� �˴ϴ�.");
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
				this.country = "�����";
				System.out.println("�������4 �Ҳɵ����, ��ö�����, ��������� 3������ �ֽ��ϴ�.");
				System.out.println("1.�Ҳɵ���� 2.��ö����� 3.���������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("������ �߸� �Է��Ͽ��� ������ �������� ���� �˴ϴ�.");
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
				this.country = "����";
				System.out.println("���ʹ� ���, ����, ����� 3������ �ֽ��ϴ�.");
				System.out.println("1.��� 2.���� 3.�����");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�߸� �Է��ϸ� ���ʹ� �������� ���۵˴ϴ�.");
					this.job((int)(Math.random()*3)+1);
				}finally {
					this.job(selme);
					break;
					}
			}//case 4
			default:{
				System.out.println("���� �Է� �ϼ̱⿡ ���ͷ� �����մϴ�.");
				selme = 4;
				break;
			}
		}//switch
	}//while
}//sejob


	void job(int i) throws InterruptedException, IOException {
		selme = i;
		if(country.equals("����")) {
			System.out.println("���� �ó������� ���� �غ� ���� �ʾҽ��ϴ�.");
			System.out.println("���� ȭ������ ���ư��ϴ�.");
			this.mainpage();
		}else if(country.equals("�ΰ�")||
				country.equals("����")||
				country.equals("�����")){
				switch (selme) {
			case 1:{
			if(country.equals("�ΰ�")) {
				this.sejob = "����";
			}else if(country.equals("����")) {
				this.sejob = "���̿���";
			}else if(country.equals("�����")) {
				this.sejob = "�Ҳɵ����";
			}
			System.out.println("������ ����,����,������,�ü�,������");
			System.out.println("����� ,������ �ֽ��ϴ�.");
			System.out.println("1.���� 2.���� 3.������ 4.�ü� 5.������");
			System.out.println("6.����� .7����");
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
			if(country.equals("�ΰ�")) {
				this.sejob = "Ȳ��";
			}else if(country.equals("����")) {
				this.sejob = "��忤��";
			}else if(country.equals("�����")) {
				this.sejob = "��ö�����";
			}
			System.out.println("������ ����,����,������,�ü�,������");
			System.out.println("����� ,������ �ֽ��ϴ�.");
			System.out.println("1.���� 2.���� 3.������ 4.�ü� 5.������");
			System.out.println("6.����� .7����");
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
			if(country.equals("�ΰ�")) {
				this.sejob = "����";
			}else if(country.equals("����")) {
				this.sejob = "��ũ����";
			}else if(country.equals("�����")) {
				this.sejob = "���������";
			}
			System.out.println("������ ����,����,������,�ü�,������");
			System.out.println("����� ,������ �ֽ��ϴ�.");
			System.out.println("1.���� 2.���� 3.������ 4.�ü� 5.������");
			System.out.println("6.����� .7����");
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
			if(country.equals("�ΰ�")) {
				sejob = "ȥ��";
			}else if(country.equals("����")) {
				sejob = "����ȥ��";
			}else if(country.equals("�����")) {
				sejob = "�巡������";
			}
			System.out.println("������ ����,����,������,�ü�,������");
			System.out.println("����� ,������ �ֽ��ϴ�.");
			System.out.println("1.���� 2.���� 3.������ 4.�ü� 5.������");
			System.out.println("6.����� .7����");
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
			if(country.equals("�ΰ�")) {
				sejob = "����";
			}else if(country.equals("����")) {
				sejob = "������������";
			}else if(country.equals("�����")) {
				sejob = "���������";
			}
			System.out.println("������ ����,����,������,�ü�,������");
			System.out.println("����� ,������ �ֽ��ϴ�.");
			System.out.println("1.���� 2.���� 3.������ 4.�ü� 5.������");
			System.out.println("6.����� .7����");
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
			System.out.println("������ �߸� �Է��Ͽ��� ������ �������� ���� �˴ϴ�.");
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
				job ="����";
				this.name();
				break;
				}
			case 2:{
				job ="����";
				this.name();
				break;
				}
			case 3:{
				job ="������";
				this.name();
				break;
				}
			case 4:{
				job ="�ü�";
				this.name();
				break;
				}
			case 5:{
				job ="������";
				this.name();
				break;
				}
			case 6:{
				job ="�����";
				this.name();
				break;
			}
			case 7:{
				job ="����";
				this.name();
				break;
			}
			case 99: job ="��ũ�θ༭";this.name();break;
			case 98: job ="���";this.name();break;
			default :{
				int sum = (int)(Math.random()*8)+1;
				System.out.println(sum);
				if(sum ==15 || sum == 7) {
					System.out.println("�������� ���簡 ���� �Ǿ����ϴ�.");
					selme = 1;
					this.setjob(selme);
					break;
				}else if(sum == 16 || sum ==8) {
					System.out.println("�������� ������ ���� �Ǿ����ϴ�.");
					selme = 2;
					this.setjob(selme);
					break;
				}else if(sum == 6 || sum == 12) {
					System.out.println("�������� �����簡 ���� �Ǿ����ϴ�.");
					selme = 3;
					this.setjob(selme);
					break;
				}else if(sum == 5 || sum == 13) {
					System.out.println("�������� �ü��� ���� �Ǿ����ϴ�.");
					selme = 4;
					this.setjob(selme);
					break;
				}else if(sum == 10 || sum == 11) {
					System.out.println("�������� �������� ���� �Ǿ����ϴ�.");
					selme = 5;
					this.setjob(selme);
					break;
				}else if(sum == 2 || sum == 9) {
					System.out.println("�������� ����簡 ���� �Ǿ����ϴ�.");
					selme = 6;
					this.setjob(selme);
					break;
				}else if(sum == 14 || sum == 3) {
					System.out.println("�������� ������ ���� �Ǿ����ϴ�.");
					selme = 7;
					this.setjob(selme);
					break;
				}else if(sum == 4) {
					System.out.println("�������� ���� ����(��ũ�θ༭)�� ���� �Ǿ����ϴ�.");
					selme = 99;
					this.setjob(selme);
					break;
				}else if(sum == 1) {
					System.out.println("�������� ���� ����(���)�� ���� �Ǿ����ϴ�.");
					selme = 98;
					this.setjob(selme);
					break;
				}
				break;
		}
		}
	}
	public void name() throws InterruptedException, IOException {
		
		System.out.println("�̸��� �Է��� �ּ���"); 
		System.out.print(">>>");
		name = sc.next();
		if (name != null) {
			System.out.println("������ �����帳�ϴ�.");
			this.showname();
		} 
	} //name
	void showname() throws InterruptedException, IOException {
		System.out.println("�̸� :" + name);
		System.out.println("���� :" +country);
		System.out.println("���� :" +sejob);
		System.out.println("���� :"+ job);
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
		System.out.println("�̸� :" +name);
		System.out.println("���� :" +country);
		System.out.println("���� :" +sejob);
		System.out.println("���� :"+ job);
		System.out.println("��� :"+ money);
		System.out.println("============");
		System.out.println("���� : "+lv);
		System.out.println("ü�� : "+hp + " / " +maxhp);
		System.out.println("�Ƹ� : "+ac);
		System.out.println("���� : "+exp);
		System.out.println("============");
		System.out.println("���� ���� : "+ eqwp);
		System.out.println("���� ���� : "+ eqam);
		System.out.println("�ٷ� : "+str + "("+strp+")");
		System.out.println("��ø : "+dex+ "("+dexp+")");
		System.out.println("�ǰ� : "+hel+ "("+help+")");
		System.out.println("���� : "+intel+ "("+intelp+")");
		System.out.println("���� : "+wis+ "("+wisp+")");
		System.out.println("�ŷ� : "+chr+ "("+chrp+")");
		System.out.println("��� : "+luc);
		System.out.println("���� : "+kar);
		System.out.println("�ž� : "+sin);
		}	
	void statset() throws InterruptedException, IOException {
		if(country.equals("�ΰ�")) {
			if(sejob.equals("����")) {
				System.out.println("���� Ư : ��� + 2, ���� -2");
				System.out.println("'�ΰ��� �߿����� ���� ������ �ִٰ� �����ϴ� �ڵ�����.");
				System.out.println("�Ƶ��Կ� ���� �־� ���� ��� ���ư����� �𸣰�");
				System.out.println("����� �ϳ��� �ȶ� �ϴٰ� �����ϴ�...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statwhite.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statwhite.get(i)+"���� �ο��մϴ�.");
						str = (int) statwhite.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statwhite.get(i)+"���� �ο��մϴ�.");
						dex = (int) statwhite.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statwhite.get(i)+"���� �ο��մϴ�.");
						hel = (int) statwhite.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statwhite.get(i)+"���� �ο��մϴ�.");
						intel = (int) statwhite.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statwhite.get(i)+"���� �ο��մϴ�.");
						wis = (int) statwhite.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statwhite.get(i)+"���� �ο��մϴ�.");
						chr = (int) statwhite.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
			}else if(sejob.equals("Ȳ��")) {
				System.out.println("Ȳ�� Ư : ��� -2, ���� +2 �žӽ� +10");
				System.out.println("'�ΰ����� ���� ���� �Ǿ��ٴ� ��������");
				System.out.println("������ Ư���� Ȳ�ε��� ȣ���̿� ��赵 �ǰ� ");
				System.out.println("�巡��� ��嵵 �ߴ���, �� ���� �������� ���̾�...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statbrown.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statbrown.get(i)+"���� �ο��մϴ�.");
						str = (int) statbrown.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statbrown.get(i)+"���� �ο��մϴ�.");
						dex = (int) statbrown.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statbrown.get(i)+"���� �ο��մϴ�.");
						hel = (int) statbrown.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statbrown.get(i)+"���� �ο��մϴ�.");
						intel = (int) statbrown.get(i);
						System.out.println("Ȳ�� ������ Ư�� ���� +1 �ο��մϴ�.");
						intel += 1;
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statbrown.get(i)+"���� �ο��մϴ�.");
						wis = (int) statbrown.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statbrown.get(i)+"���� �ο��մϴ�.");
						chr = (int) statbrown.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
				
			}else if(sejob.equals("����")) {
				System.out.println("���� Ư : ��� -4");
				System.out.println("'�׵��� ���� ��ø�� ���� �������� ���� �ɷ��� ������ ����");
				System.out.println("�ٸ� �׵鿡�Դ� �ʹ��� ū ������ ������ ���� ���̾�");
				System.out.println("����� ������ �� ������ ����...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statblack.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statblack.get(i)+"���� �ο��մϴ�.");
						str = (int) statblack.get(i);
						System.out.println("���� ������ Ư�� �ٷ� +1 �ο��մϴ�.");
						str += 1;
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statblack.get(i)+"���� �ο��մϴ�.");
						dex = (int) statblack.get(i);
						System.out.println("���� ������ Ư�� ��ø +1 �ο��մϴ�.");
						dex += 1;
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statblack.get(i)+"���� �ο��մϴ�.");
						hel = (int) statblack.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statblack.get(i)+"���� �ο��մϴ�.");
						intel = (int) statblack.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statblack.get(i)+"���� �ο��մϴ�.");
						wis = (int) statblack.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statblack.get(i)+"���� �ο��մϴ�.");
						chr = (int) statblack.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
				
			}else if(sejob.equals("����")) {
				System.out.println("���� Ư : ��� +4 ���� +4");
				System.out.println("'�������� ������ �پ�����, ������ å������ �߸���,");
				System.out.println("���� ������ ����ϴ� ������, �����ο��� Ȯ���ϴ� ���ް���");
				System.out.println("�̼��踦 �Ѿ�� �� ����� � �����ϱ�?'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statgal.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statgal.get(i)+"���� �ο��մϴ�.");
						str = (int) statgal.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statgal.get(i)+"���� �ο��մϴ�.");
						dex = (int) statgal.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statgal.get(i)+"���� �ο��մϴ�.");
						hel = (int) statgal.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statgal.get(i)+"���� �ο��մϴ�.");
						intel = (int) statgal.get(i);
						System.out.println("���� ������ Ư�� ���� -3 �ο��մϴ�.");
						intel -= 3;
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statgal.get(i)+"���� �ο��մϴ�.");
						wis = (int) statgal.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statgal.get(i)+"���� �ο��մϴ�.");
						chr = (int) statgal.get(i);
						System.out.println("���� ������ Ư�� �ŷ� +3 �ο��մϴ�.");
						chr += 3;
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for	
			}else if(sejob.equals("ȥ��")) {
				System.out.println("ȥ�� Ư : ��� +1 ���� +1");
				System.out.println("'�ٸ� ������ �Ǹ� ���� �� �پ ��ü�� �����.");
				System.out.println("���ɸ� �ϴٸ� �ξ� �پ ��ü�� �¾����");
				System.out.println("Ȥ�� �ݴ��� ��쵵 ������ ���̾�.'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(stathm.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+stathm.get(i)+"���� �ο��մϴ�.");
						str = (int) stathm.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+stathm.get(i)+"���� �ο��մϴ�.");
						dex = (int) stathm.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+stathm.get(i)+"���� �ο��մϴ�.");
						hel = (int) stathm.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+stathm.get(i)+"���� �ο��մϴ�.");
						intel = (int) stathm.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+stathm.get(i)+"���� �ο��մϴ�.");
						wis = (int) stathm.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+stathm.get(i)+"���� �ο��մϴ�.");
						chr = (int) stathm.get(i);
						System.out.println("ȥ�� ������ Ư�� �ŷ� +1 �ο��մϴ�.");
						chr += 1;
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
				System.out.println("ȥ�� ������ Ư�� ���� �ɷ�ġ�� +1 �ο��մϴ�.");
				int ran = 0;
				ran = (int)(Math.random()*5);
				switch (ran) {
				case 0:{
					System.out.println("ȥ�� Ư������ �ٷ¿� +1 �Ǿ����ϴ�.");
					str += 1;
					break;}
				case 1:{
					System.out.println("ȥ�� Ư������ ��ø�� +1 �Ǿ����ϴ�.");
					dex += 1;
					break;}
				case 2:{
					System.out.println("ȥ�� Ư������ �ǰ��� +1 �Ǿ����ϴ�.");
					hel += 1;
					break;}
				case 3:{
					System.out.println("ȥ�� Ư������ ���ɿ� +1 �Ǿ����ϴ�.");
					intel += 1;
					break;}
				case 4:{
					System.out.println("ȥ�� Ư������ ���ɿ� +1 �Ǿ����ϴ�.");
					wis += 1;
					break;}
				case 5:{
					System.out.println("ȥ�� Ư������ �ŷ¿� +1 �Ǿ����ϴ�.");
					chr += 1;
					break;}
	
				}
			}
		}else if(country.equals("����")) {
			if(sejob.equals("���̿���")) {
				System.out.println("���̿��� Ư : ��� +3 ���� +2 �žӽ� +10");
				System.out.println("'���̿����� �����߿����� �� �ȵǴ� ���� ��ü�� �����ϰ� ����");
				System.out.println("�¾�� �ʾƼ��� �ƴϾ�...");
				System.out.println("�ڱ���� �Ƿ��� ���ؼ���'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(stathl.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+stathl.get(i)+"���� �ο��մϴ�.");
						str = (int) stathl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+stathl.get(i)+"���� �ο��մϴ�.");
						dex = (int) stathl.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+stathl.get(i)+"���� �ο��մϴ�.");
						hel = (int) stathl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+stathl.get(i)+"���� �ο��մϴ�.");
						intel = (int) stathl.get(i);
						System.out.println("���̿��� ������ Ư�� ���� +1 �ο��մϴ�.");
						intel += 1;
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+stathl.get(i)+"���� �ο��մϴ�.");
						wis = (int) stathl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+stathl.get(i)+"���� �ο��մϴ�.");
						chr = (int) stathl.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
			}else if(sejob.equals("��忤��")) {
				System.out.println("��忤�� Ư : ��� +4");
				System.out.println("'��忤���� ���� ����ϴ� ���� ���� ������");
				System.out.println("���� ���ϴ� �ص� ���� ���Ⱑ �����");
				System.out.println("�ױ� ������ ������ ���� ������ �����ϱ�'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statwl.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statwl.get(i)+"���� �ο��մϴ�.");
						str = (int) statwl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statwl.get(i)+"���� �ο��մϴ�.");
						dex = (int) statwl.get(i);
						System.out.println("��忤�� ������ Ư�� ��ø +1 �ο��մϴ�.");
						dex += 1;
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statwl.get(i)+"���� �ο��մϴ�.");
						hel = (int) statwl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statwl.get(i)+"���� �ο��մϴ�.");
						intel = (int) statwl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statwl.get(i)+"���� �ο��մϴ�.");
						wis = (int) statwl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statwl.get(i)+"���� �ο��մϴ�.");
						chr = (int) statwl.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
			}else if(sejob.equals("��ũ����")) {
				System.out.println("��ũ���� Ư : ��� -2 ���� -5 �žӽ� -5");
				System.out.println("'��ũ������ ���̿��� ��忤�� �Ұ� ���� Ÿ���ϸ� �Ǵ� �����̾�");
				System.out.println("����� ���� �����߿��� �ٸ� �ǹ̷� ���ϴٰ� �Ҽ� ����.");
				System.out.println("��� ���鸸�� ���� ���� ���� �����ϱ�'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statdl.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statdl.get(i)+"���� �ο��մϴ�.");
						str = (int) statdl.get(i);
						System.out.println("��ũ���� ������ Ư�� ��ø +1 �ο��մϴ�.");
						str += 1;
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statdl.get(i)+"���� �ο��մϴ�.");
						dex = (int) statdl.get(i);
						System.out.println("��ũ���� ������ Ư�� ��ø +2 �ο��մϴ�.");
						dex += 2;
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statdl.get(i)+"���� �ο��մϴ�.");
						hel = (int) statdl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statdl.get(i)+"���� �ο��մϴ�.");
						intel = (int) statdl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statdl.get(i)+"���� �ο��մϴ�.");
						wis = (int) statdl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statdl.get(i)+"���� �ο��մϴ�.");
						chr = (int) statdl.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
			}else if(sejob.equals("������������")) {
				System.out.println("������������ Ư : ��� -4 ���� -4");
				System.out.println("'������ ��ü�� ���� ��Ȱ�� ���� ����");
				System.out.println("������� �� ���� �͸��� �ƴϾ�");
				System.out.println("�� ��ǥ���� ���Ű� �� �����̴ϱ�...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statsl.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statsl.get(i)+"���� �ο��մϴ�.");
						str = (int) statsl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statsl.get(i)+"���� �ο��մϴ�.");
						dex = (int) statsl.get(i);
						System.out.println("������������ ������ Ư�� ��ø +2 �ο��մϴ�.");
						dex += 2;
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statsl.get(i)+"���� �ο��մϴ�.");
						hel = (int) statsl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statsl.get(i)+"���� �ο��մϴ�.");
						intel = (int) statsl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statsl.get(i)+"���� �ο��մϴ�.");
						wis = (int) statsl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statsl.get(i)+"���� �ο��մϴ�.");
						chr = (int) statsl.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for
			}else if(sejob.equals("����ȥ��")) {
				System.out.println("����ȥ�� Ư : ��� -1 ���� +1");
				System.out.println("'��Ȥ ������ �߿����� ���� �ٸ� �������̶� ����� ������ ����");
				System.out.println("������ ���� �������� ��ġ��� �����ϰŵ�");
				System.out.println("�׷��� ����� �� �������� �ʴ����...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statsl.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statsl.get(i)+"���� �ο��մϴ�.");
						str = (int) statsl.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statsl.get(i)+"���� �ο��մϴ�.");
						dex = (int) statsl.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statsl.get(i)+"���� �ο��մϴ�.");
						hel = (int) statsl.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statsl.get(i)+"���� �ο��մϴ�.");
						intel = (int) statsl.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statsl.get(i)+"���� �ο��մϴ�.");
						wis = (int) statsl.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statsl.get(i)+"���� �ο��մϴ�.");
						chr = (int) statsl.get(i);
						System.out.println("����ȥ�� ������ Ư�� �ŷ� -1 �ο��մϴ�.");
						chr -= 1;
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for		
				System.out.println("ȥ�� ������ Ư�� ���� �ɷ�ġ�� +1 �ο��մϴ�.");
				int ran = 0;
				ran = (int)(Math.random()*5);
				switch (ran) {
				case 0:{
					System.out.println("ȥ�� Ư������ �ٷ¿� +1 �Ǿ����ϴ�.");
					str += 1;
					break;}
				case 1:{
					System.out.println("ȥ�� Ư������ ��ø�� +1 �Ǿ����ϴ�.");
					dex += 1;
					break;}
				case 2:{
					System.out.println("ȥ�� Ư������ �ǰ��� +1 �Ǿ����ϴ�.");
					hel += 1;
					break;}
				case 3:{
					System.out.println("ȥ�� Ư������ ���ɿ� +1 �Ǿ����ϴ�.");
					intel += 1;
					break;}
				case 4:{
					System.out.println("ȥ�� Ư������ ���ɿ� +1 �Ǿ����ϴ�.");
					wis += 1;
					break;}
				case 5:{
					System.out.println("ȥ�� Ư������ �ŷ¿� +1 �Ǿ����ϴ�.");
					chr += 1;
					break;}
	
				}
		}//����
		}else if(country.equals("�����")) {
			if(sejob.equals("�Ҳɵ����")) {
				System.out.println("�Ҳɵ���� Ư : ��� +1 ���� +1 �žӽ� +5");
				System.out.println("'�Ҳɵ������ ���濡 �Ҳ��� ������ ��ô� �����̾�.");
				System.out.println("�Ҳ�.. �� ���� �丮�� �ϰų�, ������ ����ų�");
				System.out.println("������ �¿� �����ų�...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statfd.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statfd.get(i)+"���� �ο��մϴ�.");
						str = (int) statfd.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statfd.get(i)+"���� �ο��մϴ�.");
						dex = (int) statfd.get(i);
						System.out.println("�Ҳɵ���� ������ Ư�� ��ø +1 �ο��մϴ�.");
						dex += 1;
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statfd.get(i)+"���� �ο��մϴ�.");
						hel = (int) statfd.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statfd.get(i)+"���� �ο��մϴ�.");
						intel = (int) statfd.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statfd.get(i)+"���� �ο��մϴ�.");
						wis = (int) statfd.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statfd.get(i)+"���� �ο��մϴ�.");
						chr = (int) statfd.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for	
			}else if(sejob.equals("��ö�����")) {
				System.out.println("��ö����� Ư : ��� +1 ���� +1 �žӽ� +5");
				System.out.println("'��ö������� ��� ������ �⺻ ����� ö�� �ž�����");
				System.out.println("������ ö�� �����ؼ� ����ٳ� ����...");
				System.out.println("�׷��� ���� �ְ��� ������� �ݼ��̴ϱ�.'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statid.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statid.get(i)+"���� �ο��մϴ�.");
						str = (int) statid.get(i);
						System.out.println("��ö����� ������ Ư�� �ٷ� +1 �ο��մϴ�.");
						str += 1;
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statid.get(i)+"���� �ο��մϴ�.");
						dex = (int) statid.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statid.get(i)+"���� �ο��մϴ�.");
						hel = (int) statid.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statid.get(i)+"���� �ο��մϴ�.");
						intel = (int) statid.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statid.get(i)+"���� �ο��մϴ�.");
						wis = (int) statid.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statid.get(i)+"���� �ο��մϴ�.");
						chr = (int) statid.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for	
				
			}else if(sejob.equals("���������")) {
				System.out.println("��������� Ư : ��� +1 ���� +1 +5");
				System.out.println("'������ ��� ������ �� ������ ���´ٰ� ���� �ϴ� �����̾�");
				System.out.println("�Ҳ�, ����, �׷��� ������ �ٸ� ����� ���� ����ϴ� ���� ����.");
				System.out.println("������ �ٽ� ���� ���ٴ� ��������...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statld.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statld.get(i)+"���� �ο��մϴ�.");
						str = (int) statld.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statld.get(i)+"���� �ο��մϴ�.");
						dex = (int) statld.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statld.get(i)+"���� �ο��մϴ�.");
						hel = (int) statld.get(i);
						System.out.println("��������� ������ Ư�� ��ø +1 �ο��մϴ�.");
						hel += 1;
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statld.get(i)+"���� �ο��մϴ�.");
						intel = (int) statld.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statld.get(i)+"���� �ο��մϴ�.");
						wis = (int) statld.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statld.get(i)+"���� �ο��մϴ�.");
						chr = (int) statld.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for	
				
			}else if(sejob.equals("�巡������")) {
				System.out.println("�巡������ Ư : ��� +4 ���� -1 �žӽ� -5");
				System.out.println("'�巡�������� �巡�� �ؿ��� ������ ����� ����ڵ�����");
				System.out.println("�ٸ� �巡���� ��� �����Ͽ� ���� �ֱ⿡ ���� ������ ��Ȳ����");
				System.out.println("�׷��� �巡����� ����� ������ ������ �ؾ� ������ ����...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 6 ; i ++) {
				System.out.println(statdd.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.���� 6.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 6) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statdd.get(i)+"���� �ο��մϴ�.");
						str = (int) statdd.get(i);
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statdd.get(i)+"���� �ο��մϴ�.");
						dex = (int) statdd.get(i);
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statdd.get(i)+"���� �ο��մϴ�.");
						hel = (int) statdd.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statdd.get(i)+"���� �ο��մϴ�.");
						intel = (int) statdd.get(i);
					}else if(selme == 5 && wis == 0) {
						System.out.println("������ "+statdd.get(i)+"���� �ο��մϴ�.");
						wis = (int) statdd.get(i);
					}else if(selme == 6 && chr == 0) {
						System.out.println("�ŷ¿� "+statdd.get(i)+"���� �ο��մϴ�.");
						chr = (int) statdd.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for	
				
			}else if(sejob.equals("���������")) {
				System.out.println("��������� Ư : ��� -2 ���� -2 �žӽ� -10");
				System.out.println("'����������� ������ ������ ����� �ڵ�����");
				System.out.println("������ ������ ����ٰ� �ᱹ ������ ������ ��� ������ �Ǿ���");
				System.out.println("�ٸ� �� ������ ���� ����� �ƴϾ��� �͵� �𸣰� ���̾�...'");
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
				System.out.println("�й� �մϴ�.");
				System.out.println("���� ������ �ο� �� �ɷ�ġ�� ���� �Ͽ��ּ���.");
				for(int i = 0 ; i < 5 ; i ++) {
				System.out.println(statmd.get(i) + "�� �ο��� ������?");
				System.out.println("1.�ٷ� 2.��ø 3.�ǰ� 4.���� 5.�ŷ�");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("����Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					i--;
					continue;
				}
				if(1<= selme&& selme <= 5) {
					if(selme == 1 && str == 0) {
						System.out.println("�ٷ¿� "+statmd.get(i)+"���� �ο��մϴ�.");
						str = (int) statmd.get(i);
						System.out.println("��������� ������ Ư�� �� +2 �ο��մϴ�.");
						str += 2;
					}else if(selme == 2 && dex == 0) {
						System.out.println("��ø�� "+statmd.get(i)+"���� �ο��մϴ�.");
						dex = (int) statmd.get(i);
						System.out.println("��������� ������ Ư�� ��ø +2 �ο��մϴ�.");
						dex += 2;
					}else if(selme == 3 && hel == 0) {
						System.out.println("�ǰ��� "+statmd.get(i)+"���� �ο��մϴ�.");
						hel = (int) statmd.get(i);
					}else if(selme == 4 && intel == 0) {
						System.out.println("���ɿ� "+statmd.get(i)+"���� �ο��մϴ�.");
						intel = (int) statmd.get(i);
					}else if(selme == 5 && chr == 0) {
						System.out.println("�ŷ¿� "+statmd.get(i)+"���� �ο��մϴ�.");
						chr = (int) statmd.get(i);
					}else {
						System.out.println("�ش� �ɷ�ġ�� �̹� �ο� �Ǿ��ֽ��ϴ�.");
						System.out.println("�ٸ� �ɷ�ġ�� �����ϼ���");
						i--;
					}
				}else {
					System.out.println("�ɷ�ġ�� �ٽ� Ȯ�� �� �ο����ּ���.");
					i--;
				}
		}//for	
					System.out.println("����������� �������� ���� �������� ���� ������ �����˴ϴ�.");
					System.out.println("������ "+statmd.get(5)+"���� �ο��մϴ�.");
					wis = (int) statmd.get(5);
				
			}
		}//������ if��
		if(job.equals("��ũ�θ༭")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("�žӽ� - 20 ���� + 10 ���� + 3");
			sin -= 20;
			intel += 10;
			wis += 3;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. �� 2. �ذ�");
			System.out.println("���� ����Ưȭ"); int here;
			System.out.println("�ذ��� ����Ưȭ");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
		
			}finally {
				if(selme == 1) {
					System.out.println("���� ���� �߽��ϴ�.");
					eqwp = "��";
				}else if(selme == 2) {
					System.out.println("�ذ��� ���� �߽��ϴ�.");
					eqwp = "�ذ�";
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.������ 2.�ո�");
			System.out.println("�װ� �װ�");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("�����⸦ ���� �߽��ϴ�.");
					eqam = "������";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("�ո��� ���� �߽��ϴ�.");
					eqam = "�ո�";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("����")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("�žӽ� +10 ���� +5 ���� +5");
			sin += 10;
			intel += 5;
			wis += 5;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. ������ 2. å");
			System.out.println("�����̴� ����"); int here;
			System.out.println("å�� ���� (������ ũ��Ƽ��)");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���⸦ �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("�����̸� ���� �߽��ϴ�.");
					eqwp = "������";
				}else if(selme == 2) {
					System.out.println("å�� ���� �߽��ϴ�.");
					eqwp = "å";
				}else {
					System.out.println("���⸦ �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.������ 2.���װ���");
			System.out.println("�������� ����");int here2;
			System.out.println("���װ����� ��ø");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("�������� ���� �߽��ϴ�.");
					eqam = "������";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("���װ����� ���� �߽��ϴ�.");
					eqam = "���װ���";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("�����")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("�žӽ� +5 �ٷ� +5 �ǰ� +3 ����+2");
			sin += 5;
			str += 5;
			hel += 3;
			intel += 2;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 8");
			maxhp = 8;
			hp = 8;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. ��׽�Ÿ 2. ��Ʋ��");
			System.out.println("��׽�Ÿ�� ��"); int here;
			System.out.println("��Ʋ���� ��");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���⸦ �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("��׽�Ÿ�� ���� �߽��ϴ�.");
					eqwp = "��׽�Ÿ";
				}else if(selme == 2) {
					System.out.println("��Ʋ���� ���� �߽��ϴ�.");
					eqwp = "��Ʋ��";
				}else {
					System.out.println("���⸦ �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.������ 2.ö����");
			System.out.println("�������� ����");int here2;
			System.out.println("ö������ ��");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("�������� ���� �߽��ϴ�.");
					eqam = "������";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("ö������ ���� �߽��ϴ�.");
					eqam = "ö����";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("������")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("�ٷ� +4 ��ø +3 �ǰ� +3");
			str += 4;
			dex += 3;
			hel += 3;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 8");
			maxhp = 8;
			hp = 8;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. ��Ʋ�� 2. �۷���");
			System.out.println("��Ʋ���� ��"); int here;
			System.out.println("�۷���� ��ø");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���⸦ �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("��Ʋ���� ���� �߽��ϴ�.");
					eqwp = "��Ʋ��";
				}else if(selme == 2) {
					System.out.println("�۷��긦 ���� �߽��ϴ�.");
					eqwp = "�۷���";
				}else {
					System.out.println("���⸦ �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.���� 2.���װ���");
			System.out.println("������ ����");int here2;
			System.out.println("���װ����� ��ø");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("������ ���� �߽��ϴ�.");
					eqam = "����";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("���װ����� ���� �߽��ϴ�.");
					eqam = "���װ���";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("�ü�")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("��ø +7 ���� +3");
			dex += 7;
			wis += 3;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 6");
			maxhp = 6;
			hp = 6;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. Ȱ 2. ǥâ");
			System.out.println("Ȱ�� ��"); int here;
			System.out.println("ǥâ�� ��");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("Ȱ�� ���� �߽��ϴ�.");
					eqwp = "Ȱ";
				}else if(selme == 2) {
					System.out.println("ǥâ�� ���� �߽��ϴ�.");
					eqwp = "ǥâ";
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1. ���װ��� 2. ���ڿ�");
			System.out.println("�װ� �װ�");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("���װ����� ���� �߽��ϴ�.");
					eqam = "���װ���";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("���ڿ��� ���� �߽��ϴ�.");
					eqam = "���ڿ�";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("������")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("���� +6 ���� +4");
			intel += 6;
			wis += 4;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. ������ 2. å");
			System.out.println("�����̴� ����"); int here;
			System.out.println("å�� ����");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("�����̸� ���� �߽��ϴ�.");
					eqwp = "������";
				}else if(selme == 2) {
					System.out.println("å�� ���� �߽��ϴ�.");
					eqwp = "å";
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.�κ� 2.���װ���");
			System.out.println("�װ� �װ�");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("�κ긦 ���� �߽��ϴ�.");
					eqam = "�κ�";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("���װ��ʸ� ���� �߽��ϴ�.");
					eqam = "���װ���";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("����")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("��ø +10");
			dex += 10;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 6");
			maxhp = 6;
			hp = 6;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. �ܰ� 2. ��");
			System.out.println("�ܰ��� ��"); int here;
			System.out.println("���� ���� ");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("�ܰ��� ���� �߽��ϴ�.");
					eqwp = "�ܰ�";
				}else if(selme == 2) {
					System.out.println("���� ���� �߽��ϴ�.");
					eqwp = "��";
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.���װ��� 2.�˼���");
			System.out.println("�װ� �װ�");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("���װ����� ���� �߽��ϴ�.");
					eqam = "���װ���";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("�˼��� ���� �߽��ϴ�.");
					eqam = "�˼���";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("����")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("�ٷ� +5 �ǰ� +5");
			str += 5;
			hel += 5;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 8");
			maxhp = 8;
			hp = 8;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. �Ѽհ� 2. �Ϻ���");
			System.out.println("�Ѽհ��� ���"); int here;
			System.out.println("�Ϻ����� ��");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("�Ѽհ��� ���� �߽��ϴ�.");
					eqwp = "�Ѽհ�";
				}else if(selme == 2) {
					System.out.println("�Ϻ����� ���� �߽��ϴ�.");
					eqwp = "�Ϻ���";
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.ö���� 2.���װ���");
			System.out.println("�װ� �װ�");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("ö������ ���� �߽��ϴ�.");
					eqam = "ö����";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("���װ����� ���� �߽��ϴ�.");
					eqam = "���װ���";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
					ac = am.amac(eqam);
				}
			}
		}else if(job.equals("���")) {
			System.out.println(job + "���� �߰� �ɷ�ġ");
			System.out.println("�ٷ� +5 �ǰ� -3");
			str += 5;
			hel -= 3;
			System.out.println("ü���� ���մϴ�.");
			System.out.println(job + "�⺻ ü���� 4");
			maxhp = 4;
			hp = 4;
			System.out.println(job + "�� ���⸦ �����մϴ�.");
			System.out.println("1. �� 2. ����ƺ�");
			System.out.println("���� ����"); int here;
			System.out.println("����ƺ�� ģ��");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqwp = "�Ǽ�";
			}finally {
				if(selme == 1) {
					System.out.println("���� ���� �߽��ϴ�.");
					eqwp = "��";
				}else if(selme == 2) {
					System.out.println("����ƺ��� ���� �߽��ϴ�.");
					eqwp = "����ƺ�";
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqwp = "�Ǽ�";
				}
			}
			System.out.println(job + "�� ���� ���� �����մϴ�.");
			System.out.println("1.������ 2.�ո�");
			System.out.println("�װ� �װ�");int here2;
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���� �������� �ʰ� �����մϴ�");
				eqam = "�˸�";
				ac = am.amac(eqam);
			}finally {
				if(selme == 1) {
					System.out.println("�����⸦ ���� �߽��ϴ�.");
					eqam = "������";
					ac = am.amac(eqam);
				}else if(selme == 2) {
					System.out.println("�ո��� ���� �߽��ϴ�.");
					eqam = "�ո�";
					ac = am.amac(eqam);
				}else {
					System.out.println("���� �������� �ʰ� �����մϴ�");
					eqam = "�˸�";
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
		System.out.println("�ɷ�ġ ����� �Ϸ� �߽��ϴ�.");
		System.out.println("----- ���� ���� -----");
		this.showstat();
		System.out.println("������ 1. Ʋ���� 2.");
		System.out.println(">>>");
		ch1 ch1 = new ch1();
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("���� �Է� �߱� ������ ������ ���丮�� ���� �˴ϴ�.");
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
				System.out.println("���� �Է� �߱� ������ ������ ���丮�� ���� �˴ϴ�.");
				gostop = false;
				ch1.sc1();
			}
		}
	}//statset
	void walk1(int i) throws InterruptedException, IOException  {
		x = i;
		for(x =i; x >= 0  ; x-- ) {
			System.out.println("���� �ȴ� ��");
			System.out.println("===============");
			ranen = (int) ((Math.random()*6)+1);
			if(x == 0) {
				System.out.println("�ý��� : �������� �����߽��ϴ�.");
				ch1.sc2();
			}else if(ranen == 1 || ranen ==2 ) {
				System.out.println("�ý��� : 1Km ���� �Ϸ�");
				System.out.println("���� �Ÿ� : " + x);
			}else if(ranen == 4 || ranen == 3) {
				System.out.println("���Ϳ� ���� ���� �غ�");
				System.out.println("===============");
				int ran = (int)(Math.random()*6)+lv;
				if(ran >= 1 && ran <= 6) {
					System.out.println("����� ������.");
					meetenemy("���");
					break;
//				}if(ran > 3 && ran <= 6) {
//					meetenemy("����");
				}
			}else if(ranen == 5) {
				System.out.println("������ ������.");
				System.out.println("���� �Ÿ� :" + x);
			}else if(ranen == 6) {
				System.out.println("ķ������ ã�Ҵ�.");
				System.out.println("10�ʰ��� �޽����� hp�� ��ü ȸ��");
				Thread.sleep(1000);
				hp = maxhp;
				showstat();
				System.out.println("�ٽ� ������ ������.");
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
			System.out.println("���Ͽ� �ɷ� �̹����� ���ϴ�.");
			stun --;
			defence(enemyname);
		}
		System.out.println("�ൿ�� �����ϼ���.");
		System.out.println("1.��Ÿ 2.��ų 3.������ 4.����");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("�߸� ���� �ϼ̱⿡ ��Ÿ�� ���� �մϴ�.");
			selme = 1;
		}switch (selme) {
		case 1:{
			this.attack(enemyname);
			break;
		}
		case 2:{
			System.out.println("��ų�� ����մϴ�.");
			this.skill1(job,enemyname);
			break;}
		case 3:{
//			this.item();
			System.out.println("�������� ���� �̱��� �Դϴ�.");
			System.out.println("���� �޴��� ���ư��ϴ�.");
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
			if(wpt.equals("�ٷ�")) {
				pac += strp;
			}
			if(wpt.equals("��ø")) {
				pac += dexp;
			}
			if(wpt.equals("����")) {
				pac += intelp;
			}
			if(wpt.equals("ü��")) {
				pac += help;
			}
			if(wpt.equals("����")) {
				pac += wisp;
			}
			if(wpt.equals("�ŷ�")) {
				pac += chrp;
			}
				int target = 0;
				System.out.println("����� ������ �ּ���.");
				System.out.println(enemyname +"1 �� ü�� :"+enhp1);
				System.out.println(enemyname +"2 �� ü�� :"+enhp2);
				System.out.println(enemyname +"3 �� ü�� :"+enhp3);
				System.out.print(">>>");
				gostop = true;
				System.out.println("===== �� ���� =====");
				while(gostop) {
				try {
					 target = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					continue;
				}finally {
					if(enhp1 <= 0 && target == 1) {
						System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
						continue;
					}else if(enhp2 <= 0 && target == 2) {
						System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
						continue;
					}else if(enhp3 <= 0 && target == 3) {
						System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
						continue;
					}
					switch (target) {
					case 1:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
						System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
						if(attrn == 1){
							System.out.println("�� ������ ������ ���������ϴ�.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1;
								enhp1 -= dmg;
								System.out.println(dmg + "��ŭ ������� �������ϴ�.");
								System.out.println("�� 1 �� ���� ü�� : " + enhp1);
								gostop = false;
							}break;
						}if(attrn == 20) {
							System.out.println("ġ��Ÿ�� �������ϴ�.");
							System.out.println("��� ����� 2��");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp1 -= dmg*2;
							System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 1 �� ���� ü�� : " + enhp1);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("�ƽ��� ���� �����ϴ�.");
							gostop = false;
							break;
						}
					}
					case 2:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
						System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
						if(attrn == 1){
							System.out.println("�� ������ ������ ���������ϴ�.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1;
								enhp2 -= dmg;
								System.out.println(dmg + "��ŭ ������� �������ϴ�.");
								System.out.println("�� 2 �� ���� ü�� : " + enhp2);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("ġ��Ÿ�� �������ϴ�.");
							System.out.println("��� ����� 2��");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp2 -= dmg*2;
							System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 2 �� ���� ü�� : " + enhp3);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("�ƽ��� ���� �����ϴ�.");
							gostop = false;
							break;
						}
					}case 3:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
						System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
						if(attrn == 1){
							System.out.println("�� ������ ������ ���������ϴ�.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1;
								enhp3 -= dmg;
								System.out.println(dmg + "��ŭ ������� �������ϴ�.");
								System.out.println("�� 3 �� ���� ü�� : " + enhp3);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("ġ��Ÿ�� �������ϴ�.");
							System.out.println("��� ����� 2��");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp3 -= dmg*2;
							System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("�ƽ��� ���� �����ϴ�.");
							gostop = false;
							break;
						}
					}
					default: System.out.println("�ش���� �����ϴ�.");
						continue;
					}
				}
				if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
					System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
					this.win(enemyname);
				}else {
					defence(enemyname);
				}
			}
		}//attack
			
	
		
			
	private void skill1(String job2 ,String enemy) throws InterruptedException, IOException {
		if(job2.equals("����")) {
			if(lv == 1) {
				System.out.println("1. ��Ÿ 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "��Ÿ";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
		}
	}
		 if(job2.equals("����")) {
			if(lv == 1) {
				System.out.println("1. �������� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "��������";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("������")) {
			if(lv == 1) {
				System.out.println("1. ȭ��ȭ�� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "ȭ��ȭ��";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("�ü�")) {
			if(lv == 1) {
				System.out.println("1. ���� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "����";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("������")) {
			if(lv == 1) {
				System.out.println("1. ���������� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "����������";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("�����")) {
			if(lv == 1) {
				System.out.println("1. ������� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "�������";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("����")) {
			if(lv == 1) {
				System.out.println("1. ȸ�� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "ȸ��";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("���")) {
			if(lv == 1) {
				System.out.println("1. �簥�� 2.������");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
				}finally {
					if(selme == 1) {
						job2 = "�簥��";
						this.skill2(job2,enemy);
					}else if(selme == 2) {
						ftchoice(enemy);
					}
			}
			}
		}
		 if(job2.equals("��ũ�θ༭")) {
			System.out.println("1. ��ȭ�� 2.������");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
			}finally {
				if(selme == 1) {
					job2 = "��ȭ��";
					this.skill2(job2,enemy);
				}else if(selme == 2) {
					ftchoice(enemy);
				}
		}
		}
	}// skill
	

	private void skill2(String job2, String enemy) throws InterruptedException, IOException {
		if(job2.equals("��Ÿ")) {
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
			if(wpt.equals("�ٷ�")) {
				pac += strp;
			}
			if(wpt.equals("��ø")) {
				pac += dexp;
			}
			if(wpt.equals("����")) {
				pac += intelp;
			}
			if(wpt.equals("ü��")) {
				pac += help;
			}
			if(wpt.equals("����")) {
				pac += wisp;
			}
			if(wpt.equals("�ŷ�")) {
				pac += chrp;
			}
				int target = 0;
				System.out.println("��ų�� ����� ������ �ּ���.");
				System.out.println(enemyname +"1 �� ü�� :"+enhp1);
				System.out.println(enemyname +"2 �� ü�� :"+enhp2);
				System.out.println(enemyname +"3 �� ü�� :"+enhp3);
				System.out.print(">>>");
				gostop = true;
				System.out.println("===== �� ���� =====");
				while(gostop) {
				try {
					 target = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
					continue;
				}finally {
					if(enhp1 <= 0 && target == 1) {
						System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
						continue;
					}else if(enhp2 <= 0 && target == 2) {
						System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
						continue;
					}else if(enhp3 <= 0 && target == 3) {
						System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
						continue;
					}
					switch (target) {
					case 1:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
						System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
						if(attrn == 1){
							System.out.println("�� ������ ������ ���������ϴ�.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							System.out.println("��ų ��Ÿ!");
							System.out.println("��� ����� +2");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1+2;
								enhp1 -= dmg;
								System.out.println(dmg + "��ŭ ������� �������ϴ�.");
								System.out.println("�� 1 �� ���� ü�� : " + enhp1);
								gostop = false;
							}break;
						}if(attrn == 20) {
							System.out.println("��ų ��Ÿ!");
							System.out.println("��� ����� +2");
							System.out.println("ġ��Ÿ�� �������ϴ�.");
							System.out.println("��� ����� 2��");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1+2;
							enhp1 -= dmg*2;
							System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 1 �� ���� ü�� : " + enhp1);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("�ƽ��� ���� �����ϴ�.");
							gostop = false;
							break;
						}
					}
					case 2:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
						System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
						if(attrn == 1){
							System.out.println("�� ������ ������ ���������ϴ�.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							System.out.println("��ų ��Ÿ!");
							System.out.println("��� ����� +2");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1+2;
								enhp2 -= dmg;
								System.out.println(dmg + "��ŭ ������� �������ϴ�.");
								System.out.println("�� 2 �� ���� ü�� : " + enhp2);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("��ų ��Ÿ!");
							System.out.println("��� ����� +2");
							System.out.println("ġ��Ÿ�� �������ϴ�.");
							System.out.println("��� ����� 2��");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1+2;
							enhp2 -= dmg*2;
							System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 2 �� ���� ü�� : " + enhp3);
							
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("�ƽ��� ���� �����ϴ�.");
							gostop = false;
							break;
						}
					}case 3:{
						weapon wp = new weapon();
						int wpacc = wp.wpacc(eqwp);
						System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
						System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
						int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
						if (attrn > 20) {attrn = 20;}
						System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
						if(attrn == 1){
							System.out.println("�� ������ ������ ���������ϴ�.");
							stun += 1;
							gostop = false;
							break;
						}if(eac < attrn && attrn < 20 && attrn >1) {
							System.out.println("��ų ��Ÿ!");
							System.out.println("��� ����� +2");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
								int dmg = (int) (Math.random()*wpdice)+1+2;
								enhp3 -= dmg;
								System.out.println(dmg + "��ŭ ������� �������ϴ�.");
								System.out.println("�� 3 �� ���� ü�� : " + enhp3);
								gostop = false;
								break;
							}break;
						}if(attrn == 20) {
							System.out.println("��ų ��Ÿ!");
							System.out.println("��� ����� +2");
							System.out.println("ġ��Ÿ�� �������ϴ�.");
							System.out.println("��� ����� 2��");
							wpdice = wp.wpdice(eqwp);
							wpdcr = wp.wpdcr(eqwp);
							for(int i = 1; i <= wpdcr ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1+2;
							enhp3 -= dmg*2;
							System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						}
							gostop = false;break;
						}if(eac >= attrn) {
							System.out.println("�ƽ��� ���� �����ϴ�.");
							gostop = false;
							break;
						}
					}
					default: System.out.println("�ش���� �����ϴ�.");
						continue;
					}
				}
				if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
					System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
					this.win(enemyname);
				}else {
					defence(enemyname);
				}
			}
	}else if(job2.equals("��������")) {
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
		if(wpt.equals("�ٷ�")) {
			  
			pac += strp;
		}
		if(wpt.equals("��ø")) {
			pac += dexp;
		}
		if(wpt.equals("����")) {
			pac += intelp;
		}
		if(wpt.equals("ü��")) {
			pac += help;
		}
		if(wpt.equals("����")) {
			pac += wisp;
		}
		if(wpt.equals("�ŷ�")) {
			pac += chrp;
		}
			int target = 0;
			System.out.println("��ų�� ����� ������ �ּ���.");
			System.out.println(enemyname +"1 �� ü�� :"+enhp1);
			System.out.println(enemyname +"2 �� ü�� :"+enhp2);
			System.out.println(enemyname +"3 �� ü�� :"+enhp3);
			System.out.print(">>>");
			gostop = true;
			System.out.println("===== �� ���� =====");
			while(gostop) {
			try {
				 target = Integer.parseInt(sc.next());
			}catch(Exception e){
				System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
				continue;
			}finally {
				if(enhp1 <= 0 && target == 1) {
					System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
					continue;
				}else if(enhp2 <= 0 && target == 2) {
					System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
					continue;
				}else if(enhp3 <= 0 && target == 3) {
					System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
					continue;
				}
				switch (target) {
				case 1:{
					weapon wp = new weapon();
					int wpacc = wp.wpacc(eqwp);
					System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
					System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
					int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
					if (attrn > 20) {attrn = 20;}
					System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
					if(attrn == 1){
						System.out.println("�� ������ ������ ���������ϴ�.");
						stun += 1;
						gostop = false;
						break;
					}if(eac < attrn && attrn < 20 && attrn >1) {
						System.out.println("��ų ��������");
						System.out.println("��� ����� �ֻ��� +1");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp1 -= dmg;
							System.out.println(dmg + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 1 �� ���� ü�� : " + enhp1);
							gostop = false;
						}break;
					}if(attrn == 20) {
						System.out.println("��ų ��������");
						System.out.println("��� ����� �ֻ��� +1");
						System.out.println("ġ��Ÿ�� �������ϴ�.");
						System.out.println("��� ����� 2��");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
						int dmg = (int) (Math.random()*wpdice)+1;
						enhp1 -= dmg*2;
						System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 1 �� ���� ü�� : " + enhp1);
						
					}
						gostop = false;break;
					}if(eac >= attrn) {
						System.out.println("�ƽ��� ���� �����ϴ�.");
						gostop = false;
						break;
					}
				}
				case 2:{
					weapon wp = new weapon();
					int wpacc = wp.wpacc(eqwp);
					System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
					System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
					int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
					if (attrn > 20) {attrn = 20;}
					System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
					if(attrn == 1){
						System.out.println("�� ������ ������ ���������ϴ�.");
						stun += 1;
						gostop = false;
						break;
					}if(eac < attrn && attrn < 20 && attrn >1) {
						System.out.println("��ų ��������!");
						System.out.println("��� ����� �ֻ��� +1");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp2 -= dmg;
							System.out.println(dmg + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 2 �� ���� ü�� : " + enhp2);
							gostop = false;
							break;
						}break;
					}if(attrn == 20) {
						System.out.println("��ų ��������");
						System.out.println("��� ����� �ֻ��� +1");
						System.out.println("ġ��Ÿ�� �������ϴ�.");
						System.out.println("��� ����� 2��");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
						int dmg = (int) (Math.random()*wpdice)+1;
						enhp2 -= dmg*2;
						System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 2 �� ���� ü�� : " + enhp3);
						
					}
						gostop = false;break;
					}if(eac >= attrn) {
						System.out.println("�ƽ��� ���� �����ϴ�.");
						gostop = false;
						break;
					}
				}case 3:{
					weapon wp = new weapon();
					int wpacc = wp.wpacc(eqwp);
					System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
					System.out.println("ĳ���� ���ȿ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
					int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
					if (attrn > 20) {attrn = 20;}
					System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
					if(attrn == 1){
						System.out.println("�� ������ ������ ���������ϴ�.");
						stun += 1;
						gostop = false;
						break;
					}if(eac < attrn && attrn < 20 && attrn >1) {
						System.out.println("��ų ��������!");
						System.out.println("��� ����� �ֻ��� +1");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
							int dmg = (int) (Math.random()*wpdice)+1;
							enhp3 -= dmg;
							System.out.println(dmg + "��ŭ ������� �������ϴ�.");
							System.out.println("�� 3 �� ���� ü�� : " + enhp3);
							gostop = false;
							break;
						}break;
					}if(attrn == 20) {
						System.out.println("��ų ��������!");
						System.out.println("��� ����� �ֻ��� +1");
						System.out.println("ġ��Ÿ�� �������ϴ�.");
						System.out.println("��� ����� 2��");
						wpdice = wp.wpdice(eqwp);
						wpdcr = wp.wpdcr(eqwp);
						for(int i = 1; i <= wpdcr+1 ; i++) {
						int dmg = (int) (Math.random()*wpdice)+1;
						enhp3 -= dmg*2;
						System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 3 �� ���� ü�� : " + enhp3);
					}
						gostop = false;break;
					}if(eac >= attrn) {
						System.out.println("�ƽ��� ���� �����ϴ�.");
						gostop = false;
						break;
					}
				}
				default: System.out.println("�ش���� �����ϴ�.");
					continue;
				}
			}
			if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
				System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
				this.win(enemyname);
			}else {
				defence(enemyname);
			}
		}
}if(job2.equals("ȭ��ȭ��")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "����";
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
	if(wpt.equals("�ٷ�")) {
		  
		pac += strp;
	}
	if(wpt.equals("��ø")) {
		pac += dexp;
	}
	if(wpt.equals("����")) {
		pac += intelp;
	}
	if(wpt.equals("ü��")) {
		pac += help;
	}
	if(wpt.equals("����")) {
		pac += wisp;
	}
	if(wpt.equals("�ŷ�")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("��ų�� ����� ������ �ּ���.");
		System.out.println(enemyname +"1 �� ü�� :"+enhp1);
		System.out.println(enemyname +"2 �� ü�� :"+enhp2);
		System.out.println(enemyname +"3 �� ü�� :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== �� ���� =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("ȭ��ȭ�� ��ų�� ���ɺ����� �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ȭ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 6 ���� ���� , 3ȸ ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
						int dmg = (int) (Math.random()*6)+1;
						enhp1 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 1 �� ���� ü�� : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ȭ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 6 ���� ���� , 3ȸ ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
					int dmg = (int) (Math.random()*6)+1;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 1 �� ���� ü�� : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("ȭ��ȭ�� ��ų�� ���ɺ����� �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ȭ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 6 ���� ���� , 3ȸ ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
						int dmg = (int) (Math.random()*6)+1;
						enhp2 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 2 �� ���� ü�� : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ȭ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 6 ���� ���� , 3ȸ ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
					int dmg = (int) (Math.random()*6)+1;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 2 �� ���� ü�� : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("ȭ��ȭ�� ��ų�� ���ɺ����� �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ȭ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 6 ���� ���� , 3ȸ ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
						int dmg = (int) (Math.random()*6)+1;
						enhp3 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ȭ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 6 ���� ���� , 3ȸ ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 3 ; i++) {
					int dmg = (int) (Math.random()*6)+1;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 3 �� ���� ü�� : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("�ش���� �����ϴ�.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("����������")) {
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
	if(wpt.equals("�ٷ�")) {
		pac += strp;
	}
	if(wpt.equals("��ø")) {
		pac += dexp;
	}
	if(wpt.equals("����")) {
		pac += intelp;
	}
	if(wpt.equals("ü��")) {
		pac += help;
	}
	if(wpt.equals("����")) {
		pac += wisp;
	}
	if(wpt.equals("�ŷ�")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("��ų�� ����� ������ �ּ���.");
		System.out.println(enemyname +"1 �� ü�� :"+enhp1);
		System.out.println(enemyname +"2 �� ü�� :"+enhp2);
		System.out.println(enemyname +"3 �� ü�� :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== �� ���� =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("ĳ���Ϳ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ����������!");
					System.out.println("����� �ֻ��� 8�� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr; i++) {
						int dmg = (int) 8;
						enhp1 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 1 �� ���� ü�� : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ����������!");
					System.out.println("����� �ֻ��� 8�� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr; i++) {
					int dmg = (int) 8;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 1 �� ���� ü�� : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("ĳ���Ϳ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ����������!");
					System.out.println("����� �ֻ��� 8�� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int)8;
						enhp2 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 2 �� ���� ü�� : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ����������!");
					System.out.println("����� �ֻ��� 8�� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 8;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 2 �� ���� ü�� : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("ĳ���Ϳ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ����������!");
					System.out.println("����� �ֻ��� 8�� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 8;
						enhp3 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ����������");
					System.out.println("����� �ֻ��� 8�� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 8;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 3 �� ���� ü�� : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("�ش���� �����ϴ�.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("����")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "��ø";
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
	if(wpt.equals("�ٷ�")) {
		  
		pac += strp;
	}
	if(wpt.equals("��ø")) {
		pac += dexp;
	}
	if(wpt.equals("����")) {
		pac += intelp;
	}
	if(wpt.equals("ü��")) {
		pac += help;
	}
	if(wpt.equals("����")) {
		pac += wisp;
	}
	if(wpt.equals("�ŷ�")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("��ų�� ����� ������ �ּ���.");
		System.out.println(enemyname +"1 �� ü�� :"+enhp1);
		System.out.println(enemyname +"2 �� ü�� :"+enhp2);
		System.out.println(enemyname +"3 �� ü�� :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== �� ���� =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("���� ��ų�� ��ø������ �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ����!");
					System.out.println("����� �ֻ��� 6���� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 6;
						enhp1 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 1 �� ���� ü�� : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ����!");
					System.out.println("����� �ֻ��� 6���� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 6;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 1 �� ���� ü�� : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("���� ��ų�� ��ø ������ �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ����!");
					System.out.println("����� �ֻ��� 6���� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 6;
						enhp2 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 2 �� ���� ü�� : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ����!");
					System.out.println("����� �ֻ��� 6���� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 6;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 2 �� ���� ü�� : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("���� ��ų�� ��ø ������ �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ����!");
					System.out.println("����� �ֻ��� 6���� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
						int dmg = (int) 6;
						enhp3 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ����!");
					System.out.println("����� �ֻ��� 6���� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= wpdcr ; i++) {
					int dmg = (int) 6;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 3 �� ���� ü�� : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("�ش���� �����ϴ�.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("�������")){
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "�ٷ�";
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
	if(wpt.equals("�ٷ�")) {
		  
		pac += strp;
	}
	if(wpt.equals("��ø")) {
		pac += dexp;
	}
	if(wpt.equals("����")) {
		pac += intelp;
	}
	if(wpt.equals("ü��")) {
		pac += help;
	}
	if(wpt.equals("����")) {
		pac += wisp;
	}
	if(wpt.equals("�ŷ�")) {
		pac += chrp;
	}

		System.out.println(enemyname +"1 �� ü�� :"+enhp1);
		System.out.println(enemyname +"2 �� ü�� :"+enhp2);
		System.out.println(enemyname +"3 �� ü�� :"+enhp3);
		gostop = true;
		System.out.println("===== �� ���� =====");
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("������� ��ų�� �ٷ� ������ �پ�"+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų �������!");
					System.out.println("����� �ֻ��� 3���� ����, ��� �� ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) 3;
						enhp1 -= dmg;
						enhp2 -= dmg;
						enhp3 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 1 �� ���� ü�� : " + enhp1);
						System.out.println("�� 2 �� ���� ü�� : " + enhp2);
						System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						gostop = false;
				}
				}if(attrn == 20) {
					System.out.println("��ų �������");
					System.out.println("����� �ֻ��� 3���� ����, ��� �� ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) 3;
					enhp1 -= dmg*2;
					enhp2 -= dmg*2;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 1 �� ���� ü�� : " + enhp1);
					System.out.println("�� 2 �� ���� ü�� : " + enhp2);
					System.out.println("�� 3 �� ���� ü�� : " + enhp3);
					}
						gostop = false;
					}if(eac >= attrn) {
						System.out.println("�ƽ��� ���� �����ϴ�.");
						gostop = false;

					}
			
			
			if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
				System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
				this.win(enemyname);
			}else {
				defence(enemyname);
			}
	
}if(job2.equals("��ȭ��")) {
	gostop =true;
	enemyname = enemy;
	int eac = en.eneac(enemyname);
	String wpt = "����";
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
	if(wpt.equals("�ٷ�")) {
		  
		pac += strp;
	}
	if(wpt.equals("��ø")) {
		pac += dexp;
	}
	if(wpt.equals("����")) {
		pac += intelp;
	}
	if(wpt.equals("ü��")) {
		pac += help;
	}
	if(wpt.equals("����")) {
		pac += wisp;
	}
	if(wpt.equals("�ŷ�")) {
		pac += chrp;
	}
		int target = 0;
		System.out.println("��ų�� ����� ������ �ּ���.");
		System.out.println(enemyname +"1 �� ü�� :"+enhp1);
		System.out.println(enemyname +"2 �� ü�� :"+enhp2);
		System.out.println(enemyname +"3 �� ü�� :"+enhp3);
		System.out.print(">>>");
		gostop = true;
		System.out.println("===== �� ���� =====");
		while(gostop) {
		try {
			 target = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("���Ȯ�� �� �Է� ��Ź�帳�ϴ�.");
			continue;
		}finally {
			if(enhp1 <= 0 && target == 1) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp2 <= 0 && target == 2) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}else if(enhp3 <= 0 && target == 3) {
				System.out.println("�ش� ���ʹ� �̹� �׾����ϴ�.");
				continue;
			}
			switch (target) {
			case 1:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("��ȭ�� ��ų�� ���ɺ���ġ�� �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 20���� ���� , 1ȸ ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) (Math.random()*20)+1;
						enhp1 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 1 �� ���� ü�� : " + enhp1);
						gostop = false;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 20 ���� ���� , 1ȸ ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) (Math.random()*20)+1;
					enhp1 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 1 �� ���� ü�� : " + enhp1);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			case 2:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("��ȭ�� ��ų�� ���ɺ���ġ�� �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 20 ���� ���� , 1ȸ ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) (Math.random()*20)+1;
						enhp2 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 2 �� ���� ü�� : " + enhp2);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 20 ���� ���� , 1ȸ ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) (Math.random()*20)+1;
					enhp2 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 2 �� ���� ü�� : " + enhp3);
					
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}case 3:{
				weapon wp = new weapon();
				int wpacc = wp.wpacc(eqwp);
				System.out.println("������ " + wpacc+"��ŭ ����ġ�� �ֽ��ϴ�.");
				System.out.println("��ȭ�� ��ų�� ���ɺ���ġ�� �پ� "+ pac +"��ŭ ����ġ�� �ֽ��ϴ�.");
				int attrn = (int)((Math.random()*20)+1)+wpacc+pac;
				if (attrn > 20) {attrn = 20;}
				System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
				if(attrn == 1){
					System.out.println("�� ������ ������ ���������ϴ�.");
					stun += 1;
					gostop = false;
					break;
				}if(eac < attrn && attrn < 20 && attrn >1) {
					System.out.println("��ų ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 20 ���� ���� , 1ȸ ����");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
						int dmg = (int) (Math.random()*20)+1;
						enhp3 -= dmg;
						System.out.println(dmg + "��ŭ ������� �������ϴ�.");
						System.out.println("�� 3 �� ���� ü�� : " + enhp3);
						gostop = false;
						break;
					}break;
				}if(attrn == 20) {
					System.out.println("��ų ��ȭ��!");
					System.out.println("��� ����� �ֻ��� 20 ���� ���� , 1ȸ ����");
					System.out.println("ġ��Ÿ�� �������ϴ�.");
					System.out.println("��� ����� 2��");
					wpdice = wp.wpdice(eqwp);
					wpdcr = wp.wpdcr(eqwp);
					for(int i = 1; i <= 1 ; i++) {
					int dmg = (int) (Math.random()*20)+1;
					enhp3 -= dmg*2;
					System.out.println(dmg*2 + "��ŭ ������� �������ϴ�.");
					System.out.println("�� 3 �� ���� ü�� : " + enhp3);
				}
					gostop = false;break;
				}if(eac >= attrn) {
					System.out.println("�ƽ��� ���� �����ϴ�.");
					gostop = false;
					break;
				}
			}
			default: System.out.println("�ش���� �����ϴ�.");
				continue;
			}
		}
		if (enhp1 <= 0 && enhp2 <= 0 && enhp3 <= 0) {
			System.out.println("������ ü���� 0 �� �Ǿ������� �¸� �߽��ϴ�.");
			this.win(enemyname);
		}else {
			defence(enemyname);
		}
	}
}if(job2.equals("ȸ��")){
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
	System.out.println(heal + "��ŭ ȸ�� �Ǿ����ϴ�.");
	System.out.println("���� ü�� : "+hp +" / "+ maxhp);
	System.out.println("ü�� ȸ�� �� ���� ����� ã���ϴ�.");
	this.attack(enemy);
}if(job2.equals("�簥��")) {
	gostop =true;
	hp -= 1;
	if(hp <=0) {
		System.out.println("������� �ϴ� �׾����ϴ�.");
		System.out.println("game over");
		System.out.println("===============");
		System.out.println("���� ȭ������ ���� ���ϴ�");
		this.reset();
		this.gostop = true;
		this.mainpage();
	}
	System.out.println("��ΰ� �ƹ����� �ʰ� ���� ���� �ֽ��ϴ�.");
	System.out.println("��Ȳ�� "+enemy +" ������� ��� ���ư��ϴ�.");
	System.out.println("���� ���ұ� ������ ü���� 1 ���� �մϴ�.");
	System.out.println("���� ü�� :" + hp + " / " + maxhp);
	this.defence(enemy);
//	this.runsuc();
}
}//skill2

	void defence(String enemyname) throws InterruptedException, IOException {
		int end = en.enemy(enemyname);
		System.out.println("===== �� ���� =====");
		for(int i = 1; i <= encount ; i++) {
		int attrn = (int)((Math.random()*20)+1);
		if (attrn > 20) {attrn = 20;}
		System.out.println(attrn + "��ŭ�� �ֻ��� ���� ���Խ��ϴ�.");
		if(attrn == 1){
			System.out.println("�� ������ ������ ���������ϴ�.");
		}else if(ac < attrn && attrn < 20 && attrn > 1) {
				int dmg = (int) (Math.random()*end)+1;
				hp -= dmg;
				System.out.println(dmg + "��ŭ ������� �Ծ����ϴ�.");
				System.out.println("���� ���� ü�� : " + hp);
		}else if(attrn == 20) {
			System.out.println("ġ��Ÿ�� �������ϴ�.");
			System.out.println("��� ����� 2��");
			int dmg = (int) (Math.random()*end)+1;
			hp -= dmg*2;
			System.out.println(dmg*2 + "��ŭ ������� �Ծ����ϴ�.");
			System.out.println("���� ���� ü�� : " + hp);
		}else if(ac >= attrn) {
			System.out.println("�ƽ��� ���� �����ϴ�.");
		}
		}
		
		if(hp <= 0) {
			System.out.println("���� ü���� 0�� �Ǿ� �й� �߽��ϴ�.");
			System.out.println("===============");
			System.out.println("���� over");
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
		System.out.println(exp1 + "�� ����ġ�� ȹ�� �߽��ϴ�.");
		exp += exp1;
		}
		encount = 0;
		this.enemyname = null;
		if(exp > need) {
			System.out.println("������ �Ͽ����ϴ�.");
			System.out.println("���� LV �� " + lv +"�Դϴ�.");
		}
		System.out.println("��� �Ͻðڽ��ϱ�?");
		System.out.println("1. ��� ���� 2.������� 3.���� �ɷ�ġ ����");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("�޴��� �´� ���ڸ� �Է��ϼ���.");
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


