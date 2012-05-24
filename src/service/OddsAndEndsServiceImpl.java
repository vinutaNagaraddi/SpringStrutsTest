package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import action.ch5.PersonDAOImpl;

import javax.sql.DataSource;
public class OddsAndEndsServiceImpl implements OddsAndEndsService{

	private JavaMailSender mailSender;
	private Logger logger = Logger.getLogger(this.getClass());
	private DataSource testDataSource;
	
	
	public DataSource getTestDataSource() {
		return testDataSource;
	}

	public void setTestDataSource(DataSource testDataSource) {
		this.testDataSource = testDataSource;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		MimeMessage message = mailSender.createMimeMessage();
		
				
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message,true);

			helper.setFrom("vinuta.nagaraddi@yahoo.com");
			helper.setTo("vinuta101@yahoo.com");
			helper.setText("testing");
			
			FileSystemResource image = new FileSystemResource("C:\\Users\\Vinuta\\Pictures\\2003\\Cleveland\\image.jpg");
			helper.addAttachment("image.jpg", image);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("sending...");
		mailSender.send(message);
		logger.debug(message.toString());
		
	}

	@Override
	public void testJNDI() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null; 
		
		try {
			conn = this.testDataSource.getConnection();
			stmt = conn.prepareStatement(PersonDAOImpl.SQL_SELECT_BY_ID);
			rs = stmt.executeQuery();
			if(rs.next()){
				logger.debug(rs.getString("LAST_NAME") + " and " + rs.getString("FIRST_NAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
