package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i + "");
        }
    }
}
