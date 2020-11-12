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
			System.out.println("파일을 찾을수 없습니다.");
			System.out.println("메인 화면으로 돌아갑니다.");
			pl.gostop = true;
			pl.mainpage();
		}catch(IOException e) {
			System.out.println("오류가 발생 했습니다.");
			System.out.println("메인 화면으로 돌아갑니다.");
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
			System.out.println("해당 캐릭터가 맞습니까?");
			System.out.println("1. 네 2.아니요");
			System.out.print(">>>");
			try {
			pl.selme = sc.nextInt();
			}catch(Exception e){
				System.out.println("대충 입력해서 캐릭터를 불러옵니다.");
				pl.selme = 1;
			}finally {
				if(pl.selme == 1) {
					System.out.println("해당 캐릭터를 불러왔습니다.");
					switch(pl.clrc) {
					case 0:{
						System.out.println("마지막 플레이 하던 챕터가 1챕터로 확인 되어 1챕터부터 시작합니다.");
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
					System.out.println("메인 화면으로 이동합니다.");
					pl.reset();
					pl.gostop = true;
					pl.mainpage();
				}
			}
			
			
		}
	}

}
