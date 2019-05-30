package cn.com.egova.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * bean工厂，用来获取bean
 * @author yindl
 */
public class BeanFactoryUtils {
	public static ApplicationContext ctx = null;
	static {
		/**一种方式
		 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{
						"spring_dao.xml",
						"spring_service.xml",
				}			
		);
		factory = (BeanFactory)context;
		*/
		/**第二种方式
			Resource res1=new ClassPathResource("/spring_dao.xml" );
			BeanFactory fac1 = new XmlBeanFactory(res1);
		 */
		/**第三种方式*/
		ctx = new ClassPathXmlApplicationContext(new String[]{
				"classpath:applicationContext-servlet.xml",
				"classpath:applicationContext-datasource.xml",
                "classpath:applicationContext-conf.xml"
		}); 
		
		
//		ctx = new ClassPathXmlApplicationContext(new String[]{
//				"file:D:/eclipse/workspace/DataExportService/webapp/WEB-INF/classes/applicationContext-servlet.xml",
//				"file:D:/eclipse/workspace/DataExportService/webapp/WEB-INF/classes/applicationContext-datasource.xml",
//				"file:D:/eclipse/workspace/DataExportService/webapp/WEB-INF/classes/applicationContext-conf.xml"
//		}); 
		
		/**第四种方式，在web中*/
		//ctx = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
				
//		ctx = new FileSystemXmlApplicationContext(new String[]{
//				"webapp/WEB-INF/classes/applicationContext-servlet.xml",
//				"webapp/WEB-INF/classes/applicationContext-datasource.xml",
//				"webapp/WEB-INF/classes/applicationContext-conf.xml"
//		});
		
	}
	
	public static Object getBean(String name){
		return ctx.getBean(name);
	}
}
