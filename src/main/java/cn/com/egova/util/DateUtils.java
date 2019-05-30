package cn.com.egova.util;


import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 日期工具类
 * @author yindl
 */
public class DateUtils {

	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_FORMAT_SHORT = "MM-dd";
	public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String OLYL_TIME_FORMAT = "HH:mm:ss";
	public static final String DATE_MONTH_FORMAT = "yyyy-MM";
	public static final String DATE_YEAR_FORMAT = "yyyy";
	
	/**
	 * 获取当前系统时间字符串
	 * @param format
	 * @return
	 */
	public static String getCurrentDateStr(String format){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String currentTime = sdf.format(date);
		return currentTime;
	}

	/**
	 * 获取当前系统时间
	 * @param format
	 * @return
	 */
	public static Date getCurrentDate(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = null;
		try{
			date = sdf.parse(sdf.format(new Date()));
		}catch(ParseException e){
			e.printStackTrace();
		}
		return date;
	}



	/**
	 * 将日期字符串转化为需要格式的日期
	 * @param date 日期字符串 
	 * @param format 格式字符串
	 * @return	转换后的日期对象
	 */
	public static Date strToFormatDate(String date, String format){
		if(date == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date, new ParsePosition(0));
	}

	/**
	 * 将字符串转换为yyyy-MM-dd格式的日期
	 * @param date
	 * @return	转换后的日期对象
	 */
	public static Date strToDate(String date){
		return DateUtils.strToFormatDate(date, DATE_FORMAT);
	}

	/**
	 * 将字符串转换为yyyy-MM-dd HH:mm:ss格式的日期
	 * @param date
	 * @return	转换后的日期对象
	 */
	public static Date strToDateTime(String date){
		return DateUtils.strToFormatDate(date, TIME_FORMAT);
	}

	/**
	 * 将date型日期转换成特定格式的时间字符串
	 * @param date
	 * @param format
	 * @return	转换后的日期对象
	 */
	public static String dateToFormatStr(Date date, String format){
		if(date == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 将date型日期转换成yyyy-MM-dd HH:mm:ss格式的时间字符串
	 * @param date 日期
	 * @return 返回yyyy-MM-dd HH:mm格式的时间字符串
	 */
	public static String dateTimeToStr(Date date){
		return DateUtils.dateToFormatStr(date, TIME_FORMAT);
	}
	
	/**
	 * 将date型日期转换成HH:mm:ss格式的时间字符串
	 * @param date 日期
	 * @return 返回HH:mm格式的时间字符串
	 */
	public static String getOnlyTimeStr(Date date){
		return DateUtils.dateToFormatStr(date, OLYL_TIME_FORMAT);
	}

	/**
	 * 将date型日期转换成yyyy-MM-dd格式的日期字符串
	 * @param date 日期
	 * @return 返回yyyy-MM-dd格式的日期字符串
	 */
	public static String dateToStr(Date date){
		return DateUtils.dateToFormatStr(date, DATE_FORMAT);
	}

	/**
	 * 计算出date day天之前或之后的日期
	 * @param date	日期
	 * @param days	int	天数，正数为向后几天，负数为向前几天
	 * @return	返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterDays(Date date, int days){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) + days);
		return now.getTime();
	}

	/**
	 * 计算出date monthes月之前或之后的日期
	 * @param date 日期
	 * @param monthes 月数，正数为向后几月，负数为向前几月
	 * @return 返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterMonthes(Date date, int monthes){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.MONTH, now.get(Calendar.MONTH) + monthes);
		return now.getTime();
	}

	/**
	 * 计算出date day天之前或之后的日期
	 * @param date 日期
	 * @param hours int	小时数，正数为向后几小时，负数为向前几小时
	 * @return	返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterHours(Date date, int hours){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.HOUR, now.get(Calendar.HOUR) + hours);
		return now.getTime();
	}

	/**
	 * 计算出date years年之前或之后的日期
	 * @param date 日期
	 * @param years 年数，正数为向后几年，负数为向前几年
	 * @return 返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterYears(Date date, int years){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.YEAR, now.get(Calendar.YEAR) + years);
		return now.getTime();
	}
	
	/**
	 * 计算出date seconds年之前或之后的日期
	 * @param date 日期
	 * @param seconds 秒数，正数为向后几秒，负数为向前几秒
	 * @return 返回Date日期类型
	 */
	public static Date getDateBeforeOrAfterSeconds(Date date, int seconds){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.SECOND, now.get(Calendar.SECOND) + seconds);
		return now.getTime();
	}

	/**
	 * 计算出date minutes分钟之后的时间
	 * @param date
	 * @param minutes
	 * @return
	 */
	public static Date getDateBeforeOrAfterMinutes(Date date, int minutes){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.MINUTE, now.get(Calendar.MINUTE) + minutes);
		return now.getTime();
	}

