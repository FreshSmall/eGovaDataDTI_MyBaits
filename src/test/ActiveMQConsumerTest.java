import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


public class ActiveMQConsumerTest {
	public static void main(String[] args) throws Exception {
		//1、创建ConnectionFactory
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin","admin","tcp://127.0.0.1:61616");
		//2、创建Connection
		Connection connection = connectionFactory.createConnection();
		connection.setClientID("topic_client");
		//3、启动连接
		connection.start();
		//4、创建会话
		Session session = connection.createSession(false,Session.CLIENT_ACKNOWLEDGE);
		//5、创建一个目标
		Destination destination = session.createQueue("queue-test");
		Topic topic = session.createTopic("topic-test");
		//6、创建一个消费者
//		MessageConsumer consumer = session.createConsumer(destination);
		MessageConsumer consumer = session.createDurableSubscriber(topic,"topic_client");
		//7、创建一个监听器
		consumer.setMessageListener(new MessageListener() {
			@Override
			public void onMessage(Message message) {
				String text = null;
				try {
					text = ((TextMessage) message).getText();
				} catch (JMSException e) {
					e.printStackTrace();
				}
				System.out.println(text);
				try {
					message.acknowledge();
					Thread.sleep(1000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		//8、关闭连接
//		connection.close();
	}
}
