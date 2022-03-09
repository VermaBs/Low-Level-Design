
public class NotificationServiceBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NotificationSender email=new Email();
      Notification notification=new QRMessage(email);
      notification.sendMessage();
	}

}