	/**
	 * 计算出date millisecond毫秒之后的时间
	 * @param date
	 * @param milliseconds
	 * @return
	 */
	public static Date getDateBeforeOrAfterMilliseconds(Date date, long milliseconds){
		Date newDate = new Date();
		newDate.setTime(date.getTime() + milliseconds);
		return newDate;
	}

	/**  
	 * 计算两个日期之间的天数
	 * @param beginDate  
	 * @param endDate  
	 * @return  如果beginDate 在 endDate之后返回负数 ，反之返回正数
	 */
	public static int daysOfTwoDate(Date beginDate, Date endDate){

		Calendar beginCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();

		beginCalendar.setTime(beginDate);
		endCalendar.setTime(endDate);

		return daysOfTwoDate(beginCalendar, endCalendar);

	}

	/**  
	 * 计算两个日期之间的天数
	 * @param d1  
	 * @param d2  
	 * @return  如果d1 在 d2 之后返回负数 ，反之返回正数
	 */
	public static int daysOfTwoDate(Calendar d1, Calendar d2){
		int days = 0;
		int years = d1.get(Calendar.YEAR) - d2.get(Calendar.YEAR);
		if(years == 0){//同一年中
			days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
			return days;
		}else if(years > 0){//不同一年
			for(int i = 0;i < years;i++){
				d2.add(Calendar.YEAR, 1);
				days += -d2.getActualMaximum(Calendar.DAY_OF_YEAR);
				if(d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)){
					days += d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
					return days;
				}
			}
		}else for(int i = 0;i < -years;i++){
			d1.add(Calendar.YEAR, 1);
			days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);
			if(d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)){
				days += d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
				return days;
			}
		}
		return days;
	}

	/**
	 * 获得当前时间当天的开始时间，即当前给出的时间那一天的00:00:00的时间
	 * @param date 当前给出的时间
	 * @return	当前给出的时间那一天的00:00:00的时间的日期对象
	 */
	public static Date getDateBegin(Date date){
		SimpleDateFormat ymdFormat = new SimpleDateFormat(DATE_FORMAT);
		if(date != null){
			try{
				return DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINA).parse(ymdFormat.format(date));
			}catch(ParseException e){
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 获得当前时间当天的结束时间，即当前给出的时间那一天的23:59:59的时间
	 * @param date 当前给出的时间
	 * @return	当前给出的时间那一天的23:59:59的时间的日期对象
	 */
	public static Date getDateEnd(Date date){
		SimpleDateFormat ymdFormat = new SimpleDateFormat(DATE_FORMAT);
		if(date != null){
			try{
				date = getDateBeforeOrAfterDays(date, 1);
				date = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINA).parse(ymdFormat.format(date));
				Date endDate = new Date();
				endDate.setTime(date.getTime() - 1000);
				return endDate;
			}catch(ParseException e){
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 获取时间的年份
	 * @param date
	 * @return
	 */
	public static int getDateYear(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.YEAR);
	}

	/**
	 * 获取时间的月份
	 * @param date
	 * @return
	 */
	public static int getDateMonth(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH) + 1;
	}

	/**
	 * 获取时间的小时数
	 * @param date
	 * @return
	 */
	public static int getDateHour(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 获取时间的分钟数
	 * @param date
	 * @return
	 */
	public static int getDateMinute(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MINUTE);
	}

	/**
	 * 经过一段分钟后的时间 minites 可以为整数或负数
	 * @param start
	 * @param hours
	 * @return
	 */
	public static Date getEndTimeHours(Date start, float hours){
		return getEndTimeMinites(start, hours * 60);
	}

	/**
	 * 经过一段分钟后的时间 minites 可以为整数或负数
	 * @param start
	 * @param minites
	 * @return
	 */
	public static Date getEndTimeMinites(Date start, float minites){
		int m = (int) minites;
		float seconds = (minites - m) * 60;
		int s = (int) seconds;
		if(seconds - s >= 0.5){
			s++;
		}
		if(m != 0){
			start = DateUtils.getDateBeforeOrAfterMinutes(start, m);
		}
		if(s != 0){
			start = DateUtils.getDateBeforeOrAfterSeconds(start, s);
		}
		return start;
	}

	public static Date getEndTimeMilliseconds(Date start, long milliseconds){
		return DateUtils.getDateBeforeOrAfterMilliseconds(start, milliseconds);
	}

	/**
	 * 获取时间的秒数
	 * @param date
	 * @return
	 */
	public static int getDateSecond(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.SECOND);
	}

	/**
	 * 获取英文月份名称
	 * @param date
	 * @return
	 */
	public static String getDateMonthName(Date date){
		if(MONTH_NAME == null){
			MONTH_NAME = new HashMap<Integer, String>();
			MONTH_NAME.put(JANUARY, "january");
			MONTH_NAME.put(FEBRUARY, "february");
			MONTH_NAME.put(MARCH, "march");
			MONTH_NAME.put(APRIL, "april");
			MONTH_NAME.put(MAY, "may");
			MONTH_NAME.put(JUNE, "june");
			MONTH_NAME.put(JULY, "july");
			MONTH_NAME.put(AUGUST, "august");
			MONTH_NAME.put(SEPTEMBER, "september");
			MONTH_NAME.put(OCTOBER, "october");
			MONTH_NAME.put(NOVEMBER, "november");
			MONTH_NAME.put(DECEMBER, "december");
		}
		return MONTH_NAME.get(getDateMonth(date));
	}

	public static Map<Integer, String> MONTH_NAME = null;
	public static final int JANUARY = 1;
	public static final int FEBRUARY = 2;
	public static final int MARCH = 3;
	public static final int APRIL = 4;
	public static final int MAY = 5;
	public static final int JUNE = 6;
	public static final int JULY = 7;
	public static final int AUGUST = 8;
	public static final int SEPTEMBER = 9;
	public static final int OCTOBER = 10;
	public static final int NOVEMBER = 11;
	public static final int DECEMBER = 12;


	/**
	 * 获取月份字符串
	 * @param date
	 * @return
	 */
	public static String getDateMonthStr(Date date){
		int month = DateUtils.getDateMonth(date);
		if(month < 10){
			return "0" + month;
		}else{
			return Integer.toString(month);
		}
	}

	/**
	 * 获取本周日期数组
	 * @param date
	 * @return
	 */
	public static List<Date> getDateWeekStr(Date date){
		int b = date.getDay();
		Date fdate;
		List<Date> list = new ArrayList<Date>();
		Long fTime = date.getTime() - b * 24 * 3600000;
		for (int a = 1; a <= 7; a++) {
			fdate = new Date();
			fdate.setTime(fTime + (a * 24 * 3600000));
			list.add(a-1, fdate);
		}
		return list;
	}

	/**
	 * 获取时间日期
	 * @param date
	 * @return
	 */
	public static int getDateDate(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DATE);
	}

	/**
	 * 获取日期Calendar类
	 * @param date
	 * @return
	 */
	public static Calendar getCalendar(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	/**
	 * 获取时间日期字符串
	 * @param date
	 * @return
	 */
	public static String getDateDateStr(Date date){
		int d = DateUtils.getDateDate(date);
		if(d < 10){
			return "0" + d;
		}else{
			return Integer.toString(d);
		}
	}

	/**
	 * 不比较日期只比较时间，返回是否date1早于date2
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean beforeOnlyTime(Date date1, Date date2){
		Calendar c1 = getCalendar(date1);
		Calendar c2 = getCalendar(date2);
		int hour1 = c1.get(Calendar.HOUR_OF_DAY);
		int hour2 = c2.get(Calendar.HOUR_OF_DAY);
		if(hour1 != hour2){
			return hour1 < hour2;
		}
		int minute1 = c1.get(Calendar.MINUTE);
		int minute2 = c2.get(Calendar.MINUTE);
		if(minute1 != minute2){
			return minute1 < minute2;
		}
		return c1.get(Calendar.SECOND) < c2.get(Calendar.SECOND);
	}

	/**
	 * 不比较日期只比较时间，返回是否date1晚于date2
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean afterOnlyTime(Date date1, Date date2){
		Calendar c1 = getCalendar(date1);
		Calendar c2 = getCalendar(date2);
		int hour1 = c1.get(Calendar.HOUR_OF_DAY);
		int hour2 = c2.get(Calendar.HOUR_OF_DAY);
		if(hour1 != hour2){
			return hour1 > hour2;
		}
		int minute1 = c1.get(Calendar.MINUTE);
		int minute2 = c2.get(Calendar.MINUTE);
		if(minute1 != minute2){
			return minute1 > minute2;
		}
		return c1.get(Calendar.SECOND) > c2.get(Calendar.SECOND);
	}

	/**
	 * 返回两个时间之间的分钟数, 保留三位小数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static float minutesOfTwoDate(Date date1, Date date2){
		float minutes = (date2.getTime() - date1.getTime())/60000f;
		//保留两位小数
		return (new BigDecimal(minutes)).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
	}

	/**
	 * 返回两个时间之间的秒数, 保留一位小数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static float secondsOfTwoDate(Date date1, Date date2){
		float seconds = date2.getTime() - date1.getTime();
		return (new BigDecimal(seconds)).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
	}

	/**
	 * 返回两个时间之间的毫秒数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static long millisecondsOfTwoDate(Date date1, Date date2){
		return date2.getTime() - date1.getTime();
	}

	/**
	 * 在同一天
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean theSaveDate(Date date1, Date date2){
		Calendar c1 = getCalendar(date1);
		Calendar c2 = getCalendar(date2);
		int year1 = c1.get(Calendar.YEAR);
		int year2 = c2.get(Calendar.YEAR);
		if(year1 != year2) return false;
		int month1 = c1.get(Calendar.MONTH);
		int month2 = c2.get(Calendar.MONTH);
		if(month1 != month2) return false;
		return c1.get(Calendar.DATE) == c2.get(Calendar.DATE); 
	}

}
