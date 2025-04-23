package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        // intArray[0] = 10; NullPointerExceptionExample
        String str = null;
        // System.out.println("총 문자 수: " + str.length()); NullPointerExceptionExample
    }
}
// NullPointerExceptionExample 이 발생하면 예외가 발생된 곳에서 null인 상태의 참조 변수가 사용되고 있음
// 참조 변수가 객체를 정확히 참조하도록 번지를 대입해야 함
// 객체를 사용하려면 해당 객체를 참조하는 변수를 이용해야하는데
// 변수에 null을 대입하면 번지를 잃게 되므로 더 이상 객체를 사용할 수 없게 됨
