package cn.com.egova.mail;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public class SpringHMailServerTest1 {
	public void testSendMail(){
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("192.168.32.76");
		sender.setPort(25);
		sender.setUsername("yinchao@egova.com");
		sender.setPassword("123456");
		Properties properties = new Properties();
		properties.put("mail.smtp.auth",true);
		properties.put("mail.smtp.timeout",20000);
		sender.setJavaMailProperties(properties);
		MimeMessage mMessage = sender.createMimeMessage();// 创建邮件对象
		MimeMessageHelper mMessageHelper;
		try {
			mMessageHelper = new MimeMessageHelper(mMessage, true, "UTF-8");
			// 发件人邮箱
			mMessageHelper.setFrom("yinchao@egova.com");
			// 收件人邮箱
			mMessageHelper.setTo("291355504@qq.com");
			// 邮件的主题也就是邮件的标题
			mMessageHelper.setSubject("测试");
			// 邮件的文本内容，true表示文本以html格式打开
			mMessageHelper.setText("Check out this image!", false);
			for (int i = 0; i < 2; i++) {
				String mediaUrl = "http://www.automachi.com/wp-content/uploads/2016/09/hrv-2_0_0_0-630x420.jpg";
				String filePath = System.getProperty("user.dir")+"/mail.jpg";
				File file  = new File(filePath);
				if (!file.exists()) {
					file.createNewFile();
				}
				InputStream inputStream = getStream(mediaUrl);
				inputStreamtoFile(inputStream,file);
				FileSystemResource resource1 = new FileSystemResource(file);
				mMessageHelper.addAttachment("test.jpg", resource1);
			}
			// 在邮件中添加一个附件
			sender.send(mMessage);// 发送邮件
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param mediaUrl
	 * @return
	 */
	private InputStream getStream(String mediaUrl) {
		InputStream inStream = null;
		URLConnection conn = null;
		try {
			URL url = new URL(mediaUrl);
			conn = url.openConnection();
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setConnectTimeout(60 * 1000);
			conn.setReadTimeout(60 * 1000);
			inStream = conn.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inStream;
	}

	private void inputStreamtoFile(InputStream in,File file){
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
			int bytesRead  =0;
			byte[] bytes = new byte[2048];
			while((bytesRead=in.read(bytes))!=-1){
				out.write(bytes,0,bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		SpringHMailServerTest1 test = new SpringHMailServerTest1();
		test.testSendMail();
	}
}
