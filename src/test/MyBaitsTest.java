import cn.com.egova.bean.PatrolInfo;
import cn.com.egova.bean.PatrolInfoList;
import cn.com.egova.bean.StatInfoKey;
import cn.com.egova.bean.StatInfoWithBLOBs;
import cn.com.egova.dao.StatInfoMapper;
import cn.com.egova.service.StatInfoService;
import cn.com.egova.util.DAORowMapper;
import com.google.gson.*;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.*;

public class MyBaitsTest extends BaseJunit4Test {


	@Autowired
	private StatInfoMapper statInfoMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	//	@Autowired
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
	public void testInsert() throws SQLException {
//		statInfoMapper.insertStatInfo("测试地址");
		System.out.println(jdbcTemplate.getDataSource().getConnection().getMetaData().getMaxConnections());

	}


	@Test
	public void testSelectMap() {
		Map<String, Object> map = statInfoMapper.selectMap(109l);
		System.out.println(map.size());
	}

	@Test
	public void testSelectStatInfokey() {
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
	public void testTransaction1() {
		statInfoService.updateParam1("测试案卷", 20);
	}

	@Test
	public void testTransaction2() {
		statInfoService.updateParam2("测试案卷", 20);
	}

	@Test
	public void testTransactionTotal() {
		statInfoService.updateParamTotal("测试案卷", 20);
	}

	@Test
	public void test1() {
		int[] typeIds = {0, 1};
		String sql = "select * from event_type_id_12319 where sub_type_id = ?";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, 354);
		Map<String, Object> map = list.get(0);
		typeIds[0] = (int) map.get("maintypeid");
		typeIds[1] = (int) map.get("subtypeid");
		System.out.println(list.get(0).get("maintypeid"));
		System.out.println(list.get(0).get("subtypeid"));
		System.out.println(list.size());
	}

	@Test
	public void test2() {
		String sql = "select a.patrol_id,a.patrol_name,a.tel_mobile_short as telMobile,a.imei,a.card_id,b.revised_coord_x as coordinate_x,b.revised_coord_y as coordinate_y,b.update_time,b.patrol_state_id as patrolState,d.region_name as districtName,c.unit_name from tc_patrol a,tc_patrol_state b,tc_human c,tc_region d where a.patrol_id = b.patrol_id and b.patrol_state_id = 1 and a.patrol_id=c.human_id and a.region_Id = d.region_id";

		List<PatrolScopeInfo> list = jdbcTemplate.query(sql, new DAORowMapper<PatrolScopeInfo>(PatrolScopeInfo.class));
		System.out.println(list.size());
		System.out.println("测试");
	}

	@Test
	public void testBound() {
		ResourceBundle bundle = ResourceBundle.getBundle("conf");
		System.out.println(bundle.getString("conf.statInfoUrl"));
		System.out.println("测试地址");
	}


	@Test
	public void testTianjinPatrol() throws Exception {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").registerTypeAdapter(Date.class, new DateAdapter()).create();
		String url = "http://103.233.6.23:8081/eUrbanMIS/api/v1/rec/getpatrollist";
		String data = "{\"patrolTypeID\":0,\"patrolID\":-1}";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> list = new ArrayList<>();
		list.add(new BasicNameValuePair("data", data));
		UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, "utf-8");
		httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
		httpPost.setEntity(entity);
		CloseableHttpResponse response = httpClient.execute(httpPost);
		String result = EntityUtils.toString(response.getEntity());
		JsonObject map = gson.fromJson(result, JsonObject.class);
		PatrolInfoList patrolInfoList = gson.fromJson(gson.toJson(map.get("data")), PatrolInfoList.class);
		System.out.println(patrolInfoList.getPatrolList().size());
		List<PatrolInfo> patrolInfos = patrolInfoList.getPatrolList();
		String insertSql = "insert into dic_city_patrol(patrol_id,city_patrol_id)values(?,?)";
		String selectSql ="select count(*) from dic_city_patrol where patrol_id = ?";
		List<PatrolInfo> param = new ArrayList<>();
		for (int i = 0; i < patrolInfos.size(); i++) {
			PatrolInfo patrolInfo = patrolInfos.get(i);
			int patrolID = patrolInfo.getPatrolID();
			int cityPatrolID = 1201160000 + (i);
			int count = jdbcTemplate.queryForObject(selectSql,Integer.class,patrolID);
			if (count==0) {
				jdbcTemplate.update(insertSql,patrolID,cityPatrolID);
			}
			patrolInfo.setPatrolID(cityPatrolID);
			patrolInfo.setDistrictName("滨海新区");
			patrolInfo.setUnitName("滨海新区社会治理运行中心");
			patrolInfo.setPatrolTypeID(2);
			param.add(patrolInfo);
		}


		httpPost = new HttpPost("http://111.164.113.101:8081/eUrbanMIS/api/vehicle/postPatrol");
		Map<String,Object> object = new HashMap<String,Object>();
		object.put("patrolInfoList",param);
		System.out.println(gson.toJson(object));
		StringEntity stringEntity = new StringEntity(gson.toJson(object),"utf-8");
		httpPost.setHeader("Content-Type","application/json;charset=utf-8");
		httpPost.setEntity(stringEntity);
		CloseableHttpResponse responseParam = httpClient.execute(httpPost);
		System.out.println(EntityUtils.toString(responseParam.getEntity()));



	}

	@Test
	public void testTime() {
		long time = 1523364781000L;
		System.out.println(new Date(time));
	}


}

class DateAdapter implements JsonDeserializer {


	@Override
	public Date deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		return new Date(json.getAsLong());
	}
}
