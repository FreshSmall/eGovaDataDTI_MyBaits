package cn.com.egova.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.*;

public class QueueMessageListener implements SessionAwareMessageListener<Message> {

    private Logger logger = LoggerFactory.getLogger(QueueMessageListener.class);

    @Override
    public void onMessage(Message message, Session session) throws JMSException {
        try {
            Destination destination = message.getJMSDestination();
            String topic = destination.toString();
            System.out.println("topic=====" + topic);
            TextMessage text = (TextMessage) message;
            System.out.println("消息是==========" + text.getText());
        } catch (Exception e) {
            logger.error("执行sql操作失败，错误堆栈原因：{}", e.getMessage(), e);
        }
    }
}
