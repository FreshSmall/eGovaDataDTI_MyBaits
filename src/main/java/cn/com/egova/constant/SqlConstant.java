package cn.com.egova.constant;

public class SqlConstant {

    public static String statInfoSql = "select t.*,{recid} as recid from umstat.tostatinfo t where t.recid in (select recid from dltrans.torecFlag where doflag=0 and rownum<101)";

    public static String reFreshSql = "update dltrans.torecFlag set doflag=1 where recid = ?";

//    public static String refreshSql = "";


}