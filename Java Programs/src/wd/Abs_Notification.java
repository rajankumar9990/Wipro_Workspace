package wd;

abstract class AlertService {
	String alertText;

	abstract void triggerAlert();

	void logAlert() {
		System.out.println("Logging Alert: " + alertText);
	}
}

class MailAlert extends AlertService {
	void triggerAlert() {
		System.out.println("EMAIL ALERT : " + alertText);
	}
}

class TextAlert extends AlertService {
	void triggerAlert() {
		System.out.println("SMS ALERT : " + alertText);
	}
}


class PopUpAlert extends AlertService {
	void triggerAlert() {
		System.out.println("PUSH NOTIFICATION : " + alertText);
	}
}

public class Abs_Notification {
	public static void main(String[] args) {

		AlertService mail = new MailAlert();
		mail.alertText = "Invoice #789 has been generated.";
		mail.logAlert();
		mail.triggerAlert();

		System.out.println();

		AlertService sms = new TextAlert();
		sms.alertText = "Your verification code is 998877.";
		sms.logAlert();
		sms.triggerAlert();

		System.out.println();

		AlertService push = new PopUpAlert();
		push.alertText = "New login detected on your account.";
		push.logAlert();
		push.triggerAlert();
	}
}
