package sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		// 1. 변수 score에 85를 할당합니다.

		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// 2. 삼항 연산자를 사용하여 점수에 따른 학점을 결정합니다.
//		    - score가 90보다 크면 'A'를, 그렇지 않고 score가 80보다 크면 'B'를, 그 외에는 'C'를 grade에 할당합니다.

		System.out.println(score + "점은" + grade + "등급입니다.");
		// 3. 결과를 출력합니다. 예를 들어, score가 85이므로 두 번째 조건이 참이 되어 'B'가 grade에 할당되고,
//		    출력문은 "85점은 B등급입니다."가 됩니다.


	}

}
