package sec03.exam7;

public class PrimitiveAndStringConversionExample {

    public static void main(String[] args) {
        // 문자열을 기본 자료형으로 변환하는 예제
        int value1 = Integer.parseInt("10"); // "10"을 정수로 변환
        double value2 = Double.parseDouble("3.14"); // "3.14"를 실수로 변환
        boolean value3 = Boolean.parseBoolean("true"); // "true"를 불린으로 변환
        
        // 변환된 값을 출력
        System.out.println("value1:" + value1);
        System.out.println("value2:" + value2);
        System.out.println("value3:" + value3);

        // 기본 자료형을 문자열로 변환하는 예제
        String str1 = String.valueOf(10); // 정수 10을 문자열로 변환
        String str2 = String.valueOf(3.14); // 실수 3.14를 문자열로 변환
        String str3 = String.valueOf(true); // 불린 true를 문자열로 변환
        
        // 변환된 문자열을 출력
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
    }
}
