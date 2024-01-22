package sec04.exam02;

public class keyCodeExample {

    public static void main(String[] args) throws Exception {
        int keyCode;
        
        // 키보드에서 입력한 키의 ASCII 코드를 읽어와서 keyCode 변수에 저장
        keyCode = System.in.read();
        
        // 입력된 키의 ASCII 코드 출력
        System.out.println("keyCode:" + keyCode);
        
        // 다음 키 입력을 받음
        keyCode = System.in.read();
        System.out.println("keyCode:" + keyCode);
        
        // 다음 키 입력을 받음
        keyCode = System.in.read();
        System.out.println("keyCode:" + keyCode);
    }
}
