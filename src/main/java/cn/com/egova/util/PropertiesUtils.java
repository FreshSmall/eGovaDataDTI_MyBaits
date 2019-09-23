package cn.com.egova.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具类
 * @author yindl
 */
public class PropertiesUtils {

	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

	/**
	 * 获取属性文件中的键值
	 * @param FileName
	 * @param key
	 * @return	属性文件中的键值
	 */
	public static String getValue(String FileName, String key){
		Properties properties = new Properties();
		try{
			InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream(FileName);
			properties.load(inputStream);
		}catch(IOException e){
			logger.error("读取属性配置文件出错,FileName={},key={}", FileName, key, e);
		}
		return properties.getProperty(key);
	}
	/**
	 * 获取属性文件中的键值
	 * @param FileName
	 * @param key
	 * @return	属性文件中的键值
	 */
	public static String getValue(String FileName, String key, String defaultValue){
		Properties properties = new Properties();
		try{
			InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream(FileName);
			properties.load(inputStream);
		}catch(IOException e){
			logger.error("读取属性配置文件出错,FileName={},key={}", FileName, key, e);
		}
		return properties.getProperty(key, defaultValue);
	}

}
