
public class TextMessage extends Notification {

	TextMessage(NotificationSender notificationSender) {
		super(notificationSender);
		// TODO Auto-generated constructor stub
		 System.out.println("This is the Text Message");
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		notificationSender.sendNotification();
	}

}
