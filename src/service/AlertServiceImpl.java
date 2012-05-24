package service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import domain.Person;

public class AlertServiceImpl implements AlertService{

	private JmsTemplate jmsTemplate;
	
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Override
	public void sendPersonAlert(final Person person) {
		// TODO Auto-generated method stub
		jmsTemplate.send(new MessageCreator(){

			@Override
			public Message createMessage(Session arg0) throws JMSException {
				// TODO Auto-generated method stub
				return arg0.createObjectMessage(person);
			}
			
		});
	}

}
