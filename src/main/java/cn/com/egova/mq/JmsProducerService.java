package cn.com.egova.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Service
public class JmsProducerService {

	@Autowired
	private JmsTemplate jmsTopicTemplate;

	/**
	 * 发送一条消息到指定的队列（目标）
	 * @param topicName 队列名称
	 * @param message 消息内容
	 */
	public void send(String topicName,final String message){
		jmsTopicTemplate.send(topicName, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

}
