package cn.com.egova.dao;

import cn.com.egova.bean.StatInfo;
import cn.com.egova.bean.StatInfoKey;
import cn.com.egova.bean.StatInfoWithBLOBs;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

public interface StatInfoMapper {
    int deleteByPrimaryKey(StatInfoKey key);

    int insert(StatInfoWithBLOBs record);

    int insertSelective(StatInfoWithBLOBs record);

    StatInfoWithBLOBs selectByPrimaryKey(StatInfoKey key);

    int updateByPrimaryKeySelective(StatInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(StatInfoWithBLOBs record);

    int updateByPrimaryKey(StatInfo record);

    public List<StatInfoWithBLOBs> selectByRecID(Long recID);

    @Select("select * from to_stat_info where rec_id = #{recID}")
    public List<StatInfoWithBLOBs> selectByRec(Long recID);

    @Select(value = "select rec_id as recID,create_time as createTime from to_stat_info where rec_id = #{recID}")
    @ResultType(StatInfoKey.class)
    public List<StatInfoKey> selectByStatInfo(Long recID);

    @Insert("insert into to_stat_info (rec_id, address) values(#{rec_id}, #{address})")
//    @SelectKey(statement="call next value for TestSequence", keyProperty="rec_id", before=true, resultType=Long.class)
    @SelectKey(statement = "select max(rec_id)+1 from to_stat_info", keyProperty="rec_id", before=true, resultType=Long.class)
    public int insertStatInfo(String address);

    public HashMap<String,Object> selectMap(Long recID);

    public StatInfoKey selectInfoKey(Long recID);

    @Update("update to_rec set address = #{param} where rec_id = #{recID}")
    public void updateParam(@Param("param") String param1,@Param("recID") Integer recID);
}