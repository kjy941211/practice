package ch06.sec09;

public class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model; //매개변수를 필드에 대입(this 생략 불가)
    }

    void setSpeed(int speed) {
        this.speed = speed; //매개변수를 필드에 대입(this 생략 불가)
    }
    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
}
