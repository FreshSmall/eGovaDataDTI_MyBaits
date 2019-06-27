package cn.com.egova.kafka;

import cn.com.egova.bean.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {

	@Autowired
	private KafkaTemplate kafkaProduceTemplate;

	public ResultInfo sendKafkaMessage(String topic, String param) {
		ResultInfo result = new ResultInfo();
		kafkaProduceTemplate.send(topic, param);
		return result;
	}
}
