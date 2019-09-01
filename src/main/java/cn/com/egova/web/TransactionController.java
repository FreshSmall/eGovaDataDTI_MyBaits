package cn.com.egova.web;

import cn.com.egova.batch.AsyncInfoManager;
import cn.com.egova.batch.SpringBatchManager;
import cn.com.egova.batch.SyncHandler;
import cn.com.egova.bean.ResultInfo;
import cn.com.egova.kafka.KafkaProducerService;
import cn.com.egova.mq.JmsProducerService;
import cn.com.egova.service.StatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "api/test")
public class TransactionController {


    @Autowired
    StatInfoService statInfoService;

    @Autowired
    JmsProducerService jmsProducerService;

    @Autowired
    SpringBatchManager springBatchManager;

    @Autowired
    SyncHandler syncHandler;

    @Autowired
    KafkaProducerService kafkaproducerService;

    @Autowired
    AsyncInfoManager asyncInfoManager;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/transaction/hand", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo testTransactionByHand(@RequestParam String param, @RequestParam int recID) {
        ResultInfo result = new ResultInfo(true);
        statInfoService.updateParam(param, recID);
        return result;
    }


    @RequestMapping(value = "/hand1", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo testTransaction1(@RequestParam String param, @RequestParam int recID) {
        ResultInfo result = new ResultInfo(true);
        statInfoService.updateParam1(param, recID);
        return result;
    }

    @RequestMapping(value = "/hand2", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo testTransaction2(@RequestParam String param, @RequestParam int recID) {
        ResultInfo result = new ResultInfo(true);
        statInfoService.updateParam2(param, recID);
        return result;
    }

    @RequestMapping(value = "/handTotal", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo testTransactionTotal(@RequestParam String param, @RequestParam int recID) {
        ResultInfo result = new ResultInfo(true);
        statInfoService.updateParamTotal(param, recID);
        return result;
    }

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo sendProducer(@RequestParam String param) {
        ResultInfo result = new ResultInfo(true);
        jmsProducerService.send("slimsmart.topic.test", param);
        return result;
    }

    @RequestMapping(value = "/asyncHandle", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo asyncHandle(@RequestParam int count) {
        ResultInfo result = new ResultInfo(true);
        System.out.println("线程名称："+Thread.currentThread().getName());
        List<String> list = new ArrayList<String>(count);
        for (int i = 0; i < count; i++) {
            list.add(asyncInfoManager.syncInfo());
        }
        result.addData("list",list);
        return result;
    }

    @RequestMapping(value = "/send/kafka",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo sendKafkaMessage(@RequestParam String topicName,@RequestParam String param){
        ResultInfo result = new ResultInfo(true);
        result = kafkaproducerService.sendKafkaMessage(topicName,param);
        return result;
    }

    @RequestMapping(value = "/sendBatch", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo sendBatchInfo() throws Exception{
        ResultInfo result = new ResultInfo(true);
        springBatchManager.sendBatchInfo();
        return result;
    }

    @RequestMapping(value = "/sendSyncHandler", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo sendSyncHandler(){
        ResultInfo result = new ResultInfo(true);
        result.setMessage(syncHandler.syncInfo());
        return result;
    }


    @RequestMapping(value = "/getConnects", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getConnections() throws SQLException {
        ResultInfo result = new ResultInfo(true);
        result.setMessage(""+jdbcTemplate.getDataSource().getConnection().getMetaData().getMaxConnections());
        return result;
    }
}
