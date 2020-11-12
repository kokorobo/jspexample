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
		System.out.println("마리아 : 해가 중천인데 아직도 자는게냐!?");
		System.out.println("마리아 : 나때는 말이야 잠도 못자면서 드래곤과 싸우고 그랬었는데 에잉...");
		System.out.println("에잉");
		System.out.println("1.일어나 반박한다. 2.그냥 무시하고 잔다.");
		System.out.print(">>>");
		try {
			selme = Integer.parseInt(sc.next());
		}catch(Exception e){
			System.out.println("마리아 : 뭐라고 임마?");
			System.out.println("마리아 : 말이나 제대로 하거라");
			}finally {
			if(selme == 1) {
				System.out.println(pl.name + ": "
						+ "댁은 뉘신데 낮잠을 자는데 깨우고 난리유?");
				System.out.println("마리아 : 나를 모르는 게냐?");
				System.out.println(pl.name + ": 지갑 전사...? 아니 법사?");
				System.out.println("마리아 : 크..크흠 부정은 못하겠구만...");
			}else if(selme == 2){
				System.out.println(pl.name +": 드르렁 쿠울");
				System.out.println("마리아 : 예끼 이놈아!");
				pl.hp -= 1;
				System.out.println("시스템 : 마리아가 유리 "
						+ "지팡이로 머리를 때렸습니다.");
				System.out.println("시스템 : 체력 1이 감소했습니다.");
				System.out.println(pl.name +": 아! 아프잖아요!");
				System.out.println("마리아 : 오호 드디어 일어 났구만.");
			}else {
				System.out.println("시스템 : 번호를 잘못 입력한 당신에게");
				System.out.println("시스템이 조그마한 선물을 제공합니다.");
				pl.exp += 50;
				System.out.println("시스템 : 경험치 50을 획득했습니다.");
			}
			System.out.println("마리아 : 내가 너한테 온 이유는 다름이 아니라.");
			System.out.println("마리아 : 시즌 2가 지금 나오고 있지 않아서 말이다....");
			System.out.println("마리아 : 그래서 나오지 않는 이유에 대해서 생각해 봤는데...");
			System.out.println(pl.name +" : 봤는데...");
			System.out.println("마리아 : 아무래도 우리 원래 멤버들을 다시 모아야 될거 같아서 말이지...");
			System.out.println("마리아 : 근데 내가 아무래도 파티 사냥때 좀... 인간성이 없었어서...");
			System.out.println("마리아 : 내가 가면 모이지 않을꺼 같아서 말인데 대신 가주면 안될까?");
			System.out.println("시스템  : 퀘스트가 생성 되었습니다.");
			System.out.println("퀘스트 : 시즌 1때 파티원들을 모아라");
			System.out.println("목표 : 왕골( ) , 모델리아 ( ), 퍼스트 더먼저르맨( ), 마리아 호아키나(V)");
			System.out.println("보상 : ???");
			System.out.println("시스템 : 퀘스트를 수락 하시겠습니까?");
			System.out.println("1.수락 2.거절");
			System.out.print(">>>");
			try {
				selme = Integer.parseInt(sc.next());
			}catch(Exception e) {
				System.out.println("대충 입력하셨기에 퀘스트를 강제 수락 합니다.");
			}finally {
				if(selme == 1) {
					System.out.println("퀘스트를 수락합니다.");
					System.out.println("마리아 : 이건 선 입금일세 ");
					System.out.println("정상적으로 퀘스트를 수락 하여 10골드 추가 됩니다.");
					pl.money += 10;
					System.out.println("===============");
					System.out.println("현재 골드 : "+ pl.money);
					System.out.println("===============");
				}else if(selme == 2) {
					System.out.println("마리아 : 여기까지 찾아와서 부탁을 하였건만... 잉..");
					System.out.println("마리아 : 내 그만 돌아 갑세. 흥!");
					System.out.println("시스템 : 메인 퀘스트를 수락하지 않아 게임오버 되었습니다.");
					System.out.println("Game Over");
					sv.save(pl.name);
					pl.reset();
					pl.mainpage();
				}else {
					System.out.println("대충 입력하셨기에 퀘스트를 강제 수락 합니다.");
				}
				System.out.println("마리아 : 일단 가까운 먼저르 더퍼스트맨 부터 찾지.");
				System.out.println("마리아 : 조그마한 드워프놈이 뭘 그리 싸돌아 댕기는지 나원...");
				System.out.println("마리아 : 때마침 이 근처 마을 '판덜린'마을에서 '너 천재냐?'를 들었다는 사람이 있더군");
				System.out.println("마리아 : 일단 판덜린 마을 가서 한번 찾아 봅세나.");
				System.out.println("시스템 : 판덜린 마을까지 마리아와 동행 합니다.");
				System.out.println("시스템 : 마리아는 늙었기 때문에 전투에 참여 하지 않습니다.");
				System.out.println("시스템 : 판덜린 마을까지 진행 합니다.");
				System.out.println("===== 튜토리얼 =====");
				System.out.println("시스템 : 판덜린 마을까지 거리는 3km 이며");
				System.out.println("시스템 : 랜덤 인카운트로 전투, 상인, 캠핑장을 만납니다.");
				System.out.println("시스템 : 또한 길을 잃을 수도 있습니다.");
				System.out.println("시스템 : 전투는 랜덤으로 적이 점점 상향 되어 만나며 ");
				System.out.println("시스템 : 행운수치가 높다면 네임드 보스를 만나기도 합니다.");
				System.out.println("시스템 : 전투 후에는 랜덤으로 골드, 전용 드랍템, 장비가 드랍 되며 행운 수치에 영향을 받습니다.");
				System.out.println("시스템 : 상인을 만나는 경우 또한 행운에 영향을 받으며 상인이 판매하는 장비중 \n\t 레어장비를 판매할 확률도 행운에 영향을 받습니다");
				System.out.println("시스템 : 또한 선함 수치에 따라 상인이 할인을 해주기에 선한 플레이를 진행 해주세요.");
				System.out.println("시스템 : 캠핑장은 모두 동일한 확률로 나타나며 캠핑장에서 휴식 할 경우 최대 체력으로 회복됩니다.");
				System.out.println("시스템 : 계속 진행 하시겠습니까?");
				System.out.println("1. 진행 2. 이해 못함");
				System.out.print(">>>");
				try {
					selme = Integer.parseInt(sc.next());
				}catch(Exception e){
					System.out.println("대충 선택 하셨음으로 진행 합니다.");
				}
				finally {
					if(selme ==1 ) {
						System.out.println("시스템 : 판덜린 마을까지 여행을 시작합니다.");
						System.out.println("=================");
						pl.walk1(3);
					}else if(selme == 2){
						System.out.println("시스템 : 이해하지 못하셨군요");
						System.out.println("후.... 다시 설명 합니다.");
						System.out.println("===== 튜토리얼 =====");
						System.out.println("시스템 : 판덜린 마을까지 거리는 3km 이며");
						System.out.println("시스템 : 랜덤 인카운트로 전투, 상인, 캠핑장을 만납니다.");
						System.out.println("시스템 : 또한 길을 잃을 수도 있습니다.");
						System.out.println("시스템 : 전투는 랜덤으로 적이 점점 상향 되어 만나며 ");
						System.out.println("시스템 : 행운수치가 높다면 네임드 보스를 만나기도 합니다.");
						System.out.println("시스템 : 전투 후에는 랜덤으로 골드, 전용 드랍템, 장비가 드랍 되며 행운 수치에 영향을 받습니다.");
						System.out.println("시스템 : 상인을 만나는 경우 또한 행운에 영향을 받으며 상인이 판매하는 장비중 \n\t 레어장비를 판매할 확률도 행운에 영향을 받습니다");
						System.out.println("시스템 : 또한 선함 수치에 따라 상인이 할인을 해주기에 선한 플레이를 진행 해주세요.");
						System.out.println("시스템 : 캠핑장은 모두 동일한 확률로 나타나며 캠핑장에서 휴식 할 경우 최대 체력으로 회복됩니다.");
						System.out.println("시스템 : 튜토리얼을 두번이나 보셨기 때문에 강제 진행 합니다.");
						System.out.println("시스템 : 초심자로 확인되어 방어도 +2가 됩니다.");
						System.out.println("시스템 : 생각보다 난이도가 높기 때문에 꼭 살아 남아 주세요.");
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
		 System.out.println("여기 까지 입니다.");
		 System.out.println("짜잔!");
		 pl.reset();
		 pl.mainpage();
	}
}
