package cn.com.egova.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerSerivceImpl implements MessageListener<String,String> {


    @Override
    public void onMessage(ConsumerRecord<String, String> record) {
        System.out.printf("partition =%d,offset = %d,key= %s,value=%s%n",record.partition(),record.offset(),record.key(),record.value());
    }
}
