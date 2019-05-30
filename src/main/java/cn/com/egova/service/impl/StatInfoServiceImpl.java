package cn.com.egova.service.impl;

import cn.com.egova.dao.StatInfoMapper;
import cn.com.egova.service.StatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatInfoServiceImpl implements StatInfoService {

	@Autowired
	private StatInfoMapper statInfoMapper;

	@Override
	public void updateParam(String param, int recID) {
		statInfoMapper.updateParam(param, recID);
//		int a = 1 / 0;
	}

	@Override
	public void updateParam1(String param, int recID) {
		statInfoMapper.updateParam(param+"测试1",recID);
		int a = 1/0;
	}

	@Override
	public void updateParam2(String param, int recID) {
		statInfoMapper.updateParam(param+"测试2",recID);
	}

	@Override
	public void updateParamTotal(String param, int recID) {
		updateParam1(param+"测试",recID);
		updateParam2(param+"测试",recID+1);
	}
}
