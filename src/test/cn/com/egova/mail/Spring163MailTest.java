package cn.com.egova.mail;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Spring163MailTest {

	public void testSendMail(){
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("smtp.163.com");
		sender.setUsername("ycsuper2819@163.com");
		sender.setPassword("yin281926");
		Properties properties = new Properties();
		properties.put("mail.smtp.auth",false);
		properties.put("mail.smtp.timeout",20000);
		sender.setJavaMailProperties(properties);
		MimeMessage mMessage = sender.createMimeMessage();// 创建邮件对象
		MimeMessageHelper mMessageHelper;
		try {
			mMessageHelper = new MimeMessageHelper(mMessage, true, "UTF-8");
			// 发件人邮箱
			mMessageHelper.setFrom("ycsuper2819@163.com");
			// 收件人邮箱
			mMessageHelper.setTo("291355504@qq.com");
			// 邮件的主题也就是邮件的标题
			mMessageHelper.setSubject("测试");
			// 邮件的文本内容，true表示文本以html格式打开
			mMessageHelper.setText("Check out this image!", false);

			FileSystemResource resource2 = new FileSystemResource("d:/test.txt");
			mMessageHelper.addAttachment("test.txt", resource2);
			// 在邮件中添加一个附件
			sender.send(mMessage);// 发送邮件
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		Spring163MailTest springMailTest = new Spring163MailTest();
		springMailTest.testSendMail();
	}
}
