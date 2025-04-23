package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "]" + arr1[i]);
        }
        System.out.println();

        String[] arr2 = new String[3];
        arr2[0] = "hello";
        arr2[1] = "world";
        arr2[2] = "java";

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr2[" + i + "]" + arr2[i]);
        }
    }
}
