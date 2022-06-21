import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex {
      public static void main(String[] args) {
            Queue<Message> messageQueue = new LinkedList<Message>();

            messageQueue.offer(new Message("sendMail", "Hong"));
            messageQueue.offer(new Message("sendSMS", "Kim"));
            messageQueue.offer(new Message("sendKakaoTalk", "Hong"));

            while (!messageQueue.isEmpty()) {
                  Message message = messageQueue.poll();
                  switch (message.command) {
                        case "sendMail":
                              System.out.println("Send mail to " + message.to);
                              break;
                        case "sendSMS":
                              System.out.println("Send SMS to " + message.to);
                              break;
                        case "sendKakaoTalk":
                              System.out.println("Send kakaoTal to " + message.to);
                              break;
                  }
            }
      }
}

class Message {
      String command;
      String to;

      Message(String command, String to) {
            this.command = command;
            this.to = to;
      }
}
