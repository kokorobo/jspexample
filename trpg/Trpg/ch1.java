package Trpg;

import java.io.IOException;
import java.util.Scanner;
import Trpg.Plaing;

public class ch1 extends Plaing{
	 Scanner sc = new Scanner(System.in);
	 Save sv = new Save();
	 int selme ;
	public void sc1() throws InterruptedException, IOException {
		 Plaing pl = new Plaing();
		 pl.gostop =true;
		System.out.println("������ : �ذ� ��õ�ε� ������ �ڴ°Գ�!?");
		System.out.println("������ : ������ ���̾� �ᵵ ���ڸ鼭 �巡��� �ο�� �׷����µ� ����...");
		System.out.println("����");
		System.out.println("1.�Ͼ �ݹ��Ѵ�. 2.�׳� �����ϰ� �ܴ�.");
		System.out.print(">>>");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("������ : ����� �Ӹ�?");
			System.out.println("������ : ���̳� ����� �ϰŶ�");
			}finally {
			if(selme == 1) {
				System.out.println(pl.name + ": "
						+ "���� ���ŵ� ������ �ڴµ� ����� ������?");
				System.out.println("������ : ���� �𸣴� �Գ�?");
				System.out.println(pl.name + ": ���� ����...? �ƴ� ����?");
				System.out.println("������ : ũ..ũ�� ������ ���ϰڱ���...");
			}else if(selme == 2){
				System.out.println(pl.name +": �帣�� ���");
				System.out.println("������ : ���� �̳��!");
				pl.hp -= 1;
				System.out.println("�ý��� : �����ư� ���� "
						+ "�����̷� �Ӹ��� ���Ƚ��ϴ�.");
				System.out.println("�ý��� : ü�� 1�� �����߽��ϴ�.");
				System.out.println(pl.name +": ��! �����ݾƿ�!");
				System.out.println("������ : ��ȣ ���� �Ͼ� ������.");
			}else {
				System.out.println("�ý��� : ��ȣ�� �߸� �Է��� ��ſ���");
				System.out.println("�ý����� ���׸��� ������ �����մϴ�.");
				pl.exp += 50;
				System.out.println("�ý��� : ����ġ 50�� ȹ���߽��ϴ�.");
			}
			System.out.println("������ : ���� ������ �� ������ �ٸ��� �ƴ϶�.");
			System.out.println("������ : ���� 2�� ���� ������ ���� �ʾƼ� ���̴�....");
			System.out.println("������ : �׷��� ������ �ʴ� ������ ���ؼ� ������ �ôµ�...");
			System.out.println(pl.name +" : �ôµ�...");
			System.out.println("������ : �ƹ����� �츮 ���� ������� �ٽ� ��ƾ� �ɰ� ���Ƽ� ������...");
			System.out.println("������ : �ٵ� ���� �ƹ����� ��Ƽ ��ɶ� ��... �ΰ����� �����...");
			System.out.println("������ : ���� ���� ������ ������ ���Ƽ� ���ε� ��� ���ָ� �ȵɱ�?");
			System.out.println("�ý���  : ����Ʈ�� ���� �Ǿ����ϴ�.");
			System.out.println("����Ʈ : ���� 1�� ��Ƽ������ ��ƶ�");
			System.out.println("��ǥ : �հ�( ) , �𵨸��� ( ), �۽�Ʈ ����������( ), ������ ȣ��Ű��(V)");
			System.out.println("���� : ???");
			System.out.println("�ý��� : ����Ʈ�� ���� �Ͻðڽ��ϱ�?");
			System.out.println("1.���� 2.����");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.println("���� �Է��ϼ̱⿡ ����Ʈ�� ���� ���� �մϴ�.");
			}finally {
				if(selme == 1) {
					System.out.println("����Ʈ�� �����մϴ�.");
					System.out.println("������ : �̰� �� �Ա��ϼ� ");
					System.out.println("���������� ����Ʈ�� ���� �Ͽ� 10��� �߰� �˴ϴ�.");
					pl.money += 10;
					System.out.println("===============");
					System.out.println("���� ��� : "+ pl.money);
					System.out.println("===============");
				}else if(selme == 2) {
					System.out.println("������ : ������� ã�ƿͼ� ��Ź�� �Ͽ��Ǹ�... ��..");
					System.out.println("������ : �� �׸� ���� ����. ��!");
					System.out.println("�ý��� : ���� ����Ʈ�� �������� �ʾ� ���ӿ��� �Ǿ����ϴ�.");
					System.out.println("Game Over");
					sv.save(pl.name);
					pl.reset();
					pl.mainpage();
				}else {
					System.out.println("���� �Է��ϼ̱⿡ ����Ʈ�� ���� ���� �մϴ�.");
				}
				System.out.println("������ : �ϴ� ����� ������ ���۽�Ʈ�� ���� ã��.");
				System.out.println("������ : ���׸��� ��������� �� �׸� �ε��� ������ ����...");
				System.out.println("������ : ����ħ �� ��ó ���� '�Ǵ���'�������� '�� õ���?'�� ����ٴ� ����� �ִ���");
				System.out.println("������ : �ϴ� �Ǵ��� ���� ���� �ѹ� ã�� ������.");
				System.out.println("�ý��� : �Ǵ��� �������� �����ƿ� ���� �մϴ�.");
				System.out.println("�ý��� : �����ƴ� �ľ��� ������ ������ ���� ���� �ʽ��ϴ�.");
				System.out.println("�ý��� : �Ǵ��� �������� ���� �մϴ�.");
				System.out.println("===== Ʃ�丮�� =====");
				System.out.println("�ý��� : �Ǵ��� �������� �Ÿ��� 3km �̸�");
				System.out.println("�ý��� : ���� ��ī��Ʈ�� ����, ����, ķ������ �����ϴ�.");
				System.out.println("�ý��� : ���� ���� ���� ���� �ֽ��ϴ�.");
				System.out.println("�ý��� : ������ �������� ���� ���� ���� �Ǿ� ������ ");
				System.out.println("�ý��� : ����ġ�� ���ٸ� ���ӵ� ������ �����⵵ �մϴ�.");
				System.out.println("�ý��� : ���� �Ŀ��� �������� ���, ���� �����, ��� ��� �Ǹ� ��� ��ġ�� ������ �޽��ϴ�.");
				System.out.println("�ý��� : ������ ������ ��� ���� �� ������ ������ ������ �Ǹ��ϴ� ����� \n\t ������� �Ǹ��� Ȯ���� �� ������ �޽��ϴ�");
				System.out.println("�ý��� : ���� ���� ��ġ�� ���� ������ ������ ���ֱ⿡ ���� �÷��̸� ���� ���ּ���.");
				System.out.println("�ý��� : ķ������ ��� ������ Ȯ���� ��Ÿ���� ķ���忡�� �޽� �� ��� �ִ� ü������ ȸ���˴ϴ�.");
				System.out.println("�ý��� : ��� ���� �Ͻðڽ��ϱ�?");
				System.out.println("1. ���� 2. ���� ����");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("���� ���� �ϼ������� ���� �մϴ�.");
				}
				finally {
					if(selme ==1 ) {
						System.out.println("�ý��� : �Ǵ��� �������� ������ �����մϴ�.");
						System.out.println("=================");
						pl.walk1(3);
					}else if(selme == 2){
						System.out.println("�ý��� : �������� ���ϼ̱���");
						System.out.println("��.... �ٽ� ���� �մϴ�.");
						System.out.println("===== Ʃ�丮�� =====");
						System.out.println("�ý��� : �Ǵ��� �������� �Ÿ��� 3km �̸�");
						System.out.println("�ý��� : ���� ��ī��Ʈ�� ����, ����, ķ������ �����ϴ�.");
						System.out.println("�ý��� : ���� ���� ���� ���� �ֽ��ϴ�.");
						System.out.println("�ý��� : ������ �������� ���� ���� ���� �Ǿ� ������ ");
						System.out.println("�ý��� : ����ġ�� ���ٸ� ���ӵ� ������ �����⵵ �մϴ�.");
						System.out.println("�ý��� : ���� �Ŀ��� �������� ���, ���� �����, ��� ��� �Ǹ� ��� ��ġ�� ������ �޽��ϴ�.");
						System.out.println("�ý��� : ������ ������ ��� ���� �� ������ ������ ������ �Ǹ��ϴ� ����� \n\t ������� �Ǹ��� Ȯ���� �� ������ �޽��ϴ�");
						System.out.println("�ý��� : ���� ���� ��ġ�� ���� ������ ������ ���ֱ⿡ ���� �÷��̸� ���� ���ּ���.");
						System.out.println("�ý��� : ķ������ ��� ������ Ȯ���� ��Ÿ���� ķ���忡�� �޽� �� ��� �ִ� ü������ ȸ���˴ϴ�.");
						System.out.println("�ý��� : Ʃ�丮���� �ι��̳� ���̱� ������ ���� ���� �մϴ�.");
						System.out.println("�ý��� : �ʽ��ڷ� Ȯ�εǾ� �� +2�� �˴ϴ�.");
						System.out.println("�ý��� : �������� ���̵��� ���� ������ �� ��� ���� �ּ���.");
						pl.ac += 2;
						pl.walk1(3);
					}
				}
				
			}
			gostop = false;
		}
	}
	public static void sc2() throws InterruptedException, IOException {
		 Plaing pl = new Plaing();
		 pl.gostop =true;
		 System.out.println("���� ���� �Դϴ�.");
		 System.out.println("¥��!");
		 pl.reset();
		 pl.mainpage();
	}
}
