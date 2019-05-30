import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


public class ActiveMQConsumerTest {
	public static void main(String[] args) throws Exception {
		try {
			String url = "tcp://localhost:61616";
			String userName = "admin";
			String password = "amdin";
			String topicName = "TestQueue";
			String clientID = "客户端ID";
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(userName, password, url);
//			factory.setTrustAllPackages(true);
			Connection connection = factory.createConnection();
			connection.setClientID(clientID);
			connection.start();
			Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			Topic destination = session.createTopic(topicName);
			MessageConsumer consumer = session.createDurableSubscriber(destination, topicName);

			consumer.setMessageListener(new MessageListener() {
				@Override
				public void onMessage(Message message) {
					try {
						String text = ((TextMessage) message).getText();
						System.out.println(text);
						message.acknowledge();
					} catch (JMSException e) {
						e.printStackTrace();
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
