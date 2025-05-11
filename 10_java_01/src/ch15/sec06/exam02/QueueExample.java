package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messgeQueue = new LinkedList<>();

        messgeQueue.offer(new Message("sendMail", "홍길동"));
        messgeQueue.offer(new Message("sendSMS", "신용권"));
        messgeQueue.offer(new Message("sendKakaotalk", "김자바"));

        while (!messgeQueue.isEmpty()) {
            Message message = messgeQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
