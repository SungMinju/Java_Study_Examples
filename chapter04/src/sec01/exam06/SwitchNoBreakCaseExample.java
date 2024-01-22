package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) +8;
		/*
		 * Math.random(): 0.0 이상 1.0 미만의 난수(랜덤한 실수)를 생성합니다.
		 * Math.random() * 4: 0.0 이상 4.0 미만의 범위에서의 난수를 생성합니다.
		 * (int) (Math.random() * 4): 소수 부분을 버리고 정수 부분만 남깁니다. 따라서 이제 0, 1, 2, 3 중 하나의 정수를 가집니다.
		 * (int) (Math.random() * 4) + 8: 앞서 구한 0, 1, 2, 3 중의 정수에 8을 더합니다. 결과적으로 이제 8, 9, 10, 11 중 하나의 정수를 가집니다.
		 * int time = ...;: 최종적으로 계산된 값을 time 변수에 할당합니다.
		 * 결과적으로, time 변수에는 8 이상 11 미만의 정수가 무작위로 할당되며, 이는 프로그램에서 어떠한 무작위 시간 값으로 활용될 수 있습니다. 
		 */
		
		System.out.println("[현재 시각:" + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}

}
