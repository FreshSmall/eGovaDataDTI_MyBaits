import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.util.Date;

public class ActiveMQProducerTest {

	public static void main(String[] args) throws JMSException {
		//1、创建ConnectionFactory
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin","admin","tcp://127.0.0.1:61616");
		//2、创建Connection
		Connection connection = connectionFactory.createConnection();
		//3、启动连接
		connection.start();
		//4、创建会话
		Session session = connection.createSession(true,Session.SESSION_TRANSACTED);
		//5、创建一个目标
//		Destination destination = session.createQueue("queue-test");
		Destination destination = session.createTopic("topic-test");
		//6、创建一个生产者
		MessageProducer producer = session.createProducer(destination);
		//持久化发送
		producer.setDeliveryMode(DeliveryMode. PERSISTENT);
		for (int i = 0; i < 100; i++) {
			//7、创建消息
			TextMessage textMessage = session.createTextMessage("test："+i);
			//8、发布消息
			producer.send(textMessage);
			System.out.println("发送消息："+textMessage.getText());
			session.commit();
		}

		//9、关闭连接
		connection.close();

	}
}
