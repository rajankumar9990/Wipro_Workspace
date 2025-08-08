package inheritance;


class Msg_Sender {
    void sendMessage(String msg) {
        System.out.println("General message: " + msg);
    }
}


class Email_Sender extends Msg_Sender {
  
    void sendMsg(String msg) {  //override
        System.out.println("Email sent: " + msg);
    }
}


class SmsSender extends Msg_Sender {
   
    void sendMsg(String msg) {
        System.out.println("SMS sent: " + msg);//override
    }
}

public class Poly_Over_Msg {
    public static void main(String[] args) {
      

        Email_Sender s1 = new Email_Sender();
        s1.sendMsg("Your meeting is scheduled for tomorrow at 10 AM.");

        SmsSender s2 = new SmsSender();
        s2.sendMsg("Please, be on time.");
    }
}
