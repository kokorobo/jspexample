package Trpg;

public class weapon {
	
	int wpacc(String wn) {
		if(wn.equals("��")) {
			return 2;
		}else if(wn.equals("����ƺ�")) {
			return 10;
		}else if(wn.equals("�Ѽհ�")) {
			return 1;
		}else if(wn.equals("�Ϻ���")) {
			return 2;
		}else if(wn.equals("�ܰ�")) {
			return -1;
		}else if(wn.equals("������")) {
			return 0;
		}else if(wn.equals("å")) {
			return 2;
		}else if(wn.equals("ǥâ")) {
			return 3;
		}else if(wn.equals("Ȱ")) {
			return 2;
		}else if(wn.equals("��Ʋ��")) {
			return 0;
		}else if(wn.equals("�۷���")) {
			return 2;
		}else if(wn.equals("��׽�Ÿ")) {
			return -2;
		}else if(wn.equals("�ذ�")) {
			return -2;
		}else if(wn.equals("�Ǽ�")) {
			return 0;
		}
		else{
			return 0;
		}
	}
	int wpdice(String wn) {
		if(wn.equals("��")) {
			return 8;
		}else if(wn.equals("����ƺ�")) {
			return 3;
		}else if(wn.equals("�Ѽհ�")) {
			return 6;
		}else if(wn.equals("�Ϻ���")) {
			return 4;
		}else if(wn.equals("�ܰ�")) {
			return 6;
		}else if(wn.equals("������")) {
			return 6;
		}else if(wn.equals("å")) {
			int ran = (int)(Math.random()*2)+1;
			if(ran == 1){return 20;}
			else if(ran == 2) {return 4;}
			else {return 4;}
		}else if(wn.equals("ǥâ")) {
			return 4;
		}else if(wn.equals("Ȱ")) {
			return 6;
		}else if(wn.equals("��Ʋ��")) {
			return 8;
		}else if(wn.equals("�۷���")) {
			return 4;
		}else if(wn.equals("��׽�Ÿ")) {
			return 12;
		}else if(wn.equals("�ذ�")) {
			return 1;
		}else if(wn.equals("�Ǽ�")) {
			return 4;
		}
		else {
			return 3;
		}
	}
	int wpdcr(String wn) {
		if(wn.equals("��")) {
			return 1;
		}else if(wn.equals("����ƺ�")) {
			return 3;
		}else if(wn.equals("�Ѽհ�")) {
			int ran = (int)(Math.random()*2)+1;
			return ran;
		}else if(wn.equals("�Ϻ���")) {
			return 2;
		}else if(wn.equals("�ܰ�")) {
			return 2;
		}else if(wn.equals("������")) {
			return 1;
		}else if(wn.equals("å")) {
			return 1;
		}else if(wn.equals("ǥâ")) {
			return 3;
		}else if(wn.equals("Ȱ")) {
			return 1;
		}else if(wn.equals("��Ʋ��")) {
			return 2;
		}else if(wn.equals("�۷���")) {
			return 3;
		}else if(wn.equals("��׽�Ÿ")) {
			return 1;
		}else if(wn.equals("�ذ�")) {
			return 1;
		}else if(wn.equals("�Ǽ�")) {
			return 1;
		}
		
		else {return 1;}
	}


}
