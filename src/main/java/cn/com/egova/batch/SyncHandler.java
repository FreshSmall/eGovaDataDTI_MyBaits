package cn.com.egova.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SyncHandler {

    @Autowired
    private JdbcTemplate jdbcTemplate;
//    @Async
    public String syncInfo(){
        String sql = "insert into to_test(name,age) values(?,?)";
        for(int i=0;i<10000;i++){
            jdbcTemplate.update(sql,Thread.currentThread().getName(),i);
        }
//        System.out.println("线程名称："+Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }
}
