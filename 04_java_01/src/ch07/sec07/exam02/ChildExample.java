package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        // parent.method3(); //호출 불가능
        // 부모 타입으로 자동 타입 변환된 이후에는
        // 부모 클래스에 선언된 필드와 메소드만 접근 가능

        // 자식클래스에서 오버라이딩된 메소드가 있다면
        // 부모 메소드 대신 오버라이딩된 메소드가 호출
        // 다형성과 관련 있음
    }
}