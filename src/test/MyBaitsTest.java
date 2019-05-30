import cn.com.egova.bean.StatInfo;
import cn.com.egova.bean.StatInfoKey;
import cn.com.egova.bean.StatInfoWithBLOBs;
import cn.com.egova.dao.StatInfoMapper;
import cn.com.egova.service.StatInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class MyBaitsTest extends BaseJunit4Test {


	@Autowired
	private StatInfoMapper statInfoMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private StatInfoService statInfoService;

	@Test
	public void testSelect() {

		List<StatInfoWithBLOBs> statInfoWithBLOBs = statInfoMapper.selectByRecID(109l);
		System.out.println(statInfoWithBLOBs.get(0).getAddress());

		List<StatInfoWithBLOBs> statLists = statInfoMapper.selectByRec(109l);

		System.out.println(statLists.size());


		List<StatInfoKey> statInfoKey = statInfoMapper.selectByStatInfo(109l);
		System.out.println(statInfoKey.get(0).getRecId());
	}


	@Test
	public void testInsert(){
		statInfoMapper.insertStatInfo("测试地址");
	}


	@Test
	public void testSelectMap(){
		Map<String,Object> map = statInfoMapper.selectMap(109l);
		System.out.println(map.size());
	}

	@Test
	public void testSelectStatInfokey(){
		StatInfoKey statInfoKey = statInfoMapper.selectInfoKey(109l);
		System.out.println(statInfoKey.getRecId());
	}

	@Test
	public void testJdbc() {
		String sql = "select count(*) from to_stat_info";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}

	@Test
	public void testTransaction1(){
		statInfoService.updateParam1("测试案卷",20);
	}

	@Test
	public void testTransaction2(){
		statInfoService.updateParam2("测试案卷",20);
	}

	@Test
	public void testTransactionTotal(){
		statInfoService.updateParamTotal("测试案卷",20);
	}
}
