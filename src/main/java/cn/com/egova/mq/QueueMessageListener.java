package cn.com.egova.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class QueueMessageListener implements SessionAwareMessageListener<Message> {

    private Logger logger = LoggerFactory.getLogger(QueueMessageListener.class);

    @Autowired
    private JmsProducerService jmsProducerService;

    @Override
    public void onMessage(Message message, Session session) throws JMSException {
        try {
            Destination destination = message.getJMSDestination();
            String topic = destination.toString();
            TextMessage text = (TextMessage) message;
            System.out.println("消息是==========" + text.getText());

            jmsProducerService.send("slimsmart.topic.test", text.getText());
        } catch (Exception e) {
            logger.error("执行sql操作失败，错误堆栈原因：{}", e.getMessage(), e);
        }
    }
}
