
public class QRMessage extends Notification {

	QRMessage(NotificationSender notificationSender) {
		super(notificationSender);
		// TODO Auto-generated constructor stub
        System.out.println("This is the QR Code");
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		notificationSender.sendNotification();
	}

}
