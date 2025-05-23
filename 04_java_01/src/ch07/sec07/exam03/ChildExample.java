package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // 부모 타입으로 자동 변환
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 부모 타입에 선언된 필드와 메소드만 사용 가능
        // parent.field2 = "data2";
        // parent.method3();

        // 강제 타입 변환, 다시 자식 타입으로 변환
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
