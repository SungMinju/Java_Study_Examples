package sec02.exam09;

public class BreakOutterExample {

    public static void main(String[] args) {
        // 바깥쪽 반복문에 이름 "Outter"를 부여함
        Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
            // 안쪽 반복문
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                
                // 만약 안쪽 반복문에서 lower 값이 'g'와 같다면 바깥쪽 반복문을 종료함
                if (lower == 'g') {
                    break Outter;
                }
            }
        }

        System.out.println("프로그램 실행 종료");
    }
}
