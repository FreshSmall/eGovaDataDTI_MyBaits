package cn.com.egova.java;

import com.google.gson.JsonObject;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpDemo {

		public static void main(String[] args) throws Exception {
			String data ="[{\"main_type_name\":\"市容环境\",\"event_level_name\":\"区级\",\"community_name\":\"军粮城街道社区\",\"check_num\":1,\"to_supervise_num\":1,\"shuffle_num\":0,\"check_trans_num\":1,\"need_check_num\":1,\"duty_grid_name\":\"春竹轩社区03网格\",\"inst_num\":1,\"need_supervise_num\":1,\"to_dispose_num\":1,\"to_operate_num\":1,\"main_type_id\":80157,\"overtime_archive_num\":1,\"intime_verify_num\":1,\"dispatch_human_id\":1,\"rework_num\":0,\"overtime_dispose_num\":1,\"event_grade_name\":\"日常\",\"intime_human_archive_num\":1,\"to_dispatch_num\":1,\"human_archive_num\":1,\"archive_num\":1,\"task_num\":\"22015\",\"operate_time\":\"2019-08-30 11:59:12\",\"cell_name\":\"春竹轩社区03网格\",\"need_dispose_num\":1,\"intime_inst_num\":1,\"intime_dispose_num\":1,\"address\":\"东丽区军粮城街春竹轩社区\",\"event_level_id\":2,\"intime_dispatch_num\":1,\"rec_id\":22015,\"rec_type_id\":2,\"duty_grid_id\":7,\"sub_type_id\":80215,\"event_state_name\":\"结案\",\"intime_check_num\":1,\"hang_num\":0,\"need_human_archive_num\":1,\"multi_rework_num\":0,\"archive_time\":\"2019-08-30 11:59:12\",\"intime_operate_num\":1,\"event_type_id\":80137,\"rec_type_name\":\"社会服务\",\"need_send_check_num\":1,\"event_src_id\":1,\"cell_id\":7,\"intime_to_archive_num\":1,\"to_inst_num\":1,\"create_time\":\"2019-08-30 11:59:12\",\"coordinate_x\":\"117.44254825\",\"overtime_to_dispose_num\":1,\"coordinate_y\":\"39.06171056\",\"event_type_name\":\"网格化事件\",\"event_desc\":\"春竹轩6号楼前公共场所有未倒入垃圾容器的生活垃圾\",\"verify_num\":1,\"need_dispatch_num\":1,\"not_inst_num\":1,\"street_id\":168,\"supervise_num\":1,\"to_archive_num\":1,\"event_grade_id\":1,\"event_type_code\":\"07\",\"need_archive_num\":1,\"street_name\":\"军粮城街道\",\"district_name\":\"东丽区\",\"community_id\":10068,\"overtime_to_archive_num\":1,\"cancel_num\":0,\"report_num\":1,\"his_hang_num\":0,\"dispatch_num\":1,\"send_check_num\":1,\"dispose_num\":1,\"intime_send_check_num\":1,\"not_operate_num\":1,\"intime_supervise_num\":1,\"event_state_id\":6,\"event_src_name\":\"区级网格员上报\",\"intime_archive_num\":1,\"postpone_num\":0,\"district_id\":7,\"sub_type_name\":\"暴露垃圾\",\"region_code\":\"120110\"}]\n";
			String senderCode = "120110";

			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost("http://192.156.193.214:8082/webapp/v3/synRecStatInfo");
			List<NameValuePair> list = new ArrayList<>();
			list.add(new BasicNameValuePair("data",data));
			list.add(new BasicNameValuePair("senderCode",senderCode));
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,"utf-8");
			httpPost.setHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
			httpPost.setEntity(entity);
			CloseableHttpResponse response = httpClient.execute(httpPost);
			System.out.println(EntityUtils.toString(response.getEntity()));


		}
}