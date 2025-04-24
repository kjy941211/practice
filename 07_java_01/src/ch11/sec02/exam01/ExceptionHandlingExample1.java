package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length(); // data가 null일 경우 NullPointerException 발생
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
// 12라인에서 문자열 대신 null을 입력하면 5라인에서 NullPointerException이 발생
// NullPointerException은 참조 변수가 null인 상태에서 필드나 메소드에 접근할 경우 발생
// NullPointerException은 실행 예외이므로 예외처리 코드가 없어도 되지만 실행 중에 발생하면
// 프로그램은 즉시 종료됨
