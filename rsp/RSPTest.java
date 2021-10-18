package edu.rsp;

import java.util.Scanner;

//Player라고 같은 이름의 함수가 두 개다 이것이 오버로딩
class Player { 
	// 1번 가위 2번 바위 3번 보
	private int rsp; // private String rsp; 도 상관 없음

	
	// 1. 같은 함수 이름으로 파라미터의 타입과 개수를 달리 하는 것이다.
	
	public Player(String rsp) { // ( )안 rsp는 넘어오는 값
		if (rsp.equals("가위")) { // rsp == "가위"; 이거 안 된다. 글자 비교할 때는 equals로 비교한다.
			this.rsp = 1; // 여기에는 꼭 this.rsp여야 한다.
		} else if (rsp.equals("바위")) {
			this.rsp = 2;
		} else {
			this.rsp = 3;
		}
	}

	public Player() {
		this.rsp = (int) (Math.random() * 3 + 1); // 무작위로 컴퓨터로 하여금 하나의 값을 꺼내게 하는 것 1부터 3까지!!
	}

	// 누가 뭘 냈는지에 대한 로직
	private String getRSPString(int rsp) {
		String str = "";

		if (rsp == 1)
			str = "가위";
		else if (rsp == 2)
			str = "바위";
		else
			str = "보";

		return str;
	}

	public void result(Player player) {
		System.out.println("나는:" + getRSPString(this.rsp) + " 당신은:" + getRSPString(player.rsp));

		// 총 9가지 경우의 수!!
		// this.rsp는 컴퓨터가 가진 rsp
		if (this.rsp == player.rsp) { // player.rsp는 상대방(나)의 rsp
			System.out.println("비겼습니다.");
			return;
		}

		if (this.rsp == 1 && player.rsp == 2) { // 나: 가위, 상대방:바위 결과: 졌습니다.
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 1 && player.rsp == 3) {
			System.out.println("제가 이겼습니다.");
		} else if (this.rsp == 2 && player.rsp == 1) { // 나: 바위, 상대: 가위 결과: 이겼습니다
			System.out.println("제가 이겼습니다.");
		} else if (this.rsp == 2 && player.rsp == 3) { // 나: 바위, 상대: 보 결과: 졌습니다
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 3 && player.rsp == 1) { // 나: 보, 상대: 가위 결과: 졌습니다
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 2 && player.rsp == 3) {
			System.out.println("제가 이겼습니다.");
		}
	}

}

public class RSPTest {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("가위 바위 보를 입력하세요");
			String rsp = sc.next();

			Player you = new Player(rsp); // 컴퓨터를 기준으로 "너"이기 때문에 "내 값"임 내가 입력한 값이 들어와야 하기 때문에 받은 값을 넣어 준다. (객체1)
			Player com = new Player(); // 내부적으로 처리해야 하기 때문에 값 지정해 줄 필요가 없음. (객체2)

			com.result(you); // result에 값을 넣고 비교해 준다.

			System.out.println("계속 Y :: 중단 N");
			char ch = sc.next().charAt(0);

			if (ch == 'N' || ch == 'n')
				break;
		}
		System.out.println("게임이 종료 됐습니다.");
	}

}
