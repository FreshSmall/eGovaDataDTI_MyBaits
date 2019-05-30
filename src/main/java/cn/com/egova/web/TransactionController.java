package cn.com.egova.web;

import cn.com.egova.bean.ResultInfo;
import cn.com.egova.mq.JmsProducerService;
import cn.com.egova.service.StatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "api/test")
public class TransactionController {


	@Autowired
	StatInfoService statInfoService;

	@Autowired
	JmsProducerService jmsProducerService;

	@RequestMapping(value = "/transaction/hand", method = RequestMethod.POST)
	@ResponseBody
	public ResultInfo testTransactionByHand(@RequestParam String param, @RequestParam int recID) {
		ResultInfo result = new ResultInfo(true);
		statInfoService.updateParam(param,recID);
		return result;
	}


	@RequestMapping(value = "/hand1", method = RequestMethod.POST)
	@ResponseBody
	public ResultInfo testTransaction1(@RequestParam String param, @RequestParam int recID){
		ResultInfo result = new ResultInfo(true);
		statInfoService.updateParam1(param,recID);
		return result;
	}

	@RequestMapping(value = "/hand2", method = RequestMethod.POST)
	@ResponseBody
	public ResultInfo testTransaction2(@RequestParam String param, @RequestParam int recID){
		ResultInfo result = new ResultInfo(true);
		statInfoService.updateParam2(param,recID);
		return result;
	}

	@RequestMapping(value = "/handTotal", method = RequestMethod.POST)
	@ResponseBody
	public ResultInfo testTransactionTotal(@RequestParam String param, @RequestParam int recID){
		ResultInfo result = new ResultInfo(true);
		statInfoService.updateParamTotal(param,recID);
		return result;
	}

	@RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
	@ResponseBody
	public ResultInfo sendProducer(@RequestParam String param){
		ResultInfo result = new ResultInfo(true);
		jmsProducerService.send("slimsmart.topic.test",param);
		return result;
	}


}
