package Trpg;

import java.io.*;
import java.util.Scanner;

public class Load {
	public void load(String name) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		String name2 = name;
		Plaing pl = new Plaing();
		try {
			FileInputStream fis = new FileInputStream("c:\\test\\"+name2+".txt");
		}catch(FileNotFoundException e) {
			System.out.println("������ ã���� �����ϴ�.");
			System.out.println("���� ȭ������ ���ư��ϴ�.");
			pl.gostop = true;
			pl.mainpage();
		}catch(IOException e) {
			System.out.println("������ �߻� �߽��ϴ�.");
			System.out.println("���� ȭ������ ���ư��ϴ�.");
			pl.gostop = true;
			pl.mainpage();
		}finally {
			FileInputStream fis = new FileInputStream("c:\\test\\"+name2+".txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			String name3 = dis.readUTF();
			pl.name = name3;
			String country3 = dis.readUTF();
			pl.country = country3;
			String sejob3 = dis.readUTF();
			pl.sejob = sejob3;
			String job3 = dis.readUTF();
			pl.job = job3;
			int lv3 = dis.readInt();
			pl.lv = lv3;
			int hp3 = dis.readInt();
			pl.hp = hp3;
			int maxhp3 = dis.readInt();
			pl.maxhp = maxhp3;
			int ac3 = dis.readInt();
			pl.ac = ac3;
			int str3 = dis.readInt();
			pl.str = str3;
			int dex3 = dis.readInt();
			pl.dex = dex3;
			int hel3 = dis.readInt();
			pl.hel = hel3;
			int intel3 = dis.readInt();
			pl.intel = intel3;
			int wis3 = dis.readInt();
			pl.wis = wis3;
			int chr3 = dis.readInt();
			pl.chr = chr3;
			int luc3 = dis.readInt();
			pl.luc = luc3;
			int kar3 = dis.readInt();
			pl.kar = kar3;
			int sin3 = dis.readInt();
			pl.sin = sin3;
			int exp3 = dis.readInt();
			pl.exp = exp3;
			int need3 = dis.readInt();
			pl.need = need3;
			int money3 = dis.readInt();
			pl.money = money3;
			String eqwp3 = dis.readUTF();
			pl.eqwp = eqwp3;
			String eqam3 = dis.readUTF();
			pl.eqam = eqam3;
			int clrc3 = dis.readInt();
			pl.clrc = clrc3;
			dis.close();
			pl.showstat();
			System.out.println("===============");
			System.out.println("�ش� ĳ���Ͱ� �½��ϱ�?");
			System.out.println("1. �� 2.�ƴϿ�");
			System.out.print(">>>");
			try {
			pl.selme = sc.nextInt();
			}catch(Exception e){
				System.out.println("���� �Է��ؼ� ĳ���͸� �ҷ��ɴϴ�.");
				pl.selme = 1;
			}finally {
				if(pl.selme == 1) {
					System.out.println("�ش� ĳ���͸� �ҷ��Խ��ϴ�.");
					switch(pl.clrc) {
					case 0:{
						System.out.println("������ �÷��� �ϴ� é�Ͱ� 1é�ͷ� Ȯ�� �Ǿ� 1é�ͺ��� �����մϴ�.");
						System.out.println("===============");
						ch1 ch = new ch1();
						ch.sc1();
						break;
					}
					case 1:{
						break;
					}
					}
				}else if(pl.selme == 2) {
					System.out.println("���� ȭ������ �̵��մϴ�.");
					pl.reset();
					pl.gostop = true;
					pl.mainpage();
				}
			}
			
			
		}
	}

}
