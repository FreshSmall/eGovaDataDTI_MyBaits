import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ActiveMQProducerTest {

	public static void main(String[] args) {
		//连接工厂，JMS 用它创建连接
		ConnectionFactory connectionFactory;
		//JMS 客户端到JMS Provider 的连接
		Connection connection = null;
		// 一个发送或接收消息的线程
		Session session;
		//消息的目的地;消息发送给谁.
		Destination destination;
		// 消费者，消息接收者
		MessageProducer messageProducer;
		try {
			connectionFactory = new ActiveMQConnectionFactory("admin", "admin", "http://127.0.0.1:9361");//用户名密码必须和activemq.xml中的用户名和密码一致，否则不能连接
			// 构造从工厂得到连接对象
			connection = connectionFactory.createConnection();//从工厂创建一个连接

			connection.start();//开启
			// 创建一个session，
			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			// 创建一个队列，队列名随意定义
			destination = session.createQueue("FirstQueuess");//队列式
			//destination = session.createTopic("mmm");//主题式
			// 获取消息生成者
			messageProducer = session.createProducer(destination);
			// 设置持久化，此处学习，根据需要设置
			messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);
			//消息发布--队列形式

			//发送100条信息
			for(int i = 0 ; i < 100 ; i ++){
				// 发送消息到目的地方
				TextMessage tm = session.createTextMessage("发送的信息 "+i);
				System.out.println("发送的信息 "+i);
				messageProducer.send(tm);
			}
			session.commit();

		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(connection != null){
					connection.close();//
				}
			} catch (JMSException e) {
				System.out.println("----");
			}
		}
		/*try {
			String url = "tcp://127.0.0.1:9461/";
			String userName = "admin";
			String password = "admin";
			String topicName = "ceshi";
			ConnectionFactory factory = new ActiveMQConnectionFactory(userName, password, url);
			Connection connection = factory.createConnection();
			connection.start();
			Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			Destination destination = session.createTopic(topicName);

			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.PERSISTENT);
			int i = 0;
			while(true){
				String txt = "测试序列 = " + i++;
				Message msg = session.createTextMessage(txt);
				producer.send(msg);
				Thread.sleep(5000);
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}*/

	}
}
